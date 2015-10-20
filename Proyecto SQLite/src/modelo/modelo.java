package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class modelo extends database{
    
    public modelo(){
    
    }
    
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column){  
            return false;  
        }
    }
    
    public DefaultTableModel getTablaLibros(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Título","Ejemplares","Editorial", "Páginas", "Año de Edicion"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Libros");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][6];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Libros");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Titulo");
                data[i][2] = res.getString("Ejemplares");
                data[i][3] = res.getString("Editorial");
                data[i][4] = res.getString("Paginas");
                data[i][5] = res.getString("AnyoEdicion");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaSocios(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Nombre","Apellidos","Edad", "Dirección", "Teléfono"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Socios");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][6];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Socios");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                data[i][3] = res.getString("Edad");
                data[i][4] = res.getString("Direccion");
                data[i][5] = res.getString("Telefono");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaPrestamos(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Código de Libro","Título","Código de Socio", "Nombre"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Prestamos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][5];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Prestamos");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("CodigoLibro");
                data[i][2] = res.getString("Titulo");
                data[i][3] = res.getString("CodigoSocio");
                data[i][4] = res.getString("Nombre");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public boolean InsertarLibro(String titulo, int ejemplares, String editorial, int paginas, int anyo){
        String q = "INSERT INTO Libros (Titulo, Ejemplares, Editorial, Paginas, AnyoEdicion)"
                + "VALUES('" + titulo + "', " + ejemplares + ", '" + editorial + "', " + paginas + ", " + anyo + ")";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo libro\n" + e.getMessage());
        }
        return false;
    }
    
    public boolean ModificarLibro(int codigo, String titulo, int ejemplares, String editorial, int paginas, int anyo){
        String q = "UPDATE Libros SET Titulo = '" + titulo + "', Ejemplares = " + ejemplares + ", Editorial = '" + editorial + "', Paginas = " + paginas + ", "
                + "AnyoEdicion = " + anyo + " WHERE Codigo = " + codigo;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar el libro\n" + e.getMessage());
        }
        return false;
    }
    
    public boolean EliminarLibro(int codigo){
        String q = "DELETE FROM Libros WHERE Codigo = " + codigo;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el libro\n" + e.getMessage());
        }
        return false;
    }
    
    public boolean InsertarSocio(String nombre, String apellidos, int edad, String direccion, int telefono){
        String q = "INSERT INTO Socios (Nombre, Apellidos, Edad, Direccion, Telefono)"
                + "VALUES('" + nombre + "', '" + apellidos + "', " + edad + ", '" + direccion + "', " + telefono + ")";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo socio\n" + e.getMessage());
        }
        return false;
    }
    
    public boolean ModificarSocio(int codigo, String nombre, String apellidos, int edad, String direccion, int telefono){
        String q = "UPDATE Socios SET Nombre = '" + nombre + "', Apellidos = '" + apellidos + "', Edad = " + edad + ", Direccion = '" + direccion + "', "
                + "Telefono = " + telefono + " WHERE Codigo = " + codigo;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar el socio\n" + e.getMessage());
        }
        return false;
    }
    
    public boolean EliminarSocio(int codigo){
        String q = "DELETE FROM Socios WHERE Codigo = " + codigo;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el socio\n" + e.getMessage());
        }
        return false;
    }
    
    public String buscarLibro(int codigo){
        String libro = "";
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Titulo FROM Libros WHERE Codigo = " + codigo);
            ResultSet res = pstm.executeQuery();
            res.next();
            libro = res.getString("Titulo");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al buscar libro\n" + e.getMessage());
        }
        return libro;
    }
    
    public String buscarSocio(int codigo){
        String socio = "";
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Nombre FROM Socios WHERE Codigo = " + codigo);
            ResultSet res = pstm.executeQuery();
            res.next();
            socio = res.getString("Nombre");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al buscar socio\n" + e.getMessage());
        }
        return socio;
    }
    
    public boolean InsertarPrestamo(int codigoLibro, String titulo, int codigoSocio, String nombre){
        String q = "INSERT INTO Prestamos (CodigoLibro, Titulo, CodigoSocio, Nombre)"
                + "VALUES(" + codigoLibro + ", '" + titulo + "', " + codigoSocio + ", '" + nombre + "')";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo préstamo\n" + e.getMessage());
        }
        return false;
    }
    
    public boolean ModificarPrestamo(int codigo, int codigoLibro, String titulo, int codigoSocio, String nombre){
        String q = "UPDATE Prestamos SET CodigoLibro = " + codigoLibro + ", Titulo = '" + titulo + "', CodigoSocio = " + codigoSocio + ", Nombre = '" + nombre
                + "' WHERE Codigo = " + codigo;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar el préstamo\n" + e.getMessage());
        }
        return false;
    }
    
    public boolean EliminarPrestamo(int codigo){
        String q = "DELETE FROM Prestamos WHERE Codigo = " + codigo;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el préstamo\n" + e.getMessage());
        }
        return false;
    }
    
    public DefaultTableModel getTablaConsultaNombre(String nombre){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Nombre","Apellidos","Edad", "Dirección", "Teléfono"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Socios WHERE Nombre = '" + nombre + "'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][6];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Socios WHERE Nombre = '" + nombre + "'");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                data[i][3] = res.getString("Edad");
                data[i][4] = res.getString("Direccion");
                data[i][5] = res.getString("Telefono");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaConsultaApellido(String apellidos){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Nombre","Apellidos","Edad", "Dirección", "Teléfono"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Socios WHERE Apellidos = '" + apellidos + "'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][6];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Socios WHERE Apellidos = '" + apellidos + "'");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                data[i][3] = res.getString("Edad");
                data[i][4] = res.getString("Direccion");
                data[i][5] = res.getString("Telefono");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public int getNumeroLibrosPrestados(int codigo){
        int n = 0;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Prestamos WHERE CodigoSocio = " + codigo);
            ResultSet res = pstm.executeQuery();
            res.next();
            n = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar préstamos\n" + e.getMessage());
        }
        return n;
    }
    
    public DefaultTableModel getTablaConsultaTitulo(String titulo){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Título","Ejemplares","Editorial", "Páginas", "Año de Edicion"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Libros WHERE Titulo = '" + titulo + "'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][6];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Libros WHERE Titulo = '" + titulo + "'");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Titulo");
                data[i][2] = res.getString("Ejemplares");
                data[i][3] = res.getString("Editorial");
                data[i][4] = res.getString("Paginas");
                data[i][5] = res.getString("AnyoEdicion");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
}