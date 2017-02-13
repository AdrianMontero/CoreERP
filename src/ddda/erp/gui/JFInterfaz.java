/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.gui;

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

    JPGCinesAdmin jpgca = new JPGCinesAdmin();//Cines Administrador
    JPGPeliculas jpgpeli = new JPGPeliculas();//Peliculas
    JPGCinesEmp jpgce = new JPGCinesEmp(); //Cines Empleado
    JPGEmpAdmin jpgea = new JPGEmpAdmin(); //Empleado Administrador
    JPGEmpleadoEmp jpgee = new JPGEmpleadoEmp();//Empleado Empleado
    JPGClientes jpgc = new JPGClientes();//Clientes
    JPGProveedoresAdmin jpgproadmin = new JPGProveedoresAdmin();//Proveedor Administrador
    JPGProveedoresEmp jpgproemp = new JPGProveedoresEmp();//Proveedor Empleado
    JPGSesion jpgse = new JPGSesion();//Sesion
    JPGPedidosAdmin jpgpedadmin = new JPGPedidosAdmin();//Sesion
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * Creates new form JFInterfaz
     */
    public JFInterfaz() {
        initComponents();
//        this.getContentPane().add(jpgce);//Cines Empleado
//        this.getContentPane().add(jpgca);//Cines Administrador
//        this.getContentPane().add(jpgpeli);//Peliculas
//        this.getContentPane().add(jpgea);//Empleado Administrador
//        this.getContentPane().add(jpgee);//Empleado Empleado
//        this.getContentPane().add(jpgc);//Cliente
//        this.getContentPane().add(jpgproadmin);//Proveedor Administrador 
//        this.getContentPane().add(jpgproemp);//Proveedor Empleado
//        this.getContentPane().add(jpgse);//Sesion
        this.getContentPane().add(jpgpedadmin);//Pedidos Administrador
        this.setVisible(true);
        this.setBounds(0, 0, screenSize.width, screenSize.height);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    // End of variables declaration//GEN-END:variables
}
