package vista;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogClientes = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        clientes = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        dialogNuevoCliente = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        nuevoCliente = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        servicio = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtServicio = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        dialogInformacion = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        informacion = new javax.swing.JLabel();
        nombreT = new javax.swing.JLabel();
        apellidosT = new javax.swing.JLabel();
        dniT = new javax.swing.JLabel();
        salarioT = new javax.swing.JLabel();
        serviciosT = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        txtApellidosT = new javax.swing.JTextField();
        txtDniT = new javax.swing.JTextField();
        txtServiciosT = new javax.swing.JTextField();
        txtSalarioT = new javax.swing.JTextField();
        txtNombreT = new javax.swing.JTextField();
        dialogNuevoTrabajador = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        nuevoTrabajador = new javax.swing.JLabel();
        nombreNT = new javax.swing.JLabel();
        apellidosNT = new javax.swing.JLabel();
        dniNT = new javax.swing.JLabel();
        serviciosNT = new javax.swing.JLabel();
        txtServiciosNT = new javax.swing.JTextField();
        txtNombreNT = new javax.swing.JTextField();
        txtApellidosNT = new javax.swing.JTextField();
        txtDniNT = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        panelTrabajadores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTrabajadores = new javax.swing.JTable();
        trabajadores = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevotrabajador = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaClientes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 540, 270));

        clientes.setBackground(new java.awt.Color(255, 255, 255));
        clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientes.setText("CLIENTES");
        clientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clientes.setOpaque(true);
        jPanel1.add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 540, -1));

        btnAtras.setText("Atrás");
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        btnNuevoCliente.setText("Nuevo cliente");
        jPanel1.add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        btnEliminarCliente.setText("Eliminar cliente");
        jPanel1.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        javax.swing.GroupLayout dialogClientesLayout = new javax.swing.GroupLayout(dialogClientes.getContentPane());
        dialogClientes.getContentPane().setLayout(dialogClientesLayout);
        dialogClientesLayout.setHorizontalGroup(
            dialogClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        dialogClientesLayout.setVerticalGroup(
            dialogClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevoCliente.setBackground(new java.awt.Color(255, 255, 255));
        nuevoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoCliente.setText("NUEVO CLIENTE");
        nuevoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nuevoCliente.setOpaque(true);
        jPanel2.add(nuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, -1));

        nombre.setText("Nombre");
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        apellidos.setText("Apellidos");
        jPanel2.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        servicio.setText("Servicio");
        jPanel2.add(servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        precio.setText("Precio");
        jPanel2.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 230, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 230, -1));
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 230, -1));
        jPanel2.add(txtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 230, -1));

        jButton3.setText("Aceptar");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jButton4.setText("Cancelar");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        javax.swing.GroupLayout dialogNuevoClienteLayout = new javax.swing.GroupLayout(dialogNuevoCliente.getContentPane());
        dialogNuevoCliente.getContentPane().setLayout(dialogNuevoClienteLayout);
        dialogNuevoClienteLayout.setHorizontalGroup(
            dialogNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );
        dialogNuevoClienteLayout.setVerticalGroup(
            dialogNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informacion.setBackground(new java.awt.Color(255, 255, 255));
        informacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        informacion.setText("INFORMACIÓN");
        informacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        informacion.setOpaque(true);
        jPanel3.add(informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, -1));

        nombreT.setText("Nombre");
        jPanel3.add(nombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        apellidosT.setText("Apellidos");
        jPanel3.add(apellidosT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        dniT.setText("DNI");
        jPanel3.add(dniT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        salarioT.setText("Salario");
        jPanel3.add(salarioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        serviciosT.setText("Servicios");
        jPanel3.add(serviciosT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        btnAceptar.setText("Aceptar");
        jPanel3.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));
        jPanel3.add(txtApellidosT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 240, -1));
        jPanel3.add(txtDniT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 240, -1));
        jPanel3.add(txtServiciosT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 240, -1));
        jPanel3.add(txtSalarioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 240, -1));
        jPanel3.add(txtNombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 240, -1));

        javax.swing.GroupLayout dialogInformacionLayout = new javax.swing.GroupLayout(dialogInformacion.getContentPane());
        dialogInformacion.getContentPane().setLayout(dialogInformacionLayout);
        dialogInformacionLayout.setHorizontalGroup(
            dialogInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        dialogInformacionLayout.setVerticalGroup(
            dialogInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevoTrabajador.setBackground(new java.awt.Color(255, 255, 255));
        nuevoTrabajador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoTrabajador.setText("NUEVO TRABAJADOR");
        nuevoTrabajador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nuevoTrabajador.setOpaque(true);
        jPanel4.add(nuevoTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, -1));

        nombreNT.setText("Nombre");
        jPanel4.add(nombreNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        apellidosNT.setText("Apellidos");
        jPanel4.add(apellidosNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        dniNT.setText("DNI");
        jPanel4.add(dniNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        serviciosNT.setText("Servicios");
        jPanel4.add(serviciosNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtServiciosNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiciosNTActionPerformed(evt);
            }
        });
        jPanel4.add(txtServiciosNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 230, -1));
        jPanel4.add(txtNombreNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 230, -1));
        jPanel4.add(txtApellidosNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 230, -1));
        jPanel4.add(txtDniNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 230, -1));

        jButton5.setText("Aceptar");
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jButton6.setText("Cancelar");
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        javax.swing.GroupLayout dialogNuevoTrabajadorLayout = new javax.swing.GroupLayout(dialogNuevoTrabajador.getContentPane());
        dialogNuevoTrabajador.getContentPane().setLayout(dialogNuevoTrabajadorLayout);
        dialogNuevoTrabajadorLayout.setHorizontalGroup(
            dialogNuevoTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );
        dialogNuevoTrabajadorLayout.setVerticalGroup(
            dialogNuevoTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTrabajadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaTrabajadores);

        panelTrabajadores.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 540, 320));

        trabajadores.setBackground(new java.awt.Color(255, 255, 255));
        trabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trabajadores.setText("TRABAJADORES");
        trabajadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        trabajadores.setOpaque(true);
        panelTrabajadores.add(trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 540, -1));

        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        panelTrabajadores.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        btnInformacion.setText("Información");
        panelTrabajadores.add(btnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        btnSalir.setText("Salir");
        panelTrabajadores.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        btnNuevotrabajador.setText("Nuevo trabajador");
        panelTrabajadores.add(btnNuevotrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        getContentPane().add(panelTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 561, 417));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtServiciosNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiciosNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServiciosNTActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos;
    private javax.swing.JLabel apellidosNT;
    private javax.swing.JLabel apellidosT;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevotrabajador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel clientes;
    private javax.swing.JDialog dialogClientes;
    private javax.swing.JDialog dialogInformacion;
    private javax.swing.JDialog dialogNuevoCliente;
    private javax.swing.JDialog dialogNuevoTrabajador;
    private javax.swing.JLabel dniNT;
    private javax.swing.JLabel dniT;
    private javax.swing.JLabel informacion;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombreNT;
    private javax.swing.JLabel nombreT;
    private javax.swing.JLabel nuevoCliente;
    private javax.swing.JLabel nuevoTrabajador;
    private javax.swing.JPanel panelTrabajadores;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel salarioT;
    private javax.swing.JLabel servicio;
    private javax.swing.JLabel serviciosNT;
    private javax.swing.JLabel serviciosT;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaTrabajadores;
    private javax.swing.JLabel trabajadores;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosNT;
    private javax.swing.JTextField txtApellidosT;
    private javax.swing.JTextField txtDniNT;
    private javax.swing.JTextField txtDniT;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreNT;
    private javax.swing.JTextField txtNombreT;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSalarioT;
    private javax.swing.JTextField txtServicio;
    private javax.swing.JTextField txtServiciosNT;
    private javax.swing.JTextField txtServiciosT;
    // End of variables declaration//GEN-END:variables
}