package vista;

public class vista extends javax.swing.JFrame {

    public vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        libros = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEditorialLibro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEjemplaresLibro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTituloLibro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoLibro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPaginasLibro = new javax.swing.JTextField();
        btnEliminarLibro = new javax.swing.JButton();
        btnModificarLibro = new javax.swing.JButton();
        btnInsertarLibro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtAnoEdicionLibro = new javax.swing.JTextField();
        btnLimpiarLibro = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        socios = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoSocio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreSocio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtApellidosSocio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEdadSocio = new javax.swing.JTextField();
        btnEliminarSocio = new javax.swing.JButton();
        btnModificarSocio = new javax.swing.JButton();
        btnInsertarSocio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDireccionSocio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefonoSocio = new javax.swing.JTextField();
        btnLimpiarSocio = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaSocios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtCodigoPrestamo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCodigoLibroPrestamo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTituloLibroPrestamo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCodigoSocioPrestamo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNombreSocioPrestamo = new javax.swing.JTextField();
        btnEliminarPrestamo = new javax.swing.JButton();
        btnModificarPrestamo = new javax.swing.JButton();
        btnInsertarPrestamo = new javax.swing.JButton();
        btnLimpiarPrestamo = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrestamos = new javax.swing.JTable();
        consultas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtConsultarNombre = new javax.swing.JTextField();
        btnConsultarNombre = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btnConsultarApellido = new javax.swing.JButton();
        txtConsultarApellido = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtConsultarTitulo = new javax.swing.JTextField();
        btnConsultarTitulo = new javax.swing.JButton();
        btnLibrosFuera = new javax.swing.JButton();
        btnClientesMorosos = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        numeroLibros = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        codigoSeleccionado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Título");

        jLabel6.setText("Código de libro");

        jLabel7.setText("Editorial");

        jLabel8.setText("Nº de ejemplares");

        txtCodigoLibro.setEditable(false);

        jLabel9.setText("Nº de páginas");

        btnEliminarLibro.setText("Eliminar");

        btnModificarLibro.setText("Modificar");

        btnInsertarLibro.setText("Insertar");

        jLabel1.setText("Año de edición");

