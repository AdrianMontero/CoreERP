/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddda.erp.objetos;

/**
 *
 * @author adria
 */
public class Butaca {
    private int idButaca;
    private int idSesion;
    private int idSala;
    private int nFila;
    private int ocupada;

    public int getIdButaca() {
        return idButaca;
    }

    public void setIdButaca(int idButaca) {
        this.idButaca = idButaca;
    }

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getnFila() {
        return nFila;
    }

    public void setnFila(int nFila) {
        this.nFila = nFila;
    }

    public int getOcupada() {
        return ocupada;
    }

    public void setOcupada(int ocupada) {
        this.ocupada = ocupada;
    }

    public Butaca(int idButaca, int idSesion, int idSala, int nFila, int ocupada) {
        this.idButaca = idButaca;
        this.idSesion = idSesion;
        this.idSala = idSala;
        this.nFila = nFila;
        this.ocupada = ocupada;
    }

    public Butaca() {
    }
    
    
}
