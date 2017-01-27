/*
 * Clase de gestion de cines
 */
package ddda.erp.objetos;

import ddda.erp.core.CoreBD;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

/**
 *
 * @author Team CoreERP
 */
public class Cine {

    //Metodos para interactuar con la BD
    private static CoreBD bd = new CoreBD();
    private static String sql = null;
    private static ResultSet rs = null;

    //Atributos del cine
    private int idCine;
    private String nombre;
    private String cif;
    private String direccion;
    private String poblacion;
    private int cp;

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getIdCine() {
        return idCine;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public int getCp() {
        return cp;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setters">

    public static void setBd(CoreBD bd) {
        Cine.bd = bd;
    }

    public static void setSql(String sql) {
        Cine.sql = sql;
    }

    public static void setRs(ResultSet rs) {
        Cine.rs = rs;
    }

    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
    
    
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Constructor vacio
     */
    public Cine() {
    }

    /**
     * Creamos un cine desde 0, pero sin ID del Cine, ya que es autoincremental
     *
     * @param _nombreCine Nombre que se le asigna al cine
     * @param _cif CIF del cine
     * @param _direccion Direccion del cine
     * @param _poblacion Localidad del cine
     * @param _cp Codigo postal del cine
     */
    public Cine(String _nombreCine, String _cif, String _direccion, String _poblacion, int _cp) {   
        this.nombre = _nombreCine;
        this.cif = _cif;
        this.direccion = _direccion;
        this.poblacion = _poblacion;
        this.cp = _cp;
    }

    /**
     * Creamos un cine desde 0, con un ID asociado, este metodo no es apto para
     * introducir cines en la BBDD ya que la base de datos asigna un ID
     * automaticamente, es para recibir datos de la BD
     *
     * @param _idCine Id del cine
     * @param _nombreCine Nombre del cine
     * @param _cif Cif del cine
     * @param _direccion Direccion del cine
     * @param _poblacion Poblacion del cine
     * @param _cp Codigo Postal del cine
     */
    public Cine(int _idCine, String _nombreCine, String _cif, String _direccion, String _poblacion, int _cp) {
        this.idCine = _idCine;
        this.nombre = _nombreCine;
        this.cif = _cif;
        this.direccion = _direccion;
        this.poblacion = _poblacion;
        this.cp = _cp;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Creacion de un cine en la BD con id en null, ya que lo gestiona la BD
     *
     * @throws SQLException error al crear el cine
     */
    public void crearCine() throws SQLException {
        bd.actualizarTabla("insert into cine values(null, '"
                + nombre + "', '"
                + cif + "', '"
                + direccion + "', '"
                + poblacion + "', "
                + cp + ")");
    }

    /**
     * Muestra toda la informacion asociada a un cine, buscando por su ID
     *
     * @param _idCine Id por el que se buscaran los cines
     * @return Objeto de tipo cine con todos los atributos
     * @throws SQLException Error al encontrar el objeto en la base de datos
     */
    public Cine mostrarCineId(int _idCine) throws SQLException {
        Cine miCine = new Cine();
        rs = bd.consultarTabla("select * from  cine where idCine = " + _idCine);
        while (rs.next()) {
            miCine.setIdCine(rs.getInt("idCine"));
            miCine.setNombre(rs.getString("nombre_cin"));
            miCine.setCif(rs.getString("cif_cin"));
            miCine.setDireccion(rs.getString("direccion_cin"));
            miCine.setPoblacion(rs.getString("poblacion_cin"));
            miCine.setCp(rs.getInt("cp_cin"));
        }
        return miCine;
    }

    /**
     * Muestra todos los cines de la base de datos
     *
     * @param listaCines
     * @return devuelve un array del tipo cine
     * @throws SQLException Error alencontrar el objeto en la base de datos
     */
    public static ArrayList<Cine> mostrarCines(ArrayList listaCines) throws SQLException {
        ResultSet res;
        Cine miCine = new Cine();
        res = bd.consultarTabla("select * from cine");
        listaCines.clear();
        while(res.next()) {
            miCine = new Cine();
            miCine.setIdCine(res.getInt("idCine"));
            miCine.setNombre(res.getString("nombre_cin"));
            miCine.setCif(res.getString("cif_cin"));
            miCine.setDireccion(res.getString("direccion_cin"));
            miCine.setPoblacion(res.getString("poblacion_cin"));
            miCine.setCp(res.getInt("cp_cin"));
            listaCines.add(miCine);
        }
        System.out.println("hola 6");
        return listaCines;
    }

    /**
     * Metodo el cual pasando todos los parametros de un cine los actualiza.
     *
     * @throws SQLException Error al intentar ctualizar los datos de la BD.
     */
    public void modificarCine() throws SQLException {
        bd.actualizarTabla("Update cine set nombre_cin = '"
                + nombre + "', cif_cin = '"
                + cif + "', direccion_cin = '"
                + direccion + "', poblacion_cin = '"
                + poblacion + "', cp_cin = "
                + cp + " where idCine = " + idCine);
    }
    
    /**
     * Borra un cine al pasarle el id del cine.
     * @param _idCine
     * @throws SQLException 
     */
    public void borrarCineID(int _idCine) throws SQLException {
        bd.actualizarTabla("Delete * from cine where idCine = " + _idCine);
    }
    // </editor-fold>
}
