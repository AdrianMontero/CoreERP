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
public class Proveedor {
    
    //Metodos para interactuar con la BD.
    private CoreBD bd = new CoreBD();
    private String sql = null;
    private ResultSet rs = null;
    
    
    private int idProveedor;
    private String dni_prov;
    private String nombre_prov;
    private String apellidos_prov;
    private String poblacion_prov;
    private int cp_prov;

    
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getIdProveedor() {
        return idProveedor;
    }

    public String getDni_prov() {
        return dni_prov;
    }

    public String getNombre_prov() {
        return nombre_prov;
    }

    public String getApellidos_prov() {
        return apellidos_prov;
    }

    public String getPoblacion_prov() {
        return poblacion_prov;
    }

    public int getCp_prov() {
        return cp_prov;
    }

    // </editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * 
     * @param idProveedor
     * @param dni_prov
     * @param nombre_prov
     * @param apellidos_prov
     * @param poblacion_prov
     * @param cp_prov 
     */
    public Proveedor(int idProveedor, String dni_prov, String nombre_prov, String apellidos_prov, String poblacion_prov, int cp_prov) {
        this.idProveedor = idProveedor;
        this.dni_prov = dni_prov;
        this.nombre_prov = nombre_prov;
        this.apellidos_prov = apellidos_prov;
        this.poblacion_prov = poblacion_prov;
        this.cp_prov = cp_prov;
    }

    /**
     * 
     * @param dni_prov
     * @param nombre_prov
     * @param apellidos_prov
     * @param poblacion_prov
     * @param cp_prov 
     */
    public Proveedor(String dni_prov, String nombre_prov, String apellidos_prov, String poblacion_prov, int cp_prov) {
        this.dni_prov = dni_prov;
        this.nombre_prov = nombre_prov;
        this.apellidos_prov = apellidos_prov;
        this.poblacion_prov = poblacion_prov;
        this.cp_prov = cp_prov;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    
   /**
    * Creamos un nuevo proveedor.
    * @param _proveedor Datos del proveedor.
    * @throws SQLException SQLException Error al cargar la BD
    */
    public void crearProveedores(Proveedor _proveedor) throws SQLException {
        bd.actualizarTabla("Insert into proveedor values(null, '"
                + _proveedor.idProveedor + "', '"
                + _proveedor.dni_prov + "', '"
                + _proveedor.nombre_prov + "', '"
                + _proveedor.apellidos_prov + "', '"
                + _proveedor.poblacion_prov + "', '"
                + _proveedor.cp_prov + ")");
    }

    /**
     * Muestra todos los proveedores.
     * @return Resultado de la busqueda.
     * @throws SQLException SQLException Error al cargar la BD
     */
    public ArrayList<Proveedor> mostrarProveedor() throws SQLException {
        Proveedor miProveedor;
        ArrayList<Proveedor> misProveedores = new ArrayList();
        rs = bd.consultarTabla("Select * from proveedor");
        while (rs.next()) {
            miProveedor = new Proveedor(
                    rs.getInt("idProveedor"),
                    rs.getString("dni_prov"),
                    rs.getString("nombre_prov"),
                    rs.getString("apellidos_prov"),
                    rs.getString("poblacion_prov"),
                    rs.getInt("cp_prov")
            );
            misProveedores.add(miProveedor);
        }
        return misProveedores;
    }

  /**
   * Muestra proveedor segun id.
   * @param _idProveedor Id del proveedor.
   * @return Resultado de la busqueda.
   * @throws SQLException SQLException Error al cargar la BD
   */
    public Proveedor mostrarProveedorID(int _idProveedor) throws SQLException {
        Proveedor miProveedor = null;
        rs = bd.consultarTabla("Select * from proveedor where idProveedor =" + _idProveedor);
        while (rs.next()) {
            miProveedor = new Proveedor(
                    rs.getInt("idProveedor"),
                    rs.getString("dni_prov"),
                    rs.getString("nombre_prov"),
                    rs.getString("apellidos_prov"),
                    rs.getString("poblacion_prov"),
                    rs.getInt("cp_prov"));
        }
        return miProveedor;

    }

 /**
  * Busca proveedor segun nombre.
  * @param _nombreProv Nombre del proveedor.
  * @return Resultado de la busqueda.
  * @throws SQLException SQLException Error al cargar la BD.
  */
    public ArrayList<Proveedor> mostrarProveedorNombre(String _nombreProv) throws SQLException {
        Proveedor miProveedor;
        ArrayList<Proveedor> misProveedores = new ArrayList();
        rs = bd.consultarTabla("Select * from proveedor where Lower(nombre_prov) = Lower('" + _nombreProv + "')");

        while (rs.next()) {
            miProveedor = new Proveedor(
                    rs.getInt("idProveedor"),
                    rs.getString("dni_prov"),
                    rs.getString("nombre_prov"),
                    rs.getString("apellidos_prov"),
                    rs.getString("poblacion_prov"),
                    rs.getInt("cp_prov"));
            misProveedores.add(miProveedor);
        }
        return misProveedores;
    }

    /**
     * Borra un proveedor segun id.
     * @param _idProveedor Id del proveedor.
     * @throws SQLException SQLException Error al cargar la BD
     */
    public void borrarProveedorID(int _idProveedor) throws SQLException {
        bd.actualizarTabla("Delete * from proveedor where idProveedror =" + _idProveedor);
    }

   /**
    * Modifica un proveedor correspondiente a un id
    * @param _proveedor Datos del proveedor.
    * @throws SQLException SQLException Error al cargar la BD
    */
    public void modificarProveedor(Proveedor _proveedor) throws SQLException {
        bd.actualizarTabla("Update empleado set "
                + _proveedor.idProveedor + ", '"
                + _proveedor.dni_prov + "', '"
                + _proveedor.nombre_prov + "', '"
                + _proveedor.apellidos_prov + "', '"
                + _proveedor.poblacion_prov + "',"
                + _proveedor.cp_prov + ")");
    }
     // </editor-fold>
    
}
