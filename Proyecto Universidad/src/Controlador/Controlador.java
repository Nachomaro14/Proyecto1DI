package Controlador;

import ModeloLetras.ModeloMySQL;
import ModeloCiencias.ModeloSQLite;
import Vista.Interfaz;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Controlador implements ActionListener, MouseListener{
    
    Interfaz vista;
    ModeloMySQL modeloMySQL = new ModeloMySQL();
    ModeloSQLite modeloSQLite = new ModeloSQLite();
    int ciencias = 0;
    int letras = 1;
    
    public Controlador(Interfaz i){
        vista = i;
    }
    
    public enum AccionMVC{
        btnLetras,
        btnCiencias,
        btnSalirInicio,
        
        btnNuevaMatricula,
        btnConsultas,
        btnSalir,
        
        btnCompletarMatricula,
        btnCancelarMatricula,
        
        btnVolver
    }
    
    public void iniciar(){
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            
            vista.pack();
            vista.setLocationRelativeTo(null);
            vista.setVisible(true);
            vista.setTitle("Gestión de matrículas e información");
            
        } catch (UnsupportedLookAndFeelException ex){}
          catch (ClassNotFoundException ex){}
          catch (InstantiationException ex){}
          catch (IllegalAccessException ex){}
        
        this.vista.btnLetras.setActionCommand("btnLetras");
        this.vista.btnLetras.addActionListener(this);
        this.vista.btnCiencias.setActionCommand("btnCiencias");
        this.vista.btnCiencias.addActionListener(this);
        this.vista.btnSalirInicio.setActionCommand("btnSalirInicio");
        this.vista.btnSalirInicio.addActionListener(this);
        
        this.vista.btnNuevaMatricula.setActionCommand("btnNuevaMatricula");
        this.vista.btnNuevaMatricula.addActionListener(this);
        this.vista.btnConsultas.setActionCommand("btnConsultas");
        this.vista.btnConsultas.addActionListener(this);
        this.vista.btnSalir.setActionCommand("btnSalir");
        this.vista.btnSalir.addActionListener(this);
        
        this.vista.btnCancelarMatricula.setActionCommand("btnCancelarMatricula");
        this.vista.btnCancelarMatricula.addActionListener(this);
        
        this.vista.btnVolver.setActionCommand("btnVolver");
        this.vista.btnVolver.addActionListener(this);
        
        this.vista.tablaMatriculas.addMouseListener(this);
        this.vista.tablaMatriculas.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaMatriculas.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaAsigMat.addMouseListener(this);
        this.vista.tablaAsigMat.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaAsigMat.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaAlumnos.addMouseListener(this);
        this.vista.tablaAlumnos.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaAlumnos.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaAsigMatAlum.addMouseListener(this);
        this.vista.tablaAsigMatAlum.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaAsigMatAlum.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaProfesores.addMouseListener(this);
        this.vista.tablaProfesores.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaProfesores.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaAsignaturas.addMouseListener(this);
        this.vista.tablaAsignaturas.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaAsignaturas.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaAulas.addMouseListener(this);
        this.vista.tablaAulas.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaAulas.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaAsignaciones.addMouseListener(this);
        this.vista.tablaAsignaciones.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaAsignaciones.getTableHeader().setResizingAllowed(false);
        
    }

    public void actionPerformed(ActionEvent e) {
        switch(AccionMVC.valueOf(e.getActionCommand())){
            case btnLetras:
                letras = 1;
                vista.setVisible(false);
                if(letras == 1){
                    vista.tablaMatriculas.setModel(modeloMySQL.getTablaMatriculas());
                    vista.tablaAsigMat.setModel(modeloMySQL.getTablaAsignaturas());
                }else{
                    vista.tablaMatriculas.setModel(modeloSQLite.getTablaMatriculas());
                    vista.tablaAsigMat.setModel(modeloSQLite.getTablaAsignaturas());
                }
                vista.matriculas.pack();
                vista.matriculas.setLocationRelativeTo(null);
                vista.matriculas.setVisible(true);
                break;
            case btnCiencias:
                ciencias = 1;
                vista.setVisible(false);
                if(ciencias == 1){
                    vista.tablaMatriculas.setModel(modeloSQLite.getTablaMatriculas());
                    vista.tablaAsigMat.setModel(modeloSQLite.getTablaAsignaturas());
                }else{
                    vista.tablaMatriculas.setModel(modeloMySQL.getTablaMatriculas());
                    vista.tablaAsigMat.setModel(modeloMySQL.getTablaAsignaturas());
                }
                vista.matriculas.pack();
                vista.matriculas.setLocationRelativeTo(null);
                vista.matriculas.setVisible(true);
                break;
            case btnSalirInicio:
                System.exit(0);
                break;
                
                
            case btnNuevaMatricula:
                vista.nuevaMatricula.pack();
                vista.nuevaMatricula.setLocationRelativeTo(null);
                vista.nuevaMatricula.setVisible(true);
                break;
            case btnConsultas:
                vista.matriculas.setVisible(false);
                if(ciencias == 1){
                    vista.tablaAlumnos.setModel(modeloSQLite.getTablaAlumnos());
                    vista.tablaAsigMatAlum.setModel(modeloSQLite.getTablaAsignaturas());
                    vista.tablaAsignaturas.setModel(modeloSQLite.getTablaAsignaturas());
                    vista.tablaProfesores.setModel(modeloSQLite.getTablaProfesores());
                    vista.tablaAulas.setModel(modeloSQLite.getTablaAulas());
                    vista.tablaAsignaciones.setModel(modeloSQLite.getTablaAsignaciones());
                }else if(letras == 1){
                    vista.tablaAlumnos.setModel(modeloMySQL.getTablaAlumnos());
                    vista.tablaAsigMatAlum.setModel(modeloMySQL.getTablaAsignaturas());
                    vista.tablaAsignaturas.setModel(modeloMySQL.getTablaAsignaturas());
                    vista.tablaProfesores.setModel(modeloMySQL.getTablaProfesores());
                    vista.tablaAulas.setModel(modeloMySQL.getTablaAulas());
                    vista.tablaAsignaciones.setModel(modeloMySQL.getTablaAsignaciones());
                }
                vista.consultas.pack();
                vista.consultas.setLocationRelativeTo(null);
                vista.consultas.setVisible(true);
                break;
            case btnSalir:
                System.exit(0);
                break;
                
                
            case btnCancelarMatricula:
                vista.nuevaMatricula.setVisible(false);
                vista.txtNuevoDni.setText("");
                vista.txtNuevoApellidos.setText("");
                vista.txtNuevoNombre.setText("");
                vista.txtNuevoDomicilio.setText("");
                vista.txtNuevoTelefono.setText("");
                vista.matriculas.setVisible(true);
                
                
            case btnVolver:
                vista.consultas.setVisible(false);
                vista.matriculas.setVisible(true);
                break;
        }
    }

    public void mouseClicked(MouseEvent e) {
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