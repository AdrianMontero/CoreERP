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
public class Sala {

    //Metodos para interactuar con la BD.
    private CoreBD bd = new CoreBD();
    private String sql = null;
    private ResultSet rs = null;

    public void crearSalas(int _idCine) throws SQLException {
        for (int i = 0; i < 10; i++) {

            bd.actualizarTabla("insert into sala values(null,'sala" + i + "',100," + _idCine + ")");
            
        }
    }

}
