/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.vista.cliente;

import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCompositor;
import ec.edu.ups.practica5joaquinzavala.modelo.Cantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Compositor;
import ec.edu.ups.practica5joaquinzavala.modelo.GeneroMusical;
import ec.edu.ups.practica5joaquinzavala.modelo.Nacionalidad;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VentanaListarCliente extends javax.swing.JInternalFrame {
    private Compositor  compositor;
    private Cantante cantante;
    private ControladorCompositor controladorCompositor;
    
    public VentanaListarCliente(ControladorCompositor controladorCompositor) {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCompositor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCantante = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cliente"));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setResizable(true);
        setTitle("Lisrtar Cliente");
        setToolTipText("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Listar Cliente");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 191, -1));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 36, -1, 190));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cantante.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 210));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busquedaCliente.png"))); // NOI18N
        jLabel15.setText("  Listar Cliente");
        jLabel15.setToolTipText("");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 250, -1));

        tblCompositor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "# Composiciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCompositor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCompositorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCompositor);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 830, 210));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tblCantante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "Nombre artistico", "Genero Musical", "# de sencillos", "# de conciertos", "# de giras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblCantante);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.closingFrame();
    }//GEN-LAST:event_formInternalFrameClosing

    private void tblCompositorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCompositorMouseClicked
        cargarCantante();
    }//GEN-LAST:event_tblCompositorMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.cargarCompositor();
    }//GEN-LAST:event_formInternalFrameActivated

    private void cargarCompositor() {
        DefaultTableModel modelo = (DefaultTableModel) tblCompositor.getModel();
        modelo.setNumRows(0);
        List<Compositor> listaCompositors = controladorCompositor.listarCompositores();
        for (Compositor compositor : listaCompositors) {
            String codigo = String.valueOf(compositor.getCodigo());
            String nombre = compositor.getNombre();
            String edad = String.valueOf(compositor.getEdad());
            Nacionalidad nacionalidad = compositor.getNacionalidad();
            String apellido = compositor.getApellido();
            String salario = String.valueOf(compositor.getSalario());
            String numComposiciones = String.valueOf(compositor.getNumeroDeComposiciones());
            Object[] rowData = {codigo, nombre, apellido, edad, nacionalidad, salario, numComposiciones};
            modelo.addRow(rowData);
            
            
        }
        tblCompositor.setModel(modelo);
    }

    private void cargarCantante() {
        int fila = tblCompositor.getSelectedRow();
        int codigoCompositor = Integer.parseInt(tblCompositor.getValueAt(fila, 0).toString());
        Compositor compositor = controladorCompositor.buscarCompositor(codigoCompositor);
        DefaultTableModel modelo = (DefaultTableModel) tblCantante.getModel();
        modelo.setNumRows(0);
        List<Cantante> listaCantante = controladorCompositor.listarClientes(compositor);
        for (Cantante cantante : listaCantante) {
            String codigo = String.valueOf(cantante.getCodigo());
            String nombre = cantante.getNombre();
            String apellido = cantante.getApellido();
            String edad = String.valueOf(cantante.getEdad());
            Nacionalidad nacionalidad = cantante.getNacionalidad();
            String salario = String.valueOf(cantante.calularSalario());
            String nombreArtistico = cantante.getNombreArtistico();
            GeneroMusical generoMusical = cantante.getGeneroMusical();
            String numSencillos = String.valueOf(cantante.getNumeroDeSensillos());
            String numConciertos = String.valueOf(cantante.getNumeroDeConciertos());
            String numGiras = String.valueOf(cantante.getNumeroDeGiras());
            Object[] rowData = {codigo, nombre, apellido, edad, nacionalidad, salario, nombreArtistico, generoMusical, numSencillos, numConciertos, numGiras};
            modelo.addRow(rowData);
        }
        tblCantante.setModel(modelo);
    }
    
    private void closingFrame() {
        DefaultTableModel modeloCantante = (DefaultTableModel) tblCantante.getModel();
        modeloCantante.setNumRows(0);
        tblCantante.setModel(modeloCantante);
        DefaultTableModel modeloCompositor = (DefaultTableModel) tblCompositor.getModel();
        modeloCompositor.setNumRows(0);
        tblCompositor.setModel(modeloCompositor);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblCantante;
    private javax.swing.JTable tblCompositor;
    // End of variables declaration//GEN-END:variables

}
