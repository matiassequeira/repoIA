/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import domain.Nodo;
import domain.Punto;
import excepciones.CoordenadasSinNodoException;
import frsf.cidisi.exercise.agente.search.AgenteMain;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author USUARIO
 */
public class PanelMapa extends JPanel{
    public  final ImagenFondo image;
    public JButton botonDisminuir;
    public JButton botonAumentar;
    public AgenteMain agenteMain;
    
   
    public PanelMapa(Map mapa, ImagenFondo imagen,AgenteMain agenteMain){
        setLayout(null);
        image=imagen;
        this.agenteMain = agenteMain;
        //image= new ImagenFondo(mapa);
        ScrollPanelMapa scrollPanelMap= new ScrollPanelMapa(image);
        
        scrollPanelMap.setBounds(10, 10, 650, 400);
        
        botonDisminuir= new JButton();
        botonDisminuir.setText("-");
        add(botonDisminuir);
        botonDisminuir.setBounds(10, 420, 50, 35);
        botonDisminuir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDisminuirClicked(evt);
            }

          
        });
        botonAumentar= new JButton();
        botonAumentar.setText("+");
        add(botonAumentar);
        botonAumentar.setBounds(80, 420, 50, 35);
        botonAumentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAumentarClicked(evt);
            }

            
          
        });
        
        JTextField textPisos = new JTextField();      
        textPisos.setEditable(false);
        textPisos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textPisos.setText("Pisos:");
        textPisos.setBorder(null);
        textPisos.setBounds(150, 420, 80, 35);
        add(textPisos);
        
        JButton botonPlantaBaja= new JButton();
        botonPlantaBaja.setText("0");
        add(botonPlantaBaja);
        botonPlantaBaja.setBounds(240, 420, 50, 35);
        botonPlantaBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPisoClicked(evt,0);
            }
        });
        
        JButton botonPrimerPiso= new JButton();
        botonPrimerPiso.setText("1");
        add(botonPrimerPiso);
        botonPrimerPiso.setBounds(300, 420, 50, 35);
        botonPrimerPiso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPisoClicked(evt,1);
            }
        });
        
        JButton botonSegundoPiso= new JButton();
        botonSegundoPiso.setText("2");
        add(botonSegundoPiso);
        botonSegundoPiso.setBounds(360, 420, 50, 35);
        botonSegundoPiso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPisoClicked(evt,2);
            }
        });
         JButton botonTercerPiso= new JButton();
        botonTercerPiso.setText("3");
        add(botonTercerPiso);
        botonTercerPiso.setBounds(410, 420, 50, 35);
        botonTercerPiso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPisoClicked(evt,3);
            }
        });
       
        
        JButton botonIniciar= new JButton();
        botonIniciar.setText("Iniciar");
        add(botonIniciar);
        botonIniciar.setBounds(10, 460, 80, 35);
        botonIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIniciar(evt);
            }

            
        });
        add(scrollPanelMap);
        
        

            
    }
      private void jButtonDisminuirClicked(MouseEvent evt) {
        image.setZoom(image.getZoom()*0.2);
      }
      private void jButtonAumentarClicked(MouseEvent evt) {
          image.setZoom(image.getZoom()*1.2);
      }
      private void jButtonPisoClicked(MouseEvent evt, int piso) {
         image.setPiso(piso);
      }
      private void jButtonIniciar(MouseEvent evt) {
          agenteMain.simulatorStart();
      }
     

}
