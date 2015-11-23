package controlador;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Modelo;
import vista.Interfaz;

public class Controlador implements ActionListener, MouseListener{
    
    Interfaz vista;
    Modelo modelo = new Modelo();
    
    public Controlador(Interfaz i){
        vista = i;
    }
    
    public enum AccionMVC{
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
        
        btnPresuAgregar,
        btnPresuBorrar,
        btnPresuGenProf,
        btnPresuCrearPed,
        
        btnAgregarPresuArt,
        btnAgregarPresuQuitarArt,
        btnAgregarPresuCrear,
        btnAgregarPresuCancelar,
        
        btnAgregarPedArt,
        btnAgregarPedQuitarArt,
        btnAgregarPedCrear,
        btnAgregarPedCancelar
    }
    
    public void iniciar(){
        
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
            
            //ESTABLECEMOS LA VISIBILIDAD DE LOS PANELES AL INICIAR
            vista.clientes.setVisible(false);
            vista.presupuestos.setVisible(false);
            vista.proveedores.setVisible(false);
            vista.articulos.setVisible(false);
            vista.pedidos.setVisible(false);
            vista.inicio.setVisible(true);
            
            //INICIALIZAMOS LOS MODELOS DE LOS COMBOBOX
            vista.comboProveedores.setModel(new DefaultComboBoxModel(modelo.getProveedores()));
            
            //INICIALIZAMOS LAS TABLAS VACÍAS CON SUS RESPECTIVOS MODELOS
            vista.tablaArticulos.setModel(modelo.tablaArticulosVacia());
            vista.tablaPedidos.setModel(modelo.tablaPedidosVacia());
            vista.tablaPresupuesto.setModel(modelo.tablaPresupuestosVacia());
            
        } catch (UnsupportedLookAndFeelException ex){}
          catch (ClassNotFoundException ex){}
          catch (InstantiationException ex){}
          catch (IllegalAccessException ex){}
        
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
        
