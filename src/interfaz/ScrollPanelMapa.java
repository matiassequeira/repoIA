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
public class ScrollPanelMapa extends JScrollPane implements MouseMotionListener, MouseWheelListener{
    final ImagenFondo imagenFondo;
    
    public double zoom;
    public ScrollPanelMapa(ImagenFondo img){
        super(img);
        
     
       
        
        imagenFondo= img;
        
        
        
        addMouseMotionListener(this);
        addMouseWheelListener(this);
    }
    
        @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        /*
        if(imagenFondoZoomX>-(imagenFondo.getIconWidth()-this.getWidth())){
            if(e.getX()>(this.getWidth()-50)){
                imagenFondoZoomX-=10;
                repaint();
            }
        }
        if(imagenFondoZoomX<0){
            if(e.getX()>0 && e.getX()<50){
                imagenFondoZoomX+=10;
                repaint();
            }
        }
        if(imagenFondoZoomY<0){
            if(e.getY()>0 && e.getY()<50){
                imagenFondoZoomY+=10;
                repaint();
            }
        }
        if(imagenFondoZoomY>-(imagenFondo.getIconHeight()-this.getHeight())){
            if(e.getY()>(this.getHeight()-50)){
                imagenFondoZoomY-=10;
                //imagenFondoY+=10;
                repaint();
            }
        }*/
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        
        if(e.getWheelRotation()<0){
            //zoom+=-e.getUnitsToScroll()*0.3;
            zoom-=0.3;
        }
        else{
            if(zoom>1){
                //zoom-=e.getUnitsToScroll()*0.3;
                zoom+=0.3;
            }
        }
        //zoom=e.getUnitsToScroll()*0.3;
        imagenFondo.setZoom(zoom);
    }
       
    
}

