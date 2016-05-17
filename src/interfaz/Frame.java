/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import domain.Nodo;
import domain.Punto;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author USUARIO
 */
public class Frame extends JFrame{
    
    public PanelSetearDatos panelDatos;
    public PanelMapa panelMapa;
    public ImagenFondo imagen; 
    public Frame(Map<Punto,Nodo> mapa){
        setBounds(0, 0, 1200, 600);
        getContentPane().setLayout(null);
        imagen= new ImagenFondo(mapa);
        panelMapa = new PanelMapa(mapa);
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
    public static void main(String args[]) throws IOException {
        
        //new Frame();
        
        
    }
    
}


