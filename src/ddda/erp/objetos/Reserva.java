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
    private int nFila;

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

    public int getnFila() {
        return nFila;
    }

    public void setnFila(int nFila) {
        this.nFila = nFila;
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
    public Reserva(int idReserva, int idPelicula, int idSesion, int idButaca, int nFila) {
        this.idReserva = idReserva;
        this.idPelicula = idPelicula;
        this.idSesion = idSesion;
        this.idButaca = idButaca;
        this.nFila = nFila;
    }

    /**
     * Creamos una reserva desde 0, pero sin ID de la reserva, ya que es
     * autoincremental.
     *
     * @param idPelicula
     * @param idSesion
     * @param idButaca
     */
    public Reserva(int idPelicula, int idSesion, int idButaca, int nFila) {
        this.idPelicula = idPelicula;
        this.idSesion = idSesion;
        this.idButaca = idButaca;
        this.nFila = nFila;
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
    public static void crearReserva(Reserva miReserva) throws SQLException {
                bd.actualizarTabla("Update butaca set "
                + "ocupada_but = 1 where idButaca = " + 
                miReserva.getIdButaca() + " and idSesion = " +
                miReserva.getIdSesion() + " and nFila_but = " +
                miReserva.getnFila());
                //Update butaca set ocupada_but = 1 where
                //idButaca = 1 and idSesion = 1 and nFila = 1
    }

    /**
     * Muestra las reservas segun id.
     *
     * @param _idReserva
     * @return
     * @throws SQLException
     */
    public static ArrayList<Butaca> mostrarReservasId(int _idSesion) throws SQLException {
        ArrayList<Butaca> misReservas = new ArrayList();
        Butaca miReserva;
        rs = bd.consultarTabla("select * from  butaca where idSesion = " + _idSesion + " and ocupada_but = 1");
        while (rs.next()) {
            miReserva = new Butaca();
            miReserva.setIdButaca(rs.getInt("idButaca"));
            miReserva.setIdSesion(rs.getInt("idSesion"));
            miReserva.setIdSala(rs.getInt("idSala"));
            miReserva.setnFila(rs.getInt("nFila_but"));
            miReserva.setOcupada(rs.getInt("ocupada_but"));
            misReservas.add(miReserva);
        }
        return misReservas;
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
        public static void borrarReserva(Reserva miReserva) throws SQLException {
                bd.actualizarTabla("Update butaca set "
                + "ocupada_but = 0 where idButaca = " + 
                miReserva.getIdButaca() + " and idSesion = " +
                miReserva.getIdSesion() + " and nFila_but = " +
                miReserva.getnFila());
                //Update butaca set ocupada_but = 1 where
                //idButaca = 1 and idSesion = 1 and nFila = 1
    }
    
    public static ArrayList getidButaca(int _idSesion, int _nFila) throws SQLException{
        ArrayList misIdButacas = new ArrayList();
        rs = bd.consultarTabla("Select * from butaca where idSesion = " + _idSesion + " and nFila_but = " +_nFila);
        rs.next();
        do{
           int idBut = rs.getInt("idButaca");
           misIdButacas.add(idBut);
       }while(rs.next());
       return misIdButacas;
    }
    
    public static Boolean evaluarButaca(int _idButaca, int _idSesion, int _nFila) throws SQLException{
        rs = bd.consultarTabla("select * from butaca where idButaca = " + _idButaca + " and  idSesion = " + _idSesion + " and nFila_but = " +_nFila);
        rs.next();
        if(rs.getBoolean("ocupada_but") == true){
            return true;
        }else{
            return false;
        }
    }
    // </editor-fold>

}
