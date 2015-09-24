package vista;

public class interfaz extends javax.swing.JFrame {

    public interfaz() {
        initComponents();
        hombres.setEnabled(false);
        mujeres.setEnabled(false);
        andalucia.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hombres = new javax.swing.JCheckBox();
        mujeres = new javax.swing.JCheckBox();
        andalucia = new javax.swing.JCheckBox();
        trimestre = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        diferencia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        municipio = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DIFERENCIA TRIMESTRAL DE DEMANDANTES DE EMPLEO Y PARADOS");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hombres.setSelected(true);
        hombres.setText("Hombres");
        jPanel1.add(hombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        mujeres.setSelected(true);
        mujeres.setText("Mujeres");
        jPanel1.add(mujeres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        andalucia.setSelected(true);
        andalucia.setText("Andalucía");
        jPanel1.add(andalucia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        trimestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primer trimestre 2014", "Segundo trimestre 2014", "Tercer trimestre 2014", "Cuarto trimestre 2014" }));
        jPanel1.add(trimestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 370, 20));

        jLabel2.setText("Municipio con mayor diferencia:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 360, 20));

        diferencia.setBackground(new java.awt.Color(255, 255, 255));
        diferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        diferencia.setOpaque(true);
        jPanel1.add(diferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 370, 20));

        jLabel5.setText("Diferencia:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 360, 20));

        municipio.setBackground(new java.awt.Color(255, 255, 255));
        municipio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        municipio.setOpaque(true);
        jPanel1.add(municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 370, 20));

        btnCalcular.setText("Calcular");
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox andalucia;
    public javax.swing.JButton btnCalcular;
    public javax.swing.JLabel diferencia;
    private javax.swing.JCheckBox hombres;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox mujeres;
    public javax.swing.JLabel municipio;
    public javax.swing.JComboBox trimestre;
    // End of variables declaration//GEN-END:variables
}