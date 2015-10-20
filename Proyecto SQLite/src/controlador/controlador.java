package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import modelo.modelo;
import vista.vista;

public class controlador implements ActionListener, MouseListener{
    
    vista vista;
    modelo modelo = new modelo();
    
    public controlador(vista v){
        vista = v;
    }

    public enum AccionMVC{
        btnInsertarLibro,
        btnModificarLibro,
        btnEliminarLibro,
        btnLimpiarLibro,
        
        btnInsertarSocio,
        btnModificarSocio,
        btnEliminarSocio,
        btnLimpiarSocio,
        
        btnInsertarPrestamo,
        btnModificarPrestamo,
        btnEliminarPrestamo,
        btnLimpiarPrestamo,
        
        btnConsultarNombre,
        btnConsultarApellido,
        btnConsultarTitulo,
        btnLibrosFuera,
        btnClientesMorosos
    }
    
    public void iniciar(){
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            vista.pack();
            vista.setLocationRelativeTo(null);
            vista.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex){}
          catch (ClassNotFoundException ex){}
          catch (InstantiationException ex){}
          catch (IllegalAccessException ex){}
        
        this.vista.btnInsertarLibro.setActionCommand("btnInsertarLibro");
        this.vista.btnInsertarLibro.addActionListener(this);
        this.vista.btnModificarLibro.setActionCommand("btnModificarLibro");
        this.vista.btnModificarLibro.addActionListener(this);
        this.vista.btnEliminarLibro.setActionCommand("btnEliminarLibro");
        this.vista.btnEliminarLibro.addActionListener(this);
        this.vista.btnLimpiarLibro.setActionCommand("btnLimpiarLibro");
        this.vista.btnLimpiarLibro.addActionListener(this);
        
        this.vista.btnInsertarSocio.setActionCommand("btnInsertarSocio");
        this.vista.btnInsertarSocio.addActionListener(this);
        this.vista.btnModificarSocio.setActionCommand("btnModificarSocio");
        this.vista.btnModificarSocio.addActionListener(this);
        this.vista.btnEliminarSocio.setActionCommand("btnEliminarSocio");
        this.vista.btnEliminarSocio.addActionListener(this);
        this.vista.btnLimpiarSocio.setActionCommand("btnLimpiarSocio");
        this.vista.btnLimpiarSocio.addActionListener(this);
        
        this.vista.btnInsertarPrestamo.setActionCommand("btnInsertarPrestamo");
        this.vista.btnInsertarPrestamo.addActionListener(this);
        this.vista.btnModificarPrestamo.setActionCommand("btnModificarPrestamo");
        this.vista.btnModificarPrestamo.addActionListener(this);
        this.vista.btnEliminarPrestamo.setActionCommand("btnEliminarPrestamo");
        this.vista.btnEliminarPrestamo.addActionListener(this);
        this.vista.btnLimpiarPrestamo.setActionCommand("btnLimpiarPrestamo");
        this.vista.btnLimpiarPrestamo.addActionListener(this);
        
        this.vista.btnConsultarNombre.setActionCommand("btnConsultarNombre");
        this.vista.btnConsultarNombre.addActionListener(this);
        this.vista.btnConsultarApellido.setActionCommand("btnConsultarApellido");
        this.vista.btnConsultarApellido.addActionListener(this);
        this.vista.btnConsultarTitulo.setActionCommand("btnConsultarTitulo");
        this.vista.btnConsultarTitulo.addActionListener(this);
        this.vista.btnLibrosFuera.setActionCommand("btnLibrosFuera");
        this.vista.btnLibrosFuera.addActionListener(this);
        this.vista.btnClientesMorosos.setActionCommand("btnClientesMorosos");
        this.vista.btnClientesMorosos.addActionListener(this);
        
