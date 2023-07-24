/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.vista;

import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCantante;
import ec.edu.ups.practica5joaquinzavala.controlador.ControladorCompositor;
import ec.edu.ups.practica5joaquinzavala.dao.CantanteDAO;
import ec.edu.ups.practica5joaquinzavala.dao.CompositorDAO;
import ec.edu.ups.practica5joaquinzavala.vista.Cancion.VentanaActualizarCancion;
import ec.edu.ups.practica5joaquinzavala.vista.Cancion.VentanaBuscarCancion;
import ec.edu.ups.practica5joaquinzavala.vista.Cancion.VentanaCrearCancion;
import ec.edu.ups.practica5joaquinzavala.vista.Cancion.VentanaEliminarCancion;
import ec.edu.ups.practica5joaquinzavala.vista.Cancion.VentanaListarCancion;
import ec.edu.ups.practica5joaquinzavala.vista.Cantante.VentanaActualizarCantante;
import ec.edu.ups.practica5joaquinzavala.vista.Cantante.VentanaBuscarCantante;
import ec.edu.ups.practica5joaquinzavala.vista.Cantante.VentanaCrearCantante;
import ec.edu.ups.practica5joaquinzavala.vista.Cantante.VentanaEliminarCantante;
import ec.edu.ups.practica5joaquinzavala.vista.Cantante.VentanaListarCantante;
import ec.edu.ups.practica5joaquinzavala.vista.Compositor.VentanaActualizarCompositor;
import ec.edu.ups.practica5joaquinzavala.vista.Compositor.VentanaBuscarCompositor;
import ec.edu.ups.practica5joaquinzavala.vista.Compositor.VentanaCrearCompositor;
import ec.edu.ups.practica5joaquinzavala.vista.Compositor.VentanaEliminarCompositor;
import ec.edu.ups.practica5joaquinzavala.vista.Compositor.VentanaListarCompositor;
import ec.edu.ups.practica5joaquinzavala.vista.cliente.VentanaActualizarCliente;
import ec.edu.ups.practica5joaquinzavala.vista.cliente.VentanaBuscarCliente;
import ec.edu.ups.practica5joaquinzavala.vista.cliente.VentanaCrearCliente;
import ec.edu.ups.practica5joaquinzavala.vista.cliente.VentanaEliminarCliente;
import ec.edu.ups.practica5joaquinzavala.vista.cliente.VentanaListarCliente;
import ec.edu.ups.practica5joaquinzavala.vista.disco.VentanaActualizarDisco;
import ec.edu.ups.practica5joaquinzavala.vista.disco.VentanaBuscarDisco;
import ec.edu.ups.practica5joaquinzavala.vista.disco.VentanaCrearDisco;
import ec.edu.ups.practica5joaquinzavala.vista.disco.VentanaEliminarDisco;
import ec.edu.ups.practica5joaquinzavala.vista.disco.VentanaListarDisco;
import java.util.Locale;
import java.util.ResourceBundle;



