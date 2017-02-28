/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.gui;

import ddda.erp.objetos.CuerpoPedido;
import ddda.erp.objetos.Producto;
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
public class JPGPedidosAdmin extends javax.swing.JPanel {
    CuerpoPedido cp;
    Producto pro;
    Proveedor prov;
    ArrayList<Producto> misPro = new ArrayList();
    ArrayList<Proveedor> misProv = new ArrayList();
    DefaultTableModel model;

    /**
     * Creates new form JPGPedidosEmp
     */
    public JPGPedidosAdmin() {
        initComponents();
        model = (DefaultTableModel) jtAddPedido.getModel();
        model.setRowCount(0);
        String stringId;
        int idProv;
        int idProd;
        try {
            Producto.mostrarProducto(misPro);
            for (int i = 0; i < misPro.size(); i++) {
                pro = (Producto) misPro.get(i);
                idProd = pro.getIdProducto();
                stringId = pro.getNombre_prod();
                System.out.println(stringId);
                jcbAddPedido.addItem(String.valueOf(idProd));
                jcbBajaIdPedido.addItem(stringId);
                jcbConsIdPedido.addItem(stringId);
            }
            Proveedor.mostrarProveedor(misProv);
            for (int i = 0; i < misProv.size(); i++) {
                prov = (Proveedor) misProv.get(i);
                idProv = prov.getIdProveedor();
                jcbProvPedidos.addItem(String.valueOf(idProv));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JPGPedidosAdmin.class.getName()).log(Level.SEVERE, null, ex);
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbAddPedido = new javax.swing.JButton();
        jbAddProducto = new javax.swing.JButton();
        jcbAddPedido = new javax.swing.JComboBox<>();
        jsAddPedido = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtAddPedido = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jcbProvPedidos = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jspModPedido = new javax.swing.JSpinner();
        jcbModPedido = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbModIdPedido = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcbConsIdPedido = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcbBajaIdPedido = new javax.swing.JComboBox<>();
        jbEliminarPedido = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel1.setText("Producto:");

        jLabel3.setText("Cantidad:");

        jbAddPedido.setText("Añadir Pedido");
        jbAddPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddPedidoActionPerformed(evt);
            }
        });

        jbAddProducto.setText("Añadir Producto");
        jbAddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddProductoActionPerformed(evt);
            }
        });

        jcbAddPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAddPedidoActionPerformed(evt);
            }
        });

        jtAddPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idProducto", "idProveedor", "Cantidad", "Precio", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtAddPedido);

        jLabel8.setText("Proveedores:");

        jcbProvPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProvPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbAddPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(jsAddPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jcbProvPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbAddProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jbAddPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbAddPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jsAddPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbProvPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAddProducto)
                    .addComponent(jbAddPedido))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        jTabbedPane1.addTab("Alta Pedido", jPanel2);

        jLabel4.setText("Producto:");

        jLabel6.setText("Cantidad:");

        jbModificar.setText("Modificar Pedido");

        jLabel2.setText("ID Pedido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jspModPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbModPedido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbModIdPedido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jcbModIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbModPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jspModPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jbModificar)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Pedido", jPanel1);

        jLabel7.setText("ID Pedido:");

        jbBuscar.setText("Buscar Pedido");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Producto", "Cantidad", "Precio Sin IVA", "Precio Con IVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addGap(45, 45, 45)
                        .addComponent(jcbConsIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jbBuscar)
                    .addComponent(jcbConsIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta Pedido", jPanel3);

        jLabel5.setText("Id Pedido:");

        jbEliminarPedido.setText("Eliminar Pedido");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbEliminarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbBajaIdPedido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbBajaIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jbEliminarPedido)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Baja Pedido", jPanel4);

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

    private void jbAddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddProductoActionPerformed
        // TODO add your handling code here:
        String idProd = jcbAddPedido.getSelectedItem().toString();
        int cantidad = (int) jsAddPedido.getValue();
        int precio;
        String idProv = jcbProvPedidos.getSelectedItem().toString();
        precio = pro.getPrecio_prod() * cantidad;
        String desc = pro.getDescripcion_prod();
        model.addRow(new Object[]{(String) idProd,(String) idProv, (int) cantidad, (int) precio, (String) desc});
    }//GEN-LAST:event_jbAddProductoActionPerformed

    private void jcbAddPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAddPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAddPedidoActionPerformed

    private void jbAddPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddPedidoActionPerformed
        // TODO add your handling code here:
        int cols = jtAddPedido.getColumnCount();
        int fils = jtAddPedido.getRowCount();
        String nombre;
        int idProd;
        int cantidad;
        int precio = 0;
        String idProv = null;
        int idPedido = 0;
        CuerpoPedido cp = new CuerpoPedido();
        for (int i = 0; i < fils; i++) {
            idProv = (String) jtAddPedido.getValueAt(i, 1);
            precio = precio + (int) jtAddPedido.getValueAt(i, 4);
            for (int j = 0; j < cols; j++) {
            }
        }
        try {
            cp.crearCabeceraPedido(precio, idProv);
            idPedido = cp.recuperarIdPedido();
        } catch (SQLException ex) {
            Logger.getLogger(JPGPedidosAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < fils; i++) {
            idProd = (int) jtAddPedido.getValueAt(i, 0);
            cantidad = (int) jtAddPedido.getValueAt(i, 2);
            nombre = (String) jtAddPedido.getValueAt(i, 4);
            cp = new CuerpoPedido(idProd,nombre,cantidad);
            try {
                cp.crearCuerpoPedido(idPedido);
            } catch (SQLException ex) {
                Logger.getLogger(JPGPedidosAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (int j = 0; j < cols; j++) {
            }
            
        }
    }//GEN-LAST:event_jbAddPedidoActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jcbProvPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProvPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProvPedidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAddPedido;
    private javax.swing.JButton jbAddProducto;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminarPedido;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcbAddPedido;
    private javax.swing.JComboBox<String> jcbBajaIdPedido;
    private javax.swing.JComboBox<String> jcbConsIdPedido;
    private javax.swing.JComboBox<String> jcbModIdPedido;
    private javax.swing.JComboBox<String> jcbModPedido;
    private javax.swing.JComboBox<String> jcbProvPedidos;
    private javax.swing.JSpinner jsAddPedido;
    private javax.swing.JSpinner jspModPedido;
    private javax.swing.JTable jtAddPedido;
    // End of variables declaration//GEN-END:variables
}
