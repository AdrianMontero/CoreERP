/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.gui;

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
public class JPGEmpleadoEmp extends javax.swing.JPanel {
    ArrayList<Empleado> misEmpleados = new ArrayList();
    Empleado miEmpleado;
    /**
     * Creates new form JPGEmpleadoEmp
     */
    public JPGEmpleadoEmp() {
        initComponents();
        String stringId;
        try {
            Empleado.mostrarEmpleados(misEmpleados);
            for (int i = 0; i < misEmpleados.size(); i++) {
                miEmpleado = (Empleado) misEmpleados.get(i);
                stringId = String.valueOf(miEmpleado.getIdEmpleado());
                System.out.println(stringId);
                jcbIdEmpleEmp.addItem(stringId);

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

        jbBuscar = new javax.swing.JButton();
        jtfNombreEmpleado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleadoEmp = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbIdEmpleEmp = new javax.swing.JComboBox<>();

        jbBuscar.setText("Buscar por Nombre");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtEmpleadoEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apellido", "Fecha Inicio", "Cargo", "DNI", "IdCine"
            }
        ));
        jScrollPane1.setViewportView(jtEmpleadoEmp);

        jLabel1.setText("Nombre empleado:");

        jLabel2.setText("Id Empleado:");

        jcbIdEmpleEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbIdEmpleEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jcbIdEmpleEmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbIdEmpleEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbIdEmpleEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbIdEmpleEmpActionPerformed
        int empleadoBuscado;
        empleadoBuscado = jcbIdEmpleEmp.getSelectedIndex();
        miEmpleado = misEmpleados.get(empleadoBuscado);
        jtfNombreEmpleado.setText(miEmpleado.getNombre());
    }//GEN-LAST:event_jcbIdEmpleEmpActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        String apellido = null;
        String fechaInicio = null;
        String cargo = null;
        String dni = null;
        int idCine = 0;
        try {
            Empleado.mostrarEmpleados(misEmpleados);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < misEmpleados.size(); i++) {
            miEmpleado = misEmpleados.get(i);
            if (miEmpleado.getNombre().equals(jtfNombreEmpleado.getText()) == true) {
                apellido = miEmpleado.getApellido();
                fechaInicio = miEmpleado.getFechaInicio();
                cargo = miEmpleado.getCargo();
                dni = miEmpleado.getDni();
                idCine = miEmpleado.getIdCine();
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) jtEmpleadoEmp.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{(String) apellido, (String) fechaInicio, (String) cargo,(String) dni, (Integer) idCine});

    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<String> jcbIdEmpleEmp;
    private javax.swing.JTable jtEmpleadoEmp;
    private javax.swing.JTextField jtfNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
