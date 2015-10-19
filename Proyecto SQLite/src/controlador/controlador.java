package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import modelo.modelo;
import vista.vista;

public class controlador implements ActionListener, MouseListener{
    
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
        
        this.vista.tablaLibros.addMouseListener(this);
        this.vista.tablaLibros.setModel(modelo.getTablaLibros());
        this.vista.tablaLibros.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaLibros.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaSocios.addMouseListener(this);
        this.vista.tablaSocios.setModel(modelo.getTablaSocios());
        this.vista.tablaSocios.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaSocios.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaPrestamos.addMouseListener(this);
        this.vista.tablaPrestamos.setModel(modelo.getTablaPrestamos());
        this.vista.tablaPrestamos.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaPrestamos.getTableHeader().setResizingAllowed(false);
    }
    
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}