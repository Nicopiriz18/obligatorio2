package interfaz;

import interfaz.*;
import dominio.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class VentanaRegistroPuesto extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form altaPostulante
     */
    public VentanaRegistroPuesto(Sistema sis) {
        initComponents();
        modelo = sis;
        modelo.addObserver(this);
        temas = new ArrayList<Tematica>();
        cargarCombo();
    }

    @Override
    public void update(Observable o, Object arg) {
        cargarCombo();
        temas = new ArrayList<Tematica>();
        cargarListaTemas();
    }

    public void cargarCombo() {
        ArrayList<Tematica> temas = modelo.obtenerTematicas();
        for (Tematica tema : temas) {
            comboTemas.addItem(tema.getNombre());
        }
    }

    public void cargarListaTemas() {
        listaTemas.setListData(temas.toArray());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formatoTrabajo = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        comboTemas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombrePuesto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        radioRemoto = new javax.swing.JRadioButton();
        radioPresencial = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTemas = new javax.swing.JList();
        radioMixto = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        buttonAgregarExperiencia = new javax.swing.JButton();
        buttonAgregarExperiencia2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        comboTemas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        comboTemas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTemasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Alta de puesto");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Nombre:");

        nombrePuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePuestoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Temas requeridos");

        formatoTrabajo.add(radioRemoto);
        radioRemoto.setText("Remoto");
        radioRemoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRemotoActionPerformed(evt);
            }
        });

        formatoTrabajo.add(radioPresencial);
        radioPresencial.setText("Presencial");
        radioPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPresencialActionPerformed(evt);
            }
        });

        listaTemas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaTemas);

        formatoTrabajo.add(radioMixto);
        radioMixto.setText("Mixto");
        radioMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMixtoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSiguiente.setText("Registrar");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Formato");

        buttonAgregarExperiencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAgregarExperiencia.setText("Agregar");
        buttonAgregarExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarExperienciaActionPerformed(evt);
            }
        });

        buttonAgregarExperiencia2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAgregarExperiencia2.setText("Eliminar");
        buttonAgregarExperiencia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarExperiencia2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Se puede eliminar un tema agregado clickeando en el mismo y luego en el boton eliminar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombrePuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(51, 51, 51)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(radioRemoto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(radioPresencial, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(radioMixto, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addGap(96, 96, 96))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboTemas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonAgregarExperiencia)
                                    .addComponent(buttonAgregarExperiencia2))
                                .addGap(0, 111, Short.MAX_VALUE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nombrePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(radioRemoto)
                        .addComponent(radioPresencial)
                        .addComponent(radioMixto)))
                .addGap(39, 39, 39)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(comboTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAgregarExperiencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAgregarExperiencia2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSiguiente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panel);
        panel.setBounds(-20, 10, 670, 480);

        setBounds(0, 0, 592, 566);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String nombre = this.nombrePuesto.getText();
        String selectedRadioButton = "";
        if (radioRemoto.isSelected()) {
            selectedRadioButton = "remoto";
        } else if (radioPresencial.isSelected()) {
            selectedRadioButton = "presencial";
        } else if (radioMixto.isSelected()) {
            selectedRadioButton = "mixto";
        }
        boolean validos = true;
        //se recorre los distintos tipos de errores que pueden ocurrir para darle al usuario un tipo de error no generico
        if (nombre.strip().equals("") || selectedRadioButton == null || selectedRadioButton.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            validos = false;
        } else if (validos && !modelo.puestoEsUnico(nombre)) {
            JOptionPane.showMessageDialog(this, "Ya existe un puesto con el nombre especificado. El nombre del puesto no puede repetirse", "Error", JOptionPane.ERROR_MESSAGE);
            validos = false;
        } else if (validos && temas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Se debe ingresar al menos un tema para el puesto", "Error", JOptionPane.ERROR_MESSAGE);
            validos = false;
        }
        if (validos) {
            Puesto puesto = new Puesto(nombre, selectedRadioButton, temas);
            modelo.agregarPuesto(puesto);
            JOptionPane.showMessageDialog(this, "Puesto agregado con éxito.", "Operación exitosa.", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void radioMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMixtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMixtoActionPerformed

    private void radioPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPresencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPresencialActionPerformed

    private void radioRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRemotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioRemotoActionPerformed

    private void nombrePuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePuestoActionPerformed

    private void comboTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTemasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTemasActionPerformed

    private void buttonAgregarExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarExperienciaActionPerformed
        // TODO add your handling code here:
        String tematicaElegidaString = (String) this.comboTemas.getSelectedItem();
        Tematica tematicaElegida = modelo.devolverTematicaNombre(tematicaElegidaString);
        if (tematicaElegida.getNombre().equals("default")) {
            JOptionPane.showMessageDialog(this, "No se seleccionó una experiencia a agregar", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            temas.add(tematicaElegida);
            cargarListaTemas();
        }
    }//GEN-LAST:event_buttonAgregarExperienciaActionPerformed

    private void buttonAgregarExperiencia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarExperiencia2ActionPerformed
        Tematica seleccionado = (Tematica) listaTemas.getSelectedValue();
        if (seleccionado == null) {
            JOptionPane.showMessageDialog(this, "No se seleccionó un tema a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            temas.remove(seleccionado);
            cargarListaTemas();
        }
    }//GEN-LAST:event_buttonAgregarExperiencia2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton buttonAgregarExperiencia;
    private javax.swing.JButton buttonAgregarExperiencia2;
    private javax.swing.JComboBox<String> comboTemas;
    private javax.swing.ButtonGroup formatoTrabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaTemas;
    private javax.swing.JTextField nombrePuesto;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton radioMixto;
    private javax.swing.JRadioButton radioPresencial;
    private javax.swing.JRadioButton radioRemoto;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private ArrayList<Tematica> temas;
}
