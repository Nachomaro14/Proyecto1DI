package controlador;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Modelo;
import vista.Interfaz;

public class Controlador implements ActionListener, MouseListener {

    Interfaz vista;
    Modelo modelo = new Modelo();

    public Controlador(Interfaz i) {
        vista = i;
    }

    public enum AccionMVC {

        menuInicio,
        menuClientes,
        menuProveedores,
        menuArticulos,
        menuPedidos,
        menuPresupuestos,
        menuSalir,
        btnClientesAgregar,
        btnClientesModificar,
        btnClientesBorrar,
        btnArticulosAgregar,
        btnArticulosModificar,
        btnArticulosEliminar,
        btnProveedoresAgregar,
        btnProveedoresModificar,
        btnProveedoresBorrar,
        btnPresuBorrar,
        btnPresuGenProf,
        btnPresuCrearPed,
        btnAgregarPresuCrearAux,
        btnPedidoAgregar,
        btnPedidoBorrar,
        btnPedidoGenFac,
        btnAgregarPresuArt,
        btnAgregarPresuQuitarArt,
        btnAgregarPresuCrear,
        btnAgregarPresuCancelar,
        btnAgregarPedArt,
        btnAgregarPedQuitarArt,
        btnAgregarPedCrear,
        btnAgregarPedCancelar,
    }

    public void iniciar() {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);

            //CAMBIAMOS EL LOGO DE LA APLICACIÓN
            Toolkit t = Toolkit.getDefaultToolkit();
            vista.setIconImage(t.getImage(getClass().getResource("/imagenes/logo.png")));

            vista.pack();
            vista.setLocationRelativeTo(null);
            vista.setVisible(true);
            vista.setTitle("Gestión de compras");

            //MODIFICAMOS LA INFORMACIÓN INICIAL DE LA EMPRESA
            String[] empresa = modelo.infoEmpresa();
            vista.txtEmpresaCIF.setText(empresa[0]);
            vista.txtEmpresaNombre.setText(empresa[1]);
            vista.txtEmpresaDireccion.setText(empresa[2]);
            vista.txtEmpresaCorreo.setText(empresa[3]);
            vista.txtEmpresaTelefono.setText(empresa[4]);
            vista.txtEmpresaWeb.setText(empresa[5]);

            //LIMITAMOS LA INTRODUCCIÓN DE SOLO LETRAS DE ALGUNOS TEXTFIELD
            SLetras(vista.txtClientesNombre);
            SLetras(vista.txtClientesApellidos);

            //LIMITAMOS LA INTRODUCCIÓN DE SOLO CIFRAS DE ALGUNOS TEXTFIELD
            SCifras(vista.txtClientesTelefono);
            SCifras(vista.txtPCPArt);
            SCifras(vista.txtPVPArt);
            SCifras(vista.txtProveedoresTelefono);
            SCifras(vista.txtAgregarPresuCantidad);
            SCifras(vista.txtAgregarPedCantidad);

            //ESTABLECEMOS LA VISIBILIDAD DE LOS PANELES AL INICIAR
            vista.clientes.setVisible(false);
            vista.presupuestos.setVisible(false);
            vista.proveedores.setVisible(false);
            vista.articulos.setVisible(false);
            vista.pedidos.setVisible(false);
            vista.inicio.setVisible(true);

            //INICIALIZAMOS LOS MODELOS DE LOS COMBOBOX
            vista.comboProveedores.setModel(new DefaultComboBoxModel(modelo.getProveedores()));
            vista.comboClientesPedidos.setModel(new DefaultComboBoxModel(modelo.getClientes()));
            vista.comboClientesPresupuestos.setModel(new DefaultComboBoxModel(modelo.getClientes()));
            vista.comboClientesAgrPedido.setModel(new DefaultComboBoxModel(modelo.getClientes()));
            vista.comboClientesAgrPresupuesto.setModel(new DefaultComboBoxModel(modelo.getClientes()));

            //INICIALIZAMOS LAS TABLAS VACÍAS CON SUS RESPECTIVOS MODELOS
            vista.tablaArticulos.setModel(modelo.tablaArticulos());
            vista.tablaPedidos.setModel(modelo.tablaPedidosClientes(vista.comboClientesPedidos.getSelectedItem().toString()));
            vista.tablaPresupuestos.setModel(modelo.tablaPresupuestosClientes(vista.comboClientesPresupuestos.getSelectedItem().toString()));
            vista.tablaClientes.setModel(modelo.tablaClientes());
            vista.tablaProveedores.setModel(modelo.tablaProveedores());
            vista.tablaPedidosClientes.setModel(modelo.tablaPresupuestosClientes(""));
            vista.tablaProveedoresArticulos.setModel(modelo.tablaArticulosProveedores(""));
            vista.tablaPresuArtPresu.setModel(modelo.tablaArticulosPresupuestos(""));
            vista.tablaPedidosArtPed.setModel(modelo.tablaArticulosPedidos(""));
            vista.tablaAgregarPresuArt.setModel(modelo.tablaArticulos());
            vista.tablaAgregarPresuArtPre.setModel(modelo.tablaArticulosPresupuestosVacia());
            vista.tablaAgregarPedArt.setModel(modelo.tablaArticulos());
            vista.tablaAgregarPedArtPed.setModel(modelo.tablaArticulosPedidosVacia());
            
