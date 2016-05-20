/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import datos.DatosMapa;
import domain.Nodo;
import domain.Punto;
import excepciones.CoordenadasSinNodoException;
import excepciones.NodoSeleccionadoException;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.Timer;

/**
 *
 * @author USUARIO
 */


public class ImagenFondo extends JComponent{
     BufferedImage img;
     public double zoom;
     public Agente agente;
    public Timer timer;
    public ArrayList listaRecorrido;
    public Image iconoAgente;
   
    private double tamanioMapaX=198.0;
    private double tamanioMapaY=96.0;
    
    public Map<Punto,Nodo> mapa; 
    public int diametroNodo=15;
    public int piso,mouseX,mouseY;
    Dimension dimension;
    public Nodo nodoClickeado;
    ScrollPanelMapa scroll; 

   // public Image img;
    public ImagenFondo(Map<Punto,Nodo> mapa){
        
        listaRecorrido= new ArrayList();
         nodoClickeado=null;
         this.mapa =mapa;
         setPiso(0);
         this.addMouseListener(new MouseListener() {
             @Override
             public void mouseClicked(MouseEvent e) {
                 mouseClickedNodo(e);
             }

             @Override
             public void mousePressed(MouseEvent e) {
             }

             @Override
             public void mouseReleased(MouseEvent e) {
             }

             @Override
             public void mouseEntered(MouseEvent e) {
             }

             @Override
             public void mouseExited(MouseEvent e) {
            }

            
         });
         this.addMouseMotionListener(new MouseMotionListener() {
             @Override
             public void mouseDragged(MouseEvent e) {
             }

             @Override
             public void mouseMoved(MouseEvent e){
                   
                   mouseX=e.getX();
                   mouseY=e.getY();
                   repaint();
             }
         });
        agente= new Agente(); 
        Image iconoAgente= new ImageIcon(getClass().getResource("/imagen/Upgraded_Robot_Sprite.png")).getImage(); // NOI18N
        agente.setPosicionXY(0,0);
        /*timer = new Timer(16, new ActionListener (){
            double i=104.0;
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(i==110.0)
                    timer.stop();
                listaRecorrido.add(i);
                listaRecorrido.add(30.0);
                agente.setPosicionXY((int)i, 30);
                i+=1.0;
                repaint();
            }
 
            });*/
    }
    public void setPiso(int pisoSeleccionado){
        try{
           
            piso= pisoSeleccionado;
            String imagen="";
            switch(piso){
                case 0: imagen="C:/Users/USUARIO/Documents/NetBeansProjects/tpIA/src/imagen/FRSF Planta Baja 12k.png";
                        break;
                case 1: imagen="C:/Users/USUARIO/Documents/NetBeansProjects/tpIA/src/imagen/FRSF Piso 1 12k.png";
                        break;
                case 2: imagen="C:/Users/USUARIO/Documents/NetBeansProjects/tpIA/src/imagen/FRSF Piso 2 12k.png";
                        break;
                case 3: imagen="C:/Users/USUARIO/Documents/NetBeansProjects/tpIA/src/imagen/FRSF Piso 3 12k.png";
                        break;                        
            }
            img= ImageIO.read(new File(imagen));
        
        }
        catch(IOException e){
            System.err.println("Error imagen");
        }
        
        zoom=1;
        setZoom(1);
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
     super.paintComponent(g);
     dimension = getPreferredSize();
     
     g.drawImage(img, 0, 0, dimension.width, dimension.height, this);
     
        //puntos     
        cargarPuntos(g);
        
        
        
       
    }
    
