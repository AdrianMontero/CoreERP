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
     * @param idProducto
     * @param descripcion
     * @param precio
     * @param nombre
     * @param stock
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
     * @param _poducto Datos del producto a crear.
     * @throws SQLException Error al cargar la BD.
     */
    public void crearProducto(Producto _poducto) throws SQLException {
        bd.actualizarTabla("Insert into empleado values(null, "
                + _poducto.idProducto + ", '"
                + _poducto.descripcion+ "', '"
                + _poducto.precio+ "', '"
                + _poducto.nombre+ "', '"
                + _poducto.stock+ ")");
    }

    /**
     * Mostrar todos los productos.
     * 
     * @return Resultado de la busqueda.
     * @throws SQLException Error al cargar la BD.
     */
    public ArrayList<Producto> mostrarProductos() throws SQLException {
        Producto miProducto = null;
        ArrayList<Producto> misProductos = new ArrayList();
        rs = bd.consultarTabla("Select * from empleado");
        while (rs.next()) {
            miProducto = new Producto(
                    rs.getInt("idProducto"),
                    rs.getString("descipcion_pod"),
                    rs.getInt("precio_prod"),
                    rs.getString("nombre_prod"),
                    rs.getInt("Stock_prod"));
            misProductos.add(miProducto);
        }
        return misProductos;
    }

    /**
     *Muestra los productos segun id.
     * 
     * @param _idProducto Id del producto que vamos a buscar.
     * @return Resultado de la busqueda.
     * @throws SQLException Error al cargar la BD.
     */
    public Producto mostrarPoductoID(int _idProducto) throws SQLException {
        Producto miProducto = null;
        rs = bd.consultarTabla("Select * from producto where idProducto =" + _idProducto + "");
        while (rs.next()) {
            miProducto = new Producto(
                    rs.getInt("idProducto"),
                    rs.getString("descipcion_pod"),
                    rs.getInt("precio_prod"),
                    rs.getString("nombre_prod"),
                    rs.getInt("Stock_prod"));
        }
        return miProducto;

    }

    /**
     *
     * @param _nombreProd Nombre del producto ue se va a buscar.
     * @return Resultado de la busqueda.
     * @throws SQLException Error al cargar la BD.
     */
    public ArrayList<Producto> mostrarProductoNombre(String _nombreProd) throws SQLException {
        Producto miProducto = null;
        ArrayList<Producto> misProductos = new ArrayList();
        rs = bd.consultarTabla("Select * from producto where nombre_prod =" + _nombreProd + "");

        while (rs.next()) {
            miProducto = new Producto(
                    rs.getInt("idProducto"),
                    rs.getString("descipcion_pod"),
                    rs.getInt("precio_prod"),
                    rs.getString("nombre_prod"),
                    rs.getInt("Stock_prod"));
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
                + ",nombre_emp='" + _producto.descripcion
                + "',apellidos_emp='" + _producto.precio
                + "',fechaInicio_emp='" + _producto.nombre
                + "',cargo_emp='" + _producto.stock);
    }

    // </editor-fold>
}
