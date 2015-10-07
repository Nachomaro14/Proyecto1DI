import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelImage extends JPanel{
    private Image fondo;
    private ImageIcon icono;
    
    protected void paintComponent (Graphics g){
        if(fondo!=null){
            Graphics2D gg = (Graphics2D) g;
            gg.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }
    public ImageIcon getIcon(){
        return icono;
    }
    public void setIcon (ImageIcon icono){
        this.icono = icono;
        if(icono!=null){
            fondo = icono.getImage();
        }
    }
}