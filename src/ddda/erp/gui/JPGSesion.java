/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.gui;

import ddda.erp.objetos.Csalasbutacas;
import ddda.erp.objetos.Pelicula;
import ddda.erp.objetos.Sesion;
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
public class JPGSesion extends javax.swing.JPanel {
    ArrayList<Sesion> misSesiones = new ArrayList();
    Sesion miSesion;
    ArrayList<Pelicula> misPeliculas = new ArrayList();
    Pelicula miPelicula;
    ArrayList<Csalasbutacas> misSalas = new ArrayList();
    Csalasbutacas miSala;
    /**
     * Creates new form JPGTurnos
     */
    public JPGSesion() {
        initComponents();
        String stringIdSesion;
        String stringIdSala;
        String stringIdPelicula;
        try {
            Sesion.mostrarSesiones(misSesiones);
            Pelicula.mostrarPeliculas(misPeliculas);
            Csalasbutacas.mostrarSalas(misSalas);
            for (int i = 0; i < misSesiones.size(); i++) {
                miSesion = (Sesion) misSesiones.get(i);
                stringIdSesion = String.valueOf(miSesion.getIdSesion());
                jcbIdSesionConsulta.addItem(stringIdSesion);
                jcbModificarIdSesion.addItem(stringIdSesion);
                jcbBajaIdSesion.addItem(stringIdSesion);
            }
            for (int i = 0; i < misPeliculas.size(); i++) {
                miPelicula = (Pelicula) misPeliculas.get(i);
                stringIdPelicula = String.valueOf(miPelicula.getIdPelicula());
                jcbIdPeliculaCrearSesion.addItem(stringIdPelicula);
                jcbIdPeliculaConsultaSesion.addItem(stringIdPelicula);
                jcbIdPeliculaModSesion.addItem(stringIdPelicula);
            }
            for (int i = 0; i < misSalas.size(); i++) {
                miSala = (Csalasbutacas) misSalas.get(i);
                stringIdSala = String.valueOf(miSala.getIdSala());
                jcbIdSalaCrearSesion.addItem(stringIdSala);
                jcbIdSalaSesionAlta.addItem(stringIdSala);
                jcbIdSalaModSesion.addItem(stringIdSala);
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
        jLabel3 = new javax.swing.JLabel();
        jtfHoraSesionAlta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbCrearSesionAlta = new javax.swing.JButton();
        jcbIdPeliculaCrearSesion = new javax.swing.JComboBox<>();
        jcbIdSalaCrearSesion = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcbIdSesionConsulta = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcbIdPeliculaConsultaSesion = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcbIdSalaSesionAlta = new javax.swing.JComboBox<>();
        jbConsultaSesion = new javax.swing.JButton();
        jbConsultaIdPelicula = new javax.swing.JButton();
        jbConsultaIdSala = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultaSesion = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jcbModificarIdSesion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtfModificaHoraSesion = new javax.swing.JTextField();
        jbModificaSesion = new javax.swing.JButton();
        jcbIdPeliculaModSesion = new javax.swing.JComboBox<>();
        jcbIdSalaModSesion = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jcbBajaIdSesion = new javax.swing.JComboBox<>();
        jbEliminarSesion = new javax.swing.JButton();

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel1.setText("Id Pelicula:");

        jLabel3.setText("Hora:");

        jLabel4.setText("Id Sala:");

        jbCrearSesionAlta.setText("Crear Sesion");
        jbCrearSesionAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearSesionAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCrearSesionAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtfHoraSesionAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addComponent(jcbIdPeliculaCrearSesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbIdSalaCrearSesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbIdPeliculaCrearSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfHoraSesionAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbIdSalaCrearSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbCrearSesionAlta)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alta Sesion", jPanel1);

        jLabel5.setText("Id Sesión:");

        jLabel6.setText("Id Película:");

        jLabel7.setText("Id Sala:");

        jbConsultaSesion.setText("Consultar por Sesión");
        jbConsultaSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaSesionActionPerformed(evt);
            }
        });

