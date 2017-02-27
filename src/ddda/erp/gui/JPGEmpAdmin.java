/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.gui;

import ddda.erp.core.CoreBD;
import ddda.erp.objetos.Cine;
import ddda.erp.objetos.Empleado;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class JPGEmpAdmin extends javax.swing.JPanel {
    ArrayList<Empleado> misEmpleados = new ArrayList();
    Empleado miEmpleado;
    ArrayList<Cine> misCines = new ArrayList();
    Cine miCine;
    /**
     * Creates new form JPGEmpAdmin
     */
    public JPGEmpAdmin() {
        initComponents();
        String stringId;
        String stringIdCine;
        try {
            Empleado.mostrarEmpleados(misEmpleados);
            for (int i = 0; i < misEmpleados.size(); i++) {
                miEmpleado = (Empleado) misEmpleados.get(i);
                stringId = String.valueOf(miEmpleado.getIdEmpleado());
                stringIdCine = String.valueOf(miEmpleado.getIdCine());
                System.out.println(stringId);
                jcbIdEmpleado.addItem(stringId);
                jcbConsultaEmp.addItem(stringId);
                jcbBajaEmp.addItem(stringId);
                jcbIdCineAltaEmpleado.addItem(stringIdCine);
                jcbModificarIdCineEmp.addItem(stringIdCine);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfNombreEmpleado = new javax.swing.JTextField();
        jtfApellidoEmpleado = new javax.swing.JTextField();
        jtfDniEmpleado = new javax.swing.JTextField();
        jcbCargoEmpleado = new javax.swing.JComboBox<>();
        jtfNomUsuarioEmpleado = new javax.swing.JTextField();
        jtfContraseñaEmpleado = new javax.swing.JTextField();
        jcbIdCineAltaEmpleado = new javax.swing.JComboBox<>();
        jbCrearEmpleado = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jtfFechaInicioEmpAdmin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jcbIdEmpleado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jtfModificarNomEmp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfModificarApeEmp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfModificarDniEmp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jcbModificarCargoEmp = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtfModificarNomUsuEmp = new javax.swing.JTextField();
        jcbModificarIdCineEmp = new javax.swing.JComboBox<>();
        jbModificarEmp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jcbConsultaEmp = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultaEmp = new javax.swing.JTable();
        jcbConsultaEmpleado = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jtfNombreEmpConsultaAdmin = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jcbBajaEmp = new javax.swing.JComboBox<>();
        jcbEliminarEmp = new javax.swing.JButton();

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("DNI:");

        jLabel4.setText("Cargo:");

        jLabel5.setText("Nombre de Usuario:");

        jLabel6.setText("Contraseña:");

        jLabel7.setText("Id Cine:");

        jcbCargoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Administrador" }));

        jbCrearEmpleado.setText("Crear Empleado");
        jbCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearEmpleadoActionPerformed(evt);
            }
        });

        jLabel17.setText("Fecha Inicio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel17))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jtfNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfApellidoEmpleado)
                            .addComponent(jtfDniEmpleado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtfFechaInicioEmpAdmin)))
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNomUsuarioEmpleado)
                            .addComponent(jtfContraseñaEmpleado)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbCargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbIdCineAltaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCrearEmpleado)
                        .addGap(141, 141, 141)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfDniEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtfFechaInicioEmpAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfNomUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfContraseñaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbIdCineAltaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jbCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Alta Empleado", jPanel1);

        jLabel8.setText("Id Empleado:");

        jcbIdEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbIdEmpleadoActionPerformed(evt);
            }
        });

        jLabel9.setText("Nombre:");

        jLabel10.setText("Apellidos:");

        jLabel11.setText("DNI:");

        jLabel12.setText("Cargo:");

        jcbModificarCargoEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Administrador" }));

        jLabel13.setText("IdCine:");

        jLabel14.setText("Nombre de Usuario:");

        jbModificarEmp.setText("Modificar");
        jbModificarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfModificarApeEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfModificarNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(78, 78, 78)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfModificarDniEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jcbModificarCargoEmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbModificarEmp)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfModificarNomUsuEmp)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jcbModificarIdCineEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfModificarNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfModificarApeEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfModificarDniEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jcbModificarCargoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtfModificarNomUsuEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jcbModificarIdCineEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbModificarEmp)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Empleado", jPanel2);

        jLabel15.setText("Id Empleado:");

        jcbConsultaEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConsultaEmpActionPerformed(evt);
            }
        });

        jtConsultaEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cargo", "Id Cine", "DNI", "Nombre Usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtConsultaEmp);

        jcbConsultaEmpleado.setText("Consultar por Nombre");
        jcbConsultaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConsultaEmpleadoActionPerformed(evt);
            }
        });

        jLabel18.setText("Nombre Empleado:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbConsultaEmp, 0, 143, Short.MAX_VALUE)
                            .addComponent(jtfNombreEmpConsultaAdmin))
                        .addGap(47, 47, 47)
                        .addComponent(jcbConsultaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jcbConsultaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbConsultaEmpleado)
                    .addComponent(jLabel18)
                    .addComponent(jtfNombreEmpConsultaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta Empleado", jPanel3);

        jLabel16.setText("Id Empleado:");

        jcbEliminarEmp.setText("Eliminar Empleado");
        jcbEliminarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEliminarEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel16)
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbEliminarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jcbBajaEmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jcbBajaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jcbEliminarEmp)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Baja Empleado", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearEmpleadoActionPerformed
        String nombre = jtfNombreEmpleado.getText();
        String apellido = jtfApellidoEmpleado.getText();
        String dni = jtfDniEmpleado.getText();
        String fechaInicio = jtfFechaInicioEmpAdmin.getText();
        String cargo = (String) jcbCargoEmpleado.getSelectedItem();
        String usuario = jtfNomUsuarioEmpleado.getText();
        String contrasena = jtfContraseñaEmpleado.getText();
        int idCine = Integer.parseInt((String) jcbIdCineAltaEmpleado.getSelectedItem());

        Empleado elEmpleado = new Empleado(dni, nombre, apellido, fechaInicio, cargo, usuario, contrasena, idCine);
        try {
            elEmpleado.crearEmpleado();
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbCrearEmpleadoActionPerformed

    private void jbModificarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarEmpActionPerformed
        miEmpleado.setIdEmpleado(Integer.parseInt((String) jcbIdEmpleado.getSelectedItem()));
        miEmpleado.setNombre(jtfModificarNomEmp.getText());
        miEmpleado.setDni(jtfModificarDniEmp.getText());
        miEmpleado.setCargo ((String) jcbModificarCargoEmp.getSelectedItem());
        miEmpleado.setUsuario(jtfModificarNomUsuEmp.getText());
        miEmpleado.setIdCine(Integer.parseInt((String) jcbModificarIdCineEmp.getSelectedItem()));
        try {
            miEmpleado.modificarEmpleado();
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbModificarEmpActionPerformed

    private void jcbIdEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbIdEmpleadoActionPerformed
        int empleadoBuscado;
        empleadoBuscado = jcbIdEmpleado.getSelectedIndex();
        miEmpleado = misEmpleados.get(empleadoBuscado);
        jtfModificarNomEmp.setText(miEmpleado.getNombre());
        jtfModificarApeEmp.setText(miEmpleado.getApellido());
        jtfModificarDniEmp.setText(miEmpleado.getDni());
        jtfModificarNomUsuEmp.setText(miEmpleado.getUsuario());
        jcbModificarCargoEmp.setSelectedItem(miEmpleado.getCargo());
        jcbModificarIdCineEmp.setSelectedItem(String.valueOf(miEmpleado.getIdCine()));
        
    }//GEN-LAST:event_jcbIdEmpleadoActionPerformed

    private void jcbEliminarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEliminarEmpActionPerformed
        int idEmpleado;
        String comodin;
        comodin = jcbBajaEmp.getSelectedItem().toString();
        idEmpleado = Integer.parseInt(comodin);
        try {
            miEmpleado.borrarEmpleadoID(idEmpleado);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcbEliminarEmpActionPerformed

    private void jcbConsultaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConsultaEmpleadoActionPerformed
        String nombre = null;
        String apellido = null;
        String cargo = null;
        int idCine = 0;
        String dni = null;
        String nombreUsuario = null;
        try {
            Empleado.mostrarEmpleados(misEmpleados);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < misEmpleados.size(); i++) {
            miEmpleado = misEmpleados.get(i);
            if (miEmpleado.getNombre().equals(jtfNombreEmpConsultaAdmin.getText()) == true) {
                nombre = miEmpleado.getNombre();
                apellido = miEmpleado.getApellido();
                cargo = miEmpleado.getCargo();
                idCine = miEmpleado.getIdCine();
                dni = miEmpleado.getDni();
                nombreUsuario = miEmpleado.getUsuario();
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) jtConsultaEmp.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{(String) nombre, (String) apellido, (String) cargo, (Integer) idCine, (String) dni, (String) nombreUsuario});

    }//GEN-LAST:event_jcbConsultaEmpleadoActionPerformed

    private void jcbConsultaEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConsultaEmpActionPerformed
        int empleadoBuscado;
        empleadoBuscado = jcbConsultaEmp.getSelectedIndex();
        miEmpleado = misEmpleados.get(empleadoBuscado);
        jtfNombreEmpConsultaAdmin.setText(miEmpleado.getNombre());
    }//GEN-LAST:event_jcbConsultaEmpActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbCrearEmpleado;
    private javax.swing.JButton jbModificarEmp;
    private javax.swing.JComboBox<String> jcbBajaEmp;
    private javax.swing.JComboBox<String> jcbCargoEmpleado;
    private javax.swing.JComboBox<String> jcbConsultaEmp;
    private javax.swing.JButton jcbConsultaEmpleado;
    private javax.swing.JButton jcbEliminarEmp;
    private javax.swing.JComboBox<String> jcbIdCineAltaEmpleado;
    private javax.swing.JComboBox<String> jcbIdEmpleado;
    private javax.swing.JComboBox<String> jcbModificarCargoEmp;
    private javax.swing.JComboBox<String> jcbModificarIdCineEmp;
    private javax.swing.JTable jtConsultaEmp;
    private javax.swing.JTextField jtfApellidoEmpleado;
    private javax.swing.JTextField jtfContraseñaEmpleado;
    private javax.swing.JTextField jtfDniEmpleado;
    private javax.swing.JTextField jtfFechaInicioEmpAdmin;
    private javax.swing.JTextField jtfModificarApeEmp;
    private javax.swing.JTextField jtfModificarDniEmp;
    private javax.swing.JTextField jtfModificarNomEmp;
    private javax.swing.JTextField jtfModificarNomUsuEmp;
    private javax.swing.JTextField jtfNomUsuarioEmpleado;
    private javax.swing.JTextField jtfNombreEmpConsultaAdmin;
    private javax.swing.JTextField jtfNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
