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
 * @author adria
 */
public class Cine {

    //Metodos para interactuar con la BD
    private CoreBD bd = new CoreBD();
    private String sql = null;
    private ResultSet rs = null;

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
    // <editor-fold defaultstate="collapsed" desc="Constructores">
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

    //Metodos
    /**
     * Creacion de un cine en la BD con id en null, ya que lo gestiona la BD
     *
     * @param _cine Clase con todos los atributos del cine ya definidos (nombre,
     * cif)
     * @throws SQLException error al crear el cine
     */
    public void crearCine(Cine _cine) throws SQLException {
        bd.actualizarTabla("insert into cine values(null, " + _cine.getNombre() + ", " + _cine.getCif() + ", " + _cine.getDireccion() + ", " + _cine.getPoblacion() + ", " + _cine.getCp() + ")");
    }

    /**
     * Muestra toda la informacion asociada a un cine, buscando por su ID
     *
     * @param _idCine Id por el que se buscaran los cines
     * @return Objeto de tipo cine con todos los atributos
     * @throws SQLException Error al encontrar el objeto en la base de datos
     */
    public Cine mostrarCineId(int _idCine) throws SQLException {
        Cine miCine = null;
        rs = bd.consultarTabla("select * from  cine where Lower(nombre_cin) = Lower(" + _idCine + ")");
        while (rs.next()) {
            miCine = new Cine(rs.getInt("_idCine"), rs.getString("nombre_cin"), rs.getString("cif_cin"), rs.getString("direccion_cin"), rs.getString("poblacion_cin"), rs.getInt("cp_cin"));
        }
        return miCine;
    }

    /**
     * Muestra todos los cines de la base de datos
     *
     * @return devuelve un array del tipo cine
     * @throws SQLException Error alencontrar el objeto en la base de datos
     */
    public ArrayList mostrarCines() throws SQLException {
        ArrayList<Cine> misCines = new ArrayList();
        Cine miCine = null;
        rs = bd.consultarTabla("select * from  cine");
        while (rs.next()) {
            miCine = new Cine(rs.getInt("_idCine"), rs.getString("nombre_cin"), rs.getString("cif_cin"), rs.getString("direccion_cin"), rs.getString("poblacion_cin"), rs.getInt("cp_cin"));
            misCines.add(miCine);
        }
        return misCines;
    }

    /**
     * Metodo el cual pasando todos los parametros de un cine los actualiza.
     *
     * @param _idCine Id usado para buscar el cine el cual se va a actualizar.
     * @param _cine Datos nuevos del cine.
     * @throws SQLException Error al intentar ctualizar los datos de la BD.
     */
    public void modificarCine(int _idCine, Cine _cine) throws SQLException {
        bd.actualizarTabla("Update cine set nombre_cin = " + _cine.nombre + ", cif_cin = " + _cine.cif + ", direccion_cin = " + _cine.direccion + ", poblacion_cin = " + _cine.poblacion + ", cp_cin = " + _cine.cp + " where Lower(nombre_cin) = Lower(" + _idCine + ")");
    }
    
}
