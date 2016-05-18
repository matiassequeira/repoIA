/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author USUARIO
 */
public class ScrollPanelMapa extends JScrollPane{
    final ImagenFondo imagenFondo;
    
    public double zoom;
    public ScrollPanelMapa(ImagenFondo img){
        super(img);
        
     
       
        
        imagenFondo= img;
        imagenFondo.setScroll(this);
        
        
        
    }
    
      
       
    
}

