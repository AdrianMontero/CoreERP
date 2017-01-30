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
public class Pelicula {

    //Metodos para interactuar con la BD.
    private static CoreBD bd = new CoreBD();
    private static String sql = null;
    private static ResultSet rs = null;

    private int idPelicula;
    private String nombre;
    private int duracion;
    private int edad;

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getIdPelicula() {
        return idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdad() {
        return edad;
    }

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setter">
    public void setBd(CoreBD bd) {
        this.bd = bd;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Constructor para recibir peliculas en la interfaz.
     *
     * @param idPelicula Id asignado por la BD para la pelicula
     * @param nombre Nombre de la pelucula
     * @param duracion Duracion de la pelicula (en minutos)
     * @param edad Edad de la pelicula (en años)
     */
    public Pelicula(int idPelicula, String nombre, int duracion, int edad) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.duracion = duracion;
        this.edad = edad;
    }

    /**
     * Constructor usado para guardar peliculas en la BD
     *
     * @param nombre Nombre de la pelucula
     * @param duracion Duracion de la pelicula (en minutos)
     * @param edad Edad de la pelicula (en años)
     */
    public Pelicula(String nombre, int duracion, int edad) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.edad = edad;
    }

    /**
     * Constructor vacio.
     */
    private Pelicula() {
    }

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Crea una nueva pelicula
     *
     * @param _pelicula Objeto pelicula con todos los datos a introducir en la
     * BD (SIN id)
     * @throws SQLException Error al introducir los datos en la BD
     */
    public void crearPelicula(Pelicula _pelicula) throws SQLException {
        bd.actualizarTabla("Insert into pelicula values(null, '" + _pelicula.nombre
                + "', " + _pelicula.duracion
                + ", " + _pelicula.edad + ")");
    }

    /**
     * Muestra todas las peliculas de la BD
     *
     * @return ArrayList del tipo Pelicula con toda la informacion de todos las
     * peliculas de la BD
     * @throws SQLException Error al intentar crear el objeto en la BD
     */
    public static ArrayList<Pelicula> mostrarPeliculas(ArrayList listaPeliculas) throws SQLException {
        Pelicula miPelicula;
        rs = bd.consultarTabla("select * from  pelicula");
        listaPeliculas.clear();
        while (rs.next()) {
            miPelicula = new Pelicula();
            miPelicula.setIdPelicula(rs.getInt("idPelicula"));
            miPelicula.setNombre(rs.getString("nombre_pel"));
            miPelicula.setDuracion(rs.getInt("duracion_pel"));
            miPelicula.setEdad(rs.getInt("edad_pel"));
            listaPeliculas.add(miPelicula);
        }
        return listaPeliculas;
    }

    /**
     * Muestra la pelicula correspondiente al id introducido
     *
     * @param _idPelicula Id usado para la busqueda en la BD
     * @return Objeto del tipo Pelicula con todos los datos completados de la BD
     * @throws SQLException Error al intentar crear el objeto en la BD
     */
    public Pelicula mostrarPeliculaId(int _idPelicula) throws SQLException {
        Pelicula miPelicula = null;
        bd.consultarTabla("Select * from pelicula where idPelicula = " + _idPelicula);
        while (rs.next()) {
            miPelicula = new Pelicula(
                    rs.getInt("idPelicula"),
                    rs.getString("nombre_pel"),
                    rs.getInt("duracion_pel"),
                    rs.getInt("edad_pel"));
        }
        return miPelicula;
    }

    /**
     * Muestra las peliculas que aparecen por un nombre X
     *
     * @param _nombre Parametro usado para hacer la busqueda en la BD
     * @return ArrayList de tipo Pelicula que contiene la lista de peliculas de
     * la BD
     * @throws SQLException Error al intentar recuperar el objeto
     */
    public ArrayList<Pelicula> mostrarPeliculasNombre(String _nombre) throws SQLException {
        ArrayList<Pelicula> misPeliculas = new ArrayList();
        Pelicula miPelicula;
        bd.consultarTabla("Select * from pelicula where Lower(nombre_pel) = Lower('" + _nombre + "')");
        while (rs.next()) {
            miPelicula = new Pelicula(
                    rs.getInt("idPelicula"),
                    rs.getString("nombre_pel"),
                    rs.getInt("duracion_pel"),
                    rs.getInt("edad_pel"));
            misPeliculas.add(miPelicula);
        }
        return misPeliculas;
    }

    /**
     * Borra una pelicula segun el id.
     *
     * @param _idPelicula Id usado para realizar el borrado
     * @throws SQLException Borrar el objeto
     */
    public void borrarPeliculaID(int _idPelicula) throws SQLException {
        bd.actualizarTabla("Delete from pelicula where idPelicula = " + _idPelicula);
    }
    
    /**
     * Borra una pelicula segun el nombre.
     *
     * @param _nombre Nombre usado para realizar el borrado
     * @throws SQLException Borrar el objeto
     */
    public void borrarPeliculaNombre(String _nombre) throws SQLException {
        bd.actualizarTabla("Delete from pelicula where nombre_pel = '" + _nombre + "'");
    }

    /**
     * Modifica un cliente antoguo con sus datos nuevos
     *
     * @param _pelicula Objeto pelicula con todos los datos necesarios para el
     * update, incluido el ID.
     * @throws SQLException Error al modificar el objeto
     */
    public void modificarPelicula() throws SQLException {
        bd.actualizarTabla("Update pelicula set nombre_pel = '" + nombre
                + "', duracion_pel = " + duracion
                + ", edad_pel = " + edad
                + " where idPelicula = " + idPelicula);
    }
    // </editor-fold>
}
