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
        String[] columNames = {"DNI","Apellidos","Nombre"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(CodMat) as total FROM Matriculas");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][3];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT DNI, Apellidos, Nombre FROM Matriculas");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("DNI");
                data[i][1] = res.getString("Apellidos");
                data[i][2] = res.getString("Nombre");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
            e.printStackTrace();
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
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Titulo");
                data[i][2] = res.getString("NumCreditos");
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
        Object[][] data = new String[registros][5];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Codigo, DNI, Titulo, NumCreditos, Nota FROM AsigMat WHERE DNI = '" + DNI + "'");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("DNI");
                data[i][2] = res.getString("Titulo");
                data[i][3] = res.getString("NumCreditos");
                data[i][4] = res.getString("Nota");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaAsignaturasMatriculadasSinNota(String DNI){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","DNI","Título","Créditos"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM AsigMat WHERE DNI = '" + DNI + "'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][4];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Codigo, DNI, Titulo, NumCreditos FROM AsigMat WHERE DNI = '" + DNI + "'");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("DNI");
                data[i][2] = res.getString("Titulo");
                data[i][3] = res.getString("NumCreditos");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
            e.printStackTrace();
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
                data[i][4] = res.getString("Telefono");
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
                data[i][4] = res.getString("Telefono");
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
                data[i][1] = res.getString("NumAula");
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
                data[i][0] = res.getString("CodAsignacion");
                data[i][1] = res.getString("DNI");
                data[i][2] = res.getString("Apellidos");
                data[i][3] = res.getString("Nombre");
                data[i][4] = res.getString("Titulo");
                data[i][5] = res.getString("NombreEdificio");
                data[i][6] = res.getString("NumAula");
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
    
    public void nuevaMatricula(String dni, String apellidos, String nombre, String domicilio, String telefono, String acceso){
        String q = "INSERT INTO Matriculas (DNI, Apellidos, Nombre, Domicilio, Telefono, Acceso)"
                + "VALUES('"+dni+"','"+apellidos+"','"+nombre+"','"+domicilio+"','"+telefono+"','"+acceso+"')";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nueva matrícula\n" + e.getMessage());
        }
    }
    
    public void nuevoAlumno(String dni, String apellidos, String nombre, String domicilio, String telefono, String acceso){
        String q = "INSERT INTO Alumnos (DNI, Apellidos, Nombre, Domicilio, Telefono, Acceso)"
                + "VALUES('"+dni+"','"+apellidos+"','"+nombre+"','"+domicilio+"','"+telefono+"','"+acceso+"')";
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
    
    public boolean comprobarExistenciaAsignatura(int codigo, String titulo){
        String q = "SELECT Codigo, Titulo FROM Asignaturas WHERE Codigo = "+codigo+" OR Titulo = '"+titulo+"'";
        boolean resu = false;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            res.next();
            if(res.getRow() == 0){
                resu = false;
            }else{
                resu = true;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al comprobar existencia\n" + e.getMessage());
            e.printStackTrace();
        }
        return resu;
    }
    
    public void nuevaAsignatura(int codigo, String titulo, int creditos){
        String q = "INSERT INTO Asignaturas (Codigo, Titulo, NumCreditos)"
                + "VALUES("+codigo+",'"+titulo+"',"+creditos+")";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nueva asignatura\n" + e.getMessage());
        }
    }
    
    public void modificarAsignatura(int codigo, int nCodigo, String titulo, int creditos){
        String q = "UPDATE Asignaturas SET Codigo = "+nCodigo+", Titulo = '"+titulo+"', NumCreditos = "+creditos
                + " WHERE Codigo = "+codigo;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar la asignatura\n" + e.getMessage());
        }
    }
    
    public boolean comprobarExistenciaProfesor(String dni){
        String q = "SELECT DNI FROM Profesores WHERE DNI = '"+dni+"'";
        boolean resu = false;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            res.next();
            if(res.getRow() == 0){
                resu = false;
            }else{
                resu = true;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al comprobar existencia\n" + e.getMessage());
            e.printStackTrace();
        }
        return resu;
    }
    
    public void eliminarAsignatura(int codigo, String titulo){
        String q = "DELETE FROM Asignaturas WHERE Codigo = "+codigo+" AND Titulo ='"+titulo+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar la asignatura\n" + e.getMessage());
        }
    }
    
    public void nuevoProfesor(String nDni, String apellidos, String nombre, String domicilio, String telefono, String supervisor){
        String q = "INSERT INTO Profesores (DNI, Apellidos, Nombre, Domicilio, Telefono, Supervisor)"
                + "VALUES('"+nDni+"','"+apellidos+"','"+nombre+"','"+domicilio+"','"+telefono+"','"+supervisor+"')";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo profesor\n" + e.getMessage());
        }
    }
    
    public void modificarProfesor(String dni, String nDni, String apellidos, String nombre, String domicilio, String telefono, String supervisor){
        String q = "UPDATE Profesores SET DNI = '"+nDni+"', Apellidos = '"+apellidos+"', Nombre = '"+nombre+"', "
                + "Domicilio = '"+domicilio+"', Telefono = '"+telefono+"', Supervisor = '"+supervisor+"' WHERE DNI = '"+dni+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar el profesor\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void eliminarProfesor(String dni){
        String q = "DELETE FROM Profesores WHERE DNI = '"+dni+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el profesor\n" + e.getMessage());
        }
    }
    
    public void modificarNota(String dni, String titulo, int nota){
        String q = "UPDATE AsigMat SET Nota = "+nota+" WHERE DNI = '"+dni+"' AND Titulo = '"+titulo+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar la nota\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public boolean comprobarExistenciaAula(String edificio, int numero){
        String q = "SELECT NombreEdificio, NumAula FROM Aulas WHERE NombreEdificio = '"+edificio+"' AND NumAula = "+numero;
        boolean resu = false;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            res.next();
            if(res.getRow() == 0){
                resu = false;
            }else{
                resu = true;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al comprobar existencia\n" + e.getMessage());
            e.printStackTrace();
        }
        return resu;
    }
    
    public void nuevoAula(String edificio, int numero){
        String q = "INSERT INTO Aulas (NombreEdificio, NumAula) VALUES('"+edificio+"', "+numero+")";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo aula\n" + e.getMessage());
        }
    }
    
    public void modificarAula(String edificio, int numero, String nEdificio, int nNumero){
        String q = "UPDATE Aulas SET NombreEdificio = '"+nEdificio+"', NumAula = "+nNumero+" WHERE NombreEdificio = '"+edificio+"' AND NumAula = "+numero;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo aula\n" + e.getMessage());
        }
    }
    
    public void eliminarAula(String edificio, int numero){
        String q = "DELETE FROM Aulas WHERE NombreEdificio = '"+edificio+"' AND NumAula = "+numero;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el aula\n" + e.getMessage());
        }
    }
    
    public String[] getNombresProfesoresAAsignar(){
        int registros = 0;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(DNI) as total FROM Profesores");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        String[] profesores = new String[registros];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT DNI FROM Profesores");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                profesores[i] = res.getString("DNI");
            i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return profesores;
    }
    
    public String[] getNombresEdificiosAAsignar(){
        int registros = 0;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(NombreEdificio) as total FROM Aulas");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        String[] edificios = new String[registros];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT NombreEdificio FROM Aulas");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                edificios[i] = res.getString("NombreEdificio");
            i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return edificios;
    }
    
    public String[] getNumerosAulasAAsignar(String edificio){
        int registros = 0;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(NumAula) as total FROM Aulas WHERE NombreEdificio = '"+edificio+"'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        String[] numeros = new String[registros];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT NumAula FROM Aulas WHERE NombreEdificio = '"+edificio+"'");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                numeros[i] = res.getString("NumAula");
            i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return numeros;
    }
    
    public String[] getInfoProfesor(String dni){
        String[] info = new String[2];
        String q = "SELECT Apellidos, Nombre FROM Profesores WHERE DNI = '"+dni+"'";
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            res.next();
            info[0] = res.getString("Apellidos");
            info[1] = res.getString("Nombre");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener información\n" + e.getMessage());
        }
        return info;
    }
    
    public boolean comprobarExistenciaAsignacion(String dni, String apellidos, String nombre, String titulo, String edificio, int numero){
        String q = "SELECT DNI, Apellidos, Nombre, Titulo, NombreEdificio, NumAula FROM PAA WHERE DNI = '"+dni+"' AND Apellidos = '"+apellidos+"' AND"
                + " Nombre = '"+nombre+"' AND Titulo = '"+titulo+"' AND NombreEdificio = '"+edificio+"' AND NumAula = "+numero;
        boolean resu = false;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            res.next();
            if(res.getRow() == 0){
                resu = false;
            }else{
                resu = true;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al comprobar existencia\n" + e.getMessage());
            e.printStackTrace();
        }
        return resu;
    }
    
    public void nuevaAsignacion(String dni, String apellidos, String nombre, String titulo, String edificio, int numero){
        String q = "INSERT INTO PAA (DNI, Apellidos, Nombre, Titulo, NombreEdificio, NumAula) "
                + "VALUES('"+dni+"','"+apellidos+"','"+nombre+"','"+titulo+"','"+edificio+"',"+numero+")";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el aula\n" + e.getMessage());
        }
    }
    
    public void eliminarAsignacion(String cod){
        String q = "DELETE FROM PAA WHERE CodAsignacion = '"+cod+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar la asignación\n" + e.getMessage());
        }
    }
}