            //AÑADIMOS ALGUNOS DETALLES
            String codigo = vista.comboProveedores.getSelectedItem().toString();
            String nombre = modelo.getNombreProveedor(codigo);
            vista.labelNombreProveedor.setText(nombre);
            String nif = vista.comboClientesPresupuestos.getSelectedItem().toString();
            String nombreYApellidos = modelo.getNombreCliente(nif);
            vista.labelNombreCliente.setText(nombreYApellidos);
            vista.labelNombreClientesPedidos.setText(nombreYApellidos);
            String nifP = vista.comboClientesAgrPresupuesto.getSelectedItem().toString();
            vista.tablaAgregarPresuArtPre.setModel(modelo.tablaArticulosPresupuestos(nifP));

        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
        }

        //LES ASIGNAMOS LAS ACCIONES A LOS BOTONES
        this.vista.menuInicio.setActionCommand("menuInicio");
        this.vista.menuInicio.addActionListener(this);
        this.vista.menuClientes.setActionCommand("menuClientes");
        this.vista.menuClientes.addActionListener(this);
        this.vista.menuProveedores.setActionCommand("menuProveedores");
        this.vista.menuProveedores.addActionListener(this);
        this.vista.menuArticulos.setActionCommand("menuArticulos");
        this.vista.menuArticulos.addActionListener(this);
        this.vista.menuPedidos.setActionCommand("menuPedidos");
        this.vista.menuPedidos.addActionListener(this);
        this.vista.menuPresupuestos.setActionCommand("menuPresupuestos");
        this.vista.menuPresupuestos.addActionListener(this);
        this.vista.menuSalir.setActionCommand("menuSalir");
        this.vista.menuSalir.addActionListener(this);

        this.vista.btnClientesAgregar.setActionCommand("btnClientesAgregar");
        this.vista.btnClientesAgregar.addActionListener(this);
        this.vista.btnClientesModificar.setActionCommand("btnClientesModificar");
        this.vista.btnClientesModificar.addActionListener(this);
        this.vista.btnClientesBorrar.setActionCommand("btnClientesBorrar");
        this.vista.btnClientesBorrar.addActionListener(this);

        this.vista.btnArticulosAgregar.setActionCommand("btnArticulosAgregar");
        this.vista.btnArticulosAgregar.addActionListener(this);
        this.vista.btnArticulosModificar.setActionCommand("btnArticulosModificar");
        this.vista.btnArticulosModificar.addActionListener(this);
        this.vista.btnArticulosEliminar.setActionCommand("btnArticulosEliminar");
        this.vista.btnArticulosEliminar.addActionListener(this);

        this.vista.btnProveedoresAgregar.setActionCommand("btnProveedoresAgregar");
        this.vista.btnProveedoresAgregar.addActionListener(this);
        this.vista.btnProveedoresModificar.setActionCommand("btnProveedoresModificar");
        this.vista.btnProveedoresModificar.addActionListener(this);
        this.vista.btnProveedoresBorrar.setActionCommand("btnProveedoresBorrar");
        this.vista.btnProveedoresBorrar.addActionListener(this);

        this.vista.btnPresuBorrar.setActionCommand("btnPresuBorrar");
        this.vista.btnPresuBorrar.addActionListener(this);
        this.vista.btnPresuGenProf.setActionCommand("btnPresuGenProf");
        this.vista.btnPresuGenProf.addActionListener(this);
        this.vista.btnPresuCrearPed.setActionCommand("btnPresuCrearPed");
        this.vista.btnPresuCrearPed.addActionListener(this);
        this.vista.btnAgregarPresuCrearAux.setActionCommand("btnAgregarPresuCrearAux");
        this.vista.btnAgregarPresuCrearAux.addActionListener(this);

        this.vista.btnPedidoAgregar.setActionCommand("btnPedidoAgregar");
        this.vista.btnPedidoAgregar.addActionListener(this);
        this.vista.btnPedidoBorrar.setActionCommand("btnPedidoBorrar");
        this.vista.btnPedidoBorrar.addActionListener(this);
        this.vista.btnPedidoGenFac.setActionCommand("btnPedidoGenFac");
        this.vista.btnPedidoGenFac.addActionListener(this);

        this.vista.btnAgregarPresuArt.setActionCommand("btnAgregarPresuArt");
        this.vista.btnAgregarPresuArt.addActionListener(this);
        this.vista.btnAgregarPresuQuitarArt.setActionCommand("btnAgregarPresuQuitarArt");
        this.vista.btnAgregarPresuQuitarArt.addActionListener(this);
        this.vista.btnAgregarPresuCrear.setActionCommand("btnAgregarPresuCrear");
        this.vista.btnAgregarPresuCrear.addActionListener(this);
        this.vista.btnAgregarPresuCancelar.setActionCommand("btnAgregarPresuCancelar");
        this.vista.btnAgregarPresuCancelar.addActionListener(this);

        this.vista.btnAgregarPedArt.setActionCommand("btnAgregarPedArt");
        this.vista.btnAgregarPedArt.addActionListener(this);
        this.vista.btnAgregarPedQuitarArt.setActionCommand("btnAgregarPedQuitarArt");
        this.vista.btnAgregarPedQuitarArt.addActionListener(this);
        this.vista.btnAgregarPedCrear.setActionCommand("btnAgregarPedCrear");
        this.vista.btnAgregarPedCrear.addActionListener(this);
        this.vista.btnAgregarPedCancelar.setActionCommand("btnAgregarPedCancelar");
        this.vista.btnAgregarPedCancelar.addActionListener(this);

        //LES ASIGNAMOS LOS MOUSELISTENER A LAS TABLAS
        this.vista.tablaClientes.addMouseListener(this);
        this.vista.tablaClientes.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaClientes.getTableHeader().setResizingAllowed(false);

        this.vista.tablaAgregarPedArt.addMouseListener(this);
        this.vista.tablaAgregarPedArt.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaAgregarPedArt.getTableHeader().setResizingAllowed(false);

        this.vista.tablaAgregarPedArtPed.addMouseListener(this);
        this.vista.tablaAgregarPedArtPed.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaAgregarPedArtPed.getTableHeader().setResizingAllowed(false);

        this.vista.tablaAgregarPresuArt.addMouseListener(this);
        this.vista.tablaAgregarPresuArt.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaAgregarPresuArt.getTableHeader().setResizingAllowed(false);

        this.vista.tablaAgregarPresuArtPre.addMouseListener(this);
        this.vista.tablaAgregarPresuArtPre.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaAgregarPresuArtPre.getTableHeader().setResizingAllowed(false);

        this.vista.tablaArticulos.addMouseListener(this);
        this.vista.tablaArticulos.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaArticulos.getTableHeader().setResizingAllowed(false);

        this.vista.tablaArticulosFac.addMouseListener(this);
        this.vista.tablaArticulosFac.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaArticulosFac.getTableHeader().setResizingAllowed(false);

        this.vista.tablaArticulosProf.addMouseListener(this);
        this.vista.tablaArticulosProf.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaArticulosProf.getTableHeader().setResizingAllowed(false);

        this.vista.tablaPedidos.addMouseListener(this);
        this.vista.tablaPedidos.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaPedidos.getTableHeader().setResizingAllowed(false);

        this.vista.tablaPedidosArtPed.addMouseListener(this);
        this.vista.tablaPedidosArtPed.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaPedidosArtPed.getTableHeader().setResizingAllowed(false);

        this.vista.tablaPedidosClientes.addMouseListener(this);
        this.vista.tablaPedidosClientes.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaPedidosClientes.getTableHeader().setResizingAllowed(false);

        this.vista.tablaPresuArtPresu.addMouseListener(this);
        this.vista.tablaPresuArtPresu.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaPresuArtPresu.getTableHeader().setResizingAllowed(false);

        this.vista.tablaPresupuestos.addMouseListener(this);
        this.vista.tablaPresupuestos.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaPresupuestos.getTableHeader().setResizingAllowed(false);

        this.vista.tablaProveedores.addMouseListener(this);
        this.vista.tablaProveedores.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaProveedores.getTableHeader().setResizingAllowed(false);

        this.vista.tablaProveedoresArticulos.addMouseListener(this);
        this.vista.tablaProveedoresArticulos.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaProveedoresArticulos.getTableHeader().setResizingAllowed(false);
        
        //ESTABLECEMOS LOS ITEM LISTENERS PARA LOS COMBOBOX
        this.vista.comboClientesAgrPedido.addItemListener( new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                String codigo = vista.comboProveedores.getSelectedItem().toString();
                String nombre = modelo.getNombreProveedor(codigo);
                vista.labelNombreProveedor.setText(nombre);
            }
        });
        this.vista.comboPresupuestosOPedidos.addItemListener( new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                String nif = vista.txtClientesNif.getText();
                if(vista.comboPresupuestosOPedidos.getSelectedItem().toString().equals("Presupuestos")){
                    vista.tablaPedidosClientes.setModel(modelo.tablaPresupuestosClientes(nif));
                }else{
                    vista.tablaPedidosClientes.setModel(modelo.tablaPedidosClientes(nif));
                }
            }
        });
        this.vista.comboClientesPresupuestos.addItemListener( new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                String nif = vista.comboClientesPresupuestos.getSelectedItem().toString();
                String nombreYApellidos = modelo.getNombreCliente(nif);
                vista.labelNombreCliente.setText(nombreYApellidos);
            }
        });
        this.vista.comboClientesPedidos.addItemListener( new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                String nif = vista.comboClientesPedidos.getSelectedItem().toString();
                String nombreYApellidos = modelo.getNombreCliente(nif);
                vista.labelNombreClientesPedidos.setText(nombreYApellidos);
            }
        });
        this.vista.comboClientesAgrPresupuesto.addItemListener( new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                String nif = vista.comboClientesAgrPresupuesto.getSelectedItem().toString();
                vista.tablaAgregarPresuArtPre.setModel(modelo.tablaArticulosPresupuestos(nif));
            }
        });
    }

    //DEFINIMOS LAS ACCIONES QUE SE REALIZARÁN AL PULSAR LOS BOTONES DE LA INTERFAZ
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())) {
            case menuInicio:
                vista.clientes.setVisible(false);
                vista.presupuestos.setVisible(false);
                vista.proveedores.setVisible(false);
                vista.articulos.setVisible(false);
                vista.inicio.setVisible(true);
                vista.pedidos.setVisible(false);
                break;
            case menuClientes:
                vista.presupuestos.setVisible(false);
                vista.proveedores.setVisible(false);
                vista.articulos.setVisible(false);
                vista.inicio.setVisible(false);
                vista.clientes.setVisible(true);
                vista.pedidos.setVisible(false);
                break;
            case menuProveedores:
                vista.presupuestos.setVisible(false);
                vista.articulos.setVisible(false);
                vista.inicio.setVisible(false);
                vista.clientes.setVisible(false);
                vista.proveedores.setVisible(true);
                vista.pedidos.setVisible(false);
                break;
            case menuArticulos:
                vista.presupuestos.setVisible(false);
                vista.inicio.setVisible(false);
                vista.clientes.setVisible(false);
                vista.proveedores.setVisible(false);
                vista.articulos.setVisible(true);
                vista.pedidos.setVisible(false);
                break;
            case menuPedidos:
                vista.presupuestos.setVisible(false);
                vista.inicio.setVisible(false);
                vista.clientes.setVisible(false);
                vista.proveedores.setVisible(false);
                vista.articulos.setVisible(false);
                vista.pedidos.setVisible(true);
                break;
            case menuPresupuestos:
                vista.inicio.setVisible(false);
                vista.clientes.setVisible(false);
                vista.proveedores.setVisible(false);
                vista.articulos.setVisible(false);
                vista.presupuestos.setVisible(true);
                vista.pedidos.setVisible(false);
                break;
            case menuSalir:
                System.exit(0);
                break;
            /**
             * ***BOTONES VISTA CLIENTES*****
             */
            case btnClientesAgregar:
                String nnifC = vista.txtClientesNNif.getText();
                String nombreC = vista.txtClientesNombre.getText();
                String apellidosC = vista.txtClientesApellidos.getText();
                String direccionC = vista.txtClientesDireccion.getText();
                String telefonoC = vista.txtClientesTelefono.getText();
                String correoC = vista.txtClientesCorreo.getText();
                if (nnifC.equals("") || nombreC.equals("") || direccionC.equals("")
                        || telefonoC.equals("") || correoC.equals("")) {
                    JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios");
                } else {
                    if (modelo.comprobarExistenciaCliente(nnifC) == true) {
                        JOptionPane.showMessageDialog(null, "Ya existe un cliente con esa identificación");
                    } else {
                        modelo.crearCliente(nnifC, nombreC, apellidosC, direccionC, telefonoC, correoC);
                    }
                }
                vista.tablaClientes.setModel(modelo.tablaClientes());
                vista.comboClientesAgrPedido.setModel(new DefaultComboBoxModel(modelo.getClientes()));
                vista.comboClientesAgrPresupuesto.setModel(new DefaultComboBoxModel(modelo.getClientes()));
                vista.comboClientesPedidos.setModel(new DefaultComboBoxModel(modelo.getClientes()));
                vista.comboClientesPresupuestos.setModel(new DefaultComboBoxModel(modelo.getClientes()));
                break;
            case btnClientesModificar:
                String nifCM = vista.txtClientesNif.getText();
                String nnifCM = vista.txtClientesNNif.getText();
                String nombreCM = vista.txtClientesNombre.getText();
                String apellidosCM = vista.txtClientesApellidos.getText();
                String direccionCM = vista.txtClientesDireccion.getText();
                String telefonoCM = vista.txtClientesTelefono.getText();
                String correoCM = vista.txtClientesCorreo.getText();
                if (nifCM.equals("") || nombreCM.equals("") || direccionCM.equals("")
                        || telefonoCM.equals("") || correoCM.equals("")) {
                    JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios");
                } else {
                    if(nnifCM.equals("")){
                        nnifCM = nifCM;
                    }
                    modelo.modificarCliente(nifCM, nnifCM, nombreCM, apellidosCM, direccionCM, telefonoCM, correoCM);
                }
                vista.tablaClientes.setModel(modelo.tablaClientes());
                vista.comboClientesAgrPedido.setModel(new DefaultComboBoxModel(modelo.getClientes()));
                vista.comboClientesAgrPresupuesto.setModel(new DefaultComboBoxModel(modelo.getClientes()));
                vista.comboClientesPedidos.setModel(new DefaultComboBoxModel(modelo.getClientes()));
                vista.comboClientesPresupuestos.setModel(new DefaultComboBoxModel(modelo.getClientes()));
                break;
            case btnClientesBorrar:
                String nifCE = vista.txtClientesNif.getText();
                if (nifCE.equals("")) {
                    JOptionPane.showMessageDialog(null, "Seleccione un cliente de la tabla");
                } else {
                    modelo.eliminarCliente(nifCE);
                }
                vista.tablaClientes.setModel(modelo.tablaClientes());
                vista.comboClientesAgrPedido.setModel(new DefaultComboBoxModel(modelo.getClientes()));
                vista.comboClientesAgrPresupuesto.setModel(new DefaultComboBoxModel(modelo.getClientes()));
                vista.comboClientesPedidos.setModel(new DefaultComboBoxModel(modelo.getClientes()));
                vista.comboClientesPresupuestos.setModel(new DefaultComboBoxModel(modelo.getClientes()));
                break;
            /**
             * *BOTONES VISTA ARTICULOS**
             */
            case btnArticulosAgregar:
                String ncodigoA = vista.txtNuevoCodigoArt.getText();
                String nombreA = vista.txtNombreArt.getText();
                double PCPA = Double.parseDouble(vista.txtPCPArt.getText());
                double PVPA = Double.parseDouble(vista.txtPVPArt.getText());
                int IVA = Integer.getInteger(vista.txtIVAArt.getText());
                String proveedorA = vista.comboProveedores.getSelectedItem().toString();
                String descripcionA = vista.txtDescripcionArt.getText();
                if (ncodigoA.equals("") || nombreA.equals("") || vista.txtPCPArt.getText().equals("") || vista.txtPVPArt.getText().equals("")
                        || PCPA <= 0.0 || PVPA <= 0.0 || proveedorA.equals("") || descripcionA.equals("") || vista.txtIVAArt.getText().equals("")) {
                    if (vista.comboProveedores.getSelectedItem().toString().equals("")) {
                        JOptionPane.showMessageDialog(null, "Primero debe crearse al menos un proveedor");
                    }
                    JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios\n(Incluida una descripción)");
                } else {
                    if (modelo.comprobarExistenciaArticulo(ncodigoA) == true) {
                        JOptionPane.showMessageDialog(null, "Ya existe un artículo con esa identificación");
                    } else {
                        modelo.crearArticulo(ncodigoA, proveedorA, nombreA, descripcionA, PCPA, PVPA, IVA);
                    }
                }
                vista.tablaArticulos.setModel(modelo.tablaArticulos());
                break;
            case btnArticulosModificar:
                String codigoAM = vista.txtCodigoCodigo.getText();
                String ncodigoAM = vista.txtNuevoCodigoArt.getText();
                String nombreAM = vista.txtNombreArt.getText();
                double PCPAM = Double.parseDouble(vista.txtPCPArt.getText());
                double PVPAM = Double.parseDouble(vista.txtPVPArt.getText());
                String proveedorAM = vista.comboProveedores.getSelectedItem().toString();
                String descripcionAM = vista.txtDescripcionArt.getText();
                if (nombreAM.equals("") || vista.txtPCPArt.getText().equals("") || vista.txtPVPArt.getText().equals("")
                        || PCPAM <= 0.0 || PVPAM <= 0.0 || proveedorAM.equals("") || descripcionAM.equals("") || codigoAM.equals("")) {
                    if (codigoAM.equals("")) {
                        JOptionPane.showMessageDialog(null, "Primero debe seleccionarse un artículo a modificar");
                    }
                    JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios\n(Incluida una descripción)");
                } else {
                    if(ncodigoAM.equals("")){
                        ncodigoAM = codigoAM;
                    }
                    modelo.modificarArticulo(codigoAM, ncodigoAM, proveedorAM, nombreAM, descripcionAM, PCPAM, PVPAM);
                }
                vista.tablaArticulos.setModel(modelo.tablaArticulos());
                break;
            case btnArticulosEliminar:
                String codigoAE = vista.txtCodigoCodigo.getText();
                if (codigoAE.equals("")) {
                    JOptionPane.showMessageDialog(null, "Primero debe seleccionarse un artículo a eliminar");
                } else {
                    modelo.eliminarArticulo(codigoAE);
                }
                vista.tablaArticulos.setModel(modelo.tablaArticulos());
                break;
            /**
             * *BOTONES VISTA PROVEEDORES**
             */
            case btnProveedoresAgregar:
                String ncifP = vista.txtProveedoresNCif.getText();
                String nombreP = vista.txtProveedoresNombre.getText();
                String direccionP = vista.txtProveedoresDireccion.getText();
                String telefonoP = vista.txtProveedoresTelefono.getText();
                String correoP = vista.txtProveedoresCorreo.getText();
                if (ncifP.equals("") || nombreP.equals("") || direccionP.equals("") || telefonoP.equals("") || correoP.equals("")) {
                    JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios");
                } else {
                    if (modelo.comprobarExistenciaProveedor(ncifP) == true) {
                        JOptionPane.showMessageDialog(null, "Ya existe un artículo con esa identificación");
                    } else {
                        modelo.crearProveedor(ncifP, nombreP, direccionP, telefonoP, correoP);
                    }
                }
                vista.tablaProveedores.setModel(modelo.tablaProveedores());
                vista.comboProveedores.setModel(new DefaultComboBoxModel(modelo.getProveedores()));
                break;
            case btnProveedoresModificar:
                String cifPM = vista.txtProveedoresCif.getText();
                String ncifPM = vista.txtProveedoresNCif.getText();
                String nombrePM = vista.txtProveedoresNombre.getText();
                String direccionPM = vista.txtProveedoresDireccion.getText();
                String telefonoPM = vista.txtProveedoresTelefono.getText();
                String correoPM = vista.txtProveedoresCorreo.getText();
                if (cifPM.equals("") || nombrePM.equals("") || direccionPM.equals("") || telefonoPM.equals("") || correoPM.equals("")) {
                    if (cifPM.equals("")) {
                        JOptionPane.showMessageDialog(null, "Primero debe seleccionarse un proveedor a modificar");
                    }
                    JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios");
                } else {
                    if(ncifPM.equals("")){
                        ncifPM = cifPM;
                    }
                    modelo.modificarProveedor(cifPM, ncifPM, nombrePM, direccionPM, telefonoPM, correoPM);
                }
                vista.tablaProveedores.setModel(modelo.tablaProveedores());
                vista.comboProveedores.setModel(new DefaultComboBoxModel(modelo.getProveedores()));
                break;
            case btnProveedoresBorrar:
                String cifPE = vista.txtProveedoresCif.getText();
                if (cifPE.equals("")) {
                    JOptionPane.showMessageDialog(null, "Primero debe seleccionarse un proveedor a eliminar");
                } else {
                    modelo.eliminarProveedor(cifPE);
                }
                vista.tablaProveedores.setModel(modelo.tablaProveedores());
                vista.comboProveedores.setModel(new DefaultComboBoxModel(modelo.getProveedores()));
                break;
            /**
             *** BOTONES VISTA PRESUPUESTO***
             */
            case btnPresuBorrar:
                String codPreB = vista.labelCodigoPresupuesto.getText();
                modelo.eliminarPresupuesto(codPreB);
                vista.tablaPresupuestos.setModel(modelo.tablaPresupuestos());
                vista.tablaPresuArtPresu.setModel(modelo.tablaArticulosPresupuestosVacia());
                break;
            case btnPresuGenProf:
                break;
            case btnPresuCrearPed:
                vista.dialogAgregarPresupuesto.pack();
                vista.dialogAgregarPresupuesto.setLocationRelativeTo(null);
                vista.dialogAgregarPresupuesto.setVisible(true);
                break;
            /**
             * ***BOTONES VISTA PEDIDOS****
             */
            case btnPedidoAgregar:
                vista.dialogAgregarPedido.pack();
                vista.dialogAgregarPedido.setLocationRelativeTo(null);
                vista.dialogAgregarPedido.setVisible(true);
                break;
            case btnPedidoBorrar:
                String codPB = vista.labelCodigoPedido.getText();
                modelo.eliminarPedido(codPB);
                vista.tablaPedidos.setModel(modelo.tablaPedidos());
                vista.tablaPedidosArtPed.setModel(modelo.tablaArticulosPedidosVacia());
                break;
            case btnPedidoGenFac:
                break;
            /**
             * ***** JDIALOG PRESUPUESTOS***
             */
            case btnAgregarPresuArt:
                String presupuesto = vista.labelCodigoPresupuestoAux.getText();
                String codigo = vista.labelCodArtPresu.getText();
                String cantidad = vista.txtAgregarPresuCantidad.getText();
                if(!codigo.equals("")){
                    if(!cantidad.equals("") && Integer.parseInt(cantidad) >= 0){
                        Object[] info = modelo.infoArticuloPresupuesto(codigo);
                        if(!presupuesto.equals("")){
                            modelo.nuevoArticuloPresupuesto(codigo, presupuesto, (Double) info[2], (String) info[1], Integer.parseInt(cantidad));
                        }else{
                            JOptionPane.showMessageDialog(null, "Primero debe crear un presupuesto auxiliar.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "La cantidad debe ser positiva.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione un artículo de la tabla.");
                }
                break;
            case btnAgregarPresuCrearAux:
                Calendar fecha = new GregorianCalendar();
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int mes = fecha.get(Calendar.MONTH);
                int año = fecha.get(Calendar.YEAR);
                String fechaHoy = "" + dia + "/" + mes + "/" + año;
                String nif = vista.comboClientesAgrPresupuesto.getSelectedItem().toString();
                modelo.crearPresupuesto(fechaHoy, 0.0, nif);
                vista.labelCodigoPresupuestoAux.setText(modelo.obtenerUltimoPresupuesto());
                break;
            case btnAgregarPresuQuitarArt:
                modelo.eliminarArticuloPresupuesto(vista.labelCodigoPresupuestoAux.getText(), vista.labelCodigoArtPresuSeleccionado.getText());
                vista.tablaAgregarPresuArtPre.setModel(modelo.tablaArticulosPresupuestos(vista.labelCodigoPresupuestoAux.getText()));
                break;
            case btnAgregarPresuCrear:
                boolean existe = modelo.comprobarExistenciaArticulosDePresupuesto(vista.labelCodigoPresupuestoAux.getText());
                if(existe == true){
                    vista.dialogAgregarPresupuesto.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Antes de finalizar debes añadir artículos al presupuesto.");
                }
                break;
            case btnAgregarPresuCancelar:
                String cod = vista.labelCodigoPresupuestoAux.getText();
                modelo.eliminarPresupuesto(cod);
                modelo.eliminarTodosArticulosPresupuesto(cod);
                vista.dialogAgregarPresupuesto.dispose();
                vista.comboClientesAgrPresupuesto.setSelectedIndex(0);
                vista.tablaPresupuestos.setModel(modelo.tablaPresupuestosClientes(vista.comboClientesPresupuestos.getSelectedItem().toString()));
                vista.tablaAgregarPresuArtPre.setModel(modelo.tablaArticulosPresupuestosVacia());
                vista.txtAgregarPresuCantidad.setText("");
                vista.comboClientesAgrPresupuesto.setSelectedIndex(0);
                vista.labelCodArtPresu.setText("");
                vista.labelCodigoPresupuestoAux.setText("");
                vista.labelCodigoArtPresuSeleccionado.setText("");
                break;
            /**
             * ******************JDIALOG PEDIDOS****************
             */
            case btnAgregarPedArt:
                break;
            case btnAgregarPedQuitarArt:
                break;
            case btnAgregarPedCrear:
                break;
            case btnAgregarPedCancelar:
                vista.dialogAgregarPedido.dispose();
                vista.tablaAgregarPedArtPed.setModel(modelo.tablaArticulosPedidosVacia());
                vista.txtAgregarPedCantidad.setText("");
                vista.comboClientesAgrPedido.setSelectedIndex(0);
                vista.labelCodArtPed.setText("");
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int articulo = vista.tablaArticulos.rowAtPoint(e.getPoint());
        if (articulo > -1) {
            try {
                String codigo = String.valueOf(vista.tablaArticulos.getValueAt(articulo, 0));
                String proveedor = String.valueOf(vista.tablaArticulos.getValueAt(articulo, 1));
                String nombre = String.valueOf(vista.tablaArticulos.getValueAt(articulo, 2));
                String precioP = String.valueOf(vista.tablaArticulos.getValueAt(articulo, 3));
                String precioC = String.valueOf(vista.tablaArticulos.getValueAt(articulo, 4));
                String IVA = String.valueOf(vista.tablaArticulos.getValueAt(articulo, 5));
                String descripcion = modelo.descripcionArticulo(codigo);
                vista.txtCodigoCodigo.setText(codigo);
                for (int i = 0; i < vista.comboProveedores.getItemCount(); i++) {
                    if (vista.comboProveedores.getItemAt(i).equals(proveedor)) {
                        vista.comboProveedores.setSelectedIndex(i);
                    }
                }
                vista.txtNombreArt.setText(nombre);
                vista.txtPCPArt.setText(precioP);
                vista.txtPVPArt.setText(precioC);
                vista.txtDescripcionArt.setText(descripcion);
                vista.txtIVAArt.setText(IVA);
                String nombreP = modelo.getNombreProveedor(proveedor);
                vista.labelNombreProveedor.setText(nombreP);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener los datos de la tupla de la tabla.\n\n" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        int proveedor = vista.tablaProveedores.rowAtPoint(e.getPoint());
        if (proveedor > -1) {
            try {
                String cif = String.valueOf(vista.tablaProveedores.getValueAt(proveedor, 0));
                String nombre = String.valueOf(vista.tablaProveedores.getValueAt(proveedor, 1));
                String direccion = String.valueOf(vista.tablaProveedores.getValueAt(proveedor, 2));
                String telefono = String.valueOf(vista.tablaProveedores.getValueAt(proveedor, 3));
                String correo = String.valueOf(vista.tablaProveedores.getValueAt(proveedor, 4));
                vista.txtProveedoresCif.setText(cif);
                vista.txtProveedoresNombre.setText(nombre);
                vista.txtProveedoresDireccion.setText(direccion);
                vista.txtProveedoresTelefono.setText(telefono);
                vista.txtProveedoresCorreo.setText(correo);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener los datos de la tupla de la tabla.\n\n" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        int cliente = vista.tablaClientes.rowAtPoint(e.getPoint());
        if (cliente > - 1) {
            try {
                String nif = String.valueOf(vista.tablaClientes.getValueAt(cliente, 0));
                String nombre = String.valueOf(vista.tablaClientes.getValueAt(cliente, 1));
                String apellidos = String.valueOf(vista.tablaClientes.getValueAt(cliente, 2));
                String direccion = String.valueOf(vista.tablaClientes.getValueAt(cliente, 3));
                String telefono = String.valueOf(vista.tablaClientes.getValueAt(cliente, 4));
                String correo = String.valueOf(vista.tablaClientes.getValueAt(cliente, 5));
                vista.txtClientesNif.setText(nif);
                vista.txtClientesNombre.setText(nombre);
                vista.txtClientesApellidos.setText(apellidos);
                vista.txtClientesDireccion.setText(direccion);
                vista.txtClientesTelefono.setText(telefono);
                vista.txtClientesCorreo.setText(correo);

                if (vista.comboPresupuestosOPedidos.getSelectedItem().toString().equals("Presupuestos")) {
                    vista.tablaPedidosClientes.setModel(modelo.tablaPresupuestosClientes(vista.txtClientesNif.getText()));
                } else {
                    vista.tablaPedidosClientes.setModel(modelo.tablaPedidosClientes(vista.txtClientesNif.getText()));
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener los datos de la tupla de la tabla.\n\n" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        int presupuesto = vista.tablaPresupuestos.rowAtPoint(e.getPoint());
        if (presupuesto > - 1) {
            try{
                String codigo = String.valueOf(vista.tablaPresupuestos.getValueAt(presupuesto, 0));
                vista.tablaPresuArtPresu.setModel(modelo.tablaArticulosPresupuestos(codigo));
                vista.labelCodigoPresupuesto.setText(codigo);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener los datos de la tupla de la tabla.\n\n" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        int pedido = vista.tablaPedidos.rowAtPoint(e.getPoint());
        if (pedido > - 1) {
            try{
                String codigo = String.valueOf(vista.tablaPedidos.getValueAt(pedido, 0));
                vista.tablaPedidosArtPed.setModel(modelo.tablaArticulosPedidos(codigo));
                vista.labelCodigoPedido.setText(codigo);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener los datos de la tupla de la tabla.\n\n" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        int articuloParaPresupuesto = vista.tablaAgregarPresuArt.rowAtPoint(e.getPoint());
        if (articuloParaPresupuesto > -1) {
            try{
                String codigo = String.valueOf(vista.tablaArticulos.getValueAt(articulo, 0));
                vista.labelCodArtPresu.setText(codigo);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener los datos de la tupla de la tabla.\n\n" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public static void SCifras(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                    e.consume();
                }
            }
        });
    }

    public static void SLetras(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
    }
}
