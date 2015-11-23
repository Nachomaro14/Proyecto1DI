package controlador;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
            vista.inicio.setVisible(true);
            
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
                break;
            case menuClientes:
                vista.presupuestos.setVisible(false);
                vista.proveedores.setVisible(false);
                vista.articulos.setVisible(false);
                vista.inicio.setVisible(false);
                vista.clientes.setVisible(true);
                break;
            case menuProveedores:
                vista.presupuestos.setVisible(false);
                vista.articulos.setVisible(false);
                vista.inicio.setVisible(false);
                vista.clientes.setVisible(false);
                vista.proveedores.setVisible(true);
                break;
            case menuArticulos:
                vista.presupuestos.setVisible(false);
                vista.inicio.setVisible(false);
                vista.clientes.setVisible(false);
                vista.proveedores.setVisible(false);
                vista.articulos.setVisible(true);
                break;
            case menuPedidos:
                vista.presupuestos.setVisible(false);
                vista.inicio.setVisible(false);
                vista.clientes.setVisible(false);
                vista.proveedores.setVisible(false);
                vista.articulos.setVisible(false);
                break;
            case menuPresupuestos:
                vista.inicio.setVisible(false);
                vista.clientes.setVisible(false);
                vista.proveedores.setVisible(false);
                vista.articulos.setVisible(false);
                vista.presupuestos.setVisible(true);
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
                break;
                
            case btnArticulosAgregar:
                break;
            case btnArticulosModificar:
                break;
            case btnArticulosEliminar:
                break;
                
            case btnProveedoresAgregar:
                break;
            case btnProveedoresModificar:
                break;
            case btnProveedoresBorrar:
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