        btnLimpiarLibro.setText("Limpiar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigoLibro)
                    .addComponent(txtTituloLibro)
                    .addComponent(txtEjemplaresLibro)
                    .addComponent(txtEditorialLibro)
                    .addComponent(txtPaginasLibro)
                    .addComponent(btnInsertarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(txtAnoEdicionLibro)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(btnLimpiarLibro))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEjemplaresLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditorialLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaginasLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnoEdicionLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnInsertarLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarLibro)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(jPanel4);

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaLibros);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(jPanel5);

        javax.swing.GroupLayout librosLayout = new javax.swing.GroupLayout(libros);
        libros.setLayout(librosLayout);
        librosLayout.setHorizontalGroup(
            librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        librosLayout.setVerticalGroup(
            librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        jTabbedPane1.addTab("LIBROS", libros);

        jLabel10.setText("Nombre");

        txtCodigoSocio.setEditable(false);

        jLabel11.setText("Apellidos");

        jLabel12.setText("Edad");

        jLabel13.setText("Código de socio");

        btnEliminarSocio.setText("Eliminar");

        btnModificarSocio.setText("Modificar");

        btnInsertarSocio.setText("Insertar");

        jLabel2.setText("Dirección");

        jLabel3.setText("Teléfono");

        btnLimpiarSocio.setText("Limpiar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreSocio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoSocio))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModificarSocio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsertarSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnEliminarSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDireccionSocio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdadSocio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidosSocio))
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtTelefonoSocio))
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnLimpiarSocio)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidosSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdadSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccionSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnInsertarSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarSocio)
                .addContainerGap())
        );

        jSplitPane3.setLeftComponent(jPanel7);

        tablaSocios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaSocios);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        jSplitPane3.setRightComponent(jPanel8);

        javax.swing.GroupLayout sociosLayout = new javax.swing.GroupLayout(socios);
        socios.setLayout(sociosLayout);
        sociosLayout.setHorizontalGroup(
            sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 857, Short.MAX_VALUE)
            .addGroup(sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSplitPane3))
        );
        sociosLayout.setVerticalGroup(
            sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
            .addGroup(sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSplitPane3, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        jTabbedPane1.addTab("SOCIOS", socios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jLabel14.setText("Cd. de préstamo");

        txtCodigoPrestamo.setEditable(false);

        jLabel15.setText("Código de libro");

        jLabel16.setText("Título");

        txtTituloLibroPrestamo.setEditable(false);

        jLabel17.setText("Código de socio");

        jLabel18.setText("Nombre");

        txtNombreSocioPrestamo.setEditable(false);

        btnEliminarPrestamo.setText("Eliminar");

        btnModificarPrestamo.setText("Modificar");

        btnInsertarPrestamo.setText("Insertar");

        btnLimpiarPrestamo.setText("Limpiar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigoPrestamo)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigoLibroPrestamo)
                    .addComponent(txtTituloLibroPrestamo)
                    .addComponent(txtCodigoSocioPrestamo)
                    .addComponent(txtNombreSocioPrestamo)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(btnLimpiarPrestamo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoLibroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTituloLibroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoSocioPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreSocioPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarPrestamo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnInsertarPrestamo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarPrestamo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarPrestamo)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel6);

        tablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaPrestamos);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel9);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        jTabbedPane1.addTab("PRÉSTAMOS", jPanel1);

        jLabel4.setText("Consultar Socio por:");

        jLabel19.setText("Nombre:");

        btnConsultarNombre.setText("Consultar");

        jLabel20.setText("Apellido:");

        btnConsultarApellido.setText("Consultar");

        jLabel21.setText("Consultar Libro por:");

        jLabel22.setText("Título:");

        btnConsultarTitulo.setText("Consultar");

        btnLibrosFuera.setText("Mostrar");

        btnClientesMorosos.setText("Mostrar");

        jLabel24.setText("Mostrar clientes con libros fuera del plazo del préstamo");

        jLabel25.setText("Mostrar libros fuera del plazo del préstamo");

        tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaConsultas);

        jLabel26.setText("Número de libros en posesión del socio seleccionado:");

        jLabel27.setText("Código del socio seleccionado:");

        javax.swing.GroupLayout consultasLayout = new javax.swing.GroupLayout(consultas);
        consultas.setLayout(consultasLayout);
        consultasLayout.setHorizontalGroup(
            consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(consultasLayout.createSequentialGroup()
                        .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(consultasLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(5, 5, 5)
                                .addComponent(txtConsultarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultarTitulo))
                            .addComponent(btnClientesMorosos)
                            .addComponent(btnLibrosFuera)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel21)
                            .addGroup(consultasLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(consultasLayout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(codigoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, consultasLayout.createSequentialGroup()
                                    .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, consultasLayout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtConsultarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, consultasLayout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtConsultarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnConsultarNombre)
                                        .addComponent(btnConsultarApellido)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)))
                .addContainerGap())
        );
        consultasLayout.setVerticalGroup(
            consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addGroup(consultasLayout.createSequentialGroup()
                        .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultarNombre)
                            .addComponent(txtConsultarNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsultarApellido)
                            .addComponent(txtConsultarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtConsultarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnConsultarTitulo))
                            .addGroup(consultasLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLibrosFuera, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClientesMorosos)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("CONSULTAS", consultas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista v = new vista();
                v.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnClientesMorosos;
    public javax.swing.JButton btnConsultarApellido;
    public javax.swing.JButton btnConsultarNombre;
    public javax.swing.JButton btnConsultarTitulo;
    public javax.swing.JButton btnEliminarLibro;
    public javax.swing.JButton btnEliminarPrestamo;
    public javax.swing.JButton btnEliminarSocio;
    public javax.swing.JButton btnInsertarLibro;
    public javax.swing.JButton btnInsertarPrestamo;
    public javax.swing.JButton btnInsertarSocio;
    public javax.swing.JButton btnLibrosFuera;
    public javax.swing.JButton btnLimpiarLibro;
    public javax.swing.JButton btnLimpiarPrestamo;
    public javax.swing.JButton btnLimpiarSocio;
    public javax.swing.JButton btnModificarLibro;
    public javax.swing.JButton btnModificarPrestamo;
    public javax.swing.JButton btnModificarSocio;
    public javax.swing.JLabel codigoSeleccionado;
    private javax.swing.JPanel consultas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel libros;
    public javax.swing.JLabel numeroLibros;
    private javax.swing.JPanel socios;
    public javax.swing.JTable tablaConsultas;
    public javax.swing.JTable tablaLibros;
    public javax.swing.JTable tablaPrestamos;
    public javax.swing.JTable tablaSocios;
    public javax.swing.JTextField txtAnoEdicionLibro;
    public javax.swing.JTextField txtApellidosSocio;
    public javax.swing.JTextField txtCodigoLibro;
    public javax.swing.JTextField txtCodigoLibroPrestamo;
    public javax.swing.JTextField txtCodigoPrestamo;
    public javax.swing.JTextField txtCodigoSocio;
    public javax.swing.JTextField txtCodigoSocioPrestamo;
    public javax.swing.JTextField txtConsultarApellido;
    public javax.swing.JTextField txtConsultarNombre;
    public javax.swing.JTextField txtConsultarTitulo;
    public javax.swing.JTextField txtDireccionSocio;
    public javax.swing.JTextField txtEdadSocio;
    public javax.swing.JTextField txtEditorialLibro;
    public javax.swing.JTextField txtEjemplaresLibro;
    public javax.swing.JTextField txtNombreSocio;
    public javax.swing.JTextField txtNombreSocioPrestamo;
    public javax.swing.JTextField txtPaginasLibro;
    public javax.swing.JTextField txtTelefonoSocio;
    public javax.swing.JTextField txtTituloLibro;
    public javax.swing.JTextField txtTituloLibroPrestamo;
    // End of variables declaration//GEN-END:variables
}