/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.vista.disco;

import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Cantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Disco;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESTUDIANTE
 */
public class VentanaListarDisco extends javax.swing.JInternalFrame {

  
    private ControladorCantante controladorCantante;
    private Cantante cantante;
    public VentanaListarDisco(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnBuscarCompositor = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisco = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setEnabled(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(204, 204, 255));
        jLabel12.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jLabel12.setText("Apellido");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 114, 45));

        jLabel13.setBackground(new java.awt.Color(204, 204, 255));
        jLabel13.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jLabel13.setText("Nombre");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 114, 45));

        jLabel14.setBackground(new java.awt.Color(204, 204, 255));
        jLabel14.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jLabel14.setText("Codigo");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 114, 45));

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel6.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 295, -1));

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombre.setEnabled(false);
        jPanel6.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 295, -1));

        txtApellido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtApellido.setEnabled(false);
        jPanel6.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 295, -1));

        btnBuscarCompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnBuscarCompositor.setText("Buscar");
        btnBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCompositorActionPerformed(evt);
            }
        });
        jPanel6.add(btnBuscarCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarRed.png"))); // NOI18N
        jLabel15.setText("Buscar un cantante");
        jLabel15.setToolTipText("");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 465, -1));

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        tblDisco.setBackground(new java.awt.Color(60, 63, 65));
        tblDisco.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        tblDisco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Año de lanzamiento"
            }
        ));
        tblDisco.setEnabled(false);
        jScrollPane1.setViewportView(tblDisco);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCompositorActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        this.cantante = controladorCantante.buscarCantante(codigo);
        if (cantante != null) {
            txtApellido.setText(cantante.getApellido());
            txtNombre.setText(cantante.getNombre());
            cargarTabla();
        }else{
            JOptionPane.showMessageDialog(this, "Cantante no registrado");
        }
    }//GEN-LAST:event_btnBuscarCompositorActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        limpiarCampos();
        this.setVisible(false);
        DefaultTableModel modelo = (DefaultTableModel) tblDisco.getModel();
        modelo.setNumRows(0);
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        limpiarCampos();
        this.setVisible(false);
        DefaultTableModel modelo = (DefaultTableModel) tblDisco.getModel();
        modelo.setNumRows(0);
    }//GEN-LAST:event_formInternalFrameActivated

    private void limpiarCampos(){
        txtCodigo.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        
    }
    private void cargarTabla(){
        int codigo = Integer.parseInt(txtCodigo.getText());
        this.cantante = controladorCantante.buscarCantante(codigo);
        DefaultTableModel modelo = (DefaultTableModel) tblDisco.getModel();
        modelo.setNumRows(0);
        List<Disco> listaDisco = controladorCantante.listarDiscos(cantante);
        if (!listaDisco.isEmpty()) {
            for (Disco disco : listaDisco) {
                String codigoDisco = String.valueOf(disco.getCodigo());
                String nombreDisco = disco.getNombre();
                String anioLanzamiento = String.valueOf(disco.getAnioDeLanzamiento());
                Object[] rowData = {codigoDisco, nombreDisco, anioLanzamiento};
                modelo.addRow(rowData);
            }
            tblDisco.setModel(modelo);
        }else {
            JOptionPane.showMessageDialog(this, "El cantante " + cantante.getNombre() + " " + cantante.getApellido() + " no tiene discos registrados");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCompositor;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDisco;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
