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
    private String descripcion_prod;
    private int precio_prod;
    private String nombre_prod;
    private int stock_prod;

    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Constructor de producto con idProducto para añadir y borrar productos.
     *
     * @param idProducto Id del producto.
     * @param descripcion_prod Descripción del produto.
     * @param precio_prod Precio del produto.
     * @param nombre_prod Nombre del poducto.
     * @param stock_prod Numero de unidades en almacen.
     */
    public Producto(int idProducto, String descripcion_prod, int precio_prod, String nombre_prod, int stock_prod) {    
        this.idProducto = idProducto;
        this.descripcion_prod = descripcion_prod;
        this.precio_prod = precio_prod;
        this.nombre_prod = nombre_prod;
        this.stock_prod = stock_prod;
    }
    public Producto(){
    }
    /**
     * Constructor de producto sin idProducto para mostrar productos.
     *
     * @param descripcion_prod Descripción del produto.
     * @param precio_prod Precio del produto.
     * @param nombre_prod Nombre del poducto.
     * @param stock_prod Numero de unidades en almacen.
     */
    public Producto(String descripcion_prod, int precio_prod, String nombre_prod, int stock_prod) {
        this.descripcion_prod = descripcion_prod;
        this.precio_prod = precio_prod;
        this.nombre_prod = nombre_prod;
        this.stock_prod = stock_prod;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getters">
    
    public int getIdProducto() {
        return idProducto;
    }
    

    public String getDescripcion_prod() {
        return descripcion_prod;
    }

    public int getPrecio_prod() {
        return precio_prod;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public int getStock_prod() {
        return stock_prod;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setDescripcion_prod(String descripcion_prod) {
        this.descripcion_prod = descripcion_prod;
    }

    public void setPrecio_prod(int precio_prod) {
        this.precio_prod = precio_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public void setStock_prod(int stock_prod) {
        this.stock_prod = stock_prod;
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
                + _producto.descripcion_prod + "', "
                + _producto.precio_prod + ", '"
                + _producto.nombre_prod + "', "
                + _producto.stock_prod + ")");
    }

    /**
     *
     * @param listaPro Array donde recogeremos los datos.
     * @return Resultado de la busqueda.
     * @throws SQLException Error al cargar la BD.
     */
    public ArrayList<Producto> mostrarProducto(ArrayList listaPro) throws SQLException {
        ResultSet res;
        Producto pro;
        rs = bd.consultarTabla("Select * from producto ");
        listaPro.clear();
        while (rs.next()) {
            pro = new Producto();
            pro.setNombre_prod(rs.getString("nombre_prod"));
            pro.setIdProducto(rs.getInt("idProducto"));
            pro.setPrecio_prod(rs.getInt("precio_prod"));
            pro.setStock_prod(rs.getInt("Stock_prod"));
            listaPro.add(pro);
        }
        return listaPro;
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
    public void modificarProducto() throws SQLException {
        bd.actualizarTabla("Update producto set "
                + "idProducto=" + idProducto
                + ",descipcion_pro='" + descripcion_prod
                + "',precio_pro=" + precio_prod
                + ",nombre_pro='" + nombre_prod
                + "',Stock_pro=" + stock_prod);
    }

    // </editor-fold>
}
