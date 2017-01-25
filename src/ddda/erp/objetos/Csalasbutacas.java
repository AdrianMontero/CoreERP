/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.objetos;

import ddda.erp.core.CoreBD;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juanxxiii
 */
public class Csalasbutacas {

    //Metodos para interactuar con la BD.
    private CoreBD bd = new CoreBD();
    private String sql = null;
    private ResultSet rs = null;

    //Contadores
    private int nSalas = 10;
    private int nButacas = 10;
    private int nFila = 6;

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

}
