package ModeloCiencias;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloSQLite extends ConexionSQLite{
    
    public ModeloSQLite(){
    
    }
    
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column){  
            return false;  
        }
    }
    
    public DefaultTableModel getTablaMatriculas(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","DNI","Apellidos","Nombre"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(CodMat) as total FROM Matriculas");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][4];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT CodMat, DNI, Apellidos, Nombre FROM Matriculas");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getInt("CodMat");
                data[i][1] = res.getString("DNI");
                data[i][2] = res.getString("Apellidos");
                data[i][3] = res.getString("Nombre");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaAsignaturas(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Título","Créditos"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Asignaturas");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][3];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Codigo, Titulo, NumCreditos FROM Asignaturas");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getInt("Codigo");
                data[i][1] = res.getString("Titulo");
                data[i][2] = res.getInt("NumCreditos");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaAsignaturasMatriculadas(String DNI){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","DNI","Título","Créditos","Nota"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM AsigMat WHERE DNI = '" + DNI + "'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][3];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Codigo, DNI, Titulo, NumCreditos, Nota FROM Asignaturas WHERE DNI = '" + DNI + "'");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getInt("Codigo");
                data[i][1] = res.getString("DNI");
                data[i][2] = res.getString("Titulo");
                data[i][3] = res.getInt("NumCreditos");
                data[i][3] = res.getInt("Nota");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaAlumnos(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"DNI","Apellidos","Nombre","Domicilio","Teléfono","Acceso"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(DNI) as total FROM Alumnos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][6];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT DNI, Apellidos, Nombre, Domicilio, Telefono, Acceso FROM Alumnos");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("DNI");
                data[i][1] = res.getString("Apellidos");
                data[i][2] = res.getString("Nombre");
                data[i][3] = res.getString("Domicilio");
                data[i][4] = res.getInt("Telefono");
                data[i][5] = res.getString("Acceso");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaProfesores(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"DNI","Apellidos","Nombre","Domicilio","Teléfono","Supervisor"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(DNI) as total FROM Profesores");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][6];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT DNI, Apellidos, Nombre, Domicilio, Telefono, Supervisor FROM Profesores");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("DNI");
                data[i][1] = res.getString("Apellidos");
                data[i][2] = res.getString("Nombre");
                data[i][3] = res.getString("Domicilio");
                data[i][4] = res.getInt("Telefono");
                data[i][5] = res.getString("Supervisor");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaAulas(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Edificio","Número"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM Aulas");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][2];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT NombreEdificio, NumAula FROM Aulas");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("NombreEdificio");
                data[i][1] = res.getInt("NumAula");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaAsignaciones(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","DNI","Apellidos","Nombre","Título","Edificio","Aula"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(CodAsignacion) as total FROM PAA");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][7];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT CodAsignacion, DNI, Apellidos, Nombre, Titulo, NombreEdificio, NumAula FROM PAA");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getInt("CodAsignacion");
                data[i][1] = res.getString("DNI");
                data[i][2] = res.getString("Apellidos");
                data[i][3] = res.getString("Nombre");
                data[i][4] = res.getString("Titulo");
                data[i][5] = res.getString("NombreEdificio");
                data[i][6] = res.getInt("NumAula");
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