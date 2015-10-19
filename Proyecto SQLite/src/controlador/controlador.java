package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.modelo;
import vista.vista;

public class controlador implements ActionListener{
    
    vista vista;
    modelo modelo = new modelo();
    
    public controlador(vista v){
        vista = v;
    }
    
    public enum AccionMVC{
        
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
    }
    
    public void actionPerformed(ActionEvent e) {
        
    }
}