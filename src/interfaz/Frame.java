/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import domain.Nodo;
import domain.Punto;
import frsf.cidisi.exercise.agente.search.AgenteMain;
import frsf.cidisi.exercise.agente.search.AgentePerception;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

/**
 *
 * @author USUARIO
 */
public class Frame extends JFrame{
    
    private PanelSetearDatos panelDatos;
    private PanelMapa panelMapa;
    private ImagenFondo imagen; 
    private static ProgressBar progressBar;

    
    private static int energiaTotal;
    public Frame(Map<Punto,Nodo> mapa, AgenteMain agenteMain){
        setBounds(0, 0, 1200, 720);
        getContentPane().setLayout(null);
        imagen= new ImagenFondo(mapa);
        imagen.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseClickedPanelMapa(e);
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
        
        panelMapa = new PanelMapa(mapa,imagen,agenteMain);
        panelMapa.setBounds(400,0,700,500);
        
        getContentPane().add(panelMapa);
        
        panelDatos = new PanelSetearDatos();
        panelDatos.setBounds(0, 0, 350,300 );
        getContentPane().add(panelDatos);
        
        //energiaGastada = 0;
	energiaTotal = 300;
	progressBar = new ProgressBar(energiaTotal,energiaTotal,"Porcentaje");
	progressBar.setBackground(Color.black);
	progressBar.setBounds(400, 630, 539, 29);
	add(progressBar);
        
        this.setVisible(true);
        
    }
     
    private void mouseClickedPanelMapa(MouseEvent e) {
        
        panelDatos.setearNodo(imagen.getNodoClickeado());
     }
    public void setPerception(Nodo nodoPosicion){
        try{
        int x= nodoPosicion.getUbicacion().getX();
        int y= nodoPosicion.getUbicacion().getY();
        int z= nodoPosicion.getUbicacion().getZ();
        imagen.setAgente(x, y,z);
        }
        catch(NullPointerException e){
            System.err.println("Seleccionar nodo inicio");
        }
        
    }
    public void addConsola(InputStream out, PrintWriter in){
        JTextArea area = new JTextArea();
        JScrollPane panelConsola = new JScrollPane(area);

        // handle "System.out"
        new SwingWorker<Void, String>() {
            @Override protected Void doInBackground() throws Exception {
                Scanner s = new Scanner(out);
                while (s.hasNextLine()) publish(s.nextLine() + "\n");
                return null;
            }
            @Override protected void process(List<String> chunks) {
                for (String line : chunks) area.append(line);
            }
        }.execute();

        // handle "System.in"
        area.addKeyListener(new KeyAdapter() {
            private StringBuffer line = new StringBuffer();
            @Override public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c == KeyEvent.VK_ENTER) {
                    in.println(line);
                    line.setLength(0); 
                } else if (c == KeyEvent.VK_BACK_SPACE) { 
                    line.setLength(line.length() - 1); 
                } else if (!Character.isISOControl(c)) {
                    line.append(e.getKeyChar());
                }
            }
        });
        panelConsola.setBounds(10, 300, 300, 300);
        this.add(panelConsola);
        
    }
    public static void updateEnergia(int gasto){
		progressBar.updateActualValue(gasto);
	}
    
}


