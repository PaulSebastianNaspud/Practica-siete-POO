/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.vista.disco;

import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Cantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Disco;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class VentanaBuscarDisco extends javax.swing.JInternalFrame {


    private ControladorCantante controladorCantante;
    private Cantante cantante;
    private ResourceBundle mensajes;
    public VentanaBuscarDisco(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
    }
    
    public void cambiarIdioma(Locale localizacion) {
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblApe.setText(mensajes.getString("jlb.ape"));
        jblCod.setText(mensajes.getString("jlb.cod"));
        jblCod2.setText(mensajes.getString("jlb.cod"));
        
        jblMenPanC.setText(mensajes.getString("menuitem.buscan"));
        jblNom.setText(mensajes.getString("jlb.nom"));
        jblNom2.setText(mensajes.getString("jlb.nom"));
        jblAni.setText(mensajes.getString("jlb.ani"));
       
        btnBuscarCompositor.setText(mensajes.getString("btn.bus"));
        btnCancelar.setText(mensajes.getString("btn.can"));
        btnCancelar1.setText(mensajes.getString("btn.can"));
        btnBuscarDisco.setText(mensajes.getString("btn.bus"));
        
        jblTit.setText(mensajes.getString("menuitem.busdis"));
        jblMenPanD.setText(mensajes.getString("menuitem.busdis"));
        this.setTitle(mensajes.getString("menuitem.busdis"));
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jblNom2 = new javax.swing.JLabel();
        jblCod2 = new javax.swing.JLabel();
        txtCodigoDisco = new javax.swing.JTextField();
        txtNombreDisco = new javax.swing.JTextField();
        btnBuscarDisco = new javax.swing.JButton();
        jblMenPanD = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jblAni = new javax.swing.JLabel();
        txtAnioDeLanzamiento = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jblTit = new javax.swing.JLabel();
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
        jblMenPanC = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Buscar Disco");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
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

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));
        jPanel5.setEnabled(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblNom2.setBackground(new java.awt.Color(204, 204, 255));
        jblNom2.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblNom2.setText("Nombre");
        jPanel5.add(jblNom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 114, 45));

        jblCod2.setBackground(new java.awt.Color(204, 204, 255));
        jblCod2.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblCod2.setText("Codigo");
        jPanel5.add(jblCod2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 114, 45));

        txtCodigoDisco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodigoDisco.setEnabled(false);
        jPanel5.add(txtCodigoDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 295, -1));

        txtNombreDisco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombreDisco.setEnabled(false);
        jPanel5.add(txtNombreDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 295, -1));

        btnBuscarDisco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnBuscarDisco.setText("Buscar Disco");
        btnBuscarDisco.setEnabled(false);
        btnBuscarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDiscoActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscarDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jblMenPanD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jblMenPanD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jblMenPanD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarRed.png"))); // NOI18N
        jblMenPanD.setText("Buscar un DIsco");
        jblMenPanD.setToolTipText("");
        jPanel5.add(jblMenPanD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 465, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        jblAni.setBackground(new java.awt.Color(204, 204, 255));
        jblAni.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblAni.setText("Año de lanzamieto");
        jPanel5.add(jblAni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 160, 45));

        txtAnioDeLanzamiento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAnioDeLanzamiento.setEnabled(false);
        jPanel5.add(txtAnioDeLanzamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 295, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblTit.setText("Buscar un Disco");
        jPanel2.add(jblTit, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 191, -1));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 36, -1, 190));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Disco_Fondo.jpg"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 190));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compositorImagen.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 190));

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
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

        jblMenPanC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jblMenPanC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jblMenPanC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarRed.png"))); // NOI18N
        jblMenPanC.setText("Buscar un cantante");
        jblMenPanC.setToolTipText("");
        jPanel6.add(jblMenPanC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 465, -1));

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDiscoActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        this.cantante = controladorCantante.buscarCantante(codigo);
        int codigoDisco = Integer.parseInt(txtCodigoDisco.getText());
        Disco disco = controladorCantante.buscarDisco(cantante, codigoDisco);
        if (disco != null) {
            txtAnioDeLanzamiento.setText(String.valueOf(disco.getAnioDeLanzamiento()));
            txtNombreDisco.setText(disco.getNombre());
        } else {
            limpiarCamposDisco();
            JOptionPane.showMessageDialog(this, "No se ha encotrado el disco");
        }
    }//GEN-LAST:event_btnBuscarDiscoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        this.limpiarCampos();
        this.limpiarCamposDisco();
        this.cambiarEstado(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCompositorActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        this.cantante = controladorCantante.buscarCantante(codigo);
        if (cantante != null) {
            txtApellido.setText(cantante.getApellido());
            txtNombre.setText(cantante.getNombre());
            cambiarEstado(true);
        }
    }//GEN-LAST:event_btnBuscarCompositorActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        cambiarEstado(false);
        limpiarCampos();
        limpiarCamposDisco();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cambiarEstado(false);
        limpiarCampos();
        limpiarCamposDisco();
    }//GEN-LAST:event_formInternalFrameClosing

    private void limpiarCampos(){
        txtCodigo.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        
    }
    
    private void limpiarCamposDisco(){
        txtCodigoDisco.setText("");
        txtAnioDeLanzamiento.setText("");
        txtNombreDisco.setText("");
    }
    
    private void cambiarEstado(boolean bandera){
        txtCodigo.setEnabled(!bandera);
        txtCodigoDisco.setEnabled(bandera);
        btnBuscarDisco.setEnabled(bandera);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCompositor;
    private javax.swing.JButton btnBuscarDisco;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jblAni;
    private javax.swing.JLabel jblApe;
    private javax.swing.JLabel jblCod;
    private javax.swing.JLabel jblCod2;
    private javax.swing.JLabel jblMenPanC;
    private javax.swing.JLabel jblMenPanD;
    private javax.swing.JLabel jblNom;
    private javax.swing.JLabel jblNom2;
    private javax.swing.JLabel jblTit;
    private javax.swing.JTextField txtAnioDeLanzamiento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoDisco;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDisco;
    // End of variables declaration//GEN-END:variables
}
