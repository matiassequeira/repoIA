/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import domain.Nodo;
import domain.Punto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author USUARIO
 */
public class PanelMapa extends javax.swing.JPanel {

    /**
     * Creates new form PanelMapa
     */
    private double tamañoMapaX=190.0;
    private double tamanioMapaY=102.0;
    public Image iconoAgente;
    public Agente agente;
    public Timer timer;
    public ArrayList listaRecorrido;
    
    public PanelMapa() {
        init();
        
    }
    public void init(){
        
     
        listaRecorrido= new ArrayList();
        listaRecorrido.add(108.0);
        listaRecorrido.add(39.0);
        setLayout(null);
        
        agente= new Agente();       
        agente.setPosicionX(108);
        agente.setPosicionY(39);
        iconoAgente= new ImageIcon(getClass().getResource("/imagen/Upgraded_Robot_Sprite.png")).getImage(); // NOI18N
        
        timer = new Timer(16, new ActionListener (){
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
        
            });
        
    }
    public void animar(boolean turnOnOff) {
        if (turnOnOff) {           
            timer.start();
        } else {
            timer.stop();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     
    @SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar2 = new javax.swing.JScrollBar();
        label = new javax.swing.JLabel();

        setLayout(null);
        add(jScrollBar2);
        jScrollBar2.setBounds(425, 0, 17, 300);

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Upgraded_Robot_Sprite.png"))); // NOI18N
        add(label);
        label.setBounds(104, 137, 55, 48);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
*/
public void paint(Graphics g){
        super.paint(g);
        Dimension tamanio = getSize();
        setOpaque(false);
        
        //Colocamos el mapa
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagen/FRSF Planta Baja 12k.png"));        
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
        
        
        //puntos     
        g.translate(0,tamanio.height);
       
        //HALL
        g.setColor(Color.RED);       
        double x= tamanio.width*(108.0/tamañoMapaX);
        double y =tamanio.height*(39.0/tamanioMapaY);        
        g.fillOval((int)x,(int)-y,10,10);
       
        //FAGDUT
        g.setColor(Color.BLUE);
        x= tamanio.width*(104.0/tamañoMapaX);
        y =tamanio.height*(30.0/tamanioMapaY);
        g.fillOval((int)x,(int)-y,10,10);
        
        //AULA1
        g.setColor(Color.BLACK);
        x= tamanio.width*(110.0/tamañoMapaX);
        y =tamanio.height*(30.0/tamanioMapaY);
        g.fillOval((int)x,(int)-y,10,10);
        
        //IconoAgente
        x= tamanio.width*(agente.getPosicionX()/tamañoMapaX);
        y =tamanio.height*(agente.getPosicionY()/tamanioMapaY);
        g.drawImage(iconoAgente, (int)x, (int)-y, null);
        
        //Dibuja lineas del recorrido del agete
        
        
        for (int i=0; i+4<=listaRecorrido.size();i++) {
            g.setColor(Color.RED);
            double x1= tamanio.width*((double)listaRecorrido.get(i)/tamañoMapaX);
            double y1 =tamanio.height*((double)listaRecorrido.get(i+1)/tamanioMapaY);
            double x2= tamanio.width*((double)listaRecorrido.get(i+2)/tamañoMapaX);
            double y2 =tamanio.height*((double)listaRecorrido.get(i+3)/tamanioMapaY);
            g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
        
        
        }
        
    }    

}