    public void setZoom(double zoom) {
        this.zoom=zoom;
        int w = (int) (zoom * img.getWidth());
        int h = (int) (zoom * img.getHeight());
        setPreferredSize(new Dimension(w, h));
        revalidate();
        repaint();
    }
    public double getZoom(){
        return zoom;
    }
    public void cargarPuntos(Graphics g){
        g.translate(0,dimension.height);
       
        
        for(Map.Entry<Punto,Nodo> iteradorMapa : mapa.entrySet()){
            if(iteradorMapa.getKey().getZ()==piso){
               
                g.setColor(Color.BLUE);
                double x= dimension.width*(iteradorMapa.getKey().getX()/tamanioMapaX);
                double y =dimension.height*(iteradorMapa.getKey().getY()/tamanioMapaY);
                
                g.fillOval((int)x,(int)-y,diametroNodo,diametroNodo);
            }
        }
        for(Nodo nodoIterador : DatosMapa.getObstaculos()){
             if(nodoIterador.getUbicacion().getZ()==piso){
                g.setColor(Color.RED);
                double x= dimension.width*(nodoIterador.getUbicacion().getX()/tamanioMapaX);
                double y =dimension.height*(nodoIterador.getUbicacion().getY()/tamanioMapaY);
                
                g.fillOval((int)x,(int)-y,diametroNodo,diametroNodo);
                }
        }
        if(nodoClickeado!=null){
            g.setColor(Color.ORANGE);
            double x= dimension.width*(nodoClickeado.getUbicacion().getX()/tamanioMapaX);
            double y =dimension.height*(nodoClickeado.getUbicacion().getY()/tamanioMapaY);
            g.fillOval((int)x,(int)-y,diametroNodo,diametroNodo);
        }
        //IconoAgente
        
        double xAg= agente.getPosicionX();
        double yAg =agente.getPosicionY();
        
        g.drawImage(iconoAgente, (int)xAg, (int)-yAg, null);
        
        //Dibuja lineas del recorrido del agete
        Graphics2D g2d = (Graphics2D)g;
        
        for (int i=0; i+6<=listaRecorrido.size();i++) {
            
            double x1= dimension.width *((double)listaRecorrido.get(i)/tamanioMapaX);
            double y1 =dimension.height*((double)listaRecorrido.get(i+1)/tamanioMapaY);
            double z1=(double) listaRecorrido.get(i+2);

            double x2= dimension.width*((double)listaRecorrido.get(i+3)/tamanioMapaX);
            double y2 =dimension.height*((double)listaRecorrido.get(i+4)/tamanioMapaY);
            double z2=(double) listaRecorrido.get(i+5);
           if((int)z1==piso){
               if((int)z2==piso){
           
                    g2d.setStroke(new BasicStroke(2));
                    g2d.setColor(Color.GREEN);
                    
                    g2d.drawLine((int)x1+7,(int)-y1+7,(int)x2+7,(int)-y2+7);


                    
                     g.fillOval((int)x1,(int)-y1,diametroNodo,diametroNodo);
                     g.fillOval((int)x2,(int)-y2,diametroNodo,diametroNodo);
               }
               else{
                   g.setColor(Color.PINK);
                   g.fillOval((int)x1,(int)-y1,diametroNodo,diametroNodo);
               }
           }
           else if((int)z2==piso){
               g.setColor(Color.PINK);
                   g.fillOval((int)x1,(int)-y1,diametroNodo,diametroNodo);
           }
        }

        
            
        try {
            //Si el mouse esta sobre un nodo, el mwtodo devolvera el nodo
            Nodo nodoBajoMouse = getNodo(mouseX,mouseY);
            g.setColor(Color.ORANGE);
            double x= dimension.width*(nodoBajoMouse.getUbicacion().getX()/tamanioMapaX);
            double y =dimension.height*(nodoBajoMouse.getUbicacion().getY()/tamanioMapaY);
            
            g.fillOval((int)x,(int)-y,diametroNodo,diametroNodo);
            
        } catch (CoordenadasSinNodoException e1) {
           
            //De lo contrario, tirar� esta excepci�n, y debemos hacer nada
        }
        
    }
    public Nodo getNodo(int mouseX,int mouseY) throws CoordenadasSinNodoException{
		Nodo nodo = null;
                mouseY= dimension.height+10-mouseY;
		for(Map.Entry<Punto,Nodo> iteradorMapa : mapa.entrySet()){
                        double iteradorX= dimension.width*(iteradorMapa.getKey().getX()/tamanioMapaX);
                        double iteradorY =dimension.height*(iteradorMapa.getKey().getY()/tamanioMapaY);
                        
                        //System.out.println("itX"+iteradorX+"mouseX"+mouseX );
                        //System.out.println("itY"+iteradorY+"mouseY"+mouseY );
			if(mouseX > iteradorX && mouseX < (iteradorX+diametroNodo) &&
                           mouseY > iteradorY && mouseY < (iteradorY+diametroNodo) &&
                                piso== iteradorMapa.getKey().getZ()){
				nodo = iteradorMapa.getValue();
				break;
			}
		}
		if(nodo == null)
			throw new CoordenadasSinNodoException();
		return nodo;
	}
    private void mouseClickedNodo(MouseEvent e){
        try{
            nodoClickeado = getNodo(e.getX(), e.getY());
            repaint();
        }
        catch(CoordenadasSinNodoException e1) {
            
            nodoClickeado=null;
        
        }
    }
    public Nodo getNodoClickeado(){
        return nodoClickeado;
    }
    public void setAgente(int x, int y, int z) {
        
        agente.setPosicionX(x);
        agente.setPosicionY(y);
        listaRecorrido.add((double)x);
        listaRecorrido.add((double)y);
        listaRecorrido.add((double)z);
        
        
        double xAg= dimension.width*(agente.getPosicionX()/tamanioMapaX);
        double yAg =dimension.height*(agente.getPosicionY()/tamanioMapaY);
        
        
        //Point p= new Point((int)xAg, (int)yAg);
        Point p= new Point((int)xAg-300, dimension.height-(int)yAg-200);
        scroll.getViewport().setViewPosition(p);
        repaint();
        
    }
    
     public void instanciarListaRecorrido(){
         listaRecorrido= new ArrayList();
         repaint();
     }
     public void setScroll(ScrollPanelMapa scrollPanel){
         scroll=scrollPanel;
     }

     public ArrayList vaciarListaRecorrido() {
         ArrayList retornar= (ArrayList) listaRecorrido.clone();
         this.instanciarListaRecorrido();
         return retornar;
        
        }
        
        
        
   
}
