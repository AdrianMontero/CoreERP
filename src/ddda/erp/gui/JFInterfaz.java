/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.gui;

import ddda.erp.objetos.Empleado;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Daniel
 */
public class JFInterfaz extends javax.swing.JFrame {

    JPInicio inicio = new JPInicio();//Inicio
    Empleado emp = new Empleado();
    
    JPGCinesAdmin jpgca = new JPGCinesAdmin();//Cines Administrador
    JPGPeliculas jpgpeli = new JPGPeliculas();//Peliculas
    JPGCinesEmp jpgce = new JPGCinesEmp(); //Cines Empleado
    JPGEmpAdmin jpgea = new JPGEmpAdmin(); //Empleado Administrador
    JPGEmpleadoEmp jpgee = new JPGEmpleadoEmp();//Empleado Empleado
    JPGClientes jpgc = new JPGClientes();//Clientes
    JPGProveedoresAdmin jpgproadmin = new JPGProveedoresAdmin();//Proveedor Administrador
    JPGProveedoresEmp jpgproemp = new JPGProveedoresEmp();//Proveedor Empleado
    JPGSesion jpgse = new JPGSesion();//Sesion 
    JPGPedidosAdmin jpgpedadmin = new JPGPedidosAdmin();//Pedidos Administrador
    JPGPedidosEmp jpgpedidos = new JPGPedidosEmp();//Pedidos empleado*******************
    JPGReservas jpgreservas = new JPGReservas();//Reservas********************************************
    JPGProductos jpgprouctos = new JPGProductos();//Productos****************************************
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static String cargo = "No Registrado";
    
    

