/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.objetos;

import ddda.erp.core.CoreBD;
import java.sql.ResultSet;

/**
 *
 * @author juanxxiii
 */
public class Reserva {
    
    //Metodos para interactuar con la BD
    private CoreBD bd = new CoreBD();
    private String sql = null;
    private ResultSet rs = null;
    
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
    
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    
    /**
     * Creamos una reserva desde 0, con un ID asociado, este metodo no es apto para
     * introducir reservas en la BBDD ya que la base de datos asigna un ID
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
     * Creamos una reserva desde 0, pero sin ID de la reserva, ya que es autoincremental.
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

    

    
}
