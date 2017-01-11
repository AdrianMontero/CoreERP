/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class CoreBD {

    Connection conexion = null;
    Statement stmt = null;
    String sql = null;
    ResultSet rs = null;

    /**
     * Crea una conexion con una base de datos en Sqlite3. Si se usa este metodo
     * tendremos que usar mas adelante el "desconectarBBDD"
     *
     * @param localizacionBBDD Ruta de la ubicacion de la base de datos
     */
    public void conectarSqlite(String localizacionBBDD) {
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:" + localizacionBBDD);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CoreBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problema para encontar la BBDD");
        } catch (SQLException ex) {
            Logger.getLogger(CoreBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Con la BBDD");
        }
    }

//   Codigo de muestra para hacer updates o consultas a la BBDD
//        String mensaje = jtfSend.getText();
//        Statement stmt = null;
//        String sql = null;
//        ResultSet rs = null;
//            stmt = conexion.createStatement();
//            stmt.executeUpdate("insert into juansapp values('" + nombre + "','" + mensaje + "')");
//            sql = "Select * from juansapp";
//            rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//                jtaMensajes.append("\n" + rs.getString("Nombre")+": ");
//                jtaMensajes.append(rs.getString("Mensaje"));
//            }
//            stmt.close();
    /**
     * Cierra la conexion con la base de datos, ya sea MySql o Sqlite3
     *
     */
    public void desconectarBBDD() throws SQLException{
        conexion.close();
    }

    /**
     * Usado para consultar la BD
     *
     * @param _sql Comando para la consulta
     * @return ResultSet con la informacion devuelta por la BD
     * @throws SQLException Error al ejecutar la consulta
     */
    public ResultSet consultarTabla(String _sql) throws SQLException {
        stmt = conexion.createStatement();
        //Empezamos a trabajar con la BBDD
        rs = stmt.executeQuery(_sql);
        return rs;
    }

    /**
     * Usado para hacer actualizaciones o deletes de la BD, no devuelve nada.
     *
     * @param _sql Comando para la actualizacion
     * @throws SQLException Error al intentar hacer la actualizacion
     */
    public void actualizarTabla(String _sql) throws SQLException {
        stmt = conexion.createStatement();
        //Empezamos a trabajar con la BBDD
        stmt.executeUpdate(_sql);
    }
}
