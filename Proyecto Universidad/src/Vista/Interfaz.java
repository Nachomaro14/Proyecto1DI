package Vista;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matriculas = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaMatriculas = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaAsigMat = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnNuevaMatricula = new javax.swing.JMenuItem();
        btnConsultas = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        consultas = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtNotaAsignatura = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnModificarNota = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtDniAlumno = new javax.swing.JTextField();
        txtTituloAsignatura = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaAsigMatAlum = new javax.swing.JTable();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumCreditos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnEliminarAsignatura = new javax.swing.JButton();
        btnModificarAsignatura = new javax.swing.JButton();
        btnAnadirAsignatura = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtNuevoCodigoAsignatura = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAsignaturas = new javax.swing.JTable();
        jSplitPane3 = new javax.swing.JSplitPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProfesores = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDniProfesor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidosProfesor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreProfesor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDomicilioProfesor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefonoProfesor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAnadirProfesor = new javax.swing.JButton();
        btnModificarProfesor = new javax.swing.JButton();
        btnEliminarProfesor = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtSupervisorProfesor = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtNuevoDniProfesor = new javax.swing.JTextField();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtEdificio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAula = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnAnadirAula = new javax.swing.JButton();
        btnModificarAula = new javax.swing.JButton();
        btnEliminarAula = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtNuevoEdificio = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNuevoNumero = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAulas = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaAsignaciones = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        comboProfesor = new javax.swing.JComboBox();
        comboAsignatura = new javax.swing.JComboBox();
        comboEdificio = new javax.swing.JComboBox();
        comboAula = new javax.swing.JComboBox();
        jPanel11 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        btnAsignar = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        txtCodigoAsignacion = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        btnEliminarAsignacion = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btnVolver = new javax.swing.JMenuItem();
        nuevaMatricula = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtNuevoDni = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNuevoApellidos = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNuevoNombre = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNuevoDomicilio = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtNuevoTelefono = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtNuevoAcceso = new javax.swing.JTextField();
        comboAsignaturasAMatricular = new javax.swing.JComboBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaAsignaturasAMatricular = new javax.swing.JList();
        btnCompletarMatricula = new javax.swing.JButton();
        btnCancelarMatricula = new javax.swing.JButton();
        btnAnadirAsignaturaMatricula = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnLetras = new javax.swing.JButton();
        btnCiencias = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSalirInicio = new javax.swing.JButton();

        matriculas.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        tablaMatriculas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tablaMatriculas);

        jPanel1.add(jScrollPane5);

        tablaAsigMat.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tablaAsigMat);

        jPanel1.add(jScrollPane7);

        jMenu1.setText("Opciones");

        btnNuevaMatricula.setText("Nueva Matrícula");
        btnNuevaMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMatriculaActionPerformed(evt);
            }
        });
        jMenu1.add(btnNuevaMatricula);

        btnConsultas.setText("Consultas");
        jMenu1.add(btnConsultas);

        btnSalir.setText("Salir");
        jMenu1.add(btnSalir);

        jMenuBar1.add(jMenu1);

        matriculas.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout matriculasLayout = new javax.swing.GroupLayout(matriculas.getContentPane());
        matriculas.getContentPane().setLayout(matriculasLayout);
        matriculasLayout.setHorizontalGroup(
            matriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        matriculasLayout.setVerticalGroup(
            matriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        consultas.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel14.setText("Nota");

        jLabel15.setText("<- ->");

        btnModificarNota.setText("Modificar");

        jLabel16.setText("DNI");

        txtDniAlumno.setEditable(false);

        jLabel24.setText("Asignatura");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNotaAsignatura)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15))
                    .addComponent(btnModificarNota, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(txtDniAlumno)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel24))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTituloAsignatura))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDniAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTituloAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNotaAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel4);

        jPanel9.setLayout(new java.awt.GridLayout(0, 1));

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaAlumnos);

        jPanel9.add(jScrollPane1);

        tablaAsigMatAlum.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(tablaAsigMatAlum);

        jPanel9.add(jScrollPane8);

        jSplitPane1.setRightComponent(jPanel9);

        jTabbedPane1.addTab("Alumnos", jSplitPane1);

        jLabel1.setText("Código");

        txtCodigo.setEditable(false);

        jLabel2.setText("Título");

        jLabel3.setText("Núm. Créditos");

        jLabel11.setText("<- ->");

        btnEliminarAsignatura.setText("Eliminar");

        btnModificarAsignatura.setText("Modificar");

        btnAnadirAsignatura.setText("Añadir");

        jLabel25.setText("Nuevo Código");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addComponent(btnModificarAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnadirAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNuevoCodigoAsignatura)
                    .addComponent(txtTitulo)
                    .addComponent(txtNumCreditos)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel25)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoCodigoAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(btnAnadirAsignatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarAsignatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarAsignatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(jPanel5);

        tablaAsignaturas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaAsignaturas);

        jSplitPane2.setRightComponent(jScrollPane3);

        jTabbedPane1.addTab("Asignaturas", jSplitPane2);

        tablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaProfesores);

        jSplitPane3.setRightComponent(jScrollPane4);

        jLabel4.setText("DNI");

        txtDniProfesor.setEditable(false);

        jLabel5.setText("Apellidos");

        jLabel6.setText("Nombre");

        jLabel7.setText("Domicilio");

        jLabel8.setText("Teléfono");

        jLabel13.setText("<- ->");

        btnAnadirProfesor.setText("Añadir");

        btnModificarProfesor.setText("Modificar");

        btnEliminarProfesor.setText("Eliminar");

        jLabel22.setText("DNI Supervisor");

        jLabel26.setText("Nuevo DNI");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDniProfesor)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addComponent(btnEliminarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnAnadirProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNuevoDniProfesor)
                    .addComponent(txtApellidosProfesor)
                    .addComponent(txtNombreProfesor)
                    .addComponent(txtDomicilioProfesor)
                    .addComponent(txtTelefonoProfesor)
                    .addComponent(txtSupervisorProfesor)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel26)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel22))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDniProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoDniProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidosProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDomicilioProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSupervisorProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnAnadirProfesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarProfesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarProfesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jSplitPane3.setLeftComponent(jPanel6);

        jTabbedPane1.addTab("Profesores", jSplitPane3);

        jLabel9.setText("Edificio");

        txtEdificio.setEditable(false);

        jLabel10.setText("Número");

        txtAula.setEditable(false);

        jLabel12.setText("<- ->");

        btnAnadirAula.setText("Añadir");

        btnModificarAula.setText("Modificar");

        btnEliminarAula.setText("Eliminar");

        jLabel27.setText("Nuevo Edificio");

        jLabel28.setText("Nuevo Número");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdificio)
                    .addComponent(txtAula)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addComponent(btnEliminarAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarAula, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnAnadirAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNuevoEdificio)
                    .addComponent(txtNuevoNumero))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(btnAnadirAula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarAula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarAula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jSplitPane4.setLeftComponent(jPanel7);

        tablaAulas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaAulas);

        jSplitPane4.setRightComponent(jScrollPane2);

        jTabbedPane1.addTab("Aulas", jSplitPane4);

        jPanel8.setLayout(new java.awt.BorderLayout());

        tablaAsignaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(tablaAsignaciones);

        jPanel8.add(jScrollPane9, java.awt.BorderLayout.CENTER);

        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        comboProfesor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel10.add(comboProfesor);

        comboAsignatura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel10.add(comboAsignatura);

        comboEdificio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel10.add(comboEdificio);

        comboAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboAula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAulaItemStateChanged(evt);
            }
        });
        jPanel10.add(comboAula);

        jPanel8.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));
        jPanel11.add(filler1);

        btnAsignar.setText("Asignar");
        jPanel11.add(btnAsignar);
        jPanel11.add(filler4);

        txtCodigoAsignacion.setEnabled(false);
        jPanel11.add(txtCodigoAsignacion);
        jPanel11.add(filler3);

        btnEliminarAsignacion.setText("Eliminar");
        jPanel11.add(btnEliminarAsignacion);
        jPanel11.add(filler2);

        jPanel8.add(jPanel11, java.awt.BorderLayout.PAGE_END);

        jTabbedPane1.addTab("Asignaciones", jPanel8);

        jMenu3.setText("Opciones");

        btnVolver.setText("Volver");
        jMenu3.add(btnVolver);

        jMenuBar2.add(jMenu3);

        consultas.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout consultasLayout = new javax.swing.GroupLayout(consultas.getContentPane());
        consultas.getContentPane().setLayout(consultasLayout);
        consultasLayout.setHorizontalGroup(
            consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultasLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        consultasLayout.setVerticalGroup(
            consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultasLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        nuevaMatricula.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setLayout(new java.awt.GridLayout(0, 1));

        jLabel17.setText("DNI");
        jPanel12.add(jLabel17);
        jPanel12.add(txtNuevoDni);

        jLabel18.setText("Apellidos");
        jPanel12.add(jLabel18);
        jPanel12.add(txtNuevoApellidos);

        jLabel19.setText("Nombre");
        jPanel12.add(jLabel19);
        jPanel12.add(txtNuevoNombre);

        jLabel20.setText("Domicilio");
        jPanel12.add(jLabel20);
        jPanel12.add(txtNuevoDomicilio);

        jLabel21.setText("Teléfono");
        jPanel12.add(jLabel21);
        jPanel12.add(txtNuevoTelefono);

        jLabel23.setText("Acceso");
        jPanel12.add(jLabel23);
        jPanel12.add(txtNuevoAcceso);

        jPanel13.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 570, 260));

        comboAsignaturasAMatricular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel13.add(comboAsignaturasAMatricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        listaAsignaturasAMatricular.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(listaAsignaturasAMatricular);

        jPanel13.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 570, 160));

        btnCompletarMatricula.setText("Completar matrícula");
        jPanel13.add(btnCompletarMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        btnCancelarMatricula.setText("Cancelar");
        jPanel13.add(btnCancelarMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, -1));

        btnAnadirAsignaturaMatricula.setText("Añadir");
        jPanel13.add(btnAnadirAsignaturaMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        javax.swing.GroupLayout nuevaMatriculaLayout = new javax.swing.GroupLayout(nuevaMatricula.getContentPane());
        nuevaMatricula.getContentPane().setLayout(nuevaMatriculaLayout);
        nuevaMatriculaLayout.setHorizontalGroup(
            nuevaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        nuevaMatriculaLayout.setVerticalGroup(
            nuevaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnLetras.setText("LETRAS");
        btnLetras.setEnabled(false);
        jPanel3.add(btnLetras);

        btnCiencias.setText("CIENCIAS");
        jPanel3.add(btnCiencias);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnSalirInicio.setText("Salir");
        jPanel2.add(btnSalirInicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaMatriculaActionPerformed

    private void comboAulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAulaItemStateChanged
        
    }//GEN-LAST:event_comboAulaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAnadirAsignatura;
    public javax.swing.JButton btnAnadirAsignaturaMatricula;
    public javax.swing.JButton btnAnadirAula;
    public javax.swing.JButton btnAnadirProfesor;
    public javax.swing.JButton btnAsignar;
    public javax.swing.JButton btnCancelarMatricula;
    public javax.swing.JButton btnCiencias;
    public javax.swing.JButton btnCompletarMatricula;
    public javax.swing.JMenuItem btnConsultas;
    public javax.swing.JButton btnEliminarAsignacion;
    public javax.swing.JButton btnEliminarAsignatura;
    public javax.swing.JButton btnEliminarAula;
    public javax.swing.JButton btnEliminarProfesor;
    public javax.swing.JButton btnLetras;
    public javax.swing.JButton btnModificarAsignatura;
    public javax.swing.JButton btnModificarAula;
    public javax.swing.JButton btnModificarNota;
    public javax.swing.JButton btnModificarProfesor;
    public javax.swing.JMenuItem btnNuevaMatricula;
    public javax.swing.JMenuItem btnSalir;
    public javax.swing.JButton btnSalirInicio;
    public javax.swing.JMenuItem btnVolver;
    public javax.swing.JComboBox comboAsignatura;
    public javax.swing.JComboBox comboAsignaturasAMatricular;
    public javax.swing.JComboBox comboAula;
    public javax.swing.JComboBox comboEdificio;
    public javax.swing.JComboBox comboProfesor;
    public javax.swing.JDialog consultas;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JList listaAsignaturasAMatricular;
    public javax.swing.JDialog matriculas;
    public javax.swing.JDialog nuevaMatricula;
    public javax.swing.JTable tablaAlumnos;
    public javax.swing.JTable tablaAsigMat;
    public javax.swing.JTable tablaAsigMatAlum;
    public javax.swing.JTable tablaAsignaciones;
    public javax.swing.JTable tablaAsignaturas;
    public javax.swing.JTable tablaAulas;
    public javax.swing.JTable tablaMatriculas;
    public javax.swing.JTable tablaProfesores;
    public javax.swing.JTextField txtApellidosProfesor;
    public javax.swing.JTextField txtAula;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JLabel txtCodigoAsignacion;
    public javax.swing.JTextField txtDniAlumno;
    public javax.swing.JTextField txtDniProfesor;
    public javax.swing.JTextField txtDomicilioProfesor;
    public javax.swing.JTextField txtEdificio;
    public javax.swing.JTextField txtNombreProfesor;
    public javax.swing.JTextField txtNotaAsignatura;
    public javax.swing.JTextField txtNuevoAcceso;
    public javax.swing.JTextField txtNuevoApellidos;
    public javax.swing.JTextField txtNuevoCodigoAsignatura;
    public javax.swing.JTextField txtNuevoDni;
    public javax.swing.JTextField txtNuevoDniProfesor;
    public javax.swing.JTextField txtNuevoDomicilio;
    public javax.swing.JTextField txtNuevoEdificio;
    public javax.swing.JTextField txtNuevoNombre;
    public javax.swing.JTextField txtNuevoNumero;
    public javax.swing.JTextField txtNuevoTelefono;
    public javax.swing.JTextField txtNumCreditos;
    public javax.swing.JTextField txtSupervisorProfesor;
    public javax.swing.JTextField txtTelefonoProfesor;
    public javax.swing.JTextField txtTitulo;
    public javax.swing.JTextField txtTituloAsignatura;
    // End of variables declaration//GEN-END:variables
}