/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.vista.Cantante;

import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Cantante;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class VentanaBuscarCantante extends javax.swing.JInternalFrame {
    private ControladorCantante controladorCantante;
    private Cantante cantante;
    
    private Locale localizacion;
    private ResourceBundle mensajes;
    /**
     * Creates new form VentanaBuscarCantante
     */
    public VentanaBuscarCantante(ControladorCantante controladorCantante) {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jblApe = new javax.swing.JLabel();
        jblNom = new javax.swing.JLabel();
        jblNac = new javax.swing.JLabel();
        jblSal = new javax.swing.JLabel();
        jblEda = new javax.swing.JLabel();
        jblSen = new javax.swing.JLabel();
        jblGenMus = new javax.swing.JLabel();
        jblNomArt = new javax.swing.JLabel();
        jblGir = new javax.swing.JLabel();
        jblCon = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNombreArtistico = new javax.swing.JTextField();
        txtSencillos = new javax.swing.JTextField();
        txtGiras = new javax.swing.JTextField();
        txtConciertos = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        txtNacionalidad = new javax.swing.JTextField();
        txtGeneroMuscical = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jblMenPan = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jblCod = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cantando.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(706, 706, 706))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

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

        jblSen.setBackground(new java.awt.Color(204, 204, 255));
        jblSen.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblSen.setText("Sencillos");

        jblGenMus.setBackground(new java.awt.Color(204, 204, 255));
        jblGenMus.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblGenMus.setText("GeneroMusical");

        jblNomArt.setBackground(new java.awt.Color(204, 204, 255));
        jblNomArt.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblNomArt.setText("NombreArtistico");

        jblGir.setBackground(new java.awt.Color(204, 204, 255));
        jblGir.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblGir.setText("Giras");

        jblCon.setBackground(new java.awt.Color(204, 204, 255));
        jblCon.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblCon.setText("Conciertos");

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombre.setToolTipText("Introduce tu Nombre");
        txtNombre.setEnabled(false);

        txtApellido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtApellido.setToolTipText("Introduce tu Apellido");
        txtApellido.setEnabled(false);

        txtEdad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEdad.setToolTipText("Introduce tu Edad");
        txtEdad.setEnabled(false);

        txtSalario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSalario.setToolTipText("Introduce tu Salario");
        txtSalario.setEnabled(false);

        txtNombreArtistico.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombreArtistico.setToolTipText("Introduce tu Nombre Artistico");
        txtNombreArtistico.setEnabled(false);

        txtSencillos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSencillos.setToolTipText("Introduce tu cantidad de sencillos");
        txtSencillos.setEnabled(false);

        txtGiras.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGiras.setToolTipText("Introduce tu cantidad de giras");
        txtGiras.setEnabled(false);
        txtGiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGirasActionPerformed(evt);
            }
        });

        txtConciertos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtConciertos.setToolTipText("Introduce tu cantidad de conciertos");
        txtConciertos.setEnabled(false);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtNacionalidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNacionalidad.setToolTipText("Introduce tu cantidad de giras");
        txtNacionalidad.setEnabled(false);
        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });

        txtGeneroMuscical.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGeneroMuscical.setToolTipText("Introduce tu cantidad de sencillos");
        txtGeneroMuscical.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jblSen)
                                .addGap(64, 64, 64)
                                .addComponent(txtSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jblGenMus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGeneroMuscical, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jblNomArt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jblApe)
                            .addGap(208, 208, 208))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jblSal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(201, 201, 201))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jblGir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jblEda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(307, 307, 307))
                        .addComponent(jblCon, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGiras, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jblNac, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCancelar))
                        .addGap(49, 49, 49))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblApe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblSal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNomArt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblSen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblGenMus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneroMuscical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblEda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblGir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNac, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(btnCancelar)))
                .addGap(21, 21, 21))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jblMenPan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jblMenPan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jblMenPan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busquedaCliente.png"))); // NOI18N
        jblMenPan.setText("   Buscar un cantante");
        jblMenPan.setToolTipText("");

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodigo.setToolTipText("Introduce tu Codigo/Cedula");
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jblCod.setBackground(new java.awt.Color(204, 204, 255));
        jblCod.setFont(new java.awt.Font("Roman", 0, 18)); // NOI18N
        jblCod.setText("Codigo");

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnAceptar.setText("Buscar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jblMenPan, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnAceptar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jblMenPan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtGirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGirasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGirasActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        this.cantante = controladorCantante.buscarCantante(codigo);
        if (cantante != null) {
            txtApellido.setText(cantante.getApellido().replaceAll("\\s", ""));
            txtEdad.setText(String.valueOf(cantante.getEdad()));
            txtGeneroMuscical.setText(cantante.getGeneroMusical().toString());
            txtNacionalidad.setText(cantante.getNacionalidad().toString());
            txtNombre.setText(cantante.getNombre().replaceAll("\\s", ""));
            txtNombreArtistico.setText(cantante.getNombreArtistico().replaceAll("\\s", ""));
            txtConciertos.setText(String.valueOf(cantante.getNumeroDeConciertos()));
            txtGiras.setText(String.valueOf(cantante.getNumeroDeGiras()));
            
            txtSencillos.setText(String.valueOf(String.valueOf(cantante.getNumeroDeSensillos())));
            txtSalario.setText(String.valueOf(String.valueOf(cantante.calularSalario())));
        } else {
            JOptionPane.showMessageDialog(this, "El cantante con el codigo " + codigo + " no ha sido registrado");
            limpiarCampos();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    public void cambiarIdioma(Locale localizacion) {
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblApe.setText(mensajes.getString("jlb.ape"));
        jblCod.setText(mensajes.getString("jlb.cod"));
        jblCon.setText(mensajes.getString("jlb.con"));
        jblEda.setText(mensajes.getString("jlb.eda"));
        jblGenMus.setText(mensajes.getString("jlb.genmus"));
        jblMenPan.setText(mensajes.getString("menuitem.buscan"));
        jblNac.setText(mensajes.getString("jlb.nac"));
        jblNom.setText(mensajes.getString("jlb.nom"));
        jblNomArt.setText(mensajes.getString("jlb.nomart"));
        jblSal.setText(mensajes.getString("jlb.sal"));
        btnAceptar.setText(mensajes.getString("btn.ace"));
        btnCancelar.setText(mensajes.getString("btn.can"));
        this.setTitle(mensajes.getString("menuitem.buscan"));
        
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        this.limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.setVisible(false);
        this.limpiarCampos();
    }//GEN-LAST:event_formInternalFrameClosing

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNombre.setText("");
        txtNombreArtistico.setText("");
        txtConciertos.setText("");
        txtGiras.setText("");
        txtSencillos.setText("");
        txtSalario.setText("");
        txtNacionalidad.setText("");
        txtGeneroMuscical.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jblApe;
    private javax.swing.JLabel jblCod;
    private javax.swing.JLabel jblCon;
    private javax.swing.JLabel jblEda;
    private javax.swing.JLabel jblGenMus;
    private javax.swing.JLabel jblGir;
    private javax.swing.JLabel jblMenPan;
    private javax.swing.JLabel jblNac;
    private javax.swing.JLabel jblNom;
    private javax.swing.JLabel jblNomArt;
    private javax.swing.JLabel jblSal;
    private javax.swing.JLabel jblSen;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtConciertos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGeneroMuscical;
    private javax.swing.JTextField txtGiras;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSencillos;
    // End of variables declaration//GEN-END:variables
}
