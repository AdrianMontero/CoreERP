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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class JPGProveedoresEmp extends javax.swing.JPanel {
    ArrayList<Proveedor> misProveedores = new ArrayList();
    Proveedor miProveedor;
    /**
     * Creates new form JPGProovedoresEmp
     */
    public JPGProveedoresEmp() {
        initComponents();
        String stringId;

        try {
            Proveedor.mostrarProveedor(misProveedores);
            for (int i = 0; i < misProveedores.size(); i++) {
                miProveedor = (Proveedor) misProveedores.get(i);
                stringId = String.valueOf(miProveedor.getIdProveedor());
                System.out.println(stringId);
                jcbConsultaProEmp.addItem(stringId);
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

        jlNombre = new javax.swing.JLabel();
        jtfNombreProEmp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultarProEmp = new javax.swing.JTable();
        jbBuscar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jcbConsultaProEmp = new javax.swing.JComboBox<>();

        jlNombre.setText("Nombre proveedor:");

        jtfNombreProEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreProEmpActionPerformed(evt);
            }
        });

        jtConsultarProEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apellido", "Poblacion", "DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtConsultarProEmp);

        jbBuscar.setText("Buscar por Nombre");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel12.setText("Id Proveedor:");

        jcbConsultaProEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConsultaProEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jlNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbConsultaProEmp, 0, 112, Short.MAX_VALUE)
                            .addComponent(jtfNombreProEmp))
                        .addGap(30, 30, 30)
                        .addComponent(jbBuscar)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jcbConsultaProEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombreProEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombreProEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreProEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreProEmpActionPerformed

    private void jcbConsultaProEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConsultaProEmpActionPerformed
        int proveedorBuscado;
        proveedorBuscado = jcbConsultaProEmp.getSelectedIndex();
        miProveedor = misProveedores.get(proveedorBuscado);
        jtfNombreProEmp.setText(miProveedor.getNombre_prov());
    }//GEN-LAST:event_jcbConsultaProEmpActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
         String apellido = null;
        String dni = null;
        String poblacion = null;
        try {
            Proveedor.mostrarProveedor(misProveedores);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < misProveedores.size(); i++) {
            miProveedor = misProveedores.get(i);
            if (miProveedor.getNombre_prov().equals(jtfNombreProEmp.getText()) == true) {
                apellido = miProveedor.getApellidos_prov();
                dni = miProveedor.getDni_prov();
                poblacion = miProveedor.getPoblacion_prov();
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) jtConsultarProEmp.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{(String) apellido, (String) poblacion, (String) dni});

    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<String> jcbConsultaProEmp;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTable jtConsultarProEmp;
    private javax.swing.JTextField jtfNombreProEmp;
    // End of variables declaration//GEN-END:variables
}
