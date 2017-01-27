/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.objetos;

import ddda.erp.core.CoreBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author juanxxiii
 */
public class CuerpoPedido {
    
    //Metodos para interactuar con la BD.
    private CoreBD bd = new CoreBD();
    private String sql = null;
    private ResultSet rs = null;
    
    //Atributos.
    private int idPedido;
    private int idProducto;
    private String descripcion_cup;
    private int cantidad_cup;

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getIdPedido() {
        return idPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getDescripcion_cup() {
        return descripcion_cup;
    }

    public int getCantidad_cup() {
        return cantidad_cup;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setDescripcion_cup(String descripcion_cup) {
        this.descripcion_cup = descripcion_cup;
    }

    public void setCantidad_cup(int cantidad_cup) {
        this.cantidad_cup = cantidad_cup;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    /**
    * Creamos un cuerpo de pedido desde 0, con un ID asociado, este metodo no es apto para
     * introducir cuerpos de pedido en la BBDD ya que la base de datos asigna un ID
     * automaticamente, es para recibir datos de la BD
     * 
     * @param idPedido
     * @param idProducto
     * @param descripcion_cup
     * @param cantidad_cup 
     */
    public CuerpoPedido(int idPedido, int idProducto, String descripcion_cup, int cantidad_cup) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.descripcion_cup = descripcion_cup;
        this.cantidad_cup = cantidad_cup;
    }
    
    /**
     * Creamos un cuerpo de pedido desde 0, pero sin ID del cuerpo de pedido, ya que es autoincremental
     * 
     * @param idProducto
     * @param descripcion_cup
     * @param cantidad_cup 
     */
    public CuerpoPedido(int idProducto, String descripcion_cup, int cantidad_cup) {
        this.idProducto = idProducto;
        this.descripcion_cup = descripcion_cup;
        this.cantidad_cup = cantidad_cup;
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Metodos">

    /**
     * Creacion de un cuerpo de pedido en la BD con id en null, ya que lo gestiona la BD
     * 
     * @param _cPedido Ojeto de tipo pedido.
     * @throws SQLException 
     */
    public void crearCuerpoPedido(CuerpoPedido _cPedido) throws SQLException {
        bd.actualizarTabla("Insert into cuerpo_pedido values(null, '"
                + _cPedido.idPedido + "', '"
                + _cPedido.idProducto + "', '"
                + _cPedido.descripcion_cup + "', '"
                + _cPedido.cantidad_cup +")");
    }

   /**
    * Muestra todos los cuerpos de pedido de la base de datos.
    * 
    * @return Devuelve todos los pedidos.
    * @throws SQLException error al mostrar el pedido.
    */
    public ArrayList<CuerpoPedido> mostrarCuerpoPedido() throws SQLException {
        CuerpoPedido miCuerpoPedido;
        ArrayList<CuerpoPedido> misCuerposDePedido = new ArrayList();
        rs = bd.consultarTabla("Select * from empleado");
        while (rs.next()) {
            miCuerpoPedido = new CuerpoPedido(
                    rs.getInt("idPedido"),
                    rs.getInt("idProducto"),
                    rs.getString("descripcion_cup"),
                    rs.getInt("cantidad_cup"));
            misCuerposDePedido.add(miCuerpoPedido);
        }
        return misCuerposDePedido;
    }

    /**
     * 
     * @param _idCuerpoPedido
     * @return
     * @throws SQLException 
     */
    public CuerpoPedido mostrarCuerpoPedidoID(int _idCuerpoPedido) throws SQLException {
        CuerpoPedido miCuerpoPedido = null;
        rs = bd.consultarTabla("Select * from cuerpo_pedido where idPedido =" + _idCuerpoPedido);
        while (rs.next()) {
            miCuerpoPedido = new CuerpoPedido(
                   rs.getInt("idPedido"),
                    rs.getInt("idProducto"),
                    rs.getString("descripcion_cup"),
                    rs.getInt("cantidad_cup"));
        }
        return miCuerpoPedido;

    }
    /**
     * Borra un cuerpo de pedido en base a el id de pedido introducido.
     * 
     * @param _idCuerpoPedido
     * @throws SQLException 
     */
    public void borrarCuerpoPedidoID(int _idCuerpoPedido) throws SQLException {
        bd.actualizarTabla("Delete from empleado where idEmpleado =" + _idCuerpoPedido);
    }

    /**
     * Metodo mdiante el cual, pasando todos los parametros de un cuerpo de pedido lo actualiza.
     * 
     * @throws SQLException 
     */
    public void modificarCuerpoPedido() throws SQLException {
        bd.actualizarTabla("Update cuerpo_pedido set "
                + "idPedido = '"+ idPedido 
                + "', idProducto = '"+ idProducto + "',"
                + " descripcion_cup = '"+ descripcion_cup 
                + "', cantidad_cup = '"+ cantidad_cup);
    }
    // </editor-fold>
    
}
