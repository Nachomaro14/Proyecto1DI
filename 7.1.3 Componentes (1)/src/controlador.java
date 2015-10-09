
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class controlador implements ActionListener{
    
    Componentes vista ;
    
    public enum AccionMVC{
        buttonP1, buttonP2, buttonP3, buttonP4,
        f1, f2, f3, f4,
        p1, p2, p3, p4,
        btnBigote
    }
    
    public controlador(Componentes vista){
        this.vista = vista;
    }
    
    public void iniciar(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            vista.setVisible(true);
        }catch (UnsupportedLookAndFeelException ex){}
        catch (ClassNotFoundException ex){}
        catch (InstantiationException ex){}
        catch (IllegalAccessException ex){}
        
        this.vista.buttonP1.setActionCommand("buttonP1");
        this.vista.buttonP1.addActionListener(this);
        this.vista.buttonP2.setActionCommand("buttonP2");
        this.vista.buttonP2.addActionListener(this);
        this.vista.buttonP3.setActionCommand("buttonP3");
        this.vista.buttonP3.addActionListener(this);
        this.vista.buttonP4.setActionCommand("buttonP4");
        this.vista.buttonP4.addActionListener(this);
        this.vista.f1.setActionCommand("f1");
        this.vista.f1.addActionListener(this);
        this.vista.f2.setActionCommand("f2");
        this.vista.f2.addActionListener(this);
        this.vista.f3.setActionCommand("f3");
        this.vista.f3.addActionListener(this);
        this.vista.f4.setActionCommand("f4");
        this.vista.f4.addActionListener(this);
        this.vista.btnBigote.setActionCommand("btnBigote");
        this.vista.btnBigote.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        switch (AccionMVC.valueOf(e.getActionCommand())){
            case f1:
                break;
            case f2:
                break;
            case f3:
                break;
            case f4:
                break;
        }
    }
}