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
    
    public String[] getNombreAsignaturasAMatricular(){
        int registros = 0;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Asignaturas");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        String[] asignaturas = new String[registros];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Titulo FROM Asignaturas");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                asignaturas[i] = res.getString("Titulo");
            i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return asignaturas;
    }
    
    public void nuevaMatricula(String dni, String apellidos, String nombre, String domicilio, int telefono, String acceso){
        String q = "INSERT INTO Matriculas (DNI, Apellidos, Nombre, Domicilio, Telefono, Acceso)"
                + "VALUES('"+dni+"','"+apellidos+"','"+nombre+"','"+domicilio+"',"+telefono+",'"+acceso+"')";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nueva matrícula\n" + e.getMessage());
        }
    }
    
    public void nuevoAlumno(String dni, String apellidos, String nombre, String domicilio, int telefono, String acceso){
        String q = "INSERT INTO Alumnos (DNI, Apellidos, Nombre, Domicilio, Telefono, Acceso)"
                + "VALUES('"+dni+"','"+apellidos+"','"+nombre+"','"+domicilio+"',"+telefono+",'"+acceso+"')";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo alumno\n" + e.getMessage());
        }
    }
    
    public void nuevaAsignaturaMatriculada(String dni, String titulo){
        int num = 0;
        String q1 = "SELECT NumCreditos FROM Asignaturas WHERE Titulo = '"+titulo+"'";
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement(q1);
            ResultSet res = pstm.executeQuery();
            res.next();
            num = res.getInt("NumCreditos");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener el número de créditos\n" + e.getMessage());
        }
        String q2 = "INSERT INTO AsigMat (DNI, Titulo, NumCreditos, Nota)"
                + "VALUES('"+dni+"','"+titulo+"',"+num+",0)";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q2);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo alumno\n" + e.getMessage());
        }
    }
}