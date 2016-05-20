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
    
    public PanelSetearDatos panelDatos;
    public PanelMapa panelMapa;
    public ImagenFondo imagen; 
    public Frame(Map<Punto,Nodo> mapa, AgenteMain agenteMain){
        setBounds(0, 0, 1200, 720);
        getContentPane().setLayout(null);
        imagen= new ImagenFondo(mapa);
        panelMapa = new PanelMapa(mapa,imagen,agenteMain);
        panelMapa.setBounds(400,0,700,500);
        panelMapa.addMouseListener(new MouseListener() {
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
        getContentPane().add(panelMapa);
        
        panelDatos = new PanelSetearDatos();
        panelDatos.setBounds(0, 0, 350,690 );
        getContentPane().add(panelDatos);
        this.setVisible(true);
        
    }
     private void mouseClickedPanelMapa(MouseEvent e) {
         
         panelDatos.setearNodo(imagen.getNodoClickeado());
     }
    public void setPerception(AgentePerception perception){
        Nodo nodoPosicion= perception.getPosicionAgente();
        int x= nodoPosicion.getUbicacion().getX();
        int y= nodoPosicion.getUbicacion().getY();
        imagen.setAgente(x, y);
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
        panelConsola.setBounds(400, 515, 600, 130);
        this.add(panelConsola);
        
    }
    
}