        this.vista.tablaLibros.addMouseListener(this);
        this.vista.tablaLibros.setModel(modelo.getTablaLibros());
        this.vista.tablaLibros.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaLibros.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaSocios.addMouseListener(this);
        this.vista.tablaSocios.setModel(modelo.getTablaSocios());
        this.vista.tablaSocios.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaSocios.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaPrestamos.addMouseListener(this);
        this.vista.tablaPrestamos.setModel(modelo.getTablaPrestamos());
        this.vista.tablaPrestamos.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaPrestamos.getTableHeader().setResizingAllowed(false);
        
        DefaultTableModel modeloTablaDefault = new DefaultTableModel();
        
        this.vista.tablaConsultas.addMouseListener(this);
        this.vista.tablaConsultas.setModel(modeloTablaDefault);
        this.vista.tablaConsultas.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaConsultas.getTableHeader().setResizingAllowed(false);
    }
    
    public void actionPerformed(ActionEvent e) {
        switch(AccionMVC.valueOf(e.getActionCommand())){
            case btnInsertarLibro:
                if(vista.txtTituloLibro.getText().equals("") || vista.txtEjemplaresLibro.getText().equals("") || vista.txtEditorialLibro.getText().equals("")
                        || vista.txtPaginasLibro.getText().equals("") || vista.txtAnoEdicionLibro.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos");
                }else{
                    String titulo = vista.txtTituloLibro.getText();
                    int ejemplares = Integer.parseInt(vista.txtEjemplaresLibro.getText());
                    String editorial = vista.txtEditorialLibro.getText();
                    int paginas = Integer.parseInt(vista.txtPaginasLibro.getText());
                    int anyo = Integer.parseInt(vista.txtAnoEdicionLibro.getText());
                    
                    modelo.InsertarLibro(titulo, ejemplares, editorial, paginas, anyo);
                    this.vista.tablaLibros.setModel(modelo.getTablaLibros());
                    
                    vista.txtCodigoLibro.setText("");
                    vista.txtTituloLibro.setText("");
                    vista.txtEjemplaresLibro.setText("");
                    vista.txtEditorialLibro.setText("");
                    vista.txtPaginasLibro.setText("");
                    vista.txtAnoEdicionLibro.setText("");
                }
                break;
            case btnModificarLibro:
                if(vista.txtTituloLibro.getText().equals("") || vista.txtEjemplaresLibro.getText().equals("") || vista.txtEditorialLibro.getText().equals("")
                        || vista.txtPaginasLibro.getText().equals("") || vista.txtAnoEdicionLibro.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos");
                }else{
                    int codigo = Integer.parseInt(vista.txtCodigoLibro.getText());
                    String titulo = vista.txtTituloLibro.getText();
                    int ejemplares = Integer.parseInt(vista.txtEjemplaresLibro.getText());
                    String editorial = vista.txtEditorialLibro.getText();
                    int paginas = Integer.parseInt(vista.txtPaginasLibro.getText());
                    int anyo = Integer.parseInt(vista.txtAnoEdicionLibro.getText());
                    
                    modelo.ModificarLibro(codigo, titulo, ejemplares, editorial, paginas, anyo);
                    this.vista.tablaLibros.setModel(modelo.getTablaLibros());
                    
                    vista.txtCodigoLibro.setText("");
                    vista.txtTituloLibro.setText("");
                    vista.txtEjemplaresLibro.setText("");
                    vista.txtEditorialLibro.setText("");
                    vista.txtPaginasLibro.setText("");
                    vista.txtAnoEdicionLibro.setText("");
                }
                break;
            case btnEliminarLibro:
                if(vista.txtCodigoLibro.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un libro de la tabla");
                }else{
                    int codigo = Integer.parseInt(vista.txtCodigoLibro.getText());
                    
                    modelo.EliminarLibro(codigo);
                    this.vista.tablaLibros.setModel(modelo.getTablaLibros());
                    
                    vista.txtCodigoLibro.setText("");
                    vista.txtTituloLibro.setText("");
                    vista.txtEjemplaresLibro.setText("");
                    vista.txtEditorialLibro.setText("");
                    vista.txtPaginasLibro.setText("");
                    vista.txtAnoEdicionLibro.setText("");
                }
                break;
            case btnInsertarSocio:
                if(vista.txtNombreSocio.getText().equals("") || vista.txtApellidosSocio.getText().equals("") || vista.txtEdadSocio.getText().equals("")
                        || vista.txtDireccionSocio.getText().equals("") || vista.txtTelefonoSocio.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos");
                }else{
                    String nombre = vista.txtNombreSocio.getText();
                    String apellidos = vista.txtApellidosSocio.getText();
                    int edad = Integer.parseInt(vista.txtEdadSocio.getText());
                    String direccion = vista.txtDireccionSocio.getText();
                    int telefono = Integer.parseInt(vista.txtTelefonoSocio.getText());
                    
                    modelo.InsertarSocio(nombre, apellidos, edad, direccion, telefono);
                    this.vista.tablaSocios.setModel(modelo.getTablaSocios());
                    
                    vista.txtCodigoSocio.setText("");
                    vista.txtNombreSocio.setText("");
                    vista.txtApellidosSocio.setText("");
                    vista.txtEdadSocio.setText("");
                    vista.txtDireccionSocio.setText("");
                    vista.txtTelefonoSocio.setText("");
                }
                break;
            case btnModificarSocio:
                if(vista.txtNombreSocio.getText().equals("") || vista.txtApellidosSocio.getText().equals("") || vista.txtEdadSocio.getText().equals("")
                        || vista.txtDireccionSocio.getText().equals("") || vista.txtTelefonoSocio.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos");
                }else{
                    int codigo = Integer.parseInt(vista.txtCodigoSocio.getText());
                    String nombre = vista.txtNombreSocio.getText();
                    String apellidos = vista.txtApellidosSocio.getText();
                    int edad = Integer.parseInt(vista.txtEdadSocio.getText());
                    String direccion = vista.txtDireccionSocio.getText();
                    int telefono = Integer.parseInt(vista.txtTelefonoSocio.getText());
                    
                    modelo.ModificarSocio(codigo, nombre, apellidos, edad, direccion, telefono);
                    this.vista.tablaSocios.setModel(modelo.getTablaSocios());
                    
                    vista.txtCodigoSocio.setText("");
                    vista.txtNombreSocio.setText("");
                    vista.txtApellidosSocio.setText("");
                    vista.txtEdadSocio.setText("");
                    vista.txtDireccionSocio.setText("");
                    vista.txtTelefonoSocio.setText("");
                }
                break;
            case btnEliminarSocio:
                if(vista.txtCodigoSocio.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un socio de la tabla");
                }else{
                    int codigo = Integer.parseInt(vista.txtCodigoSocio.getText());
                    
                    modelo.EliminarSocio(codigo);
                    this.vista.tablaSocios.setModel(modelo.getTablaSocios());
                    
                    vista.txtCodigoSocio.setText("");
                    vista.txtNombreSocio.setText("");
                    vista.txtApellidosSocio.setText("");
                    vista.txtEdadSocio.setText("");
                    vista.txtDireccionSocio.setText("");
                    vista.txtTelefonoSocio.setText("");
                }
                break;
            case btnInsertarPrestamo:
                if(vista.txtCodigoLibroPrestamo.getText().equals("") || vista.txtCodigoSocioPrestamo.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Introduzca los códigos de libro y socio");
                }else{
                    try{
                        int libro = Integer.parseInt(vista.txtCodigoLibroPrestamo.getText());
                        int socio = Integer.parseInt(vista.txtCodigoSocioPrestamo.getText());
                        String titulo = modelo.buscarLibro(libro);
                        String nombre = modelo.buscarSocio(socio);
                        
                        modelo.InsertarPrestamo(libro, titulo, socio, nombre);
                        this.vista.tablaPrestamos.setModel(modelo.getTablaPrestamos());
                        
                        vista.txtCodigoPrestamo.setText("");
                        vista.txtCodigoLibroPrestamo.setText("");
                        vista.txtTituloLibroPrestamo.setText("");
                        vista.txtCodigoSocioPrestamo.setText("");
                        vista.txtNombreSocioPrestamo.setText("");
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Introduzca dos códigos válidos\n" + ex.getMessage());
                    }
                }
                break;
            case btnModificarPrestamo:
                if(vista.txtCodigoLibroPrestamo.getText().equals("") || vista.txtCodigoSocioPrestamo.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Introduzca los códigos de libro y socio");
                }else{
                    try{
                        int codigo = Integer.parseInt(vista.txtCodigoPrestamo.getText());
                        int libro = Integer.parseInt(vista.txtCodigoLibroPrestamo.getText());
                        int socio = Integer.parseInt(vista.txtCodigoSocioPrestamo.getText());
                        String titulo = modelo.buscarLibro(libro);
                        String nombre = modelo.buscarSocio(socio);
                        
                        modelo.ModificarPrestamo(codigo, libro, titulo, socio, nombre);
                        this.vista.tablaPrestamos.setModel(modelo.getTablaPrestamos());
                        
                        vista.txtCodigoPrestamo.setText("");
                        vista.txtCodigoLibroPrestamo.setText("");
                        vista.txtTituloLibroPrestamo.setText("");
                        vista.txtCodigoSocioPrestamo.setText("");
                        vista.txtNombreSocioPrestamo.setText("");
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Introduzca dos códigos válidos\n" + ex.getMessage());
                    }
                }
                break;
            case btnEliminarPrestamo:
                if(vista.txtCodigoPrestamo.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Introduzca los códigos de libro y socio");
                }else{
                    try{
                        int codigo = Integer.parseInt(vista.txtCodigoPrestamo.getText());
                        
                        modelo.EliminarPrestamo(codigo);
                        this.vista.tablaPrestamos.setModel(modelo.getTablaPrestamos());
                        
                        vista.txtCodigoPrestamo.setText("");
                        vista.txtCodigoLibroPrestamo.setText("");
                        vista.txtTituloLibroPrestamo.setText("");
                        vista.txtCodigoSocioPrestamo.setText("");
                        vista.txtNombreSocioPrestamo.setText("");
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Introduzca dos códigos válidos\n" + ex.getMessage());
                    }
                }
                break;
            case btnLimpiarLibro:
                vista.txtCodigoLibro.setText("");
                vista.txtTituloLibro.setText("");
                vista.txtEjemplaresLibro.setText("");
                vista.txtEditorialLibro.setText("");
                vista.txtPaginasLibro.setText("");
                vista.txtAnoEdicionLibro.setText("");
                break;
            case btnLimpiarSocio:
                vista.txtCodigoSocio.setText("");
                vista.txtNombreSocio.setText("");
                vista.txtApellidosSocio.setText("");
                vista.txtEdadSocio.setText("");
                vista.txtDireccionSocio.setText("");
                vista.txtTelefonoSocio.setText("");
                break;
            case btnLimpiarPrestamo:
                vista.txtCodigoPrestamo.setText("");
                vista.txtCodigoLibroPrestamo.setText("");
                vista.txtTituloLibroPrestamo.setText("");
                vista.txtCodigoSocioPrestamo.setText("");
                vista.txtNombreSocioPrestamo.setText("");
                break;
            case btnConsultarNombre:
                String nombre = vista.txtConsultarNombre.getText();
                if(nombre.equals("")){
                    JOptionPane.showMessageDialog(null, "Introduzca un nombre que consultar");
                }else{
                    this.vista.tablaConsultas.setModel(modelo.getTablaConsultaNombre(nombre));
                    vista.txtConsultarNombre.setText("");
                }
                break;
            case btnConsultarApellido:
                String apellidos = vista.txtConsultarApellido.getText();
                if(apellidos.equals("")){
                    JOptionPane.showMessageDialog(null, "Introduzca un apellido que consultar");
                }else{
                    this.vista.tablaConsultas.setModel(modelo.getTablaConsultaApellido(apellidos));
                    vista.txtConsultarApellido.setText("");
                }
                break;
            case btnConsultarTitulo:
                String titulo = vista.txtConsultarTitulo.getText();
                if(titulo.equals("")){
                    JOptionPane.showMessageDialog(null, "Introduzca un título que consultar");
                }else{
                    this.vista.tablaConsultas.setModel(modelo.getTablaConsultaTitulo(titulo));
                    vista.txtConsultarTitulo.setText("");
                }
                break;
        }
    }
    
    public void mouseClicked(MouseEvent e) {
        if(e.getButton()== 1){
            int libro = vista.tablaLibros.rowAtPoint(e.getPoint());
            int socio = vista.tablaSocios.rowAtPoint(e.getPoint());
            int prestamo = vista.tablaPrestamos.rowAtPoint(e.getPoint());
            if (libro > -1){                
                vista.txtCodigoLibro.setText(String.valueOf(vista.tablaLibros.getValueAt(libro, 0)));
                vista.txtTituloLibro.setText(String.valueOf(vista.tablaLibros.getValueAt(libro, 1)));
                vista.txtEjemplaresLibro.setText(String.valueOf(vista.tablaLibros.getValueAt(libro, 2)));
                vista.txtEditorialLibro.setText(String.valueOf(vista.tablaLibros.getValueAt(libro, 3)));
                vista.txtPaginasLibro.setText(String.valueOf(vista.tablaLibros.getValueAt(libro, 4)));
                vista.txtAnoEdicionLibro.setText(String.valueOf(vista.tablaLibros.getValueAt(libro, 5)));
            }
            if (socio > -1){                
                vista.txtCodigoSocio.setText(String.valueOf(vista.tablaSocios.getValueAt(socio, 0)));
                vista.txtNombreSocio.setText(String.valueOf(vista.tablaSocios.getValueAt(socio, 1)));
                vista.txtApellidosSocio.setText(String.valueOf(vista.tablaSocios.getValueAt(socio, 2)));
                vista.txtEdadSocio.setText(String.valueOf(vista.tablaSocios.getValueAt(socio, 3)));
                vista.txtDireccionSocio.setText(String.valueOf(vista.tablaSocios.getValueAt(socio, 4)));
                vista.txtTelefonoSocio.setText(String.valueOf(vista.tablaSocios.getValueAt(socio, 5)));
            }
            if (prestamo > -1){                
                vista.txtCodigoPrestamo.setText(String.valueOf(vista.tablaPrestamos.getValueAt(prestamo, 0)));
                vista.txtCodigoLibroPrestamo.setText(String.valueOf(vista.tablaPrestamos.getValueAt(prestamo, 1)));
                vista.txtTituloLibroPrestamo.setText(String.valueOf(vista.tablaPrestamos.getValueAt(prestamo, 2)));
                vista.txtCodigoSocioPrestamo.setText(String.valueOf(vista.tablaPrestamos.getValueAt(prestamo, 3)));
                vista.txtNombreSocioPrestamo.setText(String.valueOf(vista.tablaPrestamos.getValueAt(prestamo, 4)));
            }
        }else if(e.getButton()== 1 && vista.tablaConsultas.getColumnName(1).equals("Nombre")){
            int consulta = vista.tablaConsultas.rowAtPoint(e.getPoint());
            
            if (consulta > -1){
                vista.codigoSeleccionado.setText(String.valueOf(vista.tablaPrestamos.getValueAt(consulta, 0)));
                int cod = Integer.parseInt(vista.codigoSeleccionado.getText());
                int num = modelo.getNumeroLibrosPrestados(cod);
                vista.numeroLibros.setText(""+num);
            }
        }
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}