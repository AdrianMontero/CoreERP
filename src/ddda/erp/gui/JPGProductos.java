/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.gui;


import ddda.erp.objetos.Producto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class JPGProductos extends javax.swing.JPanel {
    ArrayList<Producto> misPro = new ArrayList();
    Producto miPro;
    /**
     * Creates new form JPGProductos
     */
    public JPGProductos() {
        initComponents();
        String id;
        try {
            Producto.mostrarProducto(misPro);
            for (int i = 0; i < misPro.size(); i++) {
                miPro = (Producto) misPro.get(i);
                id = String.valueOf(miPro.getIdProducto());
                jcbConsultaIdProducto.addItem(id);
                jcbBajaIdProdcuto.addItem(id);
                jcbModificarIdProducto.addItem(id);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNombreProducto = new javax.swing.JTextField();
        jsPrecioProducto = new javax.swing.JSpinner();
        jsCantidadProducto = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jbAltaProducto = new javax.swing.JButton();
        jtfDescripProd = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jcbBajaIdProdcuto = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jcbModificarIdProducto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtfModificarNombreProducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jsModificarCantidad = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jsModificarPrecioProducto = new javax.swing.JSpinner();
        jbModificarProducto = new javax.swing.JButton();
        jtfModProd = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jcbConsultaIdProducto = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtConsultaProducto = new javax.swing.JTable();
        jbConsultarProductoNombre = new javax.swing.JButton();
        jtfConsNomProd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtfPrecioCons = new javax.swing.JTextField();
        jbConsPrecioPro = new javax.swing.JButton();

        jLabel1.setText("Nombre Producto:");

        jLabel2.setText("Precio:");

        jLabel3.setText("Cantidad:");

        jLabel4.setText("Descripción:");

        jbAltaProducto.setText("Alta Producto");
        jbAltaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jsCantidadProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jsPrecioProducto)
                            .addComponent(jtfDescripProd)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jbAltaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jsPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jsCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfDescripProd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addComponent(jbAltaProducto)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alta Producto", jPanel1);

        jLabel5.setText("Id Producto:");

        jbEliminar.setText("Eliminar Producto");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jcbBajaIdProdcuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBajaIdProdcutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbBajaIdProdcuto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbBajaIdProdcuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jbEliminar)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Baja Producto", jPanel2);

        jLabel6.setText("Id Producto:");

        jcbModificarIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbModificarIdProductoActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre Producto:");

        jLabel8.setText("Cantidad:");

        jLabel9.setText("Descripción:");

        jLabel10.setText("Precio:");

        jbModificarProducto.setText("Modificar");
        jbModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbModificarIdProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfModificarNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jsModificarPrecioProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(jsModificarCantidad, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jtfModProd))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbModificarIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jtfModificarNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsModificarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jsModificarPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jtfModProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jbModificarProducto)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Producto", jPanel3);

        jLabel11.setText("Id Producto:");

        jcbConsultaIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConsultaIdProductoActionPerformed(evt);
            }
        });

        jLabel12.setText("Nombre Producto:");

        jtConsultaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Producto", "Nombre", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtConsultaProducto);

        jbConsultarProductoNombre.setText("Consultar por Nombre");
        jbConsultarProductoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarProductoNombreActionPerformed(evt);
            }
        });

        jLabel13.setText("Precio producto:");

        jbConsPrecioPro.setText("Consultar por Precio");
        jbConsPrecioPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsPrecioProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbConsultaIdProducto, 0, 90, Short.MAX_VALUE)
                            .addComponent(jtfConsNomProd)
                            .addComponent(jtfPrecioCons))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbConsultarProductoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbConsPrecioPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcbConsultaIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jbConsultarProductoNombre)
                    .addComponent(jtfConsNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtfPrecioCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsPrecioPro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jTabbedPane1.addTab("Consultar Producto", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbAltaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaProductoActionPerformed
        // TODO add your handling code here:
        String nombre = jtfNombreProducto.getText();
        int precio = (int) jsPrecioProducto.getValue();
        int cantidad = (int) jsCantidadProducto.getValue();
        String descripcion = jtfDescripProd.getText();
        
        Producto pro = new Producto(descripcion, precio, nombre, cantidad);
        try {
            pro.crearProducto();
        } catch (SQLException ex) {
            Logger.getLogger(JPGProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAltaProductoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        int idPro;
        String comodin;
        comodin = jcbBajaIdProdcuto.getSelectedItem().toString();
        idPro = Integer.parseInt(comodin);
        try {
            miPro.borrarProductoID(idPro);
        } catch (SQLException ex) {
            Logger.getLogger(JPGProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarProductoActionPerformed
        // TODO add your handling code here:
        miPro.setNombre_prod(jtfModificarNombreProducto.getText());
        miPro.setDescripcion_prod(jtfModProd.getText());
        miPro.setStock_prod((int) jsModificarCantidad.getValue());
        miPro.setPrecio_prod((int) jsModificarPrecioProducto.getValue());
        try {
            miPro.modificarProducto();
        } catch (SQLException ex) {
            Logger.getLogger(JPGProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbModificarProductoActionPerformed

    private void jcbModificarIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbModificarIdProductoActionPerformed
        // TODO add your handling code here:
        int prodBuscado;
        prodBuscado = jcbModificarIdProducto.getSelectedIndex();
        miPro = misPro.get(prodBuscado);
        jtfModificarNombreProducto.setText(miPro.getNombre_prod());
        jsModificarCantidad.setValue(miPro.getStock_prod());
        jsModificarPrecioProducto.setValue(miPro.getPrecio_prod());
        jtfModProd.setText(miPro.getDescripcion_prod());
    }//GEN-LAST:event_jcbModificarIdProductoActionPerformed

    private void jbConsultarProductoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarProductoNombreActionPerformed
        // TODO add your handling code here:
        String nombre = null;
        int cantidad = 0;
        int precio = 0;
        int idProd = 0;
        try {
            miPro.mostrarProducto(misPro);
        } catch (SQLException ex) {
            Logger.getLogger(JPGProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < misPro.size(); i++) {
            miPro = misPro.get(i);
            if (miPro.getNombre_prod().equals(jtfConsNomProd.getText()) == true) {
                nombre = miPro.getNombre_prod();
                cantidad = miPro.getStock_prod();
                precio = miPro.getPrecio_prod();
                idProd = miPro.getIdProducto();
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) jtConsultaProducto.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{(Integer) idProd,(String) nombre, (Integer) precio, (Integer) cantidad});
    }//GEN-LAST:event_jbConsultarProductoNombreActionPerformed

    private void jcbConsultaIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConsultaIdProductoActionPerformed
        // TODO add your handling code here:
        int prodBuscado;
        prodBuscado = jcbConsultaIdProducto.getSelectedIndex();
        miPro = misPro.get(prodBuscado);
        jtfConsNomProd.setText(miPro.getNombre_prod());
        jtfPrecioCons.setText(String.valueOf(miPro.getPrecio_prod()));
    }//GEN-LAST:event_jcbConsultaIdProductoActionPerformed

    private void jbConsPrecioProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsPrecioProActionPerformed
        // TODO add your handling code here:
        String nombre = null;
        int cantidad = 0;
        int precio = 0;
        int idProd = 0;
        try {
            miPro.mostrarProducto(misPro);
        } catch (SQLException ex) {
            Logger.getLogger(JPGProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < misPro.size(); i++) {
            miPro = misPro.get(i);
            if (miPro.getPrecio_prod() == (Integer.parseInt(jtfPrecioCons.getText())) == true) {
                nombre = miPro.getNombre_prod();
                cantidad = miPro.getStock_prod();
                precio = miPro.getPrecio_prod();
                idProd = miPro.getIdProducto();
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) jtConsultaProducto.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{(Integer) idProd,(String) nombre, (Integer) precio, (Integer) cantidad});
    }//GEN-LAST:event_jbConsPrecioProActionPerformed

    private void jcbBajaIdProdcutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBajaIdProdcutoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcbBajaIdProdcutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbAltaProducto;
    private javax.swing.JButton jbConsPrecioPro;
    private javax.swing.JButton jbConsultarProductoNombre;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificarProducto;
    private javax.swing.JComboBox<String> jcbBajaIdProdcuto;
    private javax.swing.JComboBox<String> jcbConsultaIdProducto;
    private javax.swing.JComboBox<String> jcbModificarIdProducto;
    private javax.swing.JSpinner jsCantidadProducto;
    private javax.swing.JSpinner jsModificarCantidad;
    private javax.swing.JSpinner jsModificarPrecioProducto;
    private javax.swing.JSpinner jsPrecioProducto;
    private javax.swing.JTable jtConsultaProducto;
    private javax.swing.JTextField jtfConsNomProd;
    private javax.swing.JTextField jtfDescripProd;
    private javax.swing.JTextField jtfModProd;
    private javax.swing.JTextField jtfModificarNombreProducto;
    private javax.swing.JTextField jtfNombreProducto;
    private javax.swing.JTextField jtfPrecioCons;
    // End of variables declaration//GEN-END:variables
}
