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
    private CoreBD bd = new CoreBD();
    private String sql = null;
    private ResultSet rs = null;

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

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Crea una nueva pelicula
     * @param _pelicula Objeto pelicula con todos los datos a introducir en la BD (SIN id)
     * @throws SQLException Error al introducir los datos en la BD
     */
    public void crearPelicula(Pelicula _pelicula) throws SQLException {
        bd.actualizarTabla("Insert into pelicula values(null, '" + _pelicula.nombre
                + "', '" + _pelicula.duracion
                + "', '" + _pelicula.edad + ")");
    }
    
    //Sin modificar

    /**
     * Muestra todas las peliculas de la BD
     *
     * @return ArrayList del tipo Pelicula con toda la informacion de todos las
     * peliculas de la BD
     * @throws SQLException Error al intentar crear el objeto en la BD
     */
    public ArrayList<Pelicula> mostrarPeliculas() throws SQLException {
        ArrayList<Pelicula> misPeliculas = new ArrayList();
        Pelicula miPelicula = null;
        rs = bd.consultarTabla("select * from  pelicula");
        while (rs.next()) {
            miPelicula = new Pelicula(rs.getInt("idPelicula"), rs.getString("nombre_pel"), rs.getInt("duracion_pel"), rs.getInt("edad_pel"));
            misPeliculas.add(miPelicula);
        }
        return misPeliculas;
    }

    /**
     * Muestra el cliente correspondiente al id introducido
     *
     * @param _idCliente Id usado para la busqueda en la BD
     * @throws SQLException Error al intentar crear el objeto en la BD
     */
    public Pelicula mostrarPeliculaId(int _idPelicula) throws SQLException {
        Pelicula miPelicula = null;
        bd.consultarTabla("Select * from pelicula where idPelicula = " + _idPelicula + "");
        while (rs.next()) {
            miPelicula = new Pelicula(rs.getInt("idPelicula"), rs.getString("nombre_pel"), rs.getInt("duracion_pel"), rs.getInt("edad_pel"));
        }
        return miPelicula;
    }

    public ArrayList<Cliente> mostrarClientesNombre(String _nombre) throws SQLException {
        ArrayList<Cliente> misClientes = new ArrayList();
        Cliente miCliente = null;
        bd.consultarTabla("Select * from cliente where Lower(nombre_cli) = Lower(" + _nombre + ")");
        while (rs.next()) {
            miCliente = new Cliente(rs.getInt("idCliente"), rs.getString("dni_cli"), rs.getString("nombre_cli"), rs.getString("apellidos_cli"), rs.getInt("cp_cli"), rs.getInt("puntos_cli"), rs.getString("usuario_clie"), rs.getString("contrasena"));
            misClientes.add(miCliente);
        }
        return misClientes;
    }

    /**
     * Borra un cliente segun id.
     *
     * @param _idCliente
     * @throws SQLException Error al cargar la BD
     */
    public void borrarClienteID(int _idCliente) throws SQLException {
        bd.actualizarTabla("Delete * from cliente where idCliente = " + _idCliente);
    }

    /**
     * Modifica un cliente antoguo con sus datos nuevos
     *
     * @param _cliente Objeto cliente con todos los datos necesarios para el
     * update, incluido el ID.
     * @throws SQLException
     */
    public void modificarCliente(Cliente _cliente) throws SQLException {
        bd.actualizarTabla("Update cliente set dni_cli = " + _cliente.dni
                + ", nombre_cli = " + _cliente.nombre
                + ", apellidos_cli = " + _cliente.apellidos
                + ", cp_cli = " + _cliente.cp
                + ", puntos_cli = " + _cliente.puntos
                + ", usuario_cli = " + _cliente.usuario
                + ", contrasena_cli = " + _cliente.contrasena
                + " where Lower(idCliente) = " + _cliente.idCliente);
    }
    // </editor-fold>
}
