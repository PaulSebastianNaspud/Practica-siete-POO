/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.vista.Compositor;

import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCompositor;
import ec.edu.ups.practica5joaquinzavala.modelo.Compositor;
import ec.edu.ups.practica5joaquinzavala.modelo.Nacionalidad;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class VentanaCrearCompositor extends javax.swing.JInternalFrame {

    private ControladorCompositor controladorCompositor;
    private Compositor compositor;
    private ResourceBundle mensajes;
    
    public VentanaCrearCompositor(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
        this.llenarComboBoxNacionalidad();
        this.setResizable(false);
    }
    
    public void cambiarIdioma(Locale localizacion) {
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        
        jblApe.setText(mensajes.getString("jlb.ape"));
        jblCod.setText(mensajes.getString("jlb.cod"));
        jblMenPan.setText(mensajes.getString("menuitem.crecom"));
        jblNom.setText(mensajes.getString("jlb.nom"));
        jblNac.setText(mensajes.getString("jlb.nac"));
        jblSal.setText(mensajes.getString("jlb.sal"));
        jblNumCom.setText(mensajes.getString("jlb.numcom"));
        btnAceptar.setText(mensajes.getString("btn.ace"));
        btnCancelar.setText(mensajes.getString("btn.can"));
        jblTit.setText(mensajes.getString("menuitem.crecom"));
        
        this.setTitle(mensajes.getString("menuitem.crecom"));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jblTit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jblApe = new javax.swing.JLabel();
        jblNom = new javax.swing.JLabel();
        jblNac = new javax.swing.JLabel();
        jblSal = new javax.swing.JLabel();
        jblEda = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbxNacionalidad = new javax.swing.JComboBox<>();
        jblNumCom = new javax.swing.JLabel();
        txtNumComposiciones = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jblMenPan = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jblCod = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Crear Compositor");
        setMaximumSize(new java.awt.Dimension(855, 585));
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblTit.setText("CREAR COMPOSITOR");
        jPanel1.add(jblTit, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 191, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compositorImagen.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 259, 570));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jblApe.setBackground(new java.awt.Color(204, 204, 255));
        jblApe.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblApe.setText("Apellido");

        jblNom.setBackground(new java.awt.Color(204, 204, 255));
        jblNom.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblNom.setText("Nombre");

        jblNac.setBackground(new java.awt.Color(204, 204, 255));
        jblNac.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblNac.setText("Nacionalidad");

        jblSal.setBackground(new java.awt.Color(204, 204, 255));
        jblSal.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblSal.setText("Salario");

        jblEda.setBackground(new java.awt.Color(204, 204, 255));
        jblEda.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblEda.setText("Edad");

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtApellido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtEdad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtSalario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add_user.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cmbxNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Elegir una Nacionalidad--" }));
        cmbxNacionalidad.setSelectedItem(null);
        cmbxNacionalidad.setToolTipText("");
        cmbxNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxNacionalidadActionPerformed(evt);
            }
        });

        jblNumCom.setBackground(new java.awt.Color(204, 204, 255));
        jblNumCom.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblNumCom.setText("N° compociciones");

        txtNumComposiciones.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jblNac, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jblApe, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jblSal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jblEda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbxNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGap(206, 206, 206)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jblNumCom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar))
                            .addComponent(txtNumComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblApe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblEda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblSal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNac, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNumCom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 530, 430));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jblMenPan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jblMenPan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jblMenPan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario.png"))); // NOI18N
        jblMenPan.setText("Ingrese un nuevo compositor");
        jblMenPan.setToolTipText("");

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jblCod.setBackground(new java.awt.Color(204, 204, 255));
        jblCod.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblCod.setText("Codigo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jblMenPan, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jblMenPan)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 530, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxNacionalidadActionPerformed


    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (!isEmptyCampos()) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            if (validarCompositor(codigo)) {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                int edad = Integer.parseInt(txtEdad.getText());
                double salario = Double.parseDouble(txtSalario.getText());
                int numeroComposiciones = Integer.parseInt(txtNumComposiciones.getText());
                Nacionalidad nacionalidad = (Nacionalidad) this.cmbxNacionalidad.getSelectedItem();
                this.compositor = new Compositor(numeroComposiciones, codigo, nombre, apellido, edad, salario, nacionalidad);
                compositor.setSalario(compositor.calularSalario());
                controladorCompositor.agregarCompositor(compositor);
                JOptionPane.showMessageDialog(this, "Compositor registrado con exito!");
                this.limipiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "EL compositor con el codigo: " + codigo + " ya esxite!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios de rellenar");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        this.limipiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.setVisible(false);
        this.limipiarCampos();
    }//GEN-LAST:event_formInternalFrameClosing

    private void llenarComboBoxNacionalidad() {
        DefaultComboBoxModel<Nacionalidad> modelo = (DefaultComboBoxModel) this.cmbxNacionalidad.getModel();
        modelo.removeAllElements();
        modelo.addElement(Nacionalidad.ARGENTINA);
        modelo.addElement(Nacionalidad.BRAZIL);
        modelo.addElement(Nacionalidad.CANADA);
        modelo.addElement(Nacionalidad.COLOMBIA);
        modelo.addElement(Nacionalidad.ECUADOR);
        modelo.addElement(Nacionalidad.ESPANIA);
        modelo.addElement(Nacionalidad.ESTADOS_UNIDOS);
        modelo.addElement(Nacionalidad.MEXICO);
        modelo.addElement(Nacionalidad.PARAGUAY);
        modelo.addElement(Nacionalidad.PERU);
    }

    private boolean validarCompositor(int codigo) {
        this.compositor = controladorCompositor.buscarCompositor(codigo);
        if (this.compositor == null) {
            return true;
        }
        return false;
    }

    private boolean isEmptyCampos() {
        if (txtCodigo.getText().isEmpty() || txtApellido.getText().isEmpty() || txtNombre.getText().isEmpty() || txtEdad.getText().isEmpty() || txtSalario.getText().isEmpty() || txtNumComposiciones.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    private void limipiarCampos() {
        txtCodigo.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNumComposiciones.setText("");
        txtNombre.setText("");
        txtSalario.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbxNacionalidad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jblApe;
    private javax.swing.JLabel jblCod;
    private javax.swing.JLabel jblEda;
    private javax.swing.JLabel jblMenPan;
    private javax.swing.JLabel jblNac;
    private javax.swing.JLabel jblNom;
    private javax.swing.JLabel jblNumCom;
    private javax.swing.JLabel jblSal;
    private javax.swing.JLabel jblTit;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumComposiciones;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