        jbConsultaIdPelicula.setText("Consultar por Película");
        jbConsultaIdPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaIdPeliculaActionPerformed(evt);
            }
        });

        jbConsultaIdSala.setText("Consultar por Sala");
        jbConsultaIdSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaIdSalaActionPerformed(evt);
            }
        });

        jtConsultaSesion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Sesión", "Id Película", "Hora", "Id Sala"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtConsultaSesion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(38, 38, 38)
                                .addComponent(jcbIdPeliculaConsultaSesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(53, 53, 53)
                                .addComponent(jcbIdSalaSesionAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbIdSesionConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbConsultaIdPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbConsultaSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbConsultaIdSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbIdSesionConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultaSesion))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbIdPeliculaConsultaSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultaIdPelicula))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbIdSalaSesionAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultaIdSala))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar Sesion", jPanel2);

        jLabel8.setText("Id Sesión:");

        jcbModificarIdSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbModificarIdSesionActionPerformed(evt);
            }
        });

        jLabel9.setText("Id Película:");

        jLabel10.setText("Id Sala:");

        jLabel11.setText("Hora:");

        jbModificaSesion.setText("Modificar");
        jbModificaSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificaSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbModificaSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jcbModificarIdSesion, 0, 109, Short.MAX_VALUE)
                        .addComponent(jtfModificaHoraSesion)
                        .addComponent(jcbIdPeliculaModSesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbIdSalaModSesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbModificarIdSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcbIdPeliculaModSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcbIdSalaModSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfModificaHoraSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbModificaSesion)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Sesion", jPanel3);

        jLabel12.setText("Id Sesión:");

        jbEliminarSesion.setText("Eliminar");
        jbEliminarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbEliminarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jcbBajaIdSesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jcbBajaIdSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbEliminarSesion)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Baja Sesion", jPanel4);

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

    private void jbCrearSesionAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearSesionAltaActionPerformed
        int idPelicula = Integer.parseInt((String) jcbIdPeliculaCrearSesion.getSelectedItem());
        int idSala = Integer.parseInt((String) jcbIdSalaCrearSesion.getSelectedItem());
        String hora = (jtfHoraSesionAlta.getText());

        Sesion laSesion = new Sesion(idPelicula, idSala, hora);
        try {
            laSesion.crearSesion();
            JOptionPane.showMessageDialog(null, "Sesion creada","Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            //Creamos las butacas para la sesion
            Sesion.crearButacasSesion(idSala,6 , 10);
        } catch (SQLException ex) {
            Logger.getLogger(JPGSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbCrearSesionAltaActionPerformed

    private void jbConsultaSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaSesionActionPerformed
        int idPelicula = 0;
        String hora = null;
        int idSala = 0;
        int idSesion2 = Integer.parseInt((String) jcbIdSesionConsulta.getSelectedItem());
        int idSesion= 0;
        try {
            Sesion.mostrarSesiones(misSesiones);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < misSesiones.size(); i++) {
            miSesion = misSesiones.get(i);
            if ((miSesion.getIdSesion() == (idSesion2)) == true) {
                idSesion = miSesion.getIdSesion();
                idPelicula = miSesion.getIdPelicula();
                hora = miSesion.getHora_ses();
                idSala = miSesion.getIdSala();
            }
        }
        DefaultTableModel model = (DefaultTableModel) jtConsultaSesion.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{(Integer) idSesion, (Integer) idPelicula, (String) hora, (Integer) idSala});

    }//GEN-LAST:event_jbConsultaSesionActionPerformed

    private void jbConsultaIdPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaIdPeliculaActionPerformed
        int idPelicula = 0;
        String hora = null;
        int idSala = 0;
        int idPelicula2 = Integer.parseInt((String) jcbIdPeliculaConsultaSesion.getSelectedItem());
        int idSesion= 0;
        try {
            Sesion.mostrarSesiones(misSesiones);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < misSesiones.size(); i++) {
            miSesion = misSesiones.get(i);
            if ((miSesion.getIdPelicula() == (idPelicula2)) == true) {
                idSesion = miSesion.getIdSesion();
                idPelicula = miSesion.getIdPelicula();
                hora = miSesion.getHora_ses();
                idSala = miSesion.getIdSala();
            }
        }
        DefaultTableModel model = (DefaultTableModel) jtConsultaSesion.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{(Integer) idSesion, (Integer) idPelicula, (String) hora, (Integer) idSala});

    }//GEN-LAST:event_jbConsultaIdPeliculaActionPerformed

    private void jbConsultaIdSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaIdSalaActionPerformed
        int idPelicula = 0;
        String hora = null;
        int idSala = 0;
        int idSala2 = Integer.parseInt((String) jcbIdSalaSesionAlta.getSelectedItem());
        int idSesion= 0;
        try {
            Sesion.mostrarSesiones(misSesiones);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < misSesiones.size(); i++) {
            miSesion = misSesiones.get(i);
            if ((miSesion.getIdSala() == (idSala2)) == true) {
                idSesion = miSesion.getIdSesion();
                idPelicula = miSesion.getIdPelicula();
                hora = miSesion.getHora_ses();
                idSala = miSesion.getIdSala();
            }
        }
        DefaultTableModel model = (DefaultTableModel) jtConsultaSesion.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{(Integer) idSesion, (Integer) idPelicula, (String) hora, (Integer) idSala});

    }//GEN-LAST:event_jbConsultaIdSalaActionPerformed

    private void jbModificaSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificaSesionActionPerformed
        miSesion.setIdSesion(Integer.parseInt((String) jcbModificarIdSesion.getSelectedItem()));
        miSesion.setIdPelicula(Integer.parseInt((String) jcbIdPeliculaModSesion.getSelectedItem()));
        miSesion.setIdSala(Integer.parseInt((String) jcbIdSalaModSesion.getSelectedItem()));
        miSesion.setHora_ses(jtfModificaHoraSesion.getText());
        try {
            miSesion.modificarSesion();
            JOptionPane.showMessageDialog(null, "Sesion modificada","Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbModificaSesionActionPerformed

    private void jcbModificarIdSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbModificarIdSesionActionPerformed
        int sesionBuscada;
        sesionBuscada = jcbModificarIdSesion.getSelectedIndex();
        miSesion = misSesiones.get(sesionBuscada);
        jcbIdPeliculaModSesion.setSelectedItem(String.valueOf(miSesion.getIdPelicula()));
        jcbIdSalaModSesion.setSelectedItem(String.valueOf(miSesion.getIdSala()));
        jtfModificaHoraSesion.setText(miSesion.getHora_ses());
    }//GEN-LAST:event_jcbModificarIdSesionActionPerformed

    private void jbEliminarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarSesionActionPerformed
        int idSesion;
        String comodin;
        comodin = jcbBajaIdSesion.getSelectedItem().toString();
        idSesion = Integer.parseInt(comodin);
        try {
            miSesion.borrarSesionID(idSesion);
            JOptionPane.showMessageDialog(null, "Sesion borrada","Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(JPGCinesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbEliminarSesionActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        String stringIdSesion;
        String stringIdSala;
        String stringIdPelicula;
        jcbIdSesionConsulta.setModel(new DefaultComboBoxModel());
        jcbModificarIdSesion.setModel(new DefaultComboBoxModel());
        jcbBajaIdSesion.setModel(new DefaultComboBoxModel());
        jcbIdPeliculaCrearSesion.setModel(new DefaultComboBoxModel());
        jcbIdPeliculaConsultaSesion.setModel(new DefaultComboBoxModel());
        jcbIdPeliculaModSesion.setModel(new DefaultComboBoxModel());
        jcbIdSalaCrearSesion.setModel(new DefaultComboBoxModel());
        jcbIdSalaSesionAlta.setModel(new DefaultComboBoxModel());
        jcbIdSalaModSesion.setModel(new DefaultComboBoxModel());
        try {
            Sesion.mostrarSesiones(misSesiones);
            Pelicula.mostrarPeliculas(misPeliculas);
            Csalasbutacas.mostrarSalas(misSalas);
            for (int i = 0; i < misSesiones.size(); i++) {
                miSesion = (Sesion) misSesiones.get(i);
                stringIdSesion = String.valueOf(miSesion.getIdSesion());
                jcbIdSesionConsulta.addItem(stringIdSesion);
                jcbModificarIdSesion.addItem(stringIdSesion);
                jcbBajaIdSesion.addItem(stringIdSesion);
            }
            for (int i = 0; i < misPeliculas.size(); i++) {
                miPelicula = (Pelicula) misPeliculas.get(i);
                stringIdPelicula = String.valueOf(miPelicula.getIdPelicula());
                jcbIdPeliculaCrearSesion.addItem(stringIdPelicula);
                jcbIdPeliculaConsultaSesion.addItem(stringIdPelicula);
                jcbIdPeliculaModSesion.addItem(stringIdPelicula);
            }
            for (int i = 0; i < misSalas.size(); i++) {
                miSala = (Csalasbutacas) misSalas.get(i);
                stringIdSala = String.valueOf(miSala.getIdSala());
                jcbIdSalaCrearSesion.addItem(stringIdSala);
                jcbIdSalaSesionAlta.addItem(stringIdSala);
                jcbIdSalaModSesion.addItem(stringIdSala);
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
    private javax.swing.JButton jbConsultaIdPelicula;
    private javax.swing.JButton jbConsultaIdSala;
    private javax.swing.JButton jbConsultaSesion;
    private javax.swing.JButton jbCrearSesionAlta;
    private javax.swing.JButton jbEliminarSesion;
    private javax.swing.JButton jbModificaSesion;
    private javax.swing.JComboBox<String> jcbBajaIdSesion;
    private javax.swing.JComboBox<String> jcbIdPeliculaConsultaSesion;
    private javax.swing.JComboBox<String> jcbIdPeliculaCrearSesion;
    private javax.swing.JComboBox<String> jcbIdPeliculaModSesion;
    private javax.swing.JComboBox<String> jcbIdSalaCrearSesion;
    private javax.swing.JComboBox<String> jcbIdSalaModSesion;
    private javax.swing.JComboBox<String> jcbIdSalaSesionAlta;
    private javax.swing.JComboBox<String> jcbIdSesionConsulta;
    private javax.swing.JComboBox<String> jcbModificarIdSesion;
    private javax.swing.JTable jtConsultaSesion;
    private javax.swing.JTextField jtfHoraSesionAlta;
    private javax.swing.JTextField jtfModificaHoraSesion;
    // End of variables declaration//GEN-END:variables
}
