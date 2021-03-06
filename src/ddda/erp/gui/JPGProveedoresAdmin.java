/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.gui;

import ddda.erp.objetos.Proveedor;
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
public class JPGProveedoresAdmin extends javax.swing.JPanel {
    ArrayList<Proveedor> misProveedores = new ArrayList();
    Proveedor miProveedor;
    /**
     * Creates new form JPGProveedoresAdmin
     */
    public JPGProveedoresAdmin() {
        initComponents();
        String stringId;

        try {
            Proveedor.mostrarProveedor(misProveedores);
            for (int i = 0; i < misProveedores.size(); i++) {
                miProveedor = (Proveedor) misProveedores.get(i);
                stringId = String.valueOf(miProveedor.getIdProveedor());
                System.out.println(stringId);
                jcbModIdProAdmin.addItem(stringId);
                jcbConsultaProAdmin.addItem(stringId);
                jcbBajaProAdmin.addItem(stringId);
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
        jtfNombreProAdmin = new javax.swing.JTextField();
        jtfApeProAdmin = new javax.swing.JTextField();
        jtfDniProAdmin = new javax.swing.JTextField();
        jtfPoblProAdmin = new javax.swing.JTextField();
        jtfCpProAdmin = new javax.swing.JTextField();
        jbCrearProAdmin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jcbModIdProAdmin = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtfModNomProAdmin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfModApeProAdmin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfModDniProAdmin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfModPoblProAdmin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfModCpProAdmin = new javax.swing.JTextField();
        jbModProAdmin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jcbConsultaProAdmin = new javax.swing.JComboBox<>();
        jbConsultarProAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultaProAdmin = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jtfNombreProPoAdmin = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jcbBajaProAdmin = new javax.swing.JComboBox<>();
        jbEliminarProAdmin = new javax.swing.JButton();

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("DNI:");

        jLabel4.setText("Población:");

        jLabel5.setText("C.P:");

        jbCrearProAdmin.setText("Crear Proveedor");
        jbCrearProAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearProAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfDniProAdmin)
                                    .addComponent(jtfNombreProAdmin)
                                    .addComponent(jtfApeProAdmin)
                                    .addComponent(jtfPoblProAdmin)
                                    .addComponent(jtfCpProAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jbCrearProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombreProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfApeProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfDniProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtfPoblProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtfCpProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbCrearProAdmin)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alta Proveedor", jPanel1);

        jLabel6.setText("Id Proveedor:");

        jcbModIdProAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbModIdProAdminActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre:");

        jLabel8.setText("Apellido:");

        jLabel9.setText("DNI:");

        jLabel10.setText("Población:");

        jLabel11.setText("C.P:");

        jbModProAdmin.setText("Modificar");
        jbModProAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModProAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbModProAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtfModNomProAdmin)
                        .addComponent(jtfModApeProAdmin)
                        .addComponent(jtfModDniProAdmin)
                        .addComponent(jtfModPoblProAdmin)
                        .addComponent(jtfModCpProAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addComponent(jcbModIdProAdmin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbModIdProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfModNomProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jtfModApeProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jtfModDniProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfModPoblProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfModCpProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbModProAdmin)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificación Proveedor", jPanel2);

        jLabel12.setText("Id Proveedor:");

        jcbConsultaProAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConsultaProAdminActionPerformed(evt);
            }
        });

        jbConsultarProAdmin.setText("Consultar por Nombre");
        jbConsultarProAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarProAdminActionPerformed(evt);
            }
        });

        jtConsultaProAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "DNI", "C.P", "Población"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtConsultaProAdmin);

        jLabel14.setText("Nombre Proveedor:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbConsultaProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jtfNombreProPoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbConsultarProAdmin)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jcbConsultaProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtfNombreProPoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultarProAdmin))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta Proveedor", jPanel3);

        jLabel13.setText("Id Proveedor:");

        jbEliminarProAdmin.setText("Eliminar");
        jbEliminarProAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarProAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel13)
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbEliminarProAdmin)
                    .addComponent(jcbBajaProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jcbBajaProAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbEliminarProAdmin)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Baja Proveedor", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbCrearProAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearProAdminActionPerformed
        String nombre = jtfNombreProAdmin.getText();
        String apellido = jtfApeProAdmin.getText();
        String dni = jtfDniProAdmin.getText();
        String poblacion = jtfPoblProAdmin.getText();
        int cp = Integer.parseInt(jtfCpProAdmin.getText());

        Proveedor elProveedor = new Proveedor(dni, nombre, apellido, poblacion, cp);
        try {
            elProveedor.crearProveedores();
            JOptionPane.showMessageDialog(null, "Proveedor creado","Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbCrearProAdminActionPerformed

    private void jcbModIdProAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbModIdProAdminActionPerformed
        int proveedorBuscado;
        proveedorBuscado = jcbModIdProAdmin.getSelectedIndex();
        miProveedor = misProveedores.get(proveedorBuscado);
        jtfModNomProAdmin.setText(miProveedor.getNombre_prov());
        jtfModApeProAdmin.setText(miProveedor.getApellidos_prov());
        jtfModDniProAdmin.setText(miProveedor.getDni_prov());
        jtfModPoblProAdmin.setText(miProveedor.getPoblacion_prov());
        jtfModCpProAdmin.setText(String.valueOf(miProveedor.getCp_prov()));
    }//GEN-LAST:event_jcbModIdProAdminActionPerformed

    private void jbModProAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModProAdminActionPerformed
        miProveedor.setIdProveedor(Integer.parseInt((String) jcbModIdProAdmin.getSelectedItem()));
        miProveedor.setNombre_prov(jtfModNomProAdmin.getText());
        miProveedor.setApellidos_prov(jtfModApeProAdmin.getText());
        miProveedor.setDni_prov(jtfModDniProAdmin.getText());
        miProveedor.setPoblacion_prov(jtfModPoblProAdmin.getText());
        miProveedor.setCp_prov(Integer.parseInt(jtfModCpProAdmin.getText()));
        try {
            miProveedor.modificarProveedor();
            JOptionPane.showMessageDialog(null, "Proveedor modificado","Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbModProAdminActionPerformed

    private void jcbConsultaProAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConsultaProAdminActionPerformed
        int proveedorBuscado;
        proveedorBuscado = jcbConsultaProAdmin.getSelectedIndex();
        miProveedor = misProveedores.get(proveedorBuscado);
        jtfNombreProPoAdmin.setText(miProveedor.getNombre_prov());
    }//GEN-LAST:event_jcbConsultaProAdminActionPerformed

    private void jbConsultarProAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarProAdminActionPerformed
        String nombre = null;
        String apellido = null;
        String dni = null;
        int cp = 0;
        String poblacion = null;
        try {
            Proveedor.mostrarProveedor(misProveedores);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < misProveedores.size(); i++) {
            miProveedor = misProveedores.get(i);
            if (miProveedor.getNombre_prov().equals(jtfNombreProPoAdmin.getText()) == true) {
                nombre = miProveedor.getNombre_prov();
                apellido = miProveedor.getApellidos_prov();
                dni = miProveedor.getDni_prov();
                cp = miProveedor.getCp_prov();
                poblacion = miProveedor.getPoblacion_prov();
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) jtConsultaProAdmin.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{(String) nombre, (String) apellido, (String) dni, (Integer) cp, (String) poblacion});

    }//GEN-LAST:event_jbConsultarProAdminActionPerformed

    private void jbEliminarProAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarProAdminActionPerformed
        int idroveedor;
        String comodin;
        comodin = jcbBajaProAdmin.getSelectedItem().toString();
        idroveedor = Integer.parseInt(comodin);
        try {
            miProveedor.borrarProveedorID(idroveedor);
            JOptionPane.showMessageDialog(null, "Proveedor eliminado","Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbEliminarProAdminActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        String stringId;
        jcbModIdProAdmin.setModel(new DefaultComboBoxModel());
        jcbConsultaProAdmin.setModel(new DefaultComboBoxModel());
        jcbBajaProAdmin.setModel(new DefaultComboBoxModel());
        try {
            Proveedor.mostrarProveedor(misProveedores);
            for (int i = 0; i < misProveedores.size(); i++) {
                miProveedor = (Proveedor) misProveedores.get(i);
                stringId = String.valueOf(miProveedor.getIdProveedor());
                System.out.println(stringId);
                jcbModIdProAdmin.addItem(stringId);
                jcbConsultaProAdmin.addItem(stringId);
                jcbBajaProAdmin.addItem(stringId);
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
    private javax.swing.JButton jbConsultarProAdmin;
    private javax.swing.JButton jbCrearProAdmin;
    private javax.swing.JButton jbEliminarProAdmin;
    private javax.swing.JButton jbModProAdmin;
    private javax.swing.JComboBox<String> jcbBajaProAdmin;
    private javax.swing.JComboBox<String> jcbConsultaProAdmin;
    private javax.swing.JComboBox<String> jcbModIdProAdmin;
    private javax.swing.JTable jtConsultaProAdmin;
    private javax.swing.JTextField jtfApeProAdmin;
    private javax.swing.JTextField jtfCpProAdmin;
    private javax.swing.JTextField jtfDniProAdmin;
    private javax.swing.JTextField jtfModApeProAdmin;
    private javax.swing.JTextField jtfModCpProAdmin;
    private javax.swing.JTextField jtfModDniProAdmin;
    private javax.swing.JTextField jtfModNomProAdmin;
    private javax.swing.JTextField jtfModPoblProAdmin;
    private javax.swing.JTextField jtfNombreProAdmin;
    private javax.swing.JTextField jtfNombreProPoAdmin;
    private javax.swing.JTextField jtfPoblProAdmin;
    // End of variables declaration//GEN-END:variables
}
