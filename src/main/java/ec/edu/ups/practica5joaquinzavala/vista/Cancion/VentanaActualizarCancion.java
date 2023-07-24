/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.vista.Cancion;

import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCompositor;
import ec.edu.ups.practica5joaquinzavala.modelo.Cancion;
import ec.edu.ups.practica5joaquinzavala.modelo.Compositor;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class VentanaActualizarCancion extends javax.swing.JInternalFrame {

    private ControladorCompositor controladorCompositor;
    private Compositor compositor;
    private ResourceBundle mensajes;
    
    
    public void cambiarIdioma(Locale localizacion) {
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        
        jblApe.setText(mensajes.getString("jlb.ape"));
        jblMenPanB.setText(mensajes.getString("menuitem.buscan"));
        jblMenPanC.setText(mensajes.getString("menuitem.actcnc"));
        jblCod.setText(mensajes.getString("jlb.cod"));
        jblCod2.setText(mensajes.getString("jlb.cod"));
        jblNom.setText(mensajes.getString("jlb.nom"));
        jblTieMin.setText(mensajes.getString("jlb.min"));
        jblTitP.setText(mensajes.getString("menuitem.actcnc"));
        jblTitC.setText(mensajes.getString("jlb.tit"));
        btnCancelar.setText(mensajes.getString("btn.can"));
        btnCancelar1.setText(mensajes.getString("btn.can"));
        jblLet.setText(mensajes.getString("jlb.let"));
        btnBuscarCompositor.setText(mensajes.getString("btn.bus"));
        btnActualizarCancion.setText(mensajes.getString("btn.gua"));
        
        
        this.setTitle(mensajes.getString("menuitem.buscnc"));
        
    }
    
    public VentanaActualizarCancion(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
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
        jPanel2 = new javax.swing.JPanel();
        jblTitP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jblApe = new javax.swing.JLabel();
        jblNom = new javax.swing.JLabel();
        jblCod = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnBuscarCompositor = new javax.swing.JButton();
        jblMenPanB = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jblTieMin = new javax.swing.JLabel();
        jblTitC = new javax.swing.JLabel();
        jblCod2 = new javax.swing.JLabel();
        txtCodigoCancion = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtTiempoEnMinutos = new javax.swing.JTextField();
        btnActualizarCancion = new javax.swing.JButton();
        jblMenPanC = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jblLet = new javax.swing.JLabel();
        btnBuscarCancion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLetra = new javax.swing.JTextArea();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Actualizar Cancion");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblTitP.setText("Buscar Cancion");
        jPanel2.add(jblTitP, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 191, -1));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 36, -1, 190));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 190));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compositorImagen.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 190));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setEnabled(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblApe.setBackground(new java.awt.Color(204, 204, 255));
        jblApe.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblApe.setText("Apellido");
        jPanel6.add(jblApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 227, 114, 45));

        jblNom.setBackground(new java.awt.Color(204, 204, 255));
        jblNom.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblNom.setText("Nombre");
        jPanel6.add(jblNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 176, 114, 45));

        jblCod.setBackground(new java.awt.Color(204, 204, 255));
        jblCod.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblCod.setText("Codigo");
        jPanel6.add(jblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 125, 114, 45));

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel6.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 138, 295, -1));

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombre.setEnabled(false);
        jPanel6.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 189, 295, -1));

        txtApellido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtApellido.setEnabled(false);
        jPanel6.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 240, 295, -1));

        btnBuscarCompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnBuscarCompositor.setText("Buscar");
        btnBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCompositorActionPerformed(evt);
            }
        });
        jPanel6.add(btnBuscarCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jblMenPanB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jblMenPanB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jblMenPanB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jblMenPanB.setText("Buscar un compositor");
        jblMenPanB.setToolTipText("");
        jPanel6.add(jblMenPanB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 465, -1));

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setEnabled(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblTieMin.setBackground(new java.awt.Color(204, 204, 255));
        jblTieMin.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblTieMin.setText("TiempoEnMinutos");
        jPanel5.add(jblTieMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 200, 45));

        jblTitC.setBackground(new java.awt.Color(204, 204, 255));
        jblTitC.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblTitC.setText("Titulo");
        jPanel5.add(jblTitC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 114, 45));

        jblCod2.setBackground(new java.awt.Color(204, 204, 255));
        jblCod2.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblCod2.setText("Codigo");
        jPanel5.add(jblCod2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 114, 45));

        txtCodigoCancion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodigoCancion.setEnabled(false);
        jPanel5.add(txtCodigoCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 100, -1));

        txtTitulo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTitulo.setEnabled(false);
        jPanel5.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 170, -1));

        txtTiempoEnMinutos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTiempoEnMinutos.setEnabled(false);
        jPanel5.add(txtTiempoEnMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 170, -1));

        btnActualizarCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/revert.png"))); // NOI18N
        btnActualizarCancion.setText("Guardar");
        btnActualizarCancion.setEnabled(false);
        btnActualizarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCancionActionPerformed(evt);
            }
        });
        jPanel5.add(btnActualizarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jblMenPanC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jblMenPanC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jblMenPanC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/updateCD.png"))); // NOI18N
        jblMenPanC.setText("Actuzalir una cancion");
        jblMenPanC.setToolTipText("Actulizar cancion");
        jPanel5.add(jblMenPanC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 465, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jblLet.setBackground(new java.awt.Color(204, 204, 255));
        jblLet.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblLet.setText("Letra");
        jPanel5.add(jblLet, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 114, 45));

        btnBuscarCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnBuscarCancion.setEnabled(false);
        btnBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCancionActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        txtLetra.setColumns(20);
        txtLetra.setRows(5);
        txtLetra.setEnabled(false);
        jScrollPane1.setViewportView(txtLetra);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, 170));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCompositorActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        this.compositor = controladorCompositor.buscarCompositor(codigo);
        if (compositor != null) {
            txtApellido.setText(compositor.getApellido());
            txtNombre.setText(compositor.getNombre());
            cambiarEstado(true);
        }else{
            JOptionPane.showMessageDialog(this, "No se encontrado compositor");
        }
    }//GEN-LAST:event_btnBuscarCompositorActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        cambiarEstado(false);
        cambiarEstadoDatosCancion(false);
        limipiarCampos();
        limipiarCamposCancion();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnActualizarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCancionActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        this.compositor = controladorCompositor.buscarCompositor(codigo);
        int codigoCancion = Integer.parseInt(txtCodigoCancion.getText());
        if(validarCamposCancion()) {
            String titulo = txtTitulo.getText();
            String letra = txtLetra.getText();
            double duracionEnMinutos = Double.parseDouble(txtTiempoEnMinutos.getText());
            controladorCompositor.actualizarCancion(compositor, codigoCancion, titulo, letra, duracionEnMinutos);
            JOptionPane.showMessageDialog(this, "La cancion " + titulo + " a sido actualizada");
            cambiarEstadoDatosCancion(false);
            cambiarEstado(false);
            limipiarCamposCancion();
            limipiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se han ingresado todos los datos");
        }
    }//GEN-LAST:event_btnActualizarCancionActionPerformed

    private boolean validarCamposCancion() {
        if (txtTitulo.getText().isEmpty() || txtCodigoCancion.getText().isEmpty() || txtLetra.getText().isEmpty() || txtTiempoEnMinutos.getText().isEmpty()) {
            return false;
        } return true;
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        this.limipiarCampos();
        this.limipiarCamposCancion();
        this.cambiarEstado(false);
        this.cambiarEstadoDatosCancion(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCancionActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        this.compositor = controladorCompositor.buscarCompositor(codigo);
        int codigoCancion = Integer.parseInt(txtCodigoCancion.getText());
        Cancion cancion = controladorCompositor.buscarCancion(compositor, codigoCancion);
        if (cancion != null) {
            txtTiempoEnMinutos.setText(String.valueOf(cancion.getTiempoEnMinutos()));
            txtTitulo.setText(cancion.getTitulo());
            txtLetra.setText(cancion.getLetra());
            cambiarEstadoDatosCancion(true);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontrado la cancion");
            this.limipiarCamposCancion();
        }
    }//GEN-LAST:event_btnBuscarCancionActionPerformed

    private void cambiarEstado(boolean bandera){
        txtCodigo.setEnabled(!bandera);
        txtCodigoCancion.setEnabled(bandera);
        btnBuscarCancion.setEnabled(bandera);
    }
    private void cambiarEstadoDatosCancion(boolean bandera){
        txtLetra.setEnabled(bandera);
        txtTitulo.setEnabled(bandera);
        txtTiempoEnMinutos.setEnabled(bandera);
        txtCodigoCancion.setEditable(!bandera);
        btnActualizarCancion.setEnabled(bandera);
    }
    private void limipiarCamposCancion(){
        txtCodigoCancion.setText("");
        txtLetra.setText("");
        txtTiempoEnMinutos.setText("");
        txtTitulo.setText("");
    }
    private void limipiarCampos(){
        txtCodigo.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCancion;
    private javax.swing.JButton btnBuscarCancion;
    private javax.swing.JButton btnBuscarCompositor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblApe;
    private javax.swing.JLabel jblCod;
    private javax.swing.JLabel jblCod2;
    private javax.swing.JLabel jblLet;
    private javax.swing.JLabel jblMenPanB;
    private javax.swing.JLabel jblMenPanC;
    private javax.swing.JLabel jblNom;
    private javax.swing.JLabel jblTieMin;
    private javax.swing.JLabel jblTitC;
    private javax.swing.JLabel jblTitP;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoCancion;
    private javax.swing.JTextArea txtLetra;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTiempoEnMinutos;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
