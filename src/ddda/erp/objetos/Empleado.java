/*
 * Clase de gestion de empleados
 */
package ddda.erp.objetos;

import ddda.erp.core.CoreBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
     * @param _empleado Datos del empleado.
     * @throws SQLException Error al cargar la BD.
     */
    public void crearEmpleado(Empleado _empleado) throws SQLException {
        bd.actualizarTabla("Insert into empleados values(null, "
                + _empleado.dni + ", '"
                + _empleado.nombre+ "', '"
                + _empleado.apellido + "', '"
                + _empleado.fechaInicio + "', '"
                + _empleado.cargo + "', '"
                + _empleado.usuario + "', '"
                + _empleado.contrasena + "', "
                + _empleado.idCine + ")");
    }

    /**
     * Muestra todos los empleados.
     * 
     * @return Resultado de la busqueda.
     * @throws SQLException Error al cargar la BD
     */
    public ArrayList<Empleado> mostrarEmpleados() throws SQLException {
        Empleado miEmpleado = null;
        ArrayList<Empleado> misEmpleados = new ArrayList();
        rs = bd.consultarTabla("Select * from empleado");
        while (rs.next()) {
            miEmpleado = new Empleado(rs.getInt("idEmpleado"),
                    rs.getString("dni_emp"),
                    rs.getString("nombre_emp"),
                    rs.getString("apellidos_emp"),
                    rs.getString("fechaInicio_emp"),
                    rs.getString("cargo_emp"),
                    rs.getString("usuario_emp"),
                    rs.getString("contrasena_emp"),
                    rs.getInt("idCine"));
            misEmpleados.add(miEmpleado);
        }
        return misEmpleados;
    }

    /**
     * Muestra empleado segun id.
     * 
     * @param _idEmpleado Id del empleado a mostrar.
     * @return Resultado de la busqueda.
     * @throws SQLException Error al cargar la BD
     */
    public Empleado mostrarEmpleadoID(int _idEmpleado) throws SQLException {
        Empleado miEmpleado = null;
        rs = bd.consultarTabla("Select * from empleado where idEmpleado =" + _idEmpleado + "");
        while (rs.next()) {
            miEmpleado = new Empleado(rs.getInt("idEmpleado"),
                    rs.getString("dni_emp"),
                    rs.getString("nombre_emp"),
                    rs.getString("apellidos_emp"),
                    rs.getString("fechaInicio_emp"),
                    rs.getString("cargo_emp"),
                    rs.getString("usuario_emp"),
                    rs.getString("contrasena_emp"),
                    rs.getInt("idCine"));
        }
        return miEmpleado;
        
    }

    /**
     * Busca empleado segun nombre.
     *
     * @param _nombreEmp Nombre usado para la busqueda.
     * @return Resultado de la busqueda.
     * @throws SQLException Error al cargar la BD.
     */
    public ArrayList<Empleado> mostrarEmpleadoNombre(String _nombreEmp) throws SQLException {
        Empleado miEmpleado = null;
        ArrayList<Empleado> misEmpleados = new ArrayList();
        rs = bd.consultarTabla("Select * from empleado where nombre_emp =" + _nombreEmp + "");

        while (rs.next()) {
            miEmpleado = new Empleado(rs.getInt("idEmpleado"),
                    rs.getString("dni_emp"),
                    rs.getString("nombre_emp"),
                    rs.getString("apellidos_emp"),
                    rs.getString("fechaInicio_emp"),
                    rs.getString("cargo_emp"),
                    rs.getString("usuario_emp"),
                    rs.getString("contrasena_emp"),
                    rs.getInt("idCine"));
            misEmpleados.add(miEmpleado);
        }
        return misEmpleados;
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
        bd.actualizarTabla("Update empleado set "
                + "dni_emp=" + _empleado.dni
                + ",nombre_emp='" + _empleado.nombre
                + "',apellidos_emp='" + _empleado.apellido
                + "',fechaInicio_emp='" + _empleado.fechaInicio
                + "',cargo_emp='" + _empleado.cargo
                + "',usuario_emp='" + _empleado.usuario
                + "',contrasena_emp='" + _empleado.contrasena
                + "',idCine=" + _empleado.getIdCine()
                + "where dni_emp =" + _empleado.dni);
    }
    // </editor-fold>
}
