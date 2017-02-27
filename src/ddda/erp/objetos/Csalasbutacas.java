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
public class Csalasbutacas {

    //Metodos para interactuar con la BD.
    private static CoreBD bd = new CoreBD();
    private static String sql = null;
    private static ResultSet rs = null;

    //Contadores
    private int nSalas = 10;
    private int nButacas = 10;
    private int nFila = 6;
    private int idSala;
    private String nombreSal;
    private int idCine;

    public int getnSalas() {
        return nSalas;
    }

    public void setnSalas(int nSalas) {
        this.nSalas = nSalas;
    }

    public int getnButacas() {
        return nButacas;
    }

    public void setnButacas(int nButacas) {
        this.nButacas = nButacas;
    }

    public int getnFila() {
        return nFila;
    }

    public void setnFila(int nFila) {
        this.nFila = nFila;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getNombreSal() {
        return nombreSal;
    }

    public void setNombreSal(String nombreSal) {
        this.nombreSal = nombreSal;
    }

    public int getIdCine() {
        return idCine;
    }

    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }
    
    

    /**
     * Creación de las salas y las butacas de cada cine.
     * @param _idCine id del cine en el que se van a crear las salas y las butacas.
     * @throws SQLException 
     */
    public void crearSalasButacas(int _idCine) throws SQLException {
        int idSala = 0;
        for (int i = 0; i < nSalas; i++) {//Creamos la sala.

            bd.actualizarTabla("insert into sala values(null,'sala" + i + "'," + _idCine + ")");
            rs = bd.consultarTabla("select idSala from sala where idCine = " + _idCine + " and nombre_sal = sala" + i);
            rs.next();
            idSala = rs.getInt("idSala");

            for (int j = 0; j < nFila; j++) {//Creamos la fila.

                for (int k = 0; k < nButacas; k++) {//Asignamos las butacas a la fila.

                    bd.actualizarTabla("insert into butaca values(null," + idSala + "'," + j + ")");

                }
            }
        }
    }
    
    public void borrarSalasButacas(int _idCine) throws SQLException {
        int idSala = 0;
        
        bd.consultarTabla("select idSala from sala where idCine = " + _idCine);
         rs.next();
         idSala = rs.getInt("idSala");
         
        bd.actualizarTabla("Delete from sala where idCine = " + _idCine );
        bd.actualizarTabla("Delete from butaca where idSala = " + idSala);
        
    }
    
    public static ArrayList<Csalasbutacas> mostrarSalas(ArrayList listaSalas) throws SQLException {
        ResultSet res;
        Csalasbutacas miSala = new Csalasbutacas();
        res = bd.consultarTabla("select * from sala");
        listaSalas.clear();
        while(res.next()) {
            miSala = new Csalasbutacas();
            miSala.setIdSala(res.getInt("idSala"));
            miSala.setNombreSal(res.getString("nombre_sal"));
            miSala.setIdCine(res.getInt("idCine"));
            listaSalas.add(miSala);
        }
        return listaSalas;
    }
}
