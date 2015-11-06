package ModeloLetras;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ModeloMySQL extends ConexionMySQL{

    public TableModel getTablaAsignaturasMatriculadas(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean comprobarExistenciaAsignatura(int codigo, String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void nuevaAsignatura(int codigo, String titulo, int creditos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void modificarAsignatura(int codigo, String titulo, int creditos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminarAsignatura(int codigoEA, String tituloEA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column){  
            return false;  
        }
    }

    public Object[] getNombreAsignaturasAMatricular() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void nuevaMatricula(String dni, String apellidos, String nombre, String domicilio, int telefono, String acceso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void nuevoAlumno(String dni, String apellidos, String nombre, String domicilio, int telefono, String acceso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void nuevaAsignaturaMatriculada(String dni, String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TableModel getTablaMatriculas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TableModel getTablaAsignaturas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TableModel getTablaAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TableModel getTablaProfesores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TableModel getTablaAulas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TableModel getTablaAsignaciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}