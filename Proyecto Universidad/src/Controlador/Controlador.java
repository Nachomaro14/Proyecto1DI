package Controlador;

import Modelo.Modelo;
import Vista.Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Controlador implements ActionListener, MouseListener{
    
    Interfaz vista;
    Modelo modelo = new Modelo();
    
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
    }

    public void actionPerformed(ActionEvent e) {
        switch(AccionMVC.valueOf(e.getActionCommand())){
            case btnLetras:
                vista.setVisible(false);
                vista.matriculas.pack();
                vista.matriculas.setLocationRelativeTo(null);
                vista.matriculas.setVisible(true);
                break;
            case btnCiencias:
                vista.setVisible(false);
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