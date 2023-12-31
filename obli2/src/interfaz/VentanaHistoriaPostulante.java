/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.*;
import java.awt.Cursor;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nicol
 */
public class VentanaHistoriaPostulante extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form VentanaHistoriaPostulante
     */
    public VentanaHistoriaPostulante(Sistema sis) {
        initComponents();
        modelo = sis;
        modelo.addObserver(this);

        cargarListaPostulantes();
        vaciarDatos();
    }

    public void update(Observable o, Object arg) {
        cargarListaPostulantes();
        vaciarDatos();
    }

    public void cargarListaPostulantes() {
        String[] postsConCedula = modelo.obtenerPostulantesOrdenadosString();
        listaPostulantes.setListData(postsConCedula);
    }

    public void cargarDatosPostulante(Postulante postulante) {
        labelNombre.setText(postulante.getNombre());
        labelCedula.setText(String.valueOf(postulante.getCedula()));
        labelDireccion.setText(postulante.getDireccion());
        labelTelefono.setText(postulante.getTelefono());
        labelMail.setText(postulante.getMail());
        labelLinkedin.setText(postulante.getLinkedin());
        labelFormato.setText(postulante.getFormato());
        listaExperiencia.setListData(arrayHashmap(postulante));

    }

    public void vaciarDatos() {
        labelNombre.setText("");
        labelCedula.setText("");
        labelDireccion.setText("");
        labelTelefono.setText("");
        labelMail.setText("");
        labelLinkedin.setText("");
        labelFormato.setText("");
        listaExperiencia.setListData(new Postulante[0]);
        DefaultTableModel tabla = (DefaultTableModel) tablaEntrevistas.getModel();
        tabla.setRowCount(0);
    }

    public String[] arrayHashmap(Postulante postulante) {
        HashMap<Tematica, Integer> exp = postulante.getExperiencia();
        String[] experiencias = new String[exp.size()];
        ArrayList<Map.Entry<Tematica, Integer>> entradas = new ArrayList<>(exp.entrySet());

        //recorro el arraylist con un for teniendo acceso al i
        for (int i = 0; i < entradas.size(); i++) {
            Map.Entry<Tematica, Integer> entrada = entradas.get(i);
            String tema = entrada.getKey().toString();
            Integer valor = entrada.getValue();
            experiencias[i] = tema + " (" + valor + ")";
        }
        return experiencias;
    }
    
    public void cargarTablaEntrevistas(ArrayList<Entrevista> entrevistas, String busqueda) {
        DefaultTableModel model = (DefaultTableModel) tablaEntrevistas.getModel();
        model.setRowCount(0);

        for (Entrevista entrevista : entrevistas) {
            String comentario = entrevista.getComentarios();
            Object[] fila = {entrevista.getId(), entrevista.getEvaluador(), entrevista.getPuntaje(), resaltarCoincidencias(comentario, busqueda)};
            model.addRow(fila);
        }
    }
    private String resaltarCoincidencias(String texto, String busqueda) {
        // Escapamos los caracteres especiales de HTML para evitar posibles problemas
        texto = texto.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");

        // Creamos una cadena con formato HTML para resaltar las coincidencias en rojo
        String textoResaltado = texto.replaceAll("(?i)" + busqueda, "<font color='red'>$0</font>");

        // Devolvemos la cadena HTML resaltada
        return "<html>" + textoResaltado + "</html>";
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPostulantes = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelMail = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelLinkedin = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelFormato = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaExperiencia = new javax.swing.JList();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        campoBusqueda = new javax.swing.JTextField();
        btnResetear = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEntrevistas = new javax.swing.JTable();
        btnBuscar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Historial de postulante");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(448, 6, 240, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Postulantes:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(37, 37, 83, 20);

        listaPostulantes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaPostulantes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPostulantesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaPostulantes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(37, 69, 344, 252);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(561, 59, 59, 20);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNombre.setText("jLabel4");
        jPanel1.add(labelNombre);
        labelNombre.setBounds(835, 59, 217, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Cédula:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(561, 91, 50, 20);

        labelCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCedula.setText("jLabel6");
        jPanel1.add(labelCedula);
        labelCedula.setBounds(835, 91, 217, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Dirección:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(561, 123, 68, 20);

        labelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDireccion.setText("jLabel8");
        jPanel1.add(labelDireccion);
        labelDireccion.setBounds(835, 123, 217, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Telefono");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(561, 155, 61, 20);

        labelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTelefono.setText("jLabel10");
        jPanel1.add(labelTelefono);
        labelTelefono.setBounds(835, 155, 217, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Mail:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(561, 187, 34, 20);

        labelMail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMail.setText("jLabel12");
        jPanel1.add(labelMail);
        labelMail.setBounds(835, 187, 217, 20);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Linkedin:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(561, 219, 80, 20);

        labelLinkedin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelLinkedin.setForeground(new java.awt.Color(0, 0, 255));
        labelLinkedin.setText("jLabel14");
        labelLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLinkedinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelLinkedinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelLinkedinMouseExited(evt);
            }
        });
        jPanel1.add(labelLinkedin);
        labelLinkedin.setBounds(835, 219, 217, 20);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Formato:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(561, 251, 61, 20);

        labelFormato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelFormato.setText("jLabel16");
        jPanel1.add(labelFormato);
        labelFormato.setBounds(835, 251, 217, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Experiencia:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(561, 283, 82, 20);

        listaExperiencia.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaExperiencia);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(835, 283, 217, 98);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Buscar:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(40, 430, 41, 16);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(37, 396, 1015, 10);
        jPanel1.add(campoBusqueda);
        campoBusqueda.setBounds(150, 420, 287, 26);

        btnResetear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResetear.setText("Resetear");
        btnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetear);
        btnResetear.setBounds(660, 420, 110, 31);

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(50, 720, 78, 31);

        tablaEntrevistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Evaluador", "Puntaje", "Comentarios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEntrevistas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaEntrevistas.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaEntrevistas);
        if (tablaEntrevistas.getColumnModel().getColumnCount() > 0) {
            tablaEntrevistas.getColumnModel().getColumn(0).setResizable(false);
            tablaEntrevistas.getColumnModel().getColumn(1).setResizable(false);
            tablaEntrevistas.getColumnModel().getColumn(1).setPreferredWidth(180);
            tablaEntrevistas.getColumnModel().getColumn(2).setResizable(false);
            tablaEntrevistas.getColumnModel().getColumn(2).setPreferredWidth(130);
            tablaEntrevistas.getColumnModel().getColumn(3).setResizable(false);
            tablaEntrevistas.getColumnModel().getColumn(3).setPreferredWidth(629);
        }

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(50, 470, 1020, 240);

        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar1);
        btnBuscar1.setBounds(560, 420, 90, 31);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1160, 820);

        setBounds(0, 0, 1172, 831);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void listaPostulantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPostulantesValueChanged
        // TODO add your handling code here:
        String selected = (String) listaPostulantes.getSelectedValue();
        if (selected != null && !selected.equals("")) {
            Postulante postulante = devolverPostulantePorNombreCedula(selected);
            cargarDatosPostulante(postulante);
            ArrayList<Entrevista> entrevistasFiltradas = modelo.obtenerEntrevistasPorPersona(postulante);
            cargarTablaEntrevistas(entrevistasFiltradas, "");
            campoBusqueda.setText("");
        }

    }//GEN-LAST:event_listaPostulantesValueChanged
    public Postulante devolverPostulantePorNombreCedula(String nombreConCedula) {
        String[] arraySplit = nombreConCedula.split(" ");
        //agarro el ultimo bloque del split, el que se encuentra la cedula con parentesis
        String cedulaPostConParentesis = arraySplit[arraySplit.length - 1];
        int cedulaPost = Integer.parseInt(cedulaPostConParentesis.substring(1, cedulaPostConParentesis.length() - 1));
        Postulante postulante = modelo.devolverPostulanteCedula(cedulaPost);
        return postulante;
    }
    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
        String selected = (String) listaPostulantes.getSelectedValue();
        if (selected != null && !selected.equals("")) {
            Postulante postulanteSeleccionado = devolverPostulantePorNombreCedula(selected);
            String busqueda = campoBusqueda.getText();
            ArrayList<Entrevista> entrevistasFiltradas = modelo.obtenerEntrevistaPorBusqueda(postulanteSeleccionado, busqueda);
            cargarTablaEntrevistas(entrevistasFiltradas, busqueda);
        }

    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearActionPerformed
        // TODO add your handling code here:
        String selected = (String) listaPostulantes.getSelectedValue();
        if (selected != null && !selected.equals("")) {
            Postulante postulanteSeleccionado = devolverPostulantePorNombreCedula(selected);
            ArrayList<Entrevista> entrevistas = modelo.obtenerEntrevistasPorPersona(postulanteSeleccionado);
            cargarTablaEntrevistas(entrevistas, "");
            campoBusqueda.setText("");
        }
    }//GEN-LAST:event_btnResetearActionPerformed

    private void labelLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLinkedinMouseClicked
        // TODO add your handling code here:
        String linkUsuario = labelLinkedin.getText();
        try {
            // Abrir el enlace en un navegador web
            Desktop.getDesktop().browse(new URI(linkUsuario));
        } catch (IOException | URISyntaxException ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: El enlace no es válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_labelLinkedinMouseClicked
    private void labelLinkedinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLinkedinMouseEntered
        // TODO add your handling code here:
        //labelLinkedin.setText("<html><u>" + labelLinkedin.getText() + "</u></html>");
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelLinkedinMouseEntered

    private void labelLinkedinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLinkedinMouseExited
        // TODO add your handling code here:
        labelLinkedin.setText(labelLinkedin.getText());
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_labelLinkedinMouseExited

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnResetear;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField campoBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFormato;
    private javax.swing.JLabel labelLinkedin;
    private javax.swing.JLabel labelMail;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JList listaExperiencia;
    private javax.swing.JList listaPostulantes;
    private javax.swing.JTable tablaEntrevistas;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
