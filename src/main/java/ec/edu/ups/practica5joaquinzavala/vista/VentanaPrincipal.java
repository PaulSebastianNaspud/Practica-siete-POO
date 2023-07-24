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
        itemMenuCrearCantante = new javax.swing.JMenuItem();
        itemMenuVerCantante = new javax.swing.JMenuItem();
        menuItemActualizarCantante = new javax.swing.JMenuItem();
        menuItemListarCantante = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemMenuRegistrarDisco = new javax.swing.JMenuItem();
        menuItemBuscarDisco = new javax.swing.JMenuItem();
        menuItemActualizarDisco = new javax.swing.JMenuItem();
        menuItemEliminarDisco = new javax.swing.JMenuItem();
        menuItemListarDisco = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        itemMenuRegistrarDisco2 = new javax.swing.JMenuItem();
        menuItemBuscarDisco2 = new javax.swing.JMenuItem();
        menuItemActualizarDisco2 = new javax.swing.JMenuItem();
        menuItemEliminarDisco2 = new javax.swing.JMenuItem();
        menuItemListarDisco2 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        menuItemRegistrarCompositor = new javax.swing.JMenuItem();
        menuItemBuscarCompositor = new javax.swing.JMenuItem();
        menuItemActualizarCompositor = new javax.swing.JMenuItem();
        menuItemEliminarCompositor = new javax.swing.JMenuItem();
        menuItemListarCompositor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemRegistrarCancion = new javax.swing.JMenuItem();
        menuItemBuscarCancion = new javax.swing.JMenuItem();
        menuItemActualizarCancion = new javax.swing.JMenuItem();
        menuItemEliminarCancion = new javax.swing.JMenuItem();
        menuItemListarCancion = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuItemRegistrarCliente = new javax.swing.JMenuItem();
        menuItemBuscarCliente = new javax.swing.JMenuItem();
        menuItemActulalizarCliente = new javax.swing.JMenuItem();
        menuItemEliminarCliente = new javax.swing.JMenuItem();
        menuItemListarCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuItemRegistrarCancion1 = new javax.swing.JMenuItem();
        menuItemBuscarCancion1 = new javax.swing.JMenuItem();
        menuItemActualizarCancion1 = new javax.swing.JMenuItem();
        menuItemEliminarCancion1 = new javax.swing.JMenuItem();
        menuItemListarCancion1 = new javax.swing.JMenuItem();
        menuItemRegistrarCliente1 = new javax.swing.JMenu();
        menuItemRegistrarCliente2 = new javax.swing.JMenuItem();
        menuItemBuscarCliente2 = new javax.swing.JMenuItem();
        menuItemActulalizarCliente1 = new javax.swing.JMenuItem();
        menuItemEliminarCliente1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
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

        itemMenuCrearCantante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario-menu.png"))); // NOI18N
        itemMenuCrearCantante.setMnemonic('o');
        itemMenuCrearCantante.setText("Registrar cantante");
        itemMenuCrearCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCrearCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(itemMenuCrearCantante);

        itemMenuVerCantante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busac-menu.png"))); // NOI18N
        itemMenuVerCantante.setMnemonic('s');
        itemMenuVerCantante.setText("Buscar cantante");
        itemMenuVerCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVerCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(itemMenuVerCantante);

        menuItemActualizarCantante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-menu.png"))); // NOI18N
        menuItemActualizarCantante.setMnemonic('a');
        menuItemActualizarCantante.setText("Actualizar cantante");
        menuItemActualizarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(menuItemActualizarCantante);

        menuItemListarCantante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listar-menu.png"))); // NOI18N
        menuItemListarCantante.setText("Listar cantante");
        menuItemListarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(menuItemListarCantante);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        jMenu1.setText("Disco");

        itemMenuRegistrarDisco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarDisco-menu.png"))); // NOI18N
        itemMenuRegistrarDisco.setText("Registrar disco");
        itemMenuRegistrarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuRegistrarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuRegistrarDisco);

        menuItemBuscarDisco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsicoBuscarmenu.png"))); // NOI18N
        menuItemBuscarDisco.setText("Buscar disco");
        menuItemBuscarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemBuscarDisco);

        menuItemActualizarDisco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-menu.png"))); // NOI18N
        menuItemActualizarDisco.setText("Actualizar disco");
        menuItemActualizarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemActualizarDisco);

        menuItemEliminarDisco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discoElimnarMenu.png"))); // NOI18N
        menuItemEliminarDisco.setText("Eliminar disco");
        menuItemEliminarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemEliminarDisco);

        menuItemListarDisco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discorafia-menu.png"))); // NOI18N
        menuItemListarDisco.setText("Listar disco");
        menuItemListarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarDiscoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemListarDisco);

        menuCantante.add(jMenu1);

        menuBar.add(menuCantante);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        jMenu5.setText("Disco");

        itemMenuRegistrarDisco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarDisco-menu.png"))); // NOI18N
        itemMenuRegistrarDisco2.setText("Registrar disco");
        itemMenuRegistrarDisco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuRegistrarDisco2ActionPerformed(evt);
            }
        });
        jMenu5.add(itemMenuRegistrarDisco2);

        menuItemBuscarDisco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsicoBuscarmenu.png"))); // NOI18N
        menuItemBuscarDisco2.setText("Buscar disco");
        menuItemBuscarDisco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarDisco2ActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemBuscarDisco2);

        menuItemActualizarDisco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-menu.png"))); // NOI18N
        menuItemActualizarDisco2.setText("Actualizar disco");
        menuItemActualizarDisco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarDisco2ActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemActualizarDisco2);

        menuItemEliminarDisco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discoElimnarMenu.png"))); // NOI18N
        menuItemEliminarDisco2.setText("Eliminar disco");
        menuItemEliminarDisco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarDisco2ActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemEliminarDisco2);

        menuItemListarDisco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discorafia-menu.png"))); // NOI18N
        menuItemListarDisco2.setText("Listar disco");
        menuItemListarDisco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarDisco2ActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemListarDisco2);

        menuBar.add(jMenu5);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Compositor");

        menuItemRegistrarCompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario-menu.png"))); // NOI18N
        menuItemRegistrarCompositor.setMnemonic('t');
        menuItemRegistrarCompositor.setText("Registrar compositor");
        menuItemRegistrarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemRegistrarCompositor);

        menuItemBuscarCompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busac-menu.png"))); // NOI18N
        menuItemBuscarCompositor.setMnemonic('y');
        menuItemBuscarCompositor.setText("Buscar compositor");
        menuItemBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemBuscarCompositor);

        menuItemActualizarCompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-menu.png"))); // NOI18N
        menuItemActualizarCompositor.setMnemonic('p');
        menuItemActualizarCompositor.setText("Actualizar compositor");
        menuItemActualizarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemActualizarCompositor);

        menuItemEliminarCompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarMenu.png"))); // NOI18N
        menuItemEliminarCompositor.setMnemonic('d');
        menuItemEliminarCompositor.setText("Eliminar compositor");
        menuItemEliminarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemEliminarCompositor);

        menuItemListarCompositor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listar-menu.png"))); // NOI18N
        menuItemListarCompositor.setText("Listar compositores");
        menuItemListarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCompositorActionPerformed(evt);
            }
        });
        editMenu.add(menuItemListarCompositor);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        jMenu2.setText("Cancion");

        menuItemRegistrarCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarDisco-menu.png"))); // NOI18N
        menuItemRegistrarCancion.setText("Registrar cancion");
        menuItemRegistrarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemRegistrarCancion);

        menuItemBuscarCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsicoBuscarmenu.png"))); // NOI18N
        menuItemBuscarCancion.setText("Buscar cancion");
        menuItemBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemBuscarCancion);

        menuItemActualizarCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-menu.png"))); // NOI18N
        menuItemActualizarCancion.setText("Actualizar cancion");
        menuItemActualizarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemActualizarCancion);

        menuItemEliminarCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discoElimnarMenu.png"))); // NOI18N
        menuItemEliminarCancion.setText("Eliminar cancion");
        menuItemEliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemEliminarCancion);

        menuItemListarCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discorafia-menu.png"))); // NOI18N
        menuItemListarCancion.setText("Listar cancion");
        menuItemListarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemListarCancion);

        editMenu.add(jMenu2);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        jMenu6.setText("Cliente");

        menuItemRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario-menu.png"))); // NOI18N
        menuItemRegistrarCliente.setText("Registar Cliente");
        menuItemRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarClienteActionPerformed(evt);
            }
        });
        jMenu6.add(menuItemRegistrarCliente);

        menuItemBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busac-menu.png"))); // NOI18N
        menuItemBuscarCliente.setText("Buscar Cliente");
        menuItemBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarClienteActionPerformed(evt);
            }
        });
        jMenu6.add(menuItemBuscarCliente);

        menuItemActulalizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-menu.png"))); // NOI18N
        menuItemActulalizarCliente.setText("Actualizar Cliente");
        menuItemActulalizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActulalizarClienteActionPerformed(evt);
            }
        });
        jMenu6.add(menuItemActulalizarCliente);

        menuItemEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarMenu.png"))); // NOI18N
        menuItemEliminarCliente.setText("Eliminar Cliente");
        menuItemEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarClienteActionPerformed(evt);
            }
        });
        jMenu6.add(menuItemEliminarCliente);

        menuItemListarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listar-menu.png"))); // NOI18N
        menuItemListarCliente.setText("Eliminar Cliente");
        menuItemListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarClienteActionPerformed(evt);
            }
        });
        jMenu6.add(menuItemListarCliente);

        editMenu.add(jMenu6);

        menuBar.add(editMenu);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        jMenu4.setText("Cancion");

        menuItemRegistrarCancion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarDisco-menu.png"))); // NOI18N
        menuItemRegistrarCancion1.setText("Registrar cancion");
        menuItemRegistrarCancion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarCancion1ActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemRegistrarCancion1);

        menuItemBuscarCancion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsicoBuscarmenu.png"))); // NOI18N
        menuItemBuscarCancion1.setText("Buscar cancion");
        menuItemBuscarCancion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarCancion1ActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemBuscarCancion1);

        menuItemActualizarCancion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-menu.png"))); // NOI18N
        menuItemActualizarCancion1.setText("Actualizar cancion");
        menuItemActualizarCancion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCancion1ActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemActualizarCancion1);

        menuItemEliminarCancion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discoElimnarMenu.png"))); // NOI18N
        menuItemEliminarCancion1.setText("Eliminar cancion");
        menuItemEliminarCancion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCancion1ActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemEliminarCancion1);

        menuItemListarCancion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discorafia-menu.png"))); // NOI18N
        menuItemListarCancion1.setText("Listar cancion");
        menuItemListarCancion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCancion1ActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemListarCancion1);

        menuBar.add(jMenu4);

        menuItemRegistrarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        menuItemRegistrarCliente1.setText("Cliente");

        menuItemRegistrarCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario-menu.png"))); // NOI18N
        menuItemRegistrarCliente2.setText("Registar Cliente");
        menuItemRegistrarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarCliente2ActionPerformed(evt);
            }
        });
        menuItemRegistrarCliente1.add(menuItemRegistrarCliente2);

        menuItemBuscarCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busac-menu.png"))); // NOI18N
        menuItemBuscarCliente2.setText("Buscar Cliente");
        menuItemBuscarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarCliente2ActionPerformed(evt);
            }
        });
        menuItemRegistrarCliente1.add(menuItemBuscarCliente2);

        menuItemActulalizarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-menu.png"))); // NOI18N
        menuItemActulalizarCliente1.setText("Actualizar Cliente");
        menuItemActulalizarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActulalizarCliente1ActionPerformed(evt);
            }
        });
        menuItemRegistrarCliente1.add(menuItemActulalizarCliente1);

        menuItemEliminarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarMenu.png"))); // NOI18N
        menuItemEliminarCliente1.setText("Eliminar Cliente");
        menuItemEliminarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCliente1ActionPerformed(evt);
            }
        });
        menuItemRegistrarCliente1.add(menuItemEliminarCliente1);

        menuBar.add(menuItemRegistrarCliente1);

        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuDos-menu.png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Idioma");

        menuItemEspaniol.setMnemonic('c');
        menuItemEspaniol.setText("Español");
        menuItemEspaniol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspaniolActionPerformed(evt);
            }
        });
        helpMenu.add(menuItemEspaniol);

        menuItemIngles.setMnemonic('a');
        menuItemIngles.setText("Ingles");
        menuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInglesActionPerformed(evt);
            }
        });
        helpMenu.add(menuItemIngles);

        menuItemFrances.setMnemonic('a');
        menuItemFrances.setText("Frances");
        menuItemFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFrancesActionPerformed(evt);
            }
        });
        helpMenu.add(menuItemFrances);

        menuBar.add(helpMenu);

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

    private void itemMenuCrearCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCrearCantanteActionPerformed
        if (ventanaCrearCantante == null) {
            ventanaCrearCantante = new VentanaCrearCantante(controladorCantante);
            jPanel1.add(ventanaCrearCantante);
        }
        ventanaCrearCantante.setVisible(true);
    }//GEN-LAST:event_itemMenuCrearCantanteActionPerformed

    private void itemMenuVerCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVerCantanteActionPerformed
        if (ventanaBuscarCantante == null) {
            ventanaBuscarCantante = new VentanaBuscarCantante(controladorCantante);
            jPanel1.add(ventanaBuscarCantante);
        }
        ventanaBuscarCantante.setVisible(true);
    }//GEN-LAST:event_itemMenuVerCantanteActionPerformed

    private void menuItemActualizarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCantanteActionPerformed
         if (ventanaActualizarCantante == null) {
            ventanaActualizarCantante = new VentanaActualizarCantante(controladorCantante);
            jPanel1.add(ventanaActualizarCantante);
        }
        ventanaActualizarCantante.setVisible(true);
    }//GEN-LAST:event_menuItemActualizarCantanteActionPerformed

    private void menuItemListarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCantanteActionPerformed
        if (ventanaListarCantante == null) {
            ventanaListarCantante = new VentanaListarCantante(controladorCantante);
            jPanel1.add(ventanaListarCantante);
        }
        ventanaListarCantante.setVisible(true);
    }//GEN-LAST:event_menuItemListarCantanteActionPerformed

    private void menuItemRegistrarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarCompositorActionPerformed
        if (ventanaCrearCompositor == null) {
            ventanaCrearCompositor = new VentanaCrearCompositor(controladorCompositor);
            jPanel1.add(ventanaCrearCompositor);
        }
        ventanaCrearCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemRegistrarCompositorActionPerformed

    private void menuItemBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarCompositorActionPerformed
        if (ventanaBuscarCompositor == null) {
            ventanaBuscarCompositor = new VentanaBuscarCompositor(controladorCompositor);
            jPanel1.add(ventanaBuscarCompositor);
        }
        ventanaBuscarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarCompositorActionPerformed

    private void menuItemActualizarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCompositorActionPerformed
        if (ventanaActualizarCompositor == null) {
            ventanaActualizarCompositor = new VentanaActualizarCompositor(controladorCompositor);
            jPanel1.add(ventanaActualizarCompositor);
        }
        ventanaActualizarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemActualizarCompositorActionPerformed

    private void menuItemEliminarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCompositorActionPerformed
        if (ventanaEliminarCompositor == null) {
            ventanaEliminarCompositor = new VentanaEliminarCompositor(controladorCompositor);
            jPanel1.add(ventanaEliminarCompositor);
        }
        ventanaEliminarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarCompositorActionPerformed

    private void menuItemListarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCompositorActionPerformed
        if(ventanaListarCompositor==null){
            ventanaListarCompositor= new VentanaListarCompositor(controladorCompositor);
            jPanel1.add(ventanaListarCompositor);
        }
        ventanaListarCompositor.setVisible(true);
    }//GEN-LAST:event_menuItemListarCompositorActionPerformed

    private void itemMenuRegistrarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuRegistrarDiscoActionPerformed
        if (ventanaCrearDisco == null) {
            ventanaCrearDisco = new VentanaCrearDisco(controladorCantante);
            jPanel1.add(ventanaCrearDisco);
        }
        ventanaCrearDisco.setVisible(true);
    }//GEN-LAST:event_itemMenuRegistrarDiscoActionPerformed

    private void menuItemBuscarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarDiscoActionPerformed
        if (ventanaBuscarDisco == null) {
            ventanaBuscarDisco= new VentanaBuscarDisco(controladorCantante);
            jPanel1.add(ventanaBuscarDisco);
        }
        ventanaBuscarDisco.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarDiscoActionPerformed

    private void menuItemActualizarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarDiscoActionPerformed
        if (ventanaActualizarDisco == null) {
            ventanaActualizarDisco= new VentanaActualizarDisco(controladorCantante);
            jPanel1.add(ventanaActualizarDisco);
        }
        ventanaActualizarDisco.setVisible(true);
    }//GEN-LAST:event_menuItemActualizarDiscoActionPerformed

    private void menuItemEliminarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarDiscoActionPerformed
        if (ventanaEliminarDisco == null) {
            ventanaEliminarDisco= new VentanaEliminarDisco(controladorCantante);
            jPanel1.add(ventanaEliminarDisco);
        }
        ventanaEliminarDisco.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarDiscoActionPerformed

    private void menuItemListarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarDiscoActionPerformed
        if (ventanaListarDisco == null) {
            ventanaListarDisco= new VentanaListarDisco(controladorCantante);
            jPanel1.add(ventanaListarDisco);
        }
        ventanaListarDisco.setVisible(true);
    }//GEN-LAST:event_menuItemListarDiscoActionPerformed

    private void menuItemRegistrarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarCancionActionPerformed
        if(ventanaCrearCancion==null){
            ventanaCrearCancion= new VentanaCrearCancion(controladorCompositor);
            jPanel1.add(ventanaCrearCancion);
        }
        ventanaCrearCancion.setVisible(true);
    }//GEN-LAST:event_menuItemRegistrarCancionActionPerformed

    private void menuItemBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarCancionActionPerformed
        if(ventanaBuscarCancion==null){
            ventanaBuscarCancion= new VentanaBuscarCancion(controladorCompositor);
            jPanel1.add(ventanaBuscarCancion);
        }
        ventanaBuscarCancion.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarCancionActionPerformed

    private void menuItemActualizarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCancionActionPerformed
        if(ventanaActualizarCancion==null){
            ventanaActualizarCancion= new VentanaActualizarCancion(controladorCompositor);
            jPanel1.add(ventanaActualizarCancion);
        }
        ventanaActualizarCancion.setVisible(true);
    }//GEN-LAST:event_menuItemActualizarCancionActionPerformed

    private void menuItemEliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCancionActionPerformed
        if(ventanaEliminarCancion==null){
            ventanaEliminarCancion= new VentanaEliminarCancion(controladorCompositor);
            jPanel1.add(ventanaEliminarCancion);
        }
        ventanaEliminarCancion.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarCancionActionPerformed

    private void menuItemListarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCancionActionPerformed
       if(ventanaListarCancion==null){
            ventanaListarCancion= new VentanaListarCancion(controladorCompositor);
            jPanel1.add(ventanaListarCancion);
        }
        ventanaListarCancion.setVisible(true);
    }//GEN-LAST:event_menuItemListarCancionActionPerformed

    private void menuItemRegistrarCancion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarCancion1ActionPerformed
        this.menuItemRegistrarCancionActionPerformed(evt);
    }//GEN-LAST:event_menuItemRegistrarCancion1ActionPerformed

    private void menuItemBuscarCancion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarCancion1ActionPerformed
        this.menuItemBuscarCancionActionPerformed(evt);
    }//GEN-LAST:event_menuItemBuscarCancion1ActionPerformed

    private void menuItemActualizarCancion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCancion1ActionPerformed
        this.menuItemActualizarCancionActionPerformed(evt);
    }//GEN-LAST:event_menuItemActualizarCancion1ActionPerformed

    private void menuItemEliminarCancion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCancion1ActionPerformed
        this.menuItemEliminarCancionActionPerformed(evt);
    }//GEN-LAST:event_menuItemEliminarCancion1ActionPerformed

    private void menuItemListarCancion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCancion1ActionPerformed
        this.menuItemListarCancionActionPerformed(evt);
    }//GEN-LAST:event_menuItemListarCancion1ActionPerformed

    private void menuItemRegistrarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarCliente2ActionPerformed
        this.menuItemRegistrarClienteActionPerformed(evt);
    }//GEN-LAST:event_menuItemRegistrarCliente2ActionPerformed

    private void menuItemRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarClienteActionPerformed
        if(ventanaCrearCliente ==null){
            ventanaCrearCliente= new VentanaCrearCliente(controladorCompositor, controladorCantante);
            jPanel1.add(ventanaCrearCliente);
        }
        ventanaCrearCliente.setVisible(true);
    }//GEN-LAST:event_menuItemRegistrarClienteActionPerformed

    private void menuItemBuscarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarCliente2ActionPerformed
        this.menuItemBuscarClienteActionPerformed(evt);
    }//GEN-LAST:event_menuItemBuscarCliente2ActionPerformed

    private void menuItemBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarClienteActionPerformed
        if(ventanaBuscarCliente ==null){
            ventanaBuscarCliente= new VentanaBuscarCliente(controladorCompositor);
            jPanel1.add(ventanaBuscarCliente);
        }
        ventanaBuscarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarClienteActionPerformed

    private void menuItemActulalizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActulalizarClienteActionPerformed
        if(ventanaActualizarCliente ==null){
            ventanaActualizarCliente= new VentanaActualizarCliente(controladorCompositor);
            jPanel1.add(ventanaActualizarCliente);
        }
        ventanaActualizarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemActulalizarClienteActionPerformed

    private void menuItemActulalizarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActulalizarCliente1ActionPerformed
        
    }//GEN-LAST:event_menuItemActulalizarCliente1ActionPerformed

    private void itemMenuRegistrarDisco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuRegistrarDisco2ActionPerformed
        this.itemMenuRegistrarDiscoActionPerformed(evt);
    }//GEN-LAST:event_itemMenuRegistrarDisco2ActionPerformed

    private void menuItemBuscarDisco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarDisco2ActionPerformed
        this.menuItemBuscarDiscoActionPerformed(evt);
    }//GEN-LAST:event_menuItemBuscarDisco2ActionPerformed

    private void menuItemActualizarDisco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarDisco2ActionPerformed
        this.menuItemActualizarDiscoActionPerformed(evt);
    }//GEN-LAST:event_menuItemActualizarDisco2ActionPerformed

    private void menuItemEliminarDisco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarDisco2ActionPerformed
        this.menuItemEliminarDiscoActionPerformed(evt);
    }//GEN-LAST:event_menuItemEliminarDisco2ActionPerformed

    private void menuItemListarDisco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarDisco2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemListarDisco2ActionPerformed

    private void menuItemEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarClienteActionPerformed
        if(ventanaEliminarCliente ==null){
            ventanaEliminarCliente= new VentanaEliminarCliente(controladorCompositor);
            jPanel1.add(ventanaEliminarCliente);
        }
        ventanaEliminarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarClienteActionPerformed

    private void menuItemEliminarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemEliminarCliente1ActionPerformed

    private void menuItemListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarClienteActionPerformed
        if(ventanaListarCliente ==null){
            ventanaListarCliente= new VentanaListarCliente(controladorCompositor);
            jPanel1.add(ventanaListarCliente);
        }
        ventanaListarCliente.setVisible(true);
    }//GEN-LAST:event_menuItemListarClienteActionPerformed

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

    private void cambiarIdioma() {
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        menuCantante.setText(mensajes.getString("menu.cantante"));
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
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem itemMenuCrearCantante;
    private javax.swing.JMenuItem itemMenuRegistrarDisco;
    private javax.swing.JMenuItem itemMenuRegistrarDisco2;
    private javax.swing.JMenuItem itemMenuVerCantante;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCantante;
    private javax.swing.JMenuItem menuItemActualizarCancion;
    private javax.swing.JMenuItem menuItemActualizarCancion1;
    private javax.swing.JMenuItem menuItemActualizarCantante;
    private javax.swing.JMenuItem menuItemActualizarCompositor;
    private javax.swing.JMenuItem menuItemActualizarDisco;
    private javax.swing.JMenuItem menuItemActualizarDisco2;
    private javax.swing.JMenuItem menuItemActulalizarCliente;
    private javax.swing.JMenuItem menuItemActulalizarCliente1;
    private javax.swing.JMenuItem menuItemBuscarCancion;
    private javax.swing.JMenuItem menuItemBuscarCancion1;
    private javax.swing.JMenuItem menuItemBuscarCliente;
    private javax.swing.JMenuItem menuItemBuscarCliente2;
    private javax.swing.JMenuItem menuItemBuscarCompositor;
    private javax.swing.JMenuItem menuItemBuscarDisco;
    private javax.swing.JMenuItem menuItemBuscarDisco2;
    private javax.swing.JMenuItem menuItemEliminarCancion;
    private javax.swing.JMenuItem menuItemEliminarCancion1;
    private javax.swing.JMenuItem menuItemEliminarCliente;
    private javax.swing.JMenuItem menuItemEliminarCliente1;
    private javax.swing.JMenuItem menuItemEliminarCompositor;
    private javax.swing.JMenuItem menuItemEliminarDisco;
    private javax.swing.JMenuItem menuItemEliminarDisco2;
    private javax.swing.JMenuItem menuItemEspaniol;
    private javax.swing.JMenuItem menuItemFrances;
    private javax.swing.JMenuItem menuItemIngles;
    private javax.swing.JMenuItem menuItemListarCancion;
    private javax.swing.JMenuItem menuItemListarCancion1;
    private javax.swing.JMenuItem menuItemListarCantante;
    private javax.swing.JMenuItem menuItemListarCliente;
    private javax.swing.JMenuItem menuItemListarCompositor;
    private javax.swing.JMenuItem menuItemListarDisco;
    private javax.swing.JMenuItem menuItemListarDisco2;
    private javax.swing.JMenuItem menuItemRegistrarCancion;
    private javax.swing.JMenuItem menuItemRegistrarCancion1;
    private javax.swing.JMenuItem menuItemRegistrarCliente;
    private javax.swing.JMenu menuItemRegistrarCliente1;
    private javax.swing.JMenuItem menuItemRegistrarCliente2;
    private javax.swing.JMenuItem menuItemRegistrarCompositor;
    // End of variables declaration//GEN-END:variables

}
