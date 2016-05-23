/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import datos.DatosMapa;
import domain.Nodo;
import frsf.cidisi.exercise.agente.search.Agente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
    JComboBox jComboBoxEstrategia;
    
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
        textDescripcionNodo.setBounds(50, 10, 300, 14);

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
        jCheckBoxNodoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNodoInicioActionPerformed(evt);
            }  

            
        });
        
        jCheckBoxNodoDestino.setText("Nodo Destino");
        this.add(jCheckBoxNodoDestino);
        jCheckBoxNodoDestino.setBounds(10, 120, 150, 23);
        jCheckBoxNodoDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNodoDestinoActionPerformed(evt);
            }  
        });

        jCheckBoxServicioAscensor.setSelected(true);
        DatosMapa.setAscensoresFueraServicio(true);
        jCheckBoxServicioAscensor.setText("Servicio Ascensor");
        this.add(jCheckBoxServicioAscensor);
        jCheckBoxServicioAscensor.setBounds(10, 220, 150, 23);
        jCheckBoxServicioAscensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxServicioAscensor();
            }  

            
        });

        jCheckBoxEnergiaElectrica.setSelected(true);
        DatosMapa.setEnergiaElectrica(true);
        jCheckBoxEnergiaElectrica.setText("Energia Electrica");
        this.add(jCheckBoxEnergiaElectrica);
        jCheckBoxEnergiaElectrica.setBounds(10, 250, 150, 23);
        jCheckBoxEnergiaElectrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxServicioEnergiaElectrica();
            }  

            

            
        });
        
        jComboBoxEstrategia = new JComboBox();
        jComboBoxEstrategia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMPLITUD", "COSTO_UNIFORME", "A_ASTERISCO" }));
        this.add(jComboBoxEstrategia);
        jComboBoxEstrategia.setBounds(10, 190, 120, 20);
        jComboBoxEstrategia.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                jComboBoxListener();
            }
          
           
        });
        Agente.setSearchStrategy(2);

        JLabel jLabel = new JLabel();
        jLabel.setText("Estrategia de busqueda:");
        this.add(jLabel);
        jLabel.setBounds(10, 170, 200, 14);

        
        this.setearNodo(null);
    }
    private void jCheckBoxObstaculoActionPerformed(ActionEvent evt) {
        if(jCheckBoxHayObstaculo.isSelected())
            DatosMapa.addObstaculo(nodo);
        else
            DatosMapa.removeObstaculo(nodo);
        
    }
    private void jCheckBoxLuzActionPerformed(ActionEvent evt) {
        if(jCheckBoxHayLuz.isSelected())
            DatosMapa.addNodoSinLuz(nodo);
        else 
            DatosMapa.removeNodoSinLuz(nodo);
        
    }    
    public void setearNodo(Nodo nodo){
        if (nodo==null){
            textDescripcionNodo.setText("");
            jCheckBoxHayLuz.setSelected(false);
            jCheckBoxHayObstaculo.setSelected(false);
            jCheckBoxNodoInicio.setSelected(false);
            jCheckBoxNodoDestino.setSelected(false);
            
            
        }
        else{
            this.nodo=nodo;
            textDescripcionNodo.setText(nodo.getDescripcion());
            jCheckBoxHayLuz.setSelected(nodo.hayLuz());
            jCheckBoxHayObstaculo.setSelected(nodo.hayObstaculo());
            jCheckBoxNodoInicio.setSelected(false);
            jCheckBoxNodoDestino.setSelected(false);
            if(DatosMapa.getPosicion()!=null)
                    if (DatosMapa.getPosicion().equals(nodo))
                        jCheckBoxNodoInicio.setSelected(true);
            if(DatosMapa.getDestino()!=null)
                if(DatosMapa.getDestino().equals(nodo))
                    jCheckBoxNodoDestino.setSelected(true);
            
            
        }
            
    }
    private void jCheckBoxNodoInicioActionPerformed(ActionEvent evt) {
       if(jCheckBoxNodoInicio.isSelected())
           DatosMapa.setPosicion(nodo);
    }
    private void jCheckBoxNodoDestinoActionPerformed(ActionEvent evt) {
       if(jCheckBoxNodoDestino.isSelected())
           DatosMapa.setDestino(nodo);
        
    }
     private void jComboBoxListener() {
       Agente.setSearchStrategy(jComboBoxEstrategia.getSelectedIndex()+2);
     }
     private void jCheckBoxServicioAscensor() {
         if(jCheckBoxServicioAscensor.isSelected())  
            DatosMapa.setAscensoresFueraServicio(false);
        }
     private void jCheckBoxServicioEnergiaElectrica() {
         DatosMapa.setEnergiaElectrica(false);
     }
}
