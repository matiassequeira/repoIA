/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import domain.Nodo;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class PanelSetearDatos extends JPanel{
    JCheckBox jCheckBoxHayObstaculo ;
    JCheckBox jCheckBoxHayLuz ;
    JCheckBox jCheckBoxNodoInicio ;
    JCheckBox jCheckBoxNodoDestino ;
    JCheckBox jCheckBoxServicioAscensor ;
    JCheckBox jCheckBoxEnergiaElectrica ;
    JTextField textDescripcionNodo;
    Nodo nodo;
    
    public PanelSetearDatos(){
        
        JTextField textNodo = new javax.swing.JTextField();
        textDescripcionNodo = new javax.swing.JTextField();
        jCheckBoxHayObstaculo = new javax.swing.JCheckBox();
        jCheckBoxHayLuz = new javax.swing.JCheckBox();
        jCheckBoxNodoInicio = new javax.swing.JCheckBox();
        jCheckBoxNodoDestino = new javax.swing.JCheckBox();
        jCheckBoxServicioAscensor = new javax.swing.JCheckBox();
        jCheckBoxEnergiaElectrica = new javax.swing.JCheckBox();

        

        this.setLayout(null);

        textNodo.setEditable(false);
        textNodo.setText("Nodo:");
        textNodo.setBorder(null);
        this.add(textNodo);
        textNodo.setBounds(10, 10, 29, 14);

        textDescripcionNodo.setEditable(false);
        
        textDescripcionNodo.setBorder(null);
        this.add(textDescripcionNodo);
        textDescripcionNodo.setBounds(50, 10, 90, 14);

        jCheckBoxHayObstaculo.setText("Hay Obstaculo");
        jCheckBoxHayObstaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxObstaculoActionPerformed(evt);
            }

           
        });
        this.add(jCheckBoxHayObstaculo);
        jCheckBoxHayObstaculo.setBounds(10, 40, 150, 23);

        jCheckBoxHayLuz.setText("Hay Luz");
        jCheckBoxHayLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLuzActionPerformed(evt);
            }

           
        });
        this.add(jCheckBoxHayLuz);
        jCheckBoxHayLuz.setBounds(10, 70, 150, 23);

        jCheckBoxNodoInicio.setText("Nodo Inicio");
        this.add(jCheckBoxNodoInicio);
        jCheckBoxNodoInicio.setBounds(10, 100, 150, 23);
        
        jCheckBoxNodoDestino.setText("Nodo Destino");
        this.add(jCheckBoxNodoDestino);
        jCheckBoxNodoDestino.setBounds(10, 120, 150, 23);

        jCheckBoxServicioAscensor.setSelected(true);
        jCheckBoxServicioAscensor.setText("Servicio Ascensor");
        this.add(jCheckBoxServicioAscensor);
        jCheckBoxServicioAscensor.setBounds(10, 220, 150, 23);

        jCheckBoxEnergiaElectrica.setSelected(true);
        jCheckBoxEnergiaElectrica.setText("Energia Electrica");
        this.add(jCheckBoxEnergiaElectrica);
        jCheckBoxEnergiaElectrica.setBounds(10, 250, 150, 23);
        
        this.setearNodo(null);
    }
    private void jCheckBoxObstaculoActionPerformed(ActionEvent evt) {
        nodo.hayObstaculo(jCheckBoxHayObstaculo.isSelected());
        
    }
    private void jCheckBoxLuzActionPerformed(ActionEvent evt) {
        nodo.hayLuz(jCheckBoxHayLuz.isSelected());
        
    }    
    public void setearNodo(Nodo nodo){
        if (nodo==null){
            textDescripcionNodo.setText("");
            jCheckBoxHayLuz.setSelected(false);
            jCheckBoxHayObstaculo.setSelected(false);
            
            
        }
        else{
            this.nodo=nodo;
            textDescripcionNodo.setText(nodo.getDescripcion());
            jCheckBoxHayLuz.setSelected(nodo.hayLuz());
            jCheckBoxHayObstaculo.setSelected(nodo.hayObstaculo());
            
            
        }
            
    }
}
