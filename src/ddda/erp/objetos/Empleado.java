/*
 * Clase de gestion de empleados
 */
package ddda.erp.objetos;

import ddda.erp.core.CoreBD;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Team CoreERP
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

    // <editor-fold defaultstate="collapsed" desc="Getters">
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

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Constructores">
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

    // </editor-fold>
    
    //Los metodos de consulta tienen contructores que no devuelven nada cuando tienen que hacerlo
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Creamos un nuevo empleado.
     *
     * @param _empleado
     * @throws SQLException Error al cargar la BD
     */
    public void crearEmpleado(Empleado _empleado) throws SQLException {
        bd.actualizarTabla("Insert into empleados values(null, " + _empleado.getDni()
                + ", " + _empleado.getNombre() + ", " + _empleado.getApellido() + ", " + _empleado.getFechaInicio() + ", " + _empleado.getCargo() + ", " + _empleado.getUsuario() + ", " + _empleado.getContrasena() + ", " + _empleado.getIdCine() + ")");
    }

    /**
     * Muestra todos los empleados.
     *
     * @throws SQLException Error al cargar la BD
     */
    public void mostrarEmpleados() throws SQLException {
        bd.consultarTabla("Select * from empleado");
    }

    /**
     * Muestra empleado segun id.
     *
     * @param _idEmpleado Parametro usado para realizar la busqueda de empleados
     * @throws SQLException SQLException Error al cargar la BD
     */
    public void mostrarEmpleadoID(int _idEmpleado) throws SQLException {
        bd.consultarTabla("Select * from empleado where idEmpleado =" + _idEmpleado + "");
    }

    /**
     * Busca empleado segun nombre.
     *
     * @param _nombreEmp Nombre usado para la busqueda
     * @throws SQLException Error al cargar la BD
     */
    public void mostrarEmpleadoNombre(String _nombreEmp) throws SQLException {
        bd.consultarTabla("Select * from empleado where nombre_emp =" + _nombreEmp + "");
    }

    /**
     * Borra un empleadao segun id.
     *
     * @param _idEmpleado Id usado para seleccionar el empleado a borrar
     * @throws SQLException Error al cargar la BD
     */
    public void borrarEmpleadoID(int _idEmpleado) throws SQLException {
        bd.actualizarTabla("Delete * from empleado where idEmpleado =" + _idEmpleado);
    }

    /**
     * Modifica un empleado.
     *
     * @param _empleado Parametro con todos los datos nuevos del usuario (tienen
     * que estar todos para que el metodo funcione)
     * @throws SQLException Error al cargar la BD
     */
    public void modificarEmpleado(Empleado _empleado) throws SQLException {
        bd.actualizarTabla("Update empleado set dni_emp=" + _empleado.getDni()
                + ",nombre_emp=" + _empleado.getNombre()
                + ",apellidos_emp=" + _empleado.getApellido()
                + ",fechaInicio_emp=" + _empleado.getFechaInicio()
                + ",cargo_emp=" + _empleado.getCargo()
                + ",usuario_emp=" + _empleado.getUsuario()
                + ",contrasena_emp=" + _empleado.getContrasena()
                + ",idCine=" + _empleado.getIdCine());
    }
    // </editor-fold>
}
