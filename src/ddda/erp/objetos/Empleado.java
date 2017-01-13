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
public class Empleado {

    //Metodos para interactuar con la BD.
    private CoreBD bd = new CoreBD();
    private String sql = null;
    private ResultSet rs = null;

    //Atributos del empleado.
    private int idEmpleado;
    private String dni;
    private String nombre;
    private String apellido;
    private String fechaInicio;
    private String cargo;
    private String usuario;
    private String contrasena;
    private int idCine;

    /**
     * Construtor del empleado con el idEmpleado que no sera utilizado al crear
     * un nuevo cine puesto que el id es autoincremental.
     *
     * @param idEmpleado id del empleado.
     * @param dni dni del empleado.
     * @param nombre nombre del empleado.
     * @param apellido apellidos del empleado.
     * @param fechaInicio fecha de inicio de alta.
     * @param cargo puesto que ocupa el empleado.
     * @param usuario usuario de sesión.
     * @param contrasena contraseña de sesión.
     * @param idCine id del cine al que esta asociado.
     */
    public Empleado(int idEmpleado, String dni, String nombre, String apellido, String fechaInicio, String cargo, String usuario, String contrasena, int idCine) {
        this.idEmpleado = idEmpleado;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaInicio = fechaInicio;
        this.cargo = cargo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.idCine = idCine;
    }

    /**
     * Construtor del empleado con el idEmpleado que no sera utilizado al crear
     * un nuevo cine puesto que el id es autoincremental.
     *
     * @param dni dni del empleado.
     * @param nombre nombre del empleado.
     * @param apellido apellidos del empleado.
     * @param fechaInicio fecha de inicio de alta.
     * @param cargo puesto que ocupa el empleado.
     * @param usuario usuario de sesión.
     * @param contrasena contraseña de sesión.
     * @param idCine id del cine al que esta asociado.
     */
    public Empleado(String dni, String nombre, String apellido, String fechaInicio, String cargo, String usuario, String contrasena, int idCine) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaInicio = fechaInicio;
        this.cargo = cargo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.idCine = idCine;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getCargo() {
        return cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getIdCine() {
        return idCine;
    }

    /**
     * Creamos un nuevo empleado.
     *
     * @param _empleado
     * @throws SQLException
     */
    public void crearEmpleado(Empleado _empleado) throws SQLException {
        bd.actualizarTabla("insert into empleados values(null, " + _empleado.getDni() + ", " + _empleado.getNombre() + ", " + _empleado.getApellido() + ", " + _empleado.getFechaInicio() + ", " + _empleado.getCargo() + ", " + _empleado.getUsuario() + ", " + _empleado.getContrasena() + ", " + _empleado.getIdCine() + ")");
    }

    /**
     * Muestra todos los empleados.
     *
     * @param _empleado
     * @throws SQLException
     */
    public void mostrarEmpleados(Empleado _empleado) throws SQLException {
        bd.consultarTabla("Select * from empleado");
    }

    /**
     * Muestra empleado segun id.
     *
     * @param _empleado
     * @throws SQLException
     */
    public void mostrarEmpleadoID(Empleado _empleado) throws SQLException {
        bd.consultarTabla("Select * from empleado where idEmpleado =" + _empleado.getIdEmpleado() + "");
    }

    /**
     * Busca empleado segun nombre.
     *
     * @param _empleado
     * @throws SQLException
     */
    public void mostrarEmpleadoNombre(Empleado _empleado) throws SQLException {
        bd.consultarTabla("Select * from empleado where nombre_emp =" + _empleado.getNombre() + "");
    }

    /**
     * Borrar empleado segun id.
     *
     * @param _empleado
     * @throws SQLException
     */
    public void borrarEmpleadoID(Empleado _empleado) throws SQLException {
        bd.consultarTabla("Delete * from empleado where idEmpleado =" + _empleado.getIdEmpleado() + "");
    }

    /**
     * Modifica un empleado.
     *
     * @param _empleado
     * @throws SQLException
     */
    public void modificarEmpleado(Empleado _empleado) throws SQLException {
        bd.consultarTabla("Update empleado set dni_emp=" + _empleado.getDni() + ",nombre_emp=" + _empleado.getNombre() + ",apellidos_emp=" + _empleado.getApellido() + ",fechaInicio_emp=" + _empleado.getFechaInicio() + ",cargo_emp=" + _empleado.getCargo() + ",usuario_emp=" + _empleado.getUsuario() + ",contrasenia_emp=" + _empleado.getContrasena() + ",idCine=" + _empleado.getIdCine() + "");
    }

}