/**
 *
 * @author SOPORTETICS
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaCrearCantante ventanaCrearCantante;
    private VentanaBuscarCantante ventanaBuscarCantante;
    private VentanaActualizarCantante ventanaActualizarCantante;
    private VentanaEliminarCantante ventanaEliminarCantante;
    private VentanaListarCantante ventanaListarCantante;
    
    private VentanaCrearDisco ventanaCrearDisco;
    private VentanaBuscarDisco ventanaBuscarDisco;
    private VentanaActualizarDisco ventanaActualizarDisco;
    private VentanaEliminarDisco ventanaEliminarDisco;
    private VentanaListarDisco ventanaListarDisco;
    
    private VentanaCrearCompositor ventanaCrearCompositor;
    private VentanaBuscarCompositor ventanaBuscarCompositor;
    private VentanaActualizarCompositor ventanaActualizarCompositor;
    private VentanaEliminarCompositor ventanaEliminarCompositor;
    private VentanaListarCompositor ventanaListarCompositor;

    private VentanaCrearCancion ventanaCrearCancion;
    private VentanaBuscarCancion ventanaBuscarCancion;
    private VentanaActualizarCancion ventanaActualizarCancion;
    private VentanaEliminarCancion ventanaEliminarCancion;
    private VentanaListarCancion ventanaListarCancion;
    
    private VentanaCrearCliente ventanaCrearCliente;
    private VentanaBuscarCliente ventanaBuscarCliente;
    private VentanaActualizarCliente ventanaActualizarCliente;
    private VentanaEliminarCliente ventanaEliminarCliente;
    private VentanaListarCliente ventanaListarCliente;

    private ControladorCantante controladorCantante;
    private ControladorCompositor controladorCompositor;

    private CantanteDAO cantanteDAO;
    private CompositorDAO compositorDAO;
    private Locale localizacion;
    private ResourceBundle mensajes;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        cantanteDAO = new CantanteDAO();
        controladorCantante = new ControladorCantante(cantanteDAO);
        compositorDAO = new CompositorDAO();
        controladorCompositor = new ControladorCompositor(compositorDAO, cantanteDAO);
        localizacion = new Locale("es", "EC");
        
    }

    //System.exit(0);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        menuCantante = new javax.swing.JMenu();
        menuItemRcan = new javax.swing.JMenuItem();
        menuItemBcan = new javax.swing.JMenuItem();
        menuItemAcan = new javax.swing.JMenuItem();
        menuItemEcan = new javax.swing.JMenuItem();
        menuItemLcan = new javax.swing.JMenuItem();
        menuDisco2 = new javax.swing.JMenu();
        menuItemRdisco = new javax.swing.JMenuItem();
        menuItemBdisco = new javax.swing.JMenuItem();
        menuItemAdisco = new javax.swing.JMenuItem();
        menuItemEdisco = new javax.swing.JMenuItem();
        menuItemLdisco = new javax.swing.JMenuItem();
        menuDisco = new javax.swing.JMenu();
        menuItemRdisco2 = new javax.swing.JMenuItem();
        menuItemBdisco2 = new javax.swing.JMenuItem();
        menuItemAdisco2 = new javax.swing.JMenuItem();
        menuItemEdisco2 = new javax.swing.JMenuItem();
        menuItemLdisco2 = new javax.swing.JMenuItem();
        menuCompositor = new javax.swing.JMenu();
        menuItemRCompositor = new javax.swing.JMenuItem();
        menuItemBCompositor = new javax.swing.JMenuItem();
        menuItemACompositor = new javax.swing.JMenuItem();
        menuItemECompositor = new javax.swing.JMenuItem();
        menuItemLCompositor = new javax.swing.JMenuItem();
        menuCancion1 = new javax.swing.JMenu();
        menuItemRCancion = new javax.swing.JMenuItem();
        menuItemBCancion = new javax.swing.JMenuItem();
        menuItemACancion = new javax.swing.JMenuItem();
        menuItemECancion = new javax.swing.JMenuItem();
        menuItemLCancion = new javax.swing.JMenuItem();
        menuCliente2 = new javax.swing.JMenu();
        menuItemRCliente = new javax.swing.JMenuItem();
        menuItemBCliente = new javax.swing.JMenuItem();
        menuItemACliente = new javax.swing.JMenuItem();
        menuItemECliente = new javax.swing.JMenuItem();
        menuItemLCliente = new javax.swing.JMenuItem();
        menuCancion = new javax.swing.JMenu();
        menuItemRCancion2 = new javax.swing.JMenuItem();
        menuItemBCancion2 = new javax.swing.JMenuItem();
        menuItemACancion2 = new javax.swing.JMenuItem();
        menuItemECancion2 = new javax.swing.JMenuItem();
        menuItemLCancion2 = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        menuItemRCliente2 = new javax.swing.JMenuItem();
        menuItemBCliente2 = new javax.swing.JMenuItem();
        menuItemACliente2 = new javax.swing.JMenuItem();
        menuItemECliente2 = new javax.swing.JMenuItem();
        menuItemLCliente2 = new javax.swing.JMenuItem();
        menuIdiomar = new javax.swing.JMenu();
        menuItemEspaniol = new javax.swing.JMenuItem();
        menuItemIngles = new javax.swing.JMenuItem();
        menuItemFrances = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Aplicaion");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(60, 63, 65));
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        menuBar.setBackground(new java.awt.Color(60, 63, 65));
        menuBar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        menuBar.setMinimumSize(new java.awt.Dimension(400, 32000));

        menuCantante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        menuCantante.setMnemonic('f');
        menuCantante.setText("Cantante");
        menuCantante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuItemRcan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario-menu.png"))); // NOI18N
        menuItemRcan.setMnemonic('o');
        menuItemRcan.setText("Registrar cantante");
        menuItemRcan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRcanActionPerformed(evt);
            }
        });
        menuCantante.add(menuItemRcan);

        menuItemBcan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busac-menu.png"))); // NOI18N
        menuItemBcan.setMnemonic('s');
        menuItemBcan.setText("Buscar cantante");
        menuItemBcan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBcanActionPerformed(evt);
            }
        });
        menuCantante.add(menuItemBcan);

        menuItemAcan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-menu.png"))); // NOI18N
        menuItemAcan.setMnemonic('a');
        menuItemAcan.setText("Actualizar cantante");
        menuItemAcan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAcanActionPerformed(evt);
            }
        });
        menuCantante.add(menuItemAcan);

        menuItemEcan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarMenu.png"))); // NOI18N
        menuItemEcan.setMnemonic('a');
        menuItemEcan.setText("Eliminar cantante");
        menuItemEcan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEcanActionPerformed(evt);
            }
        });
        menuCantante.add(menuItemEcan);

        menuItemLcan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listar-menu.png"))); // NOI18N
        menuItemLcan.setText("Listar cantante");
        menuItemLcan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLcanActionPerformed(evt);
            }
        });
        menuCantante.add(menuItemLcan);

        menuDisco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        menuDisco2.setText("Disco");

        menuItemRdisco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarDisco-menu.png"))); // NOI18N
        menuItemRdisco.setText("Registrar disco");
        menuItemRdisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRdiscoActionPerformed(evt);
            }
        });
        menuDisco2.add(menuItemRdisco);

        menuItemBdisco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsicoBuscarmenu.png"))); // NOI18N
        menuItemBdisco.setText("Buscar disco");
        menuItemBdisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBdiscoActionPerformed(evt);
            }
        });
        menuDisco2.add(menuItemBdisco);

        menuItemAdisco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-menu.png"))); // NOI18N
        menuItemAdisco.setText("Actualizar disco");
        menuItemAdisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAdiscoActionPerformed(evt);
            }
        });
        menuDisco2.add(menuItemAdisco);

        menuItemEdisco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discoElimnarMenu.png"))); // NOI18N
        menuItemEdisco.setText("Eliminar disco");
        menuItemEdisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEdiscoActionPerformed(evt);
            }
        });
        menuDisco2.add(menuItemEdisco);

        menuItemLdisco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discorafia-menu.png"))); // NOI18N
        menuItemLdisco.setText("Listar disco");
        menuItemLdisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLdiscoActionPerformed(evt);
            }
        });
        menuDisco2.add(menuItemLdisco);

        menuCantante.add(menuDisco2);

        menuBar.add(menuCantante);

        menuDisco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        menuDisco.setText("Disco");

        menuItemRdisco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarDisco-menu.png"))); // NOI18N
        menuItemRdisco2.setText("Registrar disco");
        menuItemRdisco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRdisco2ActionPerformed(evt);
            }
        });
        menuDisco.add(menuItemRdisco2);

        menuItemBdisco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsicoBuscarmenu.png"))); // NOI18N
        menuItemBdisco2.setText("Buscar disco");
        menuItemBdisco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBdisco2ActionPerformed(evt);
            }
        });
        menuDisco.add(menuItemBdisco2);

        menuItemAdisco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-menu.png"))); // NOI18N
        menuItemAdisco2.setText("Actualizar disco");
        menuItemAdisco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAdisco2ActionPerformed(evt);
            }
        });
        menuDisco.add(menuItemAdisco2);

        menuItemEdisco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discoElimnarMenu.png"))); // NOI18N
        menuItemEdisco2.setText("Eliminar disco");
        menuItemEdisco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEdisco2ActionPerformed(evt);
            }
        });
        menuDisco.add(menuItemEdisco2);

        menuItemLdisco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discorafia-menu.png"))); // NOI18N
        menuItemLdisco2.setText("Listar disco");
        menuItemLdisco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLdisco2ActionPerformed(evt);
            }
        });
        menuDisco.add(menuItemLdisco2);

        menuBar.add(menuDisco);

        menuCompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        menuCompositor.setMnemonic('e');
        menuCompositor.setText("Compositor");

        menuItemRCompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario-menu.png"))); // NOI18N
        menuItemRCompositor.setMnemonic('t');
        menuItemRCompositor.setText("Registrar compositor");
        menuItemRCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRCompositorActionPerformed(evt);
            }
        });
        menuCompositor.add(menuItemRCompositor);

        menuItemBCompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busac-menu.png"))); // NOI18N
        menuItemBCompositor.setMnemonic('y');
        menuItemBCompositor.setText("Buscar compositor");
        menuItemBCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBCompositorActionPerformed(evt);
            }
        });
        menuCompositor.add(menuItemBCompositor);

        menuItemACompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-menu.png"))); // NOI18N
        menuItemACompositor.setMnemonic('p');
        menuItemACompositor.setText("Actualizar compositor");
        menuItemACompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemACompositorActionPerformed(evt);
            }
        });
        menuCompositor.add(menuItemACompositor);

        menuItemECompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarMenu.png"))); // NOI18N
        menuItemECompositor.setMnemonic('d');
        menuItemECompositor.setText("Eliminar compositor");
        menuItemECompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemECompositorActionPerformed(evt);
            }
        });
        menuCompositor.add(menuItemECompositor);

        menuItemLCompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listar-menu.png"))); // NOI18N
        menuItemLCompositor.setText("Listar compositores");
        menuItemLCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLCompositorActionPerformed(evt);
            }
        });
        menuCompositor.add(menuItemLCompositor);

        menuCancion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        menuCancion1.setText("Cancion");

        menuItemRCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarDisco-menu.png"))); // NOI18N
        menuItemRCancion.setText("Registrar cancion");
        menuItemRCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRCancionActionPerformed(evt);
            }
        });
        menuCancion1.add(menuItemRCancion);

        menuItemBCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsicoBuscarmenu.png"))); // NOI18N
        menuItemBCancion.setText("Buscar cancion");
        menuItemBCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBCancionActionPerformed(evt);
            }
        });
        menuCancion1.add(menuItemBCancion);

        menuItemACancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-menu.png"))); // NOI18N
        menuItemACancion.setText("Actualizar cancion");
        menuItemACancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemACancionActionPerformed(evt);
            }
        });
        menuCancion1.add(menuItemACancion);

        menuItemECancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discoElimnarMenu.png"))); // NOI18N
        menuItemECancion.setText("Eliminar cancion");
        menuItemECancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemECancionActionPerformed(evt);
            }
        });
        menuCancion1.add(menuItemECancion);

        menuItemLCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discorafia-menu.png"))); // NOI18N
        menuItemLCancion.setText("Listar cancion");
        menuItemLCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLCancionActionPerformed(evt);
            }
        });
        menuCancion1.add(menuItemLCancion);

        menuCompositor.add(menuCancion1);

        menuCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        menuCliente2.setText("Cliente");

        menuItemRCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario-menu.png"))); // NOI18N
        menuItemRCliente.setText("Registar Cliente");
        menuItemRCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRClienteActionPerformed(evt);
            }
        });
        menuCliente2.add(menuItemRCliente);

        menuItemBCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busac-menu.png"))); // NOI18N
        menuItemBCliente.setText("Buscar Cliente");
        menuItemBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBClienteActionPerformed(evt);
            }
        });
        menuCliente2.add(menuItemBCliente);

        menuItemACliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-menu.png"))); // NOI18N
        menuItemACliente.setText("Actualizar Cliente");
        menuItemACliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAClienteActionPerformed(evt);
            }
        });
        menuCliente2.add(menuItemACliente);

        menuItemECliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarMenu.png"))); // NOI18N
        menuItemECliente.setText("Eliminar Cliente");
        menuItemECliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEClienteActionPerformed(evt);
            }
        });
        menuCliente2.add(menuItemECliente);

        menuItemLCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listar-menu.png"))); // NOI18N
        menuItemLCliente.setText("Listar Cliente");
        menuItemLCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLClienteActionPerformed(evt);
            }
        });
        menuCliente2.add(menuItemLCliente);

        menuCompositor.add(menuCliente2);

        menuBar.add(menuCompositor);

        menuCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        menuCancion.setText("Cancion");

        menuItemRCancion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarDisco-menu.png"))); // NOI18N
        menuItemRCancion2.setText("Registrar cancion");
        menuItemRCancion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRCancion2ActionPerformed(evt);
            }
        });
        menuCancion.add(menuItemRCancion2);

        menuItemBCancion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsicoBuscarmenu.png"))); // NOI18N
        menuItemBCancion2.setText("Buscar cancion");
        menuItemBCancion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBCancion2ActionPerformed(evt);
            }
        });
        menuCancion.add(menuItemBCancion2);

        menuItemACancion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-menu.png"))); // NOI18N
        menuItemACancion2.setText("Actualizar cancion");
        menuItemACancion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemACancion2ActionPerformed(evt);
            }
        });
        menuCancion.add(menuItemACancion2);

        menuItemECancion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discoElimnarMenu.png"))); // NOI18N
        menuItemECancion2.setText("Eliminar cancion");
        menuItemECancion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemECancion2ActionPerformed(evt);
            }
        });
        menuCancion.add(menuItemECancion2);

        menuItemLCancion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discorafia-menu.png"))); // NOI18N
        menuItemLCancion2.setText("Listar cancion");
        menuItemLCancion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLCancion2ActionPerformed(evt);
            }
        });
        menuCancion.add(menuItemLCancion2);

        menuBar.add(menuCancion);

        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        menuCliente.setText("Cliente");

        menuItemRCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario-menu.png"))); // NOI18N
        menuItemRCliente2.setText("Registar Cliente");
        menuItemRCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRCliente2ActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemRCliente2);

        menuItemBCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busac-menu.png"))); // NOI18N
        menuItemBCliente2.setText("Buscar Cliente");
        menuItemBCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBCliente2ActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemBCliente2);

        menuItemACliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-menu.png"))); // NOI18N
        menuItemACliente2.setText("Actualizar Cliente");
        menuItemACliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemACliente2ActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemACliente2);

        menuItemECliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarMenu.png"))); // NOI18N
        menuItemECliente2.setText("Eliminar Cliente");
        menuItemECliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemECliente2ActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemECliente2);

        menuItemLCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listar-menu.png"))); // NOI18N
        menuItemLCliente2.setText("Listar Cliente");
        menuItemLCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLCliente2ActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemLCliente2);

        menuBar.add(menuCliente);

        menuIdiomar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        menuIdiomar.setMnemonic('h');
        menuIdiomar.setText("Idioma");

        menuItemEspaniol.setMnemonic('c');
        menuItemEspaniol.setText("Español");
        menuItemEspaniol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspaniolActionPerformed(evt);
            }
        });
        menuIdiomar.add(menuItemEspaniol);

        menuItemIngles.setMnemonic('a');
        menuItemIngles.setText("Ingles");
        menuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInglesActionPerformed(evt);
            }
        });
        menuIdiomar.add(menuItemIngles);

        menuItemFrances.setMnemonic('a');
        menuItemFrances.setText("Frances");
        menuItemFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFrancesActionPerformed(evt);
            }
        });
        menuIdiomar.add(menuItemFrances);

        menuBar.add(menuIdiomar);

        setJMenuBar(menuBar);

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

    private void menuItemRcanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRcanActionPerformed
        if (ventanaCrearCantante == null) {
            ventanaCrearCantante = new VentanaCrearCantante(controladorCantante);
            jPanel1.add(ventanaCrearCantante);
        }
        ventanaCrearCantante.cambiarIdioma(localizacion);
        ventanaCrearCantante.setVisible(true);
    }//GEN-LAST:event_menuItemRcanActionPerformed

    private void menuItemBcanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBcanActionPerformed
        if (ventanaBuscarCantante == null) {
            ventanaBuscarCantante = new VentanaBuscarCantante(controladorCantante);
            jPanel1.add(ventanaBuscarCantante);
        }
        ventanaBuscarCantante.cambiarIdioma(localizacion);
        ventanaBuscarCantante.setVisible(true);
    }//GEN-LAST:event_menuItemBcanActionPerformed

    private void menuItemAcanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAcanActionPerformed
         if (ventanaActualizarCantante == null) {
            ventanaActualizarCantante = new VentanaActualizarCantante(controladorCantante);
            jPanel1.add(ventanaActualizarCantante);
        }
         ventanaActualizarCantante.cambiarIdioma(localizacion);
        ventanaActualizarCantante.setVisible(true);
    }//GEN-LAST:event_menuItemAcanActionPerformed

    private void menuItemLcanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLcanActionPerformed
        if (ventanaListarCantante == null) {
            ventanaListarCantante = new VentanaListarCantante(controladorCantante);
            jPanel1.add(ventanaListarCantante);
        }
        ventanaListarCantante.setVisible(true);
    }//GEN-LAST:event_menuItemLcanActionPerformed

    private void menuItemRCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRCompositorActionPerformed
        if (ventanaCrearCompositor == null) {
            ventanaCrearCompositor = new VentanaCrearCompositor(controladorCompositor);
            jPanel1.add(ventanaCrearCompositor);
        }
        ventanaCrearCompositor.cambiarIdioma(localizacion);
        ventanaCrearCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemRCompositorActionPerformed

    private void menuItemBCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBCompositorActionPerformed
        if (ventanaBuscarCompositor == null) {
            ventanaBuscarCompositor = new VentanaBuscarCompositor(controladorCompositor);
            jPanel1.add(ventanaBuscarCompositor);
        }
        ventanaBuscarCompositor.cambiarIdioma(localizacion);
        ventanaBuscarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemBCompositorActionPerformed

    private void menuItemACompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemACompositorActionPerformed
        if (ventanaActualizarCompositor == null) {
            ventanaActualizarCompositor = new VentanaActualizarCompositor(controladorCompositor);
            jPanel1.add(ventanaActualizarCompositor);
        }
        ventanaActualizarCompositor.cambiarIdioma(localizacion);
        ventanaActualizarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemACompositorActionPerformed

    private void menuItemECompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemECompositorActionPerformed
        if (ventanaEliminarCompositor == null) {
            ventanaEliminarCompositor = new VentanaEliminarCompositor(controladorCompositor);
            jPanel1.add(ventanaEliminarCompositor);
        }
        ventanaEliminarCompositor.cambiarIdioma(localizacion);
        ventanaEliminarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemECompositorActionPerformed

    private void menuItemLCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLCompositorActionPerformed
        if(ventanaListarCompositor==null){
            ventanaListarCompositor= new VentanaListarCompositor(controladorCompositor);
            jPanel1.add(ventanaListarCompositor);
        }
        ventanaListarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemLCompositorActionPerformed

    private void menuItemRdiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRdiscoActionPerformed
        if (ventanaCrearDisco == null) {
            ventanaCrearDisco = new VentanaCrearDisco(controladorCantante);
            jPanel1.add(ventanaCrearDisco);
        }
        ventanaCrearDisco.setVisible(true);
    }//GEN-LAST:event_menuItemRdiscoActionPerformed

    private void menuItemBdiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBdiscoActionPerformed
        if (ventanaBuscarDisco == null) {
            ventanaBuscarDisco= new VentanaBuscarDisco(controladorCantante);
            jPanel1.add(ventanaBuscarDisco);
        }
        ventanaBuscarDisco.setVisible(true);
    }//GEN-LAST:event_menuItemBdiscoActionPerformed

    private void menuItemAdiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAdiscoActionPerformed
        if (ventanaActualizarDisco == null) {
            ventanaActualizarDisco= new VentanaActualizarDisco(controladorCantante);
            jPanel1.add(ventanaActualizarDisco);
        }
        ventanaActualizarDisco.setVisible(true);
    }//GEN-LAST:event_menuItemAdiscoActionPerformed

    private void menuItemEdiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEdiscoActionPerformed
        if (ventanaEliminarDisco == null) {
            ventanaEliminarDisco= new VentanaEliminarDisco(controladorCantante);
            jPanel1.add(ventanaEliminarDisco);
        }
        ventanaEliminarDisco.setVisible(true);
    }//GEN-LAST:event_menuItemEdiscoActionPerformed

    private void menuItemLdiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLdiscoActionPerformed
        if (ventanaListarDisco == null) {
            ventanaListarDisco= new VentanaListarDisco(controladorCantante);
            jPanel1.add(ventanaListarDisco);
        }
        ventanaListarDisco.setVisible(true);
    }//GEN-LAST:event_menuItemLdiscoActionPerformed

    private void menuItemRCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRCancionActionPerformed
        if(ventanaCrearCancion==null){
            ventanaCrearCancion= new VentanaCrearCancion(controladorCompositor);
            jPanel1.add(ventanaCrearCancion);
        }
        ventanaCrearCancion.cambiarIdioma(localizacion);
        ventanaCrearCancion.setVisible(true);
    }//GEN-LAST:event_menuItemRCancionActionPerformed

    private void menuItemBCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBCancionActionPerformed
        if(ventanaBuscarCancion==null){
            ventanaBuscarCancion= new VentanaBuscarCancion(controladorCompositor);
            jPanel1.add(ventanaBuscarCancion);
        }
        ventanaBuscarCancion.cambiarIdioma(localizacion);
        ventanaBuscarCancion.setVisible(true);
    }//GEN-LAST:event_menuItemBCancionActionPerformed

    private void menuItemACancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemACancionActionPerformed
        if(ventanaActualizarCancion==null){
            ventanaActualizarCancion= new VentanaActualizarCancion(controladorCompositor);
            jPanel1.add(ventanaActualizarCancion);
        }
        ventanaActualizarCancion.cambiarIdioma(localizacion);
        ventanaActualizarCancion.setVisible(true);
    }//GEN-LAST:event_menuItemACancionActionPerformed

    private void menuItemECancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemECancionActionPerformed
        if(ventanaEliminarCancion==null){
            ventanaEliminarCancion= new VentanaEliminarCancion(controladorCompositor);
            jPanel1.add(ventanaEliminarCancion);
        }
        ventanaEliminarCancion.cambiarIdioma(localizacion);
        ventanaEliminarCancion.setVisible(true);
    }//GEN-LAST:event_menuItemECancionActionPerformed

    private void menuItemLCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLCancionActionPerformed
       if(ventanaListarCancion==null){
            ventanaListarCancion= new VentanaListarCancion(controladorCompositor);
            jPanel1.add(ventanaListarCancion);
        }
        ventanaListarCancion.setVisible(true);
    }//GEN-LAST:event_menuItemLCancionActionPerformed

    private void menuItemRCancion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRCancion2ActionPerformed
        this.menuItemRCancionActionPerformed(evt);
    }//GEN-LAST:event_menuItemRCancion2ActionPerformed

    private void menuItemBCancion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBCancion2ActionPerformed
        this.menuItemBCancionActionPerformed(evt);
    }//GEN-LAST:event_menuItemBCancion2ActionPerformed

    private void menuItemACancion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemACancion2ActionPerformed
        this.menuItemACancionActionPerformed(evt);
    }//GEN-LAST:event_menuItemACancion2ActionPerformed

    private void menuItemECancion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemECancion2ActionPerformed
        this.menuItemECancionActionPerformed(evt);
    }//GEN-LAST:event_menuItemECancion2ActionPerformed

    private void menuItemLCancion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLCancion2ActionPerformed
        this.menuItemLCancionActionPerformed(evt);
    }//GEN-LAST:event_menuItemLCancion2ActionPerformed

    private void menuItemRCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRCliente2ActionPerformed
        this.menuItemRClienteActionPerformed(evt);
    }//GEN-LAST:event_menuItemRCliente2ActionPerformed

    private void menuItemRClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRClienteActionPerformed
        if(ventanaCrearCliente ==null){
            ventanaCrearCliente= new VentanaCrearCliente(controladorCompositor, controladorCantante);
            jPanel1.add(ventanaCrearCliente);
        }
        ventanaCrearCliente.setVisible(true);
    }//GEN-LAST:event_menuItemRClienteActionPerformed

    private void menuItemBCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBCliente2ActionPerformed
        this.menuItemBClienteActionPerformed(evt);
    }//GEN-LAST:event_menuItemBCliente2ActionPerformed

    private void menuItemBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBClienteActionPerformed
        if(ventanaBuscarCliente ==null){
            ventanaBuscarCliente= new VentanaBuscarCliente(controladorCompositor);
            jPanel1.add(ventanaBuscarCliente);
        }
        ventanaBuscarCliente.cambiarIdioma(localizacion);
        ventanaBuscarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemBClienteActionPerformed

    private void menuItemAClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAClienteActionPerformed
        if(ventanaActualizarCliente ==null){
            ventanaActualizarCliente= new VentanaActualizarCliente(controladorCompositor);
            jPanel1.add(ventanaActualizarCliente);
        }
        ventanaActualizarCliente.cambiarIdioma(localizacion);
        ventanaActualizarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemAClienteActionPerformed

    private void menuItemACliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemACliente2ActionPerformed
        this.menuItemAClienteActionPerformed(evt);
    }//GEN-LAST:event_menuItemACliente2ActionPerformed

    private void menuItemRdisco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRdisco2ActionPerformed
        this.menuItemRdiscoActionPerformed(evt);
    }//GEN-LAST:event_menuItemRdisco2ActionPerformed

    private void menuItemBdisco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBdisco2ActionPerformed
        this.menuItemBdiscoActionPerformed(evt);
    }//GEN-LAST:event_menuItemBdisco2ActionPerformed

    private void menuItemAdisco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAdisco2ActionPerformed
        this.menuItemAdiscoActionPerformed(evt);
    }//GEN-LAST:event_menuItemAdisco2ActionPerformed

    private void menuItemEdisco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEdisco2ActionPerformed
        this.menuItemEdiscoActionPerformed(evt);
    }//GEN-LAST:event_menuItemEdisco2ActionPerformed

    private void menuItemLdisco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLdisco2ActionPerformed
        this.menuItemLdiscoActionPerformed(evt);
    }//GEN-LAST:event_menuItemLdisco2ActionPerformed

    private void menuItemEClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEClienteActionPerformed
        if(ventanaEliminarCliente ==null){
            ventanaEliminarCliente= new VentanaEliminarCliente(controladorCompositor);
            jPanel1.add(ventanaEliminarCliente);
        }
        ventanaEliminarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemEClienteActionPerformed

    private void menuItemECliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemECliente2ActionPerformed
        this.menuItemEClienteActionPerformed(evt);
    }//GEN-LAST:event_menuItemECliente2ActionPerformed

    private void menuItemLClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLClienteActionPerformed
        if(ventanaListarCliente ==null){
            ventanaListarCliente= new VentanaListarCliente(controladorCompositor);
            jPanel1.add(ventanaListarCliente);
        }
        ventanaListarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemLClienteActionPerformed

    private void menuItemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInglesActionPerformed
        localizacion = new Locale("en", "US");
        cambiarIdioma();
    }//GEN-LAST:event_menuItemInglesActionPerformed

    private void menuItemFrancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFrancesActionPerformed
        localizacion = new Locale("fr", "FR");
        cambiarIdioma();
    }//GEN-LAST:event_menuItemFrancesActionPerformed

    private void menuItemEspaniolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEspaniolActionPerformed
        localizacion = new Locale("es", "EC");
        cambiarIdioma();
    }//GEN-LAST:event_menuItemEspaniolActionPerformed

    private void menuItemEcanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEcanActionPerformed
        if(ventanaEliminarCantante==null){
            ventanaEliminarCantante= new VentanaEliminarCantante(controladorCantante);
            jPanel1.add(ventanaEliminarCantante);
        }
        ventanaEliminarCantante.cambiarIdioma(localizacion);
        ventanaEliminarCantante.setVisible(true);
    }//GEN-LAST:event_menuItemEcanActionPerformed

    private void menuItemLCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLCliente2ActionPerformed
        this.menuItemLClienteActionPerformed(evt);
    }//GEN-LAST:event_menuItemLCliente2ActionPerformed

    private void cambiarIdioma() {
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        
        menuCantante.setText(mensajes.getString("menu.cantante"));
        menuItemBcan.setText(mensajes.getString("menuitem.buscan"));
        menuItemRcan.setText(mensajes.getString("menuitem.crecan"));
        menuItemAcan.setText(mensajes.getString("menuitem.actcan"));
        menuItemEcan.setText(mensajes.getString("menuitem.elican"));
        menuItemLcan.setText(mensajes.getString("menuitem.liscan"));
        
        menuDisco.setText(mensajes.getString("menu.disco"));
        menuItemRdisco.setText(mensajes.getString("menuitem.credis"));
        menuItemBdisco.setText(mensajes.getString("menuitem.busdis"));
        menuItemAdisco.setText(mensajes.getString("menuitem.actdis"));
        menuItemEdisco.setText(mensajes.getString("menuitem.elidis"));
        menuItemLdisco.setText(mensajes.getString("menuitem.lisdis"));
        menuDisco2.setText(mensajes.getString("menu.disco"));
        menuItemRdisco2.setText(mensajes.getString("menuitem.credis"));
        menuItemBdisco2.setText(mensajes.getString("menuitem.busdis"));
        menuItemAdisco2.setText(mensajes.getString("menuitem.actdis"));
        menuItemEdisco2.setText(mensajes.getString("menuitem.elidis"));
        menuItemLdisco2.setText(mensajes.getString("menuitem.lisdis"));
        
        menuCompositor.setText(mensajes.getString("menu.compositor"));
        menuItemRCompositor.setText(mensajes.getString("menuitem.crecom"));
        menuItemBCompositor.setText(mensajes.getString("menuitem.buscom"));
        menuItemACompositor.setText(mensajes.getString("menuitem.actcom"));
        menuItemECompositor.setText(mensajes.getString("menuitem.elicom"));
        menuItemLCompositor.setText(mensajes.getString("menuitem.liscom"));
        
        menuCancion.setText(mensajes.getString("menu.cancion"));
        menuItemRCancion.setText(mensajes.getString("menuitem.crecan"));
        menuItemBCancion.setText(mensajes.getString("menuitem.buscan"));
        menuItemACancion.setText(mensajes.getString("menuitem.actcan"));
        menuItemECancion.setText(mensajes.getString("menuitem.elican"));
        menuItemLCancion.setText(mensajes.getString("menuitem.liscan"));
        
        menuCancion1.setText(mensajes.getString("menu.cancion"));
        menuItemRCancion2.setText(mensajes.getString("menuitem.crecan"));
        menuItemBCancion2.setText(mensajes.getString("menuitem.buscan"));
        menuItemACancion2.setText(mensajes.getString("menuitem.actcan"));
        menuItemECancion2.setText(mensajes.getString("menuitem.elican"));
        menuItemLCancion2.setText(mensajes.getString("menuitem.liscan"));
        
        menuCliente.setText(mensajes.getString("menu.cliente"));
        menuItemRCliente.setText(mensajes.getString("menuitem.crecli"));
        menuItemBCliente.setText(mensajes.getString("menuitem.buscli"));
        menuItemACliente.setText(mensajes.getString("menuitem.actcli"));
        menuItemECliente.setText(mensajes.getString("menuitem.elicli"));
        menuItemLCliente.setText(mensajes.getString("menuitem.liscli"));
        
        menuCliente.setText(mensajes.getString("menu.cliente"));
        menuItemRCliente2.setText(mensajes.getString("menuitem.crecli"));
        menuItemBCliente2.setText(mensajes.getString("menuitem.buscli"));
        menuItemACliente2.setText(mensajes.getString("menuitem.actcli"));
        menuItemECliente2.setText(mensajes.getString("menuitem.elicli"));
        menuItemLCliente2.setText(mensajes.getString("menuitem.liscli"));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCancion;
    private javax.swing.JMenu menuCancion1;
    private javax.swing.JMenu menuCantante;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuCliente2;
    private javax.swing.JMenu menuCompositor;
    private javax.swing.JMenu menuDisco;
    private javax.swing.JMenu menuDisco2;
    private javax.swing.JMenu menuIdiomar;
    private javax.swing.JMenuItem menuItemACancion;
    private javax.swing.JMenuItem menuItemACancion2;
    private javax.swing.JMenuItem menuItemACliente;
    private javax.swing.JMenuItem menuItemACliente2;
    private javax.swing.JMenuItem menuItemACompositor;
    private javax.swing.JMenuItem menuItemAcan;
    private javax.swing.JMenuItem menuItemAdisco;
    private javax.swing.JMenuItem menuItemAdisco2;
    private javax.swing.JMenuItem menuItemBCancion;
    private javax.swing.JMenuItem menuItemBCancion2;
    private javax.swing.JMenuItem menuItemBCliente;
    private javax.swing.JMenuItem menuItemBCliente2;
    private javax.swing.JMenuItem menuItemBCompositor;
    private javax.swing.JMenuItem menuItemBcan;
    private javax.swing.JMenuItem menuItemBdisco;
    private javax.swing.JMenuItem menuItemBdisco2;
    private javax.swing.JMenuItem menuItemECancion;
    private javax.swing.JMenuItem menuItemECancion2;
    private javax.swing.JMenuItem menuItemECliente;
    private javax.swing.JMenuItem menuItemECliente2;
    private javax.swing.JMenuItem menuItemECompositor;
    private javax.swing.JMenuItem menuItemEcan;
    private javax.swing.JMenuItem menuItemEdisco;
    private javax.swing.JMenuItem menuItemEdisco2;
    private javax.swing.JMenuItem menuItemEspaniol;
    private javax.swing.JMenuItem menuItemFrances;
    private javax.swing.JMenuItem menuItemIngles;
    private javax.swing.JMenuItem menuItemLCancion;
    private javax.swing.JMenuItem menuItemLCancion2;
    private javax.swing.JMenuItem menuItemLCliente;
    private javax.swing.JMenuItem menuItemLCliente2;
    private javax.swing.JMenuItem menuItemLCompositor;
    private javax.swing.JMenuItem menuItemLcan;
    private javax.swing.JMenuItem menuItemLdisco;
    private javax.swing.JMenuItem menuItemLdisco2;
    private javax.swing.JMenuItem menuItemRCancion;
    private javax.swing.JMenuItem menuItemRCancion2;
    private javax.swing.JMenuItem menuItemRCliente;
    private javax.swing.JMenuItem menuItemRCliente2;
    private javax.swing.JMenuItem menuItemRCompositor;
    private javax.swing.JMenuItem menuItemRcan;
    private javax.swing.JMenuItem menuItemRdisco;
    private javax.swing.JMenuItem menuItemRdisco2;
    // End of variables declaration//GEN-END:variables

}
