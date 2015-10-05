package vista;

public class interfaz extends javax.swing.JFrame {

    public interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        optionNuevaLista = new javax.swing.JMenuItem();
        optionAbrir = new javax.swing.JMenuItem();
        optionGuardar = new javax.swing.JMenuItem();
        optionGuardarComo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        optionSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jLabel2.setText("Apellidos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel3.setText("Dni");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel4.setText("Edad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 110, -1));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, -1));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 110, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, -1));

        btnAgregar.setText("Agregar");
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        btnModificar.setText("Modificar");
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 340, 160));

        jMenu1.setText("Archivo");

        optionNuevaLista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        optionNuevaLista.setText("Nueva Lista");
        jMenu1.add(optionNuevaLista);

        optionAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        optionAbrir.setText("Abrir");
        jMenu1.add(optionAbrir);

        optionGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        optionGuardar.setText("Guardar");
        jMenu1.add(optionGuardar);

        optionGuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        optionGuardarComo.setText("Guardar como...");
        jMenu1.add(optionGuardarComo);
        jMenu1.add(jSeparator1);

        optionSalir.setText("Salir");
        optionSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionSalirActionPerformed(evt);
            }
        });
        jMenu1.add(optionSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_optionSalirActionPerformed

    public static void main(String args[]){

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JMenuItem optionAbrir;
    public javax.swing.JMenuItem optionGuardar;
    public javax.swing.JMenuItem optionGuardarComo;
    public javax.swing.JMenuItem optionNuevaLista;
    public javax.swing.JMenuItem optionSalir;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextArea txtArea;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}