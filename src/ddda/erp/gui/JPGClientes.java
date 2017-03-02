/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.gui;

import ddda.erp.objetos.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class JPGClientes extends javax.swing.JPanel {
    ArrayList<Cliente> misClientes = new ArrayList();
    Cliente miCliente;
    /**
     * Creates new form JPGClientes
     */
    public JPGClientes() {
        initComponents();
        String stringId;
        try {
            Cliente.mostrarClientes(misClientes);
            for (int i = 0; i < misClientes.size(); i++) {
                miCliente = (Cliente) misClientes.get(i);
                stringId = String.valueOf(miCliente.getIdCliente());
                System.out.println(stringId);
                jcbBajaCli.addItem(stringId);
                jcbConsultaIdCli.addItem(stringId);
                jcbModCli.addItem(stringId);
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
        jbAltaCliente = new javax.swing.JButton();
        jtfNomCli = new javax.swing.JTextField();
        jtfApeCli = new javax.swing.JTextField();
        jtfDniCli = new javax.swing.JTextField();
        jtfCPCli = new javax.swing.JTextField();
        jtfUsuarioCli = new javax.swing.JTextField();
        jtfPassCli = new javax.swing.JTextField();
        jspPuntosCli = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jcbBajaCli = new javax.swing.JComboBox<>();
        jbBajaCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jcbConsultaIdCli = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jbConsultaNomCli = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaConsultaCli = new javax.swing.JTable();
        jtfNombreClienteConsulta = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtfDniClienteConsulta = new javax.swing.JTextField();
        jbConsultaCliDni = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jcbModCli = new javax.swing.JComboBox<>();
        jtfModNombre = new javax.swing.JTextField();
        jtfModApellidos = new javax.swing.JTextField();
        jtfModDni = new javax.swing.JTextField();
        jtfModNomUsu = new javax.swing.JTextField();
        jtfModCP = new javax.swing.JTextField();
        jspModPuntos = new javax.swing.JSpinner();
        jbModCliente = new javax.swing.JButton();

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("DNI:");

        jLabel4.setText("C.P:");

        jLabel5.setText("Usuario:");

        jLabel6.setText("Contraseña:");

        jLabel7.setText("Puntos:");

        jbAltaCliente.setText("Crear Cliente");
        jbAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaClienteActionPerformed(evt);
            }
        });

        jtfCPCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCPCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNomCli)
                            .addComponent(jtfApeCli)
                            .addComponent(jtfDniCli, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jtfCPCli)
                            .addComponent(jtfUsuarioCli)
                            .addComponent(jtfPassCli)
                            .addComponent(jspPuntosCli, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jbAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtfCPCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfUsuarioCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfPassCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jspPuntosCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jbAltaCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alta Cliente", jPanel1);

        jLabel8.setText("ID Cliente:");

        jbBajaCliente.setText("Baja Cliente");
        jbBajaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbBajaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jcbBajaCli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(400, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbBajaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jbBajaCliente)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Baja Cliente", jPanel2);

        jLabel9.setText("ID Cliente:");

        jcbConsultaIdCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConsultaIdCliActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre Cliente:");

        jbConsultaNomCli.setText("Consulta por Nombre");
        jbConsultaNomCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaNomCliActionPerformed(evt);
            }
        });

        jtaConsultaCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "ID", "Apellidos", "DNI", "Puntos", "Nombre Usuario", "CodigoPostal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtaConsultaCli);

        jLabel18.setText("DNI:");

        jbConsultaCliDni.setText("Consulta por DNI");
        jbConsultaCliDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaCliDniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel18))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbConsultaIdCli, 0, 120, Short.MAX_VALUE)
                            .addComponent(jtfNombreClienteConsulta)
                            .addComponent(jtfDniClienteConsulta))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbConsultaNomCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbConsultaCliDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcbConsultaIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jbConsultaNomCli)
                    .addComponent(jtfNombreClienteConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtfDniClienteConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultaCliDni))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta Cliente", jPanel3);

        jLabel11.setText("Id Cliente:");

        jLabel12.setText("Nombre:");

        jLabel13.setText("Apellidos:");

        jLabel14.setText("DNI:");

        jLabel15.setText("Nombre Usuario:");

        jLabel16.setText("C.P:");

        jLabel17.setText("Puntos:");

        jcbModCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbModCliActionPerformed(evt);
            }
        });

        jbModCliente.setText("Modificar Cliente");
        jbModCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbModCli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfModNombre)
                    .addComponent(jtfModApellidos)
                    .addComponent(jtfModDni)
                    .addComponent(jtfModNomUsu)
                    .addComponent(jtfModCP)
                    .addComponent(jspModPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcbModCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtfModNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtfModApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtfModDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtfModNomUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jtfModCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jspModPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jbModCliente)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Cliente", jPanel4);

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

    private void jtfCPCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCPCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCPCliActionPerformed

    private void jbAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaClienteActionPerformed
        String nombre = jtfNomCli.getText();
        String apellido = jtfApeCli.getText();
        String dni = jtfDniCli.getText();
        int cp = Integer.parseInt(jtfCPCli.getText());
        String usuario = jtfUsuarioCli.getText();
        String contrasena = jtfPassCli.getText();
        int puntos = (int) jspPuntosCli.getValue();
        
        Cliente elCliente = new Cliente(dni, nombre, apellido, cp, puntos, usuario, contrasena);
        try {
            elCliente.crearCliente();
            JOptionPane.showMessageDialog(null, "Cliente creado","Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAltaClienteActionPerformed

    private void jbBajaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaClienteActionPerformed
        int idCliente;
        String comodin;
        comodin = jcbBajaCli.getSelectedItem().toString();
        idCliente = Integer.parseInt(comodin);
        try {
            miCliente.borrarClienteID(idCliente);
            JOptionPane.showMessageDialog(null, "Cliente borrado","Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbBajaClienteActionPerformed

    private void jcbConsultaIdCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConsultaIdCliActionPerformed
        int clienteBuscado;
        clienteBuscado = jcbConsultaIdCli.getSelectedIndex();
        miCliente = misClientes.get(clienteBuscado);
        jtfNombreClienteConsulta.setText(miCliente.getNombre());
        jtfDniClienteConsulta.setText(miCliente.getDni());
    }//GEN-LAST:event_jcbConsultaIdCliActionPerformed

    private void jbConsultaNomCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaNomCliActionPerformed
        String nombre = null;
        int id = 0;
        String apellidos = null;
        String dni = null;
        int puntos = 0;
        String nomUsuario = null;
        int cp = 0;
        try {
            Cliente.mostrarClientes(misClientes);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < misClientes.size(); i++) {
            miCliente = misClientes.get(i);
            if (miCliente.getNombre().equals(jtfNombreClienteConsulta.getText()) == true) {
                nombre = miCliente.getNombre();
                id = miCliente.getIdCliente();
                apellidos = miCliente.getApellidos();
                dni = miCliente.getDni();
                puntos = miCliente.getPuntos();
                nomUsuario = miCliente.getUsuario();
                cp = miCliente.getCp();
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) jtaConsultaCli.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{(String) nombre, (Integer) id, (String) apellidos, (String) dni, (Integer) puntos, (String) nomUsuario, (Integer) cp});
    }//GEN-LAST:event_jbConsultaNomCliActionPerformed

    private void jbConsultaCliDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaCliDniActionPerformed
        String nombre = null;
        int id = 0;
        String apellidos = null;
        String dni = null;
        int puntos = 0;
        String nomUsuario = null;
        int cp = 0;
        try {
            Cliente.mostrarClientes(misClientes);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < misClientes.size(); i++) {
            miCliente = misClientes.get(i);
            if (miCliente.getDni().equals(jtfDniClienteConsulta.getText()) == true) {
                nombre = miCliente.getNombre();
                id = miCliente.getIdCliente();
                apellidos = miCliente.getApellidos();
                dni = miCliente.getDni();
                puntos = miCliente.getPuntos();
                nomUsuario = miCliente.getUsuario();
                cp = miCliente.getCp();
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) jtaConsultaCli.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{(String) nombre, (Integer) id, (String) apellidos, (String) dni, (Integer) puntos, (String) nomUsuario, (Integer) cp});
    }//GEN-LAST:event_jbConsultaCliDniActionPerformed

    private void jcbModCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbModCliActionPerformed
        int clienteBuscado;
        clienteBuscado = jcbModCli.getSelectedIndex();
        miCliente = misClientes.get(clienteBuscado);
        jtfModNombre.setText(miCliente.getNombre());
        jtfModApellidos.setText(miCliente.getApellidos());
        jtfModDni.setText(miCliente.getDni());
        jtfModNomUsu.setText(miCliente.getUsuario());
        jtfModCP.setText(String.valueOf(miCliente.getCp()));
        jspModPuntos.setValue(miCliente.getPuntos());
    }//GEN-LAST:event_jcbModCliActionPerformed

    private void jbModClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModClienteActionPerformed
        miCliente.setIdCliente(Integer.parseInt((String) jcbModCli.getSelectedItem()));
        miCliente.setNombre(jtfModNombre.getText());
        miCliente.setApellidos(jtfModApellidos.getText());
        miCliente.setDni(jtfModDni.getText());
        miCliente.setUsuario(jtfModNomUsu.getText());
        miCliente.setCp(Integer.parseInt(jtfModCP.getText()));
        miCliente.setPuntos((int) jspModPuntos.getValue());
        try {
            miCliente.modificarCliente();
            JOptionPane.showMessageDialog(null, "Cliente modificado","Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbModClienteActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        String stringId;
        jcbBajaCli.setModel(new DefaultComboBoxModel());
        jcbConsultaIdCli.setModel(new DefaultComboBoxModel());
        jcbModCli.setModel(new DefaultComboBoxModel());
        try {
            Cliente.mostrarClientes(misClientes);
            for (int i = 0; i < misClientes.size(); i++) {
                miCliente = (Cliente) misClientes.get(i);
                stringId = String.valueOf(miCliente.getIdCliente());
                System.out.println(stringId);
                jcbBajaCli.addItem(stringId);
                jcbConsultaIdCli.addItem(stringId);
                jcbModCli.addItem(stringId);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton jbAltaCliente;
    private javax.swing.JButton jbBajaCliente;
    private javax.swing.JButton jbConsultaCliDni;
    private javax.swing.JButton jbConsultaNomCli;
    private javax.swing.JButton jbModCliente;
    private javax.swing.JComboBox<String> jcbBajaCli;
    private javax.swing.JComboBox<String> jcbConsultaIdCli;
    private javax.swing.JComboBox<String> jcbModCli;
    private javax.swing.JSpinner jspModPuntos;
    private javax.swing.JSpinner jspPuntosCli;
    private javax.swing.JTable jtaConsultaCli;
    private javax.swing.JTextField jtfApeCli;
    private javax.swing.JTextField jtfCPCli;
    private javax.swing.JTextField jtfDniCli;
    private javax.swing.JTextField jtfDniClienteConsulta;
    private javax.swing.JTextField jtfModApellidos;
    private javax.swing.JTextField jtfModCP;
    private javax.swing.JTextField jtfModDni;
    private javax.swing.JTextField jtfModNomUsu;
    private javax.swing.JTextField jtfModNombre;
    private javax.swing.JTextField jtfNomCli;
    private javax.swing.JTextField jtfNombreClienteConsulta;
    private javax.swing.JTextField jtfPassCli;
    private javax.swing.JTextField jtfUsuarioCli;
    // End of variables declaration//GEN-END:variables
}
