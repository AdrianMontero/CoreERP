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
public class Producto {

    //Metodos para interactuar con la BD.
    private CoreBD bd = new CoreBD();
    private String sql = null;
    private ResultSet rs = null;

    //Atributos del empleado.
    private int idProducto;
    private String descripcion;
    private int precio;
    private String nombre;
    private int stock;

    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Constructor de producto con idProducto para añadir y borrar productos.
     *
     * @param idProducto Id del producto.
     * @param descripcion Descripción del produto.
     * @param precio Precio del produto.
     * @param nombre Nombre del poducto.
     * @param stock Numero de unidades en almacen.
     */
    public Producto(int idProducto, String descripcion, int precio, String nombre, int stock) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
    }

    /**
     * Constructor de producto sin idProducto para mostrar productos.
     *
     * @param descripcion Descripción del produto.
     * @param precio Precio del produto.
     * @param nombre Nombre del poducto.
     * @param stock Numero de unidades en almacen.
     */
    public Producto(String descripcion, int precio, String nombre, int stock) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getIdProducto() {
        return idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Crear un nuevo producto.
     *
     * @param _producto Datos del producto a crear.
     * @throws SQLException Error al cargar la BD.
     */
    public void crearProducto(Producto _producto) throws SQLException {
        bd.actualizarTabla("Insert into empleado values(null, "
                + _producto.idProducto + ", '"
                + _producto.descripcion + "', "
                + _producto.precio + ", '"
                + _producto.nombre + "', "
                + _producto.stock + ")");
    }

    /**
     * Mostrar todos los productos.
     *
     * @return Resultado de la busqueda.
     * @throws SQLException Error al cargar la BD.
     */
    public ArrayList<Producto> mostrarProductos() throws SQLException {
        Producto miProducto;
        ArrayList<Producto> misProductos = new ArrayList();
        rs = bd.consultarTabla("Select * from producto");
        while (rs.next()) {
            miProducto = new Producto(
                    rs.getInt("idProducto"),
                    rs.getString("descipcion_pro"),
                    rs.getInt("precio_pro"),
                    rs.getString("nombre_pro"),
                    rs.getInt("Stock_pro"));
            misProductos.add(miProducto);
        }
        return misProductos;
    }

    /**
     * Muestra los productos segun id.
     *
     * @param _idProducto Id del producto que vamos a buscar.
     * @return Resultado de la busqueda.
     * @throws SQLException Error al cargar la BD.
     */
    public Producto mostrarPoductoID(int _idProducto) throws SQLException {
        Producto miProducto = null;
        rs = bd.consultarTabla("Select * from producto where idProducto =" + _idProducto);
        while (rs.next()) {
            miProducto = new Producto(
                    rs.getInt("idProducto"),
                    rs.getString("descipcion_pro"),
                    rs.getInt("precio_pro"),
                    rs.getString("nombre_pro"),
                    rs.getInt("Stock_pro"));
        }
        return miProducto;
    }

    /**
     *
     * @param _nombre Nombre del producto ue se va a buscar.
     * @return Resultado de la busqueda.
     * @throws SQLException Error al cargar la BD.
     */
    public ArrayList<Producto> mostrarProductoNombre(String _nombre) throws SQLException {
        Producto miProducto;
        ArrayList<Producto> misProductos = new ArrayList();
        rs = bd.consultarTabla("Select * from producto where nombre_pro =" + _nombre + "");

        while (rs.next()) {
            miProducto = new Producto(
                    rs.getInt("idProducto"),
                    rs.getString("descipcion_pro"),
                    rs.getInt("precio_pro"),
                    rs.getString("nombre_pro"),
                    rs.getInt("Stock_pro"));
            misProductos.add(miProducto);
        }
        return misProductos;
    }

    /**
     * Borrar un producto segun id.
     *
     * @param _idProducto Id del producto que se va a borrar.
     * @throws SQLException Error al cargar la BD.
     */
    public void borrarProductoID(int _idProducto) throws SQLException {
        bd.actualizarTabla("Delete * from producto where idProducto =" + _idProducto);
    }

    /**
     * Modificar un producto.
     *
     * @param _producto Datos a modificar en el poducto.
     * @throws SQLException Error al cargar la BD.
     */
    public void modificarProducto(Producto _producto) throws SQLException {
        bd.actualizarTabla("Update producto set "
                + "idProducto=" + _producto.idProducto
                + ",descipcion_pro='" + _producto.descripcion
                + "',precio_pro=" + _producto.precio
                + ",nombre_pro='" + _producto.nombre
                + "',Stock_pro=" + _producto.stock);
    }

    // </editor-fold>
}