    /**
     * Creates new form JFInterfaz
     */
    public JFInterfaz() {
        initComponents();
        this.getContentPane().add(inicio);
//        this.getContentPane().add(jpgpedadmin);//Cines Empleado
//        this.getContentPane().add(jpgca);//Cines Administrador
//        this.getContentPane().add(jpgpeli);//Peliculas
//        this.getContentPane().add(jpgea);//Empleado Administrador
//        this.getContentPane().add(jpgee);//Empleado Empleado
//        this.getContentPane().add(jpgc);//Cliente
//        this.getContentPane().add(jpgproadmin);//Proveedor Administrador 
//        this.getContentPane().add(jpgproemp);//Proveedor Empleado
//        this.getContentPane().add(jpgse);//Sesion
//        this.getContentPane().add(jpgpedadmin);//Pedidos Administrador
//        this.getContentPane().add(jpgpedidos);
//        this.getContentPane().add(jpgprouctos);//Productos
//        this.getContentPane().add(jpgreservas);//Reservas.
            jmAdministrador.setVisible(false);
            jmEmpleados.setVisible(false);

        if(cargo.equals("Administrador")){
            jmAdministrador.setVisible(true);
            jmEmpleados.setVisible(false);
            jpInicioSesion.setVisible(false);
        }else if(cargo.equals("Empleado")){
            jmEmpleados.setVisible(true);
            jmAdministrador.setVisible(false);
            jpInicioSesion.setVisible(false);
        }else{
            jmEmpleados.setVisible(false);
            jmAdministrador.setVisible(false);
        }


        this.setVisible(true);
//      this.setBounds(0, 0, screenSize.width, screenSize.height);
        this.setBounds(0, 0, 700, 600);
        this.setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpInicioSesion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfPass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbCargo = new javax.swing.JComboBox<>();
        jbEntrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmEmpleados = new javax.swing.JMenu();
        jmCineEmp = new javax.swing.JMenuItem();
        jmClienteEmp = new javax.swing.JMenuItem();
        jmEmpEmp = new javax.swing.JMenuItem();
        jmPedidosEmp = new javax.swing.JMenuItem();
        jmPeliculasEmp = new javax.swing.JMenuItem();
        jmPoductosEmp = new javax.swing.JMenuItem();
        jmProveEmp = new javax.swing.JMenuItem();
        jmReservasEmp = new javax.swing.JMenuItem();
        jmSesionEmp = new javax.swing.JMenuItem();
        jmAdministrador = new javax.swing.JMenu();
        jmCineAdmin = new javax.swing.JMenuItem();
        jmClienteAdmin = new javax.swing.JMenuItem();
        jmEmpAdmin = new javax.swing.JMenuItem();
        jmPedidosAdmin = new javax.swing.JMenuItem();
        jmPeliculasAdmin = new javax.swing.JMenuItem();
        jmPoductosAdmin = new javax.swing.JMenuItem();
        jmProveAdmin = new javax.swing.JMenuItem();
        jmReservasAdmin = new javax.swing.JMenuItem();
        jmSesionAdmin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID:");

        jLabel2.setText("Cargo:");
        jLabel2.setToolTipText("");

        jLabel3.setText("Contraseña:");

        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));

        jbEntrar.setText("Entrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInicioSesionLayout = new javax.swing.GroupLayout(jpInicioSesion);
        jpInicioSesion.setLayout(jpInicioSesionLayout);
        jpInicioSesionLayout.setHorizontalGroup(
            jpInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioSesionLayout.createSequentialGroup()
                .addGroup(jpInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioSesionLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jpInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jpInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfId)
                            .addComponent(jtfPass)
                            .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpInicioSesionLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jpInicioSesionLayout.setVerticalGroup(
            jpInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioSesionLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jpInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jpInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addComponent(jbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jpInicioSesion, java.awt.BorderLayout.CENTER);

        jmEmpleados.setText("Paneles E");
        jmEmpleados.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jmEmpleadosComponentAdded(evt);
            }
        });

        jmCineEmp.setText("Cines Emple");
        jmCineEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCineEmpActionPerformed(evt);
            }
        });
        jmEmpleados.add(jmCineEmp);

        jmClienteEmp.setText("Clientes");
        jmClienteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClienteEmpActionPerformed(evt);
            }
        });
        jmEmpleados.add(jmClienteEmp);

        jmEmpEmp.setText("Empleados Emple");
        jmEmpEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEmpEmpActionPerformed(evt);
            }
        });
        jmEmpleados.add(jmEmpEmp);

        jmPedidosEmp.setText("Pedidos Emple");
        jmPedidosEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPedidosEmpActionPerformed(evt);
            }
        });
        jmEmpleados.add(jmPedidosEmp);

        jmPeliculasEmp.setText("Peliculas");
        jmPeliculasEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPeliculasEmpActionPerformed(evt);
            }
        });
        jmEmpleados.add(jmPeliculasEmp);

        jmPoductosEmp.setText("Productos");
        jmPoductosEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPoductosEmpActionPerformed(evt);
            }
        });
        jmEmpleados.add(jmPoductosEmp);

        jmProveEmp.setText("Proveedores Emple");
        jmProveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProveEmpActionPerformed(evt);
            }
        });
        jmEmpleados.add(jmProveEmp);

        jmReservasEmp.setText("Reservas");
        jmReservasEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmReservasEmpActionPerformed(evt);
            }
        });
        jmEmpleados.add(jmReservasEmp);

        jmSesionEmp.setText("Sesion");
        jmSesionEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSesionEmpActionPerformed(evt);
            }
        });
        jmEmpleados.add(jmSesionEmp);

        jMenuBar1.add(jmEmpleados);

        jmAdministrador.setText("Paneles A");

        jmCineAdmin.setText("Cines Admin");
        jmCineAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCineAdminActionPerformed(evt);
            }
        });
        jmAdministrador.add(jmCineAdmin);

        jmClienteAdmin.setText("Clientes");
        jmClienteAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClienteAdminActionPerformed(evt);
            }
        });
        jmAdministrador.add(jmClienteAdmin);

        jmEmpAdmin.setText("Empleados Admin");
        jmEmpAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEmpAdminActionPerformed(evt);
            }
        });
        jmAdministrador.add(jmEmpAdmin);

        jmPedidosAdmin.setText("Pedidos Admin");
        jmPedidosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPedidosAdminActionPerformed(evt);
            }
        });
        jmAdministrador.add(jmPedidosAdmin);

        jmPeliculasAdmin.setText("Peliculas");
        jmPeliculasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPeliculasAdminActionPerformed(evt);
            }
        });
        jmAdministrador.add(jmPeliculasAdmin);

        jmPoductosAdmin.setText("Productos");
        jmPoductosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPoductosAdminActionPerformed(evt);
            }
        });
        jmAdministrador.add(jmPoductosAdmin);

        jmProveAdmin.setText("Proveedores Admin");
        jmProveAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProveAdminActionPerformed(evt);
            }
        });
        jmAdministrador.add(jmProveAdmin);

        jmReservasAdmin.setText("Reservas");
        jmReservasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmReservasAdminActionPerformed(evt);
            }
        });
        jmAdministrador.add(jmReservasAdmin);

        jmSesionAdmin.setText("Sesion");
        jmSesionAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSesionAdminActionPerformed(evt);
            }
        });
        jmAdministrador.add(jmSesionAdmin);

        jMenuBar1.add(jmAdministrador);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmEmpleadosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jmEmpleadosComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jmEmpleadosComponentAdded

    private void jmEmpEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEmpEmpActionPerformed
        this.getContentPane().add(jpgee);//Empleado Empleado
        jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(true);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmEmpEmpActionPerformed

    private void jmCineEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCineEmpActionPerformed
        this.getContentPane().add(jpgce);//Cine Empleado
        jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(true);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmCineEmpActionPerformed

    private void jmClienteEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClienteEmpActionPerformed
        this.getContentPane().add(jpgc);//Cliente Empleado
        jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(true);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmClienteEmpActionPerformed

    private void jmPedidosEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPedidosEmpActionPerformed
        
        //Falta comprobar
        
        this.getContentPane().add(jpgpedidos);//Pedidos Empleado
        jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(true);
        
    }//GEN-LAST:event_jmPedidosEmpActionPerformed

    private void jmPeliculasEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPeliculasEmpActionPerformed
        this.getContentPane().add(jpgpeli);//Peliculas Empleado
         jpgpeli.setVisible(true);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmPeliculasEmpActionPerformed

    private void jmPoductosEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPoductosEmpActionPerformed
        
        //Falta comprobar
        
        this.getContentPane().add(jpgprouctos);//Productos Empleado
        jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(true);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmPoductosEmpActionPerformed

    private void jmProveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProveEmpActionPerformed
        this.getContentPane().add(jpgproemp);//Proveedores Empleado
        jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(true);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmProveEmpActionPerformed

    private void jmReservasEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmReservasEmpActionPerformed
        
        //Falta comprobar
        
        this.getContentPane().add(jpgreservas);//Reservas
         jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(true);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmReservasEmpActionPerformed

    private void jmCineAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCineAdminActionPerformed
      this.getContentPane().add(jpgca);
      jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(true);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmCineAdminActionPerformed

    private void jmClienteAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClienteAdminActionPerformed
        this.getContentPane().add(jpgc);
        jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(true);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmClienteAdminActionPerformed

    private void jmEmpAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEmpAdminActionPerformed
        this.getContentPane().add(jpgea);
        jpgpeli.setVisible(false);
        jpgea.setVisible(true);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmEmpAdminActionPerformed

    private void jmPedidosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPedidosAdminActionPerformed
       this.getContentPane().add(jpgpedadmin);
       jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(true);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmPedidosAdminActionPerformed

    private void jmPeliculasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPeliculasAdminActionPerformed
       this.getContentPane().add(jpgpeli);
       jpgpeli.setVisible(true);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmPeliculasAdminActionPerformed

    private void jmPoductosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPoductosAdminActionPerformed
       this.getContentPane().add(jpgprouctos);
       jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(true);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmPoductosAdminActionPerformed

    private void jmProveAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProveAdminActionPerformed
        this.getContentPane().add(jpgproadmin);
        jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(true);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmProveAdminActionPerformed

    private void jmReservasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmReservasAdminActionPerformed
       this.getContentPane().add(jpgreservas);
       jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(false);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(true);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmReservasAdminActionPerformed

    private void jmSesionEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSesionEmpActionPerformed
        this.getContentPane().add(jpgse);
        jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(true);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
        
    }//GEN-LAST:event_jmSesionEmpActionPerformed

    private void jmSesionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSesionAdminActionPerformed
        this.getContentPane().add(jpgse);
        jpgpeli.setVisible(false);
        jpgea.setVisible(false);
        jpgca.setVisible(false);
        jpgc.setVisible(false);
        jpgproadmin.setVisible(false);
        jpgproemp.setVisible(false);
        jpgse.setVisible(true);
        jpgpedadmin.setVisible(false);
        jpgce.setVisible(false);
        jpgee.setVisible(false);
        jpgprouctos.setVisible(false);
        jpgreservas.setVisible(false);
        jpgpedidos.setVisible(false);
    }//GEN-LAST:event_jmSesionAdminActionPerformed

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        String idEmple = jtfId.getText().toString();
        String contrasenia = jtfPass.getText().toString();

        JFInterfaz.cargo = emp.iniciarSesionEmple(idEmple, contrasenia);

    }//GEN-LAST:event_jbEntrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
            Logger.getLogger(JFInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JFInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JFInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JMenu jmAdministrador;
    private javax.swing.JMenuItem jmCineAdmin;
    private javax.swing.JMenuItem jmCineEmp;
    private javax.swing.JMenuItem jmClienteAdmin;
    private javax.swing.JMenuItem jmClienteEmp;
    private javax.swing.JMenuItem jmEmpAdmin;
    private javax.swing.JMenuItem jmEmpEmp;
    private javax.swing.JMenu jmEmpleados;
    private javax.swing.JMenuItem jmPedidosAdmin;
    private javax.swing.JMenuItem jmPedidosEmp;
    private javax.swing.JMenuItem jmPeliculasAdmin;
    private javax.swing.JMenuItem jmPeliculasEmp;
    private javax.swing.JMenuItem jmPoductosAdmin;
    private javax.swing.JMenuItem jmPoductosEmp;
    private javax.swing.JMenuItem jmProveAdmin;
    private javax.swing.JMenuItem jmProveEmp;
    private javax.swing.JMenuItem jmReservasAdmin;
    private javax.swing.JMenuItem jmReservasEmp;
    private javax.swing.JMenuItem jmSesionAdmin;
    private javax.swing.JMenuItem jmSesionEmp;
    private javax.swing.JPanel jpInicioSesion;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfPass;
    // End of variables declaration//GEN-END:variables
}
