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
public class Reserva {

    //Metodos para interactuar con la BD
    private static CoreBD bd = new CoreBD();
    private static String sql = null;
    private static ResultSet rs = null;

    private int idReserva;
    private int idPelicula;
    private int idSesion;
    private int idButaca;

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getIdReserva() {
        return idReserva;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public int getIdSesion() {
        return idSesion;
    }

    public int getIdButaca() {
        return idButaca;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setter">
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public void setIdButaca(int idButaca) {
        this.idButaca = idButaca;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Constructor vacio.
     */
    public Reserva() {
    }

    /**
     * Creamos una reserva desde 0, con un ID asociado, este metodo no es apto
     * para introducir reservas en la BBDD ya que la base de datos asigna un ID
     * automaticamente, es para recibir datos de la BD.
     *
     * @param idReserva
     * @param idPelicula
     * @param idSesion
     * @param idButaca
     */
    public Reserva(int idReserva, int idPelicula, int idSesion, int idButaca) {
        this.idReserva = idReserva;
        this.idPelicula = idPelicula;
        this.idSesion = idSesion;
        this.idButaca = idButaca;
    }

    /**
     * Creamos una reserva desde 0, pero sin ID de la reserva, ya que es
     * autoincremental.
     *
     * @param idPelicula
     * @param idSesion
     * @param idButaca
     */
    public Reserva(int idPelicula, int idSesion, int idButaca) {
        this.idPelicula = idPelicula;
        this.idSesion = idSesion;
        this.idButaca = idButaca;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Para crear la reserva hay que pasarle el idPelicula, idSesion y el
     * idButaca.
     *
     * @param _idPelicula
     * @param idSesion
     * @param idButaca
     * @throws SQLException
     */
    public void crearReserva(int _idPelicula, int _idSesion, int _idButaca) throws SQLException {
        bd.actualizarTabla("insert into reserva values(null, "
                + idPelicula + ", "
                + idSesion + ", "
                + idButaca + ")");
    }

    /**
     * Muestra las reservas segun id.
     *
     * @param _idReserva
     * @return
     * @throws SQLException
     */
    public Reserva mostrarReservaId(int _idReserva) throws SQLException {
        Reserva miReserva = new Reserva();
        rs = bd.consultarTabla("select * from  cine where idCine = " + _idReserva);
        while (rs.next()) {
            miReserva.setIdReserva(rs.getInt("idReserva"));
            miReserva.setIdPelicula(rs.getInt("idPelicula"));
            miReserva.setIdSesion(rs.getInt("idSesion"));
            miReserva.setIdButaca(rs.getInt("idButaca"));

        }
        return miReserva;
    }

    /**
     * Muestra todas las reservas que hay en la base de datos.
     *
     * @param listaReservas
     * @return
     * @throws SQLException
     */
    public static ArrayList<Reserva> mostrarReservas(ArrayList listaReservas) throws SQLException {
        ResultSet res;
        Reserva miReserva = new Reserva();
        res = bd.consultarTabla("select * from reserva");
        listaReservas.clear();
        while (res.next()) {
            miReserva = new Reserva();

            miReserva.setIdReserva(res.getInt("idCine"));
            miReserva.setIdPelicula(res.getInt("idPelicula"));
            miReserva.setIdSesion(res.getInt("idSesion"));
            miReserva.setIdButaca(res.getInt("idButaca"));

            listaReservas.add(miReserva);
        }

        return listaReservas;
    }

    /**
     * Modifica las reservas en funcion a un idReserva.
     *
     * @throws SQLException
     */
    public void modificarReserva() throws SQLException {
        bd.actualizarTabla("Update reserva set "
                + "idPelicula = " + idPelicula + ", "
                + "idSesion = " + idSesion + ","
                + " idButaca = " + idButaca
                + "where idReserva = " + idReserva);
    }

    /**
     * Borra una reserva segun idReserva.
     *
     * @param _idReserva
     * @throws SQLException
     */
    public void borrarReservaID(int _idReserva) throws SQLException {
        bd.actualizarTabla("Delete from reserva where idReserva = " + _idReserva);
    }
    // </editor-fold>

}
