package ModeloLetras;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ModeloMySQL extends ConexionMySQL{
    
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column){  
            return false;  
        }
    }

    public void nuevaAsignatura(int codigo, String titulo, int creditos) {
        Connection cnn;
        try{
            String insertar = "CALL insertar_asignatura(?,?,?)";
            cnn = getConexion();
            CallableStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setInt(1, codigo);
            cmst.setString(2, titulo);
            cmst.setInt(3, creditos);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Asignatura ingresada correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al ingresar asignatura\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al ingresar asignatura\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void modificarAsignatura(int codigo, int nCodigo, String titulo, int creditos) {
        Connection cnn;
        try{
            String insertar = "CALL modificar_asignatura(?,?,?,?)";
            cnn = getConexion();
            CallableStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setInt(1, nCodigo);
            cmst.setString(2, titulo);
            cmst.setInt(3, creditos);
            cmst.setInt(4, codigo);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Asignatura modificada correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al modificar asignatura\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al modificar asignatura\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void eliminarAsignatura(int codigo, String titulo) {
        Connection cnn;
        try{
            String insertar = "CALL eliminar_asignatura(?,?)";
            cnn = getConexion();
            CallableStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setInt(1, codigo);
            cmst.setString(2, titulo);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Asignatura eliminada correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al eliminar asignatura\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al eliminar asignatura\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void nuevoProfesor(String nDni, String apellidos, String nombre, String domicilio, String telefono, String supervisor) {
        Connection cnn;
        try{
            String insertar = "CALL insertar_profesor(?,?,?,?,?,?)";
            cnn = getConexion();
            CallableStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setString(1, nDni);
            cmst.setString(2, apellidos);
            cmst.setString(3, nombre);
            cmst.setString(4, domicilio);
            cmst.setString(5, telefono);
            cmst.setString(6, supervisor);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Profesor ingresado correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al ingresar profesor\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al ingresar profesor\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void modificarProfesor(String dni, String nDni, String apellidos, String nombre, String domicilio, String telefono, String supervisor) {
        Connection cnn;
        try{
            String insertar = "CALL modificar_profesor(?,?,?,?,?,?,?)";
            cnn = getConexion();
            CallableStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setString(1, dni);
            cmst.setString(2, nDni);
            cmst.setString(3, apellidos);
            cmst.setString(4, nombre);
            cmst.setString(5, domicilio);
            cmst.setString(6, telefono);
            cmst.setString(7, supervisor);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Profesor modificado correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al modificar profesor\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al modificar profesor\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void eliminarProfesor(String dni) {
        Connection cnn;
        try{
            String insertar = "CALL eliminar_profesor(?)";
            cnn = getConexion();
            CallableStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setString(1, dni);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Profesor eliminado correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al eliminar profesor\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al eliminar profesor\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void modificarNota(String dniMN, String tituloMN, int notaMN) {
        Connection cnn;
        try{
            String insertar = "CALL modificar_nota(?,?,?)";
            cnn = getConexion();
            CallableStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setString(1, dniMN);
            cmst.setString(2, tituloMN);
            cmst.setInt(3, notaMN);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Nota modificada correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al modificar nota\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al modificar nota\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void nuevoAula(String edificio, int numero) {
        Connection cnn;
        try{
            String insertar = "CALL insertar_aula(?,?)";
            cnn = getConexion();
            CallableStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setString(1, edificio);
            cmst.setInt(2, numero);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Aula ingresada correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al ingresar aula\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al ingresar aula\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void modificarAula(String edificioMA, int numeroMA, String nEdificioMA, int nNumeroMA) {
        Connection cnn;
        try{
            String insertar = "CALL modificar_aula(?,?,?,?)";
            cnn = getConexion();
            CallableStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setString(1, edificioMA);
            cmst.setString(2, nEdificioMA);
            cmst.setInt(3, numeroMA);
            cmst.setInt(4, nNumeroMA);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Aula modificada correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al modificar aula\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al modificar aula\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void eliminarAula(String edificioE, int numeroE) {
        Connection cnn;
        try{
            String insertar = "CALL eliminar_aula(?,?)";
            cnn = getConexion();
            CallableStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setString(1, edificioE);
            cmst.setInt(2, numeroE);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Aula eliminada correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al eliminar aula\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al eliminar aula\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void nuevaAsignacion(String dniAsig, String apellidosAsig, String nombreAsig, String tituloAsig, String edificioAsig, int aulaAsig) {
        Connection cnn;
        try{
            String insertar = "CALL insertar_asignacion(?,?,?,?,?,?)";
            cnn = getConexion();
            CallableStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setString(1, dniAsig);
            cmst.setString(2, apellidosAsig);
            cmst.setString(3, nombreAsig);
            cmst.setString(4, tituloAsig);
            cmst.setString(5, edificioAsig);
            cmst.setInt(6, aulaAsig);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Asignación ingresada correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al ingresar asignación\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al ingresar asignación\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void eliminarAsignacion(int cod) {
        Connection cnn;
        try{
            String insertar = "CALL eliminar_asignacion(?)";
            cnn = getConexion();
            CallableStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setInt(1, cod);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Aula eliminada correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al eliminar aula\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al eliminar aula\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public TableModel getTablaMatriculas() {
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"DNI","Apellidos","Nombre"};
        try{
            PreparedStatement pst = getConexion().prepareStatement("CALL conteoMatriculas()");
            ResultSet res = pst.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        Object[][] data = new String[registros][3];
        try{
            String sql = "CALL tablaMatriculas()";
            
            PreparedStatement llamada = this.getConexion().prepareStatement(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            int i = 0;
            
            while(res.next()){
                data[i][0] = res.getString(1);
                data[i][1] = res.getString(2); 
                data[i][2] = res.getString(3);
                i++;
            }
            
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return tablemodel;
    }

    public TableModel getTablaAsignaturas() {
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Título","Créditos"};
        try{
            PreparedStatement pst = getConexion().prepareStatement("CALL conteoAsignaturas()");
            ResultSet res = pst.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        Object[][] data = new String[registros][3];
        try{
            String sql = "CALL tablaAsignaturas()";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            int i = 0;
            
            while(res.next()){
                data[i][0] = res.getString(1);
                data[i][1] = res.getString(2); 
                data[i][2] = res.getString(3);
                i++;
            }
            
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return tablemodel;
    }

    public TableModel getTablaAlumnos() {
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"DNI","Apellidos","Nombre","Domicilio","Teléfono","Acceso"};
        try{
            PreparedStatement pst = getConexion().prepareStatement("CALL conteoAlumnos()");
            ResultSet res = pst.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        Object[][] data = new String[registros][6];
        try{
            String sql = "CALL tablaAlumnos()";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            int i = 0;
            
            while(res.next()){
                data[i][0] = res.getString(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getString(3);
                data[i][3] = res.getString(4);
                data[i][4] = res.getString(5);
                data[i][5] = res.getString(6);
                i++;
            }
            
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return tablemodel;
    }

    public TableModel getTablaProfesores() {
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"DNI","Apellidos","Nombre","Domicilio","Teléfono","Supervisor"};
        try{
            PreparedStatement pst = getConexion().prepareStatement("CALL conteoProfesores()");
            ResultSet res = pst.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        Object[][] data = new String[registros][6];
        try{
            String sql = "CALL tablaProfesores()";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            int i = 0;
            
            while(res.next()){
                data[i][0] = res.getString(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getString(3);
                data[i][3] = res.getString(4);
                data[i][4] = res.getString(5);
                data[i][5] = res.getString(6);
                i++;
            }
            
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return tablemodel;
    }

    public TableModel getTablaAulas() {
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Edificio","Número"};
        try{
            PreparedStatement pst = getConexion().prepareStatement("CALL conteoAulas()");
            ResultSet res = pst.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        Object[][] data = new String[registros][2];
        try{
            String sql = "CALL tablaAulas()";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            int i = 0;
            
            while(res.next()){
                data[i][0] = res.getString(1);
                data[i][1] = res.getString(2);
                i++;
            }
            
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return tablemodel;
    }

    public TableModel getTablaAsignaciones() {
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","DNI","Apellidos","Nombre","Título","Edificio","Aula"};
        try{
            PreparedStatement pst = getConexion().prepareStatement("CALL conteoAsignaciones()");
            ResultSet res = pst.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        Object[][] data = new String[registros][7];
        try{
            String sql = "CALL tablaAsignaciones()";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            int i = 0;
            
            while(res.next()){
                data[i][0] = res.getString(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getString(3);
                data[i][3] = res.getString(4);
                data[i][4] = res.getString(5);
                data[i][5] = res.getString(6);
                data[i][6] = res.getString(7);
                i++;
            }
            
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public TableModel getTablaAsignaturasMatriculadas(String dni) {
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","DNI","Título","Créditos","Nota"};
        try{
            PreparedStatement pst = this.getConexion().prepareStatement("CALL conteoAsignaturasMatriculadas('"+dni+"')");
            ResultSet res = pst.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        Object[][] data = new String[registros][5];
        try{
            String sql = "CALL tablaAsignaturasMatriculadas('"+dni+"')";
            
            PreparedStatement llamada = getConexion().prepareStatement(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            int i = 0;
            
            while(res.next()){
                data[i][0] = res.getString(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getString(3);
                data[i][3] = res.getString(4);
                data[i][4] = res.getString(5);
                i++;
            }
            
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return tablemodel;
    }

    public TableModel getTablaAsignaturasMatriculadasSinNota(String dni) {
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","DNI","Título","Créditos"};
        try{
            PreparedStatement pst = getConexion().prepareStatement("CALL conteoAsignaturasMatriculadasSinNota('"+dni+"')");
            ResultSet res = pst.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        Object[][] data = new String[registros][4];
        try{
            String sql = "CALL tablaAsignaturasMatriculadasSinNota('"+dni+"')";
            
            PreparedStatement llamada = getConexion().prepareStatement(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            int i = 0;
            
            while(res.next()){
                data[i][0] = res.getString(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getString(3);
                data[i][3] = res.getString(4);
                i++;
            }
            
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return tablemodel;
    }

    public String[] getNumerosAulasAAsignar(String edificio) {
        int registros = 0;
        try{
            PreparedStatement pst = getConexion().prepareStatement("CALL conteoNumerosAulasAAsignar('"+edificio+"')");
            ResultSet res = pst.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        String[] numeros = new String[registros];
        try{
            String sql = "CALL numerosAulasAAsignar('"+edificio+"')";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            int i = 0;
            
            while(res.next()){
                numeros[i] = res.getString(1);
                i++;
            }
            res.close();
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return numeros;
    }

    public String[] getNombreAsignaturasAMatricular() {
        int registros = 0;
        try{
            PreparedStatement pst = getConexion().prepareStatement("CALL conteoNombreAsignaturasAMatricular()");
            ResultSet res = pst.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        String[] numeros = new String[registros];
        try{
            String sql = "CALL nombreAsignaturasAMatricular()";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            int i = 0;
            
            while(res.next()){
                numeros[i] = res.getString(1);
                i++;
            }
            res.close();
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return numeros;
    }

    public String[] getInfoProfesor(String dniAsig) {
        String[] info = new String[2];
        try{
            String sql = "CALL infoProfesor('"+dniAsig+"')";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            res.next();
            info[0] = res.getString(1);
            info[1] = res.getString(2);
            res.close();
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return info;
    }

    public boolean comprobarExistenciaAsignatura(int codigo, String titulo) {
        boolean resu = false;
        try{
            String sql = "CALL comprobarExistenciaAsignatura("+codigo+", '"+titulo+"')";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
            
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

    public boolean comprobarExistenciaAsignacion(String dniAsig, String apellidosAsig, String nombreAsig, String tituloAsig, String edificioAsig, int aulaAsig) {
        boolean resu = false;
        try{
            String sql = "CALL comprobarExistenciaAsignacion('"+dniAsig+"','"+apellidosAsig+"','"+nombreAsig+"','"+tituloAsig+"','"+edificioAsig+"',"+aulaAsig+")";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
            
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

    public boolean comprobarExistenciaAula(String edificio, int numero) {
        boolean resu = false;
        try{
            String sql = "CALL comprobarExistenciaAula('"+edificio+"',"+numero+")";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
            
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

    public boolean comprobarExistenciaProfesor(String nDni) {
        boolean resu = false;
        try{
            String sql = "CALL comprobarExistenciaProfesor('"+nDni+"')";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
            
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

    public void nuevaMatricula(String dni, String apellidos, String nombre, String domicilio, String telefono, String acceso) {
        Connection cnn;
        try{
            String insertar = "CALL insertar_matricula(?,?,?,?,?,?)";
            cnn = getConexion();
            CallableStatement cmst = (CallableStatement) cnn.prepareCall(insertar);
            
            cmst.setString(1, dni);
            cmst.setString(2, apellidos);
            cmst.setString(3, nombre);
            cmst.setString(4, domicilio);
            cmst.setString(5, telefono);
            cmst.setString(6, acceso);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Matrícula ingresada correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al ingresar matrícula\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al ingresar matrícula\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void nuevaAsignaturaMatriculada(String dni, String titulo) {
        int num = 0;
        String q = "CALL obtener_creditos('"+titulo+"')";
        try{
            PreparedStatement llamada = this.getConexion().prepareCall(q);
            llamada.execute();
            ResultSet res = llamada.getResultSet();
          
            res.next();
            num = res.getInt(1);
            res.close();
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        }
        Connection cnn = this.getConexion();
        try{
            String insertar = "CALL insertar_asignaturasMatriculadas(?,?,?)";
            PreparedStatement cmst = cnn.prepareCall(insertar);
            
            cmst.setString(1, dni);
            cmst.setString(2, titulo);
            cmst.setInt(3, num);
            
            cmst.execute();
            JOptionPane.showMessageDialog(null, "Asignaturas ingresadas correctamente");
            cnn.close();
        }catch(SQLException SQLE){
            JOptionPane.showMessageDialog(null, "Error de SQL al ingresar asignaturas\n"+SQLE.getMessage());
            SQLE.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al ingresar asignaturas\n"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public String[] getNombresProfesoresAAsignar() {
        int registros = 0;
        try{
            PreparedStatement pst = getConexion().prepareStatement("CALL conteoNombresProfesoresAAsignar()");
            ResultSet res = pst.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        String[] numeros = new String[registros];
        try{
            String sql = "CALL nombresProfesoresAAsignar()";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            int i = 0;
            
            while(res.next()){
                numeros[i] = res.getString(1);
                i++;
            }
            res.close();
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return numeros;
    }

    public String[] getNombresEdificiosAAsignar() {
        int registros = 0;
        try{
            PreparedStatement pst = getConexion().prepareStatement("CALL conteoNombresEdificiosAAsignar()");
            ResultSet res = pst.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        String[] numeros = new String[registros];
        try{
            String sql = "CALL nombresEdificiosAAsignar()";
            
            CallableStatement llamada = (CallableStatement) getConexion().prepareCall(sql);
            llamada.execute();
            ResultSet res=llamada.getResultSet();
          
            int i = 0;
            
            while(res.next()){
                numeros[i] = res.getString(1);
                i++;
            }
            res.close();
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
            e.printStackTrace();
        }
        return numeros;
    }
}