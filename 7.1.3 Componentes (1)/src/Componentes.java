import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Componentes extends javax.swing.JFrame {

    public Componentes() {
        initComponents();
        
        grupoButtons.add(buttonP1);
        grupoButtons.add(buttonP2);
        grupoButtons.add(buttonP3);
        grupoButtons.add(buttonP4);
        
        int w1 = f1.getWidth();
        int h1 = f1.getHeight();
        
        ImageIcon icon1 = new javax.swing.ImageIcon(getClass().getResource("icoCampo.jpg"));
        
        Image img1 = icon1.getImage() ;  
        Image newimg1 = img1.getScaledInstance(w1, h1, java.awt.Image.SCALE_SMOOTH) ;  
        icon1 = new ImageIcon(newimg1);
        f1.setIcon(icon1);
        
        ImageIcon icon2 = new javax.swing.ImageIcon(getClass().getResource("icoCiudad.jpg"));
        
        Image img2 = icon2.getImage() ;  
        Image newimg2 = img2.getScaledInstance(w1, h1, java.awt.Image.SCALE_SMOOTH) ;  
        icon2 = new ImageIcon(newimg2);
        f2.setIcon(icon2);
        
        ImageIcon icon3 = new javax.swing.ImageIcon(getClass().getResource("icoMontana.jpg"));
        
        Image img3 = icon3.getImage() ;  
        Image newimg3 = img3.getScaledInstance(w1, h1, java.awt.Image.SCALE_SMOOTH) ;  
        icon3 = new ImageIcon(newimg3);
        f3.setIcon(icon3);
        
        ImageIcon icon4 = new javax.swing.ImageIcon(getClass().getResource("icoPlaya.jpg"));
        
        Image img4 = icon4.getImage() ;  
        Image newimg4 = img4.getScaledInstance(w1, h1, java.awt.Image.SCALE_SMOOTH) ;  
        icon4 = new ImageIcon(newimg4);
        f4.setIcon(icon4);
        
        int ww1 = p1.getWidth();
        int hh1 = p1.getHeight();
        
        ImageIcon icon5 = new javax.swing.ImageIcon(getClass().getResource("icoVaquero.jpg"));
        
        Image img5 = icon5.getImage() ;  
        Image newimg5 = img5.getScaledInstance(ww1, hh1, java.awt.Image.SCALE_SMOOTH) ;  
        icon5 = new ImageIcon(newimg5);
        p1.setIcon(icon5);
        
        ImageIcon icon6 = new javax.swing.ImageIcon(getClass().getResource("icoAstronauta.png"));
        
        Image img6 = icon6.getImage() ;  
        Image newimg6 = img6.getScaledInstance(ww1, hh1, java.awt.Image.SCALE_SMOOTH) ;  
        icon6 = new ImageIcon(newimg6);
        p2.setIcon(icon6);
        
        ImageIcon icon7 = new javax.swing.ImageIcon(getClass().getResource("icoProgramador.png"));
        
        Image img7 = icon7.getImage() ;  
        Image newimg7 = img7.getScaledInstance(ww1, hh1, java.awt.Image.SCALE_SMOOTH) ;  
        icon7 = new ImageIcon(newimg7);
        p3.setIcon(icon7);
        
        ImageIcon icon8 = new javax.swing.ImageIcon(getClass().getResource("icoCocinero.jpg"));
        
        Image img8 = icon8.getImage() ;  
        Image newimg8 = img8.getScaledInstance(ww1, hh1, java.awt.Image.SCALE_SMOOTH) ;  
        icon8 = new ImageIcon(newimg8);
        p4.setIcon(icon8);
        
        ImageIcon fota = new javax.swing.ImageIcon(getClass().getResource("Default.jpg"));
        
        Image fot = fota.getImage();  
        Image newfot = fot.getScaledInstance(230, 250, java.awt.Image.SCALE_SMOOTH);  
        fota = new ImageIcon(newfot);
        foto.setIcon(fota);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoButtons = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        buttonP1 = new javax.swing.JRadioButton();
        buttonP2 = new javax.swing.JRadioButton();
        buttonP3 = new javax.swing.JRadioButton();
        buttonP4 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        f2 = new javax.swing.JButton();
        f3 = new javax.swing.JButton();
        f4 = new javax.swing.JButton();
        f1 = new javax.swing.JButton();
        btnBigote = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 230, 250));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Personaje"));

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setOpaque(true);

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p2.setOpaque(true);

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p3.setOpaque(true);

        p4.setBackground(new java.awt.Color(255, 255, 255));
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(buttonP1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(buttonP2)
                        .addGap(79, 79, 79)
                        .addComponent(buttonP3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonP4)
                        .addGap(48, 48, 48))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonP1)
                    .addComponent(buttonP2)
                    .addComponent(buttonP3)
                    .addComponent(buttonP4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 150));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fondo"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 410, 110));

        btnBigote.setBackground(new java.awt.Color(255, 51, 51));
        btnBigote.setText("BIGOTE");
        btnBigote.setOpaque(true);
        jPanel1.add(btnBigote, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 200, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECCIONE UNO DE LOS FONDOS PARA MODIFICAR LA IMAGEN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 410, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Componentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton btnBigote;
    public javax.swing.JRadioButton buttonP1;
    public javax.swing.JRadioButton buttonP2;
    public javax.swing.JRadioButton buttonP3;
    public javax.swing.JRadioButton buttonP4;
    public javax.swing.JButton f1;
    public javax.swing.JButton f2;
    public javax.swing.JButton f3;
    public javax.swing.JButton f4;
    public javax.swing.JLabel foto;
    public javax.swing.ButtonGroup grupoButtons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel p1;
    public javax.swing.JLabel p2;
    public javax.swing.JLabel p3;
    public javax.swing.JLabel p4;
    // End of variables declaration//GEN-END:variables
}