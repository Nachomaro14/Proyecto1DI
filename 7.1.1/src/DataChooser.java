import java.util.Calendar;
import javax.swing.JOptionPane;

public class DataChooser extends javax.swing.JFrame {

    public DataChooser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnLeerFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, -1));

        btnLeerFecha.setText("Leer fecha");
        btnLeerFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerFechaActionPerformed(evt);
            }
        });
        jPanel1.add(btnLeerFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeerFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerFechaActionPerformed
        JOptionPane.showMessageDialog(this, jDateChooser1.getDate());
        JOptionPane.showMessageDialog(this, jDateChooser1.getCalendar().get(Calendar.YEAR));
        JOptionPane.showMessageDialog(this, jDateChooser1.getCalendar().get(Calendar.MONTH)+1);
        JOptionPane.showMessageDialog(this, jDateChooser1.getCalendar().get(Calendar.DATE));
    }//GEN-LAST:event_btnLeerFechaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeerFecha;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}