        this.vista.btnPresuAgregar.setActionCommand("btnPresuAgregar");
        this.vista.btnPresuAgregar.addActionListener(this);
        this.vista.btnPresuBorrar.setActionCommand("btnPresuBorrar");
        this.vista.btnPresuBorrar.addActionListener(this);
        this.vista.btnPresuGenProf.setActionCommand("btnPresuGenProf");
        this.vista.btnPresuGenProf.addActionListener(this);
        this.vista.btnPresuCrearPed.setActionCommand("btnPresuCrearPed");
        this.vista.btnPresuCrearPed.addActionListener(this);
        
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
    }
    
    public void actionPerformed(ActionEvent e) {
        switch(AccionMVC.valueOf(e.getActionCommand())){
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
                
            case btnClientesAgregar:
                String nnifC = vista.txtClientesNNif.getText();
                String nombreC = vista.txtClientesNombre.getText();
                String apellidosC = vista.txtClientesApellidos.getText();
                String direccionC = vista.txtClientesDireccion.getText();
                String telefonoC = vista.txtClientesTelefono.getText();
                String correoC = vista.txtClientesCorreo.getText();
                if(nnifC.equals("") || nombreC.equals("") || direccionC.equals("")
                        || telefonoC.equals("") || correoC.equals("")){
                    JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios");
                }else{
                    modelo.crearCliente(nnifC, nombreC, apellidosC, direccionC, telefonoC, correoC);
                }
                break;
            case btnClientesModificar:
                String nifCM = vista.txtClientesNif.getText();
                String nnifCM = vista.txtClientesNNif.getText();
                String nombreCM = vista.txtClientesNombre.getText();
                String apellidosCM = vista.txtClientesApellidos.getText();
                String direccionCM = vista.txtClientesDireccion.getText();
                String telefonoCM = vista.txtClientesTelefono.getText();
                String correoCM = vista.txtClientesCorreo.getText();
                if(nifCM.equals("") || nnifCM.equals("") || nombreCM.equals("") || direccionCM.equals("")
                        || telefonoCM.equals("") || correoCM.equals("")){
                    JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios");
                }else{
                    modelo.modificarCliente(nifCM, nnifCM, nombreCM, apellidosCM, direccionCM, telefonoCM, correoCM);
                }
                break;
            case btnClientesBorrar:
                String nifCE = vista.txtClientesNif.getText();
                if(nifCE.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un cliente de la tabla");
                }else{
                    modelo.eliminarCliente(nifCE);
                }
                break;
                
            case btnArticulosAgregar:
                String ncodigoA = vista.txtNuevoCodigoArt.getText();
                String nombreA = vista.txtNombreArt.getText();
                double PCPA = Double.parseDouble(vista.txtPCPArt.getText());
                double PVPA = Double.parseDouble(vista.txtPVPArt.getText());
                String proveedorA = vista.comboProveedores.getSelectedItem().toString();
                String descripcionA = vista.txtDescripcionArt.getText();
                if(ncodigoA.equals("") || nombreA.equals("") || vista.txtPCPArt.getText().equals("") || vista.txtPVPArt.getText().equals("")
                        || PCPA <= 0.0 || PVPA <= 0.0 || proveedorA.equals("") || descripcionA.equals("")){
                    if(vista.comboProveedores.getSelectedItem().toString().equals("")){
                        JOptionPane.showMessageDialog(null, "Primero debe crearse al menos un proveedor");
                    }
                    JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios\n(Incluida una descripción)");
                }else{
                    modelo.crearArticulo(ncodigoA, proveedorA, nombreA, descripcionA, PCPA, PVPA);
                }
                break;
            case btnArticulosModificar:
                String codigoAM = vista.txtCodigoCodigo.getText();
                String ncodigoAM = vista.txtNuevoCodigoArt.getText();
                String nombreAM = vista.txtNombreArt.getText();
                double PCPAM = Double.parseDouble(vista.txtPCPArt.getText());
                double PVPAM = Double.parseDouble(vista.txtPVPArt.getText());
                String proveedorAM = vista.comboProveedores.getSelectedItem().toString();
                String descripcionAM = vista.txtDescripcionArt.getText();
                if(ncodigoAM.equals("") || nombreAM.equals("") || vista.txtPCPArt.getText().equals("") || vista.txtPVPArt.getText().equals("")
                        || PCPAM <= 0.0 || PVPAM <= 0.0 || proveedorAM.equals("") || descripcionAM.equals("") || codigoAM.equals("")){
                    if(codigoAM.equals("")){
                        JOptionPane.showMessageDialog(null, "Primero debe seleccionarse un artículo a modificar");
                    }
                    JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios\n(Incluida una descripción)");
                }else{
                    modelo.modificarArticulo(codigoAM, ncodigoAM, proveedorAM, nombreAM, descripcionAM, PCPAM, PVPAM);
                }
                break;
            case btnArticulosEliminar:
                String codigoAE = vista.txtCodigoCodigo.getText();
                if(codigoAE.equals("")){
                    JOptionPane.showMessageDialog(null, "Primero debe seleccionarse un artículo a eliminar");
                }else{
                    modelo.eliminarArticulo(codigoAE);
                }
                break;
                
            case btnProveedoresAgregar:
                String ncifP = vista.txtProveedoresNCif.getText();
                String nombreP = vista.txtProveedoresNombre.getText();
                String direccionP = vista.txtProveedoresDireccion.getText();
                String telefonoP = vista.txtProveedoresTelefono.getText();
                String correoP = vista.txtProveedoresCorreo.getText();
                if(ncifP.equals("") || nombreP.equals("") || direccionP.equals("") || telefonoP.equals("") || correoP.equals("")){
                    JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios");
                }else{
                    modelo.crearProveedor(ncifP, nombreP, direccionP, telefonoP, correoP);
                }
                break;
            case btnProveedoresModificar:
                String cifPM = vista.txtProveedoresCif.getText();
                String ncifPM = vista.txtProveedoresNCif.getText();
                String nombrePM = vista.txtProveedoresNombre.getText();
                String direccionPM = vista.txtProveedoresDireccion.getText();
                String telefonoPM = vista.txtProveedoresTelefono.getText();
                String correoPM = vista.txtProveedoresCorreo.getText();
                if(cifPM.equals("") || ncifPM.equals("") || nombrePM.equals("") || direccionPM.equals("") || telefonoPM.equals("") || correoPM.equals("")){
                    if(cifPM.equals("")){
                        JOptionPane.showMessageDialog(null, "Primero debe seleccionarse un proveedor a modificar");
                    }
                    JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios");
                }else{
                    modelo.modificarProveedor(cifPM, ncifPM, nombrePM, direccionPM, telefonoPM, correoPM);
                }
                break;
            case btnProveedoresBorrar:
                String cifPE = vista.txtProveedoresCif.getText();
                if(cifPE.equals("")){
                    JOptionPane.showMessageDialog(null, "Primero debe seleccionarse un proveedor a eliminar");
                }else{
                    modelo.eliminarProveedor(cifPE);
                }
                break;
                
            case btnPresuAgregar:
                break;
            case btnPresuBorrar:
                break;
            case btnPresuGenProf:
                break;
            case btnPresuCrearPed:
                break;
                
            case btnAgregarPresuArt:
                break;
            case btnAgregarPresuQuitarArt:
                break;
            case btnAgregarPresuCrear:
                break;
            case btnAgregarPresuCancelar:
                break;
                
            case btnAgregarPedArt:
                break;
            case btnAgregarPedQuitarArt:
                break;
            case btnAgregarPedCrear:
                break;
            case btnAgregarPedCancelar:
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //int A = vista.tablaT.rowAtPoint(e.getPoint());
        //  if (A > -1){
        //      try{
        //          String B = String.valueOf(vista.tablaT.getValueAt(A, 0));
        //      }
        //  }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void SCifras(JTextField a){
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(Character.isLetter(c)){
                    e.consume();
                }
            }
        });        
    }
    
    public static void SLetras(JTextField a){
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(Character.isDigit(c)){
                    e.consume();
                }
            }
        });        
    }
}