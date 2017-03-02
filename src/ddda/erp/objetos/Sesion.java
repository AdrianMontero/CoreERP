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
public class Sesion {

    //Metodos para interactuar con la BD
    private static CoreBD bd = new CoreBD();
    private static String sql = null;
    private static ResultSet rs = null;

    //Atributos del cine
    private int idSesion;
    private int idPelicula;
    private int idSala;
    private String hora_ses;

    public Sesion(int idPelicula, String idSala, int hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getIdSesion() {
        return idSesion;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public int getIdSala() {
        return idSala;
    }

    public String getHora_ses() {
        return hora_ses;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public void setHora_ses(String hora_ses) {
        this.hora_ses = hora_ses;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructores">
    public Sesion() {

    }

    public Sesion(int idSesion, int idPelicula, int idSala, String hora_ses) {
        this.idSesion = idSesion;
        this.idPelicula = idPelicula;
        this.idSala = idSala;
        this.hora_ses = hora_ses;
    }

    public Sesion(int idPelicula, int idSala, String hora_ses) {
        this.idPelicula = idPelicula;
        this.idSala = idSala;
        this.hora_ses = hora_ses;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Crear una Sesion.
     *
     * @throws SQLException
     */
    public void crearSesion() throws SQLException {
        bd.actualizarTabla("insert into sesion_pelicula values(null, '"
                + idPelicula + "', '"
                + idSala + "', "
                + hora_ses + ")");
    }

    /**
     * Muestra las sesiones para un idSesion
     *
     * @param _idSesion
     * @return
     * @throws SQLException
     */
    public Sesion mostrarSesionIdSesion(int _idSesion) throws SQLException {
        Sesion miSesion = new Sesion();
        rs = bd.consultarTabla("select * from sesion_pelicula where idSesion = " + _idSesion);
        while (rs.next()) {
            miSesion.setIdSesion(rs.getInt("idSesion"));
            miSesion.setIdPelicula(rs.getInt("idPelicula"));
            miSesion.setIdSala(rs.getInt("idSala"));
            miSesion.setHora_ses(rs.getString("hora_ses"));

        }
        return miSesion;
    }

    /**
     * Muestra las sesiones para un idSala
     *
     * @param _idSala
     * @return
     * @throws SQLException
     */
    public Sesion mostrarSesionIdSala(int _idSala) throws SQLException {
        Sesion miSesion = new Sesion();
        rs = bd.consultarTabla("select * from sesion_pelicula where idSesion = " + _idSala);
        while (rs.next()) {
            miSesion.setIdSesion(rs.getInt("idSesion"));
            miSesion.setIdPelicula(rs.getInt("idPelicula"));
            miSesion.setIdSala(rs.getInt("idSala"));
            miSesion.setHora_ses(rs.getString("hora_ses"));

        }
        return miSesion;
    }

    /**
     * Muestra todas las sesiones.
     *
     * @param listaSesiones
     * @return
     * @throws SQLException
     */
    public static ArrayList<Sesion> mostrarSesiones(ArrayList<Sesion> listaSesiones) throws SQLException {
        ResultSet res;
        Sesion miSesion = new Sesion();
        res = bd.consultarTabla("select * from sesion_pelicula");
        listaSesiones.clear();
        while (res.next()) {
            miSesion = new Sesion();
            miSesion.setIdSesion(res.getInt("idSesion"));
            miSesion.setIdPelicula(res.getInt("idPelicula"));
            miSesion.setIdSala(res.getInt("idSala"));
            miSesion.setHora_ses(res.getString("hora_ses"));

            listaSesiones.add(miSesion);
        }

        return listaSesiones;
    }

    /**
     * Modifica la sesion segn el id.
     *
     * @throws SQLException
     */
    public void modificarSesion() throws SQLException {
        bd.actualizarTabla("Update sesion_pelicula set "
                + "idPelicula = '" + idPelicula + "', "
                + "idSala = '" + idSala + "', "
                + "hora_ses = " + hora_ses + " "
                + "where idSesion = '" + idSesion + "'");
    }

    /**
     * Borra una sesion segun el id.
     *
     * @param _idSala
     * @throws SQLException
     */
    public void borrarSesionID(int _idSeseion) throws SQLException {
        bd.actualizarTabla("Delete from sesion_pelicula where idSesion = " + _idSeseion);
    }

    public static void crearButacasSesion(int _idSala, int numFilas, int numButacasXFila) throws SQLException {
        int idSesion = 0;
        rs = bd.consultarTabla("select idSesion from sesion_pelicula");
        while (rs.next()) {
            idSesion = rs.getInt("idSesion");
        }
        for (int j = 1; j <= numFilas; j++) {//Creamos la fila.

            for (int k = 1; k <= numButacasXFila; k++) {//Asignamos las butacas a la fila.

                bd.actualizarTabla("insert into butaca values(" + k + "," + idSesion + "," + _idSala + "," + j + ",0)");

            }
        }
    }

    //Metodos de la clase reserva
    public static ArrayList<Sesion> mostrarPeliculasSesiones(ArrayList<Sesion> listaSesiones) throws SQLException {
        ResultSet res;
        Sesion miSesion = new Sesion();
        res = bd.consultarTabla("select * from sesion_pelicula group by idPelicula");
        listaSesiones.clear();
        while (res.next()) {
            miSesion = new Sesion();
            miSesion.setIdSesion(res.getInt("idSesion"));
            miSesion.setIdPelicula(res.getInt("idPelicula"));
            miSesion.setIdSala(res.getInt("idSala"));
            miSesion.setHora_ses(res.getString("hora_ses"));

            listaSesiones.add(miSesion);
        }

        return listaSesiones;
    }

    /**
     * Muestra las sesiones para un idPelicula
     *
     * @param _idPelicula
     * @return
     * @throws SQLException
     */
    public static ArrayList<Sesion> mostrarSesionIdPelicula(int _idPelicula) throws SQLException {
        ArrayList<Sesion> misSesiones = new ArrayList();
        Sesion miSesion;
        rs = bd.consultarTabla("select * from sesion_pelicula where idPelicula = " + _idPelicula);
        while (rs.next()) {
            miSesion = new Sesion();
            miSesion.setIdSesion(rs.getInt("idSesion"));
            miSesion.setIdPelicula(rs.getInt("idPelicula"));
            miSesion.setIdSala(rs.getInt("idSala"));
            miSesion.setHora_ses(rs.getString("hora_ses"));
            misSesiones.add(miSesion);
        }
        return misSesiones;
    }
    

    // </editor-fold>
}
