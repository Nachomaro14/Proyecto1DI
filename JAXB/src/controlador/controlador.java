package controlador;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.modelo;
import vista.interfaz;

public class controlador {
    
    interfaz vista ;
    modelo modelo = new modelo();
    
    public enum AccionMVC{
        
    }
    
    public controlador(interfaz vista){
        this.vista = vista;
    }
    
    public void iniciar(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            vista.setLocationRelativeTo(null);
            vista.setVisible(true);
        }catch (UnsupportedLookAndFeelException ex){}
        catch (ClassNotFoundException ex){}
        catch (InstantiationException ex){}
        catch (IllegalAccessException ex){}
    }
}