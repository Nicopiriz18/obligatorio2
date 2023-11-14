/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.*;
import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class VentanaConsultaTematica extends javax.swing.JFrame {

    /**
     * Creates new form VentanaConsultaTematica
     */
    public VentanaConsultaTematica(Sistema mod) {
        initComponents();
        modelo = mod;
        cargarLista();
    }

    public void cargarLista() {
        Tematica[] tematicas = modelo.obtenerTematicas().toArray(new Tematica[0]);
        listaTematicas.setListData(tematicas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        listaTematicas = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        buttonConsultar = new javax.swing.JButton();
        labelNroPostulantes = new javax.swing.JLabel();
        labelNroPuestos = new javax.swing.JLabel();
        buttonConsultar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaTematicas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaTematicas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Consulta por temática");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonConsultar.setText("Realizar consulta");
        buttonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarActionPerformed(evt);
            }
        });

        labelNroPostulantes.setText(" ");

        labelNroPuestos.setText(" ");

        buttonConsultar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonConsultar1.setText("Salir");
        buttonConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNroPostulantes)
                            .addComponent(buttonConsultar)
                            .addComponent(labelNroPuestos)
                            .addComponent(buttonConsultar1))
                        .addGap(32, 32, 32))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addGap(29, 29, 29)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(buttonConsultar)
                .addGap(18, 18, 18)
                .addComponent(labelNroPostulantes)
                .addGap(47, 47, 47)
                .addComponent(labelNroPuestos)
                .addGap(37, 37, 37)
                .addComponent(buttonConsultar1)
                .addGap(15, 15, 15))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(229, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarActionPerformed
        // TODO add your handling code here:
        Tematica tem = (Tematica) this.listaTematicas.getSelectedValue();
        if (tem == null) {
            JOptionPane.showMessageDialog(this, "No se seleccionó una tematica a consultar.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int cantidadMayor5 = modelo.consultarPostulantesTematica(tem);
            int cantidadPuestosTematica = modelo.consultarPuestosTematica(tem);
            labelNroPostulantes.setText("Cantidad de postulantes con puntuación mayor que 5 en " + tem.getNombre() + ":\n " + cantidadMayor5);
            labelNroPuestos.setText("Cantidad de puestos que requieren conocimiento de " + tem.getNombre() + ":\n " + cantidadPuestosTematica);
        }
    }//GEN-LAST:event_buttonConsultarActionPerformed

    private void buttonConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultar1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonConsultar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConsultar;
    private javax.swing.JButton buttonConsultar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNroPostulantes;
    private javax.swing.JLabel labelNroPuestos;
    private javax.swing.JList listaTematicas;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}