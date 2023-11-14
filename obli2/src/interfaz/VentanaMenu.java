/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.*;
import interfaz.*;
import javax.swing.*;

/**
 *
 * @author nicol
 */
public class VentanaMenu extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMenu
     */
    public VentanaMenu(Sistema sis) {
        initComponents();
        modelo = sis;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPostulantes = new javax.swing.JMenu();
        registroTematica = new javax.swing.JMenuItem();
        altaPostulante = new javax.swing.JMenuItem();
        bajaPostulante = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        registroEvaluador = new javax.swing.JMenuItem();
        ingresoEntrevista = new javax.swing.JMenuItem();
        registroPuesto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        consultaPuesto = new javax.swing.JMenuItem();
        historiaPostulante = new javax.swing.JMenuItem();
        consultaPorTematica = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        menuPostulantes.setText("Postulantes");

        registroTematica.setText("Registro de tematica");
        registroTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroTematicaActionPerformed(evt);
            }
        });
        menuPostulantes.add(registroTematica);

        altaPostulante.setText("Alta de postulante");
        altaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaPostulanteActionPerformed(evt);
            }
        });
        menuPostulantes.add(altaPostulante);

        bajaPostulante.setText("Baja de postulante");
        bajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaPostulanteActionPerformed(evt);
            }
        });
        menuPostulantes.add(bajaPostulante);

        jMenuBar1.add(menuPostulantes);

        jMenu1.setText("Evaluadores");

        registroEvaluador.setText("Registro de Evaluador");
        registroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroEvaluadorActionPerformed(evt);
            }
        });
        jMenu1.add(registroEvaluador);

        ingresoEntrevista.setText("Ingreso de entrevista");
        ingresoEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoEntrevistaActionPerformed(evt);
            }
        });
        jMenu1.add(ingresoEntrevista);

        registroPuesto.setText("Registro de puesto");
        registroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroPuestoActionPerformed(evt);
            }
        });
        jMenu1.add(registroPuesto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        consultaPuesto.setText("Consulta para puesto");
        consultaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaPuestoActionPerformed(evt);
            }
        });
        jMenu2.add(consultaPuesto);

        historiaPostulante.setText("Historia de postulante");
        jMenu2.add(historiaPostulante);

        consultaPorTematica.setText("Consulta por tematica");
        consultaPorTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaPorTematicaActionPerformed(evt);
            }
        });
        jMenu2.add(consultaPorTematica);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoEntrevistaActionPerformed
        // TODO add your handling code here:
        VentanaIngresoEntrevista vent = new VentanaIngresoEntrevista(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_ingresoEntrevistaActionPerformed

    private void registroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroPuestoActionPerformed
        // TODO add your handling code here:
        VentanaRegistroPuesto vent = new VentanaRegistroPuesto(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_registroPuestoActionPerformed

    private void altaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaPostulanteActionPerformed
        // TODO add your handling code here:
        AltaPostulante vent = new AltaPostulante(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_altaPostulanteActionPerformed

    private void registroTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroTematicaActionPerformed
        // TODO add your handling code here:
        VentanaRegistroTematica vent = new VentanaRegistroTematica(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_registroTematicaActionPerformed

    private void bajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaPostulanteActionPerformed
        // TODO add your handling code here:
        VentanaBajaPostulante vent = new VentanaBajaPostulante(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_bajaPostulanteActionPerformed

    private void registroEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroEvaluadorActionPerformed
        // TODO add your handling code here:
        VentanaRegistroEvaluador vent = new VentanaRegistroEvaluador(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_registroEvaluadorActionPerformed

    private void consultaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaPuestoActionPerformed
        // TODO add your handling code here:
        VentanaConsultaPuesto vent = new VentanaConsultaPuesto(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_consultaPuestoActionPerformed

    private void consultaPorTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaPorTematicaActionPerformed
        // TODO add your handling code here:
        VentanaConsultaTematica vent = new VentanaConsultaTematica(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_consultaPorTematicaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem altaPostulante;
    private javax.swing.JMenuItem bajaPostulante;
    private javax.swing.JMenuItem consultaPorTematica;
    private javax.swing.JMenuItem consultaPuesto;
    private javax.swing.JMenuItem historiaPostulante;
    private javax.swing.JMenuItem ingresoEntrevista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuPostulantes;
    private javax.swing.JMenuItem registroEvaluador;
    private javax.swing.JMenuItem registroPuesto;
    private javax.swing.JMenuItem registroTematica;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
