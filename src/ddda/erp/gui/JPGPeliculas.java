/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.gui;

import ddda.erp.objetos.Pelicula;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class JPGPeliculas extends javax.swing.JPanel {
    ArrayList<Pelicula> misPeliculas = new ArrayList();
    Pelicula miPelicula;
    /**
     * Creates new form JPGPeliculas
     */
    public JPGPeliculas() {
        initComponents();
        
        String stringId;
        String nomPel;

        try {
            
            Pelicula.mostrarPeliculas(misPeliculas);
            for (int i = 0; i < misPeliculas.size(); i++) {
                miPelicula = (Pelicula) misPeliculas.get(i);
                stringId = String.valueOf(miPelicula.getIdPelicula());
                nomPel = String.valueOf(miPelicula.getNombre());
                System.out.println(stringId);
                jcbModIdPeli.addItem(stringId);
                jcbConsId.addItem(stringId);
                jcbBajaPeliID.addItem(stringId);
                jcbBajaPeliNom.addItem(nomPel);
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
        jtfNombrePelicula = new javax.swing.JTextField();
        jspEdadCine = new javax.swing.JSpinner();
        jbAltaPelicula = new javax.swing.JButton();
        jspDuracionPelicula = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcbModIdPeli = new javax.swing.JComboBox<>();
        jtfModNomPeli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfModDuracionPeli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jspModEdad = new javax.swing.JSpinner();
        jbModPeli = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbConsId = new javax.swing.JComboBox<>();
        jtfConsNom = new javax.swing.JTextField();
        jbConsNom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaConsPeli = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcbBajaPeliID = new javax.swing.JComboBox<>();
        jcbBajaPeliNom = new javax.swing.JComboBox<>();
        jbBajaID = new javax.swing.JButton();
        jbBajaNombre = new javax.swing.JButton();

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Duracion:");

        jLabel3.setText("Edad:");

        jbAltaPelicula.setText("Alta Pelicula");
        jbAltaPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaPeliculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtfNombrePelicula)
                        .addComponent(jspEdadCine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbAltaPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addComponent(jspDuracionPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jspDuracionPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jspEdadCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jbAltaPelicula)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alta Pelicula", jPanel1);

        jLabel4.setText("Id Pelicula:");

        jLabel5.setText("Nombre Pelicula:");

        jcbModIdPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbModIdPeliActionPerformed(evt);
            }
        });

        jLabel6.setText("Duracion:");

        jLabel7.setText("Edad:");

        jbModPeli.setText("Modificar pelicula");
        jbModPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModPeliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbModIdPeli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfModNomPeli)
                    .addComponent(jtfModDuracionPeli)
                    .addComponent(jspModEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModPeli, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbModIdPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfModNomPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfModDuracionPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jspModEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jbModPeli)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Pelicula", jPanel2);

        jLabel8.setText("Id Pelicula:");

        jLabel9.setText("Nombre Pelicula:");

        jcbConsId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConsIdActionPerformed(evt);
            }
        });

        jtfConsNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfConsNomActionPerformed(evt);
            }
        });

        jbConsNom.setText("Consultar por Nombre");
        jbConsNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsNomActionPerformed(evt);
            }
        });

        jtaConsPeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "ID", "Duracion", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtaConsPeli);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbConsId, 0, 100, Short.MAX_VALUE)
                            .addComponent(jtfConsNom))
                        .addGap(18, 18, 18)
                        .addComponent(jbConsNom)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbConsId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfConsNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsNom))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar Pelicula", jPanel3);

        jLabel10.setText("Id Pelicula:");

        jLabel11.setText("Id Nombre:");

        jcbBajaPeliID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBajaPeliIDActionPerformed(evt);
            }
        });

        jbBajaID.setText("Baja por ID");
        jbBajaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaIDActionPerformed(evt);
            }
        });

        jbBajaNombre.setText("Baja por Nombre");
        jbBajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbBajaPeliID, 0, 120, Short.MAX_VALUE)
                    .addComponent(jcbBajaPeliNom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbBajaID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBajaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcbBajaPeliID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBajaID))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcbBajaPeliNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBajaNombre))
                .addContainerGap(295, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Baja Pelicula", jPanel4);

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

    private void jtfConsNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfConsNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfConsNomActionPerformed

    private void jbAltaPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaPeliculaActionPerformed
        String nombre = jtfNombrePelicula.getText();
        int duracion = (int) jspDuracionPelicula.getValue();
        int edad = (int) jspEdadCine.getValue();
        
        Pelicula miPelicula = new Pelicula(nombre, duracion, edad);
        try {
            miPelicula.crearPelicula(miPelicula);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAltaPeliculaActionPerformed

    private void jcbModIdPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbModIdPeliActionPerformed
        int peliculaBuscada;
        peliculaBuscada = jcbModIdPeli.getSelectedIndex();
        miPelicula = misPeliculas.get(peliculaBuscada);
        jtfModNomPeli.setText(miPelicula.getNombre());
        jtfModDuracionPeli.setText(String.valueOf(miPelicula.getDuracion()));
        jspModEdad.setValue(miPelicula.getEdad());
    }//GEN-LAST:event_jcbModIdPeliActionPerformed

    private void jbModPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModPeliActionPerformed
        miPelicula.setIdPelicula(Integer.parseInt((String) jcbModIdPeli.getSelectedItem()));
        miPelicula.setNombre(jtfModNomPeli.getText());
        miPelicula.setDuracion(Integer.parseInt(jtfModDuracionPeli.getText()));
        miPelicula.setEdad((int) jspModEdad.getValue());
        try {
            miPelicula.modificarPelicula();
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbModPeliActionPerformed

    private void jcbConsIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConsIdActionPerformed
        int peliculaBuscada;
        peliculaBuscada = jcbConsId.getSelectedIndex();
        miPelicula = misPeliculas.get(peliculaBuscada);
        jtfConsNom.setText(miPelicula.getNombre());
    }//GEN-LAST:event_jcbConsIdActionPerformed

    private void jbConsNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsNomActionPerformed
        String nombre = null;
        int duracion = 0;
        int edad = 0;
        int id = 0;
        try {
            Pelicula.mostrarPeliculas(misPeliculas);
        } catch (SQLException ex) {
            Logger.getLogger(JPGPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < misPeliculas.size(); i++) {
            miPelicula = misPeliculas.get(i);
            if (miPelicula.getNombre().equals(jtfConsNom.getText()) == true) {
                nombre = miPelicula.getNombre();
                id = miPelicula.getIdPelicula();
                duracion = miPelicula.getDuracion();
                edad = miPelicula.getEdad();
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) jtaConsPeli.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{(String) nombre, (Integer) id, (Integer) duracion, (Integer) edad});
    }//GEN-LAST:event_jbConsNomActionPerformed

    private void jcbBajaPeliIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBajaPeliIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbBajaPeliIDActionPerformed

    private void jbBajaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaIDActionPerformed
        int idPelicula;
        String comodin;
        comodin = jcbBajaPeliID.getSelectedItem().toString();
        idPelicula = Integer.parseInt(comodin);
        try {
            miPelicula.borrarPeliculaID(idPelicula);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbBajaIDActionPerformed

    private void jbBajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaNombreActionPerformed
        String nombrePelicula;
        nombrePelicula = (String) jcbBajaPeliNom.getSelectedItem();
        try {
            miPelicula.borrarPeliculaNombre(nombrePelicula);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbBajaNombreActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        String stringId;
        String nomPel;
        jcbModIdPeli.setModel(new DefaultComboBoxModel());
        jcbConsId.setModel(new DefaultComboBoxModel());
        jcbBajaPeliID.setModel(new DefaultComboBoxModel());
        jcbBajaPeliNom.setModel(new DefaultComboBoxModel());
        try {
            
            Pelicula.mostrarPeliculas(misPeliculas);
            for (int i = 0; i < misPeliculas.size(); i++) {
                miPelicula = (Pelicula) misPeliculas.get(i);
                stringId = String.valueOf(miPelicula.getIdPelicula());
                nomPel = String.valueOf(miPelicula.getNombre());
                System.out.println(stringId);
                jcbModIdPeli.addItem(stringId);
                jcbConsId.addItem(stringId);
                jcbBajaPeliID.addItem(stringId);
                jcbBajaPeliNom.addItem(nomPel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JButton jbAltaPelicula;
    private javax.swing.JButton jbBajaID;
    private javax.swing.JButton jbBajaNombre;
    private javax.swing.JButton jbConsNom;
    private javax.swing.JButton jbModPeli;
    private javax.swing.JComboBox<String> jcbBajaPeliID;
    private javax.swing.JComboBox<String> jcbBajaPeliNom;
    private javax.swing.JComboBox<String> jcbConsId;
    private javax.swing.JComboBox<String> jcbModIdPeli;
    private javax.swing.JSpinner jspDuracionPelicula;
    private javax.swing.JSpinner jspEdadCine;
    private javax.swing.JSpinner jspModEdad;
    private javax.swing.JTable jtaConsPeli;
    private javax.swing.JTextField jtfConsNom;
    private javax.swing.JTextField jtfModDuracionPeli;
    private javax.swing.JTextField jtfModNomPeli;
    private javax.swing.JTextField jtfNombrePelicula;
    // End of variables declaration//GEN-END:variables
}
