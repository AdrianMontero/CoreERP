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
public class Cine {

    //Atributos del cine
    private int idCine;
    private String nombreCine;
    private String cif;
    private String direccion;
    private String poblacion;
    private int cp;
    private int nSalas;

    //Constructores
    /**
     * Creamos un cine desde 0, pero sin ID del Cine, ya que es autoincremental
     *
     * @param nombreCine Nombre del cine
     * @param cif Cif del cine
     * @param direccion Direccion del cine
     * @param poblacion Poblacion del cine
     * @param cp Codigo Postal del cine
     * @param nSalas Numero de salas del cine
     */
    public Cine(String nombreCine, String cif, String direccion, String poblacion, int cp, int nSalas) {
        this.nombreCine = nombreCine;
        this.cif = cif;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.cp = cp;
        this.nSalas = nSalas;
    }

    /**
     * Creamos un cine desde 0, con un ID asociado, este metodo no es apto para
     * introducir cines en la BBDD ya que la base de datos asigna un ID
     * automaticamente, es para recibir datos de la BD
     *
     * @param idCine Id del cine
     * @param nombreCine Nombre del cine
     * @param cif Cif del cine
     * @param direccion Direccion del cine
     * @param poblacion Poblacion del cine
     * @param cp Codigo Postal del cine
     * @param nSalas Numero de salas del cine
     */
    public Cine(int idCine, String nombreCine, String cif, String direccion, String poblacion, int cp, int nSalas) {
        this.idCine = idCine;
        this.nombreCine = nombreCine;
        this.cif = cif;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.cp = cp;
        this.nSalas = nSalas;
    }

    //Getter
    public int getIdCine() {
        return idCine;
    }

    public String getNombreCine() {
        return nombreCine;
    }

    public String getCif() {
        return cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public int getCp() {
        return cp;
    }

    public int getnSalas() {
        return nSalas;
    }

}
