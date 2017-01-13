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
public class Cliente {

    //Metodos para interactuar con la BD.
    private CoreBD bd = new CoreBD();
    private String sql = null;
    private ResultSet rs = null;

    //Atributos del empleado.
    private int idCliente;
    private String dni;
    private String nombre;
    private String apellidos;
    private int cp;
    private int puntos;
    private String usuario;
    private String contrasena;

    // <editor-fold defaultstate="collapsed" desc="Getters">

    public CoreBD getBd() {
        return bd;
    }

    public String getSql() {
        return sql;
    }

    public ResultSet getRs() {
        return rs;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCp() {
        return cp;
    }

    public int getPuntos() {
        return puntos;
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
     * Constructor usado para devolver datos a la interfaz, ya que lleva idCliente
     * @param idCliente Id del cliente
     * @param dni dni del cliente
     * @param nombre Nombre del cliente
     * @param apellidos Apellidos del cliente
     * @param cp Codigo postal del cliente
     * @param puntos Puntos acumulados por el cliente
     * @param usuario Nombre de usuario del cliente para la web
     * @param contrasena Contraseña de la web para el cliente
     */
    public Cliente(int idCliente, String dni, String nombre, String apellidos, int cp, int puntos, String usuario, String contrasena) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cp = cp;
        this.puntos = puntos;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    /**
     * Constructor usado para recibir datos de la interfaz, no usa ID
     * @param dni dni del cliente
     * @param nombre Nombre del cliente
     * @param apellidos Apellidos del cliente
     * @param cp Codigo postal del cliente
     * @param puntos Puntos acumulados por el cliente
     * @param usuario Nombre de usuario del cliente para la web
     * @param contrasena Contraseña de la web para el cliente
     */
    public Cliente(String dni, String nombre, String apellidos, int cp, int puntos, String usuario, String contrasena) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cp = cp;
        this.puntos = puntos;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    
    /**
     * Metodo para crear un cliente nuevo en la BD
     * @param _cliente Objeto cliente con todos los datos menos el ID
     * @throws SQLException Error al intentar crear el objeto en la BD
     */
    public void crearCliente(Cliente _cliente) throws SQLException {
        bd.actualizarTabla("Insert into cliente values(null, " + _cliente.dni +
                ", " + _cliente.nombre +
                ", " + _cliente.apellidos +
                ", " + _cliente.cp +
                ", " + _cliente.puntos +
                ", " + _cliente.usuario +
                ", " + _cliente.contrasena + ")");
    }

    /**
     * Muestra todos los clientes de la BD
     * 
     * @return ArrayList del tipo Cliente con toda la informacion de todos los clientes de la BD
     * @throws SQLException Error al intentar crear el objeto en la BD
     */
    public ArrayList mostrarClientes() throws SQLException {
        ArrayList<Cliente> misClientes = new ArrayList();
        Cliente miCliente = null;
        rs = bd.consultarTabla("select * from  cliente");
        while (rs.next()) {
            miCliente = new Cliente(rs.getInt("idCliente"), rs.getString("dni_cli"), rs.getString("nombre_cli"), rs.getString("apellidos_cli"), rs.getInt("cp_cli"), rs.getInt("puntos_cli"), rs.getString("usuario_cli"), rs.getString("contrasena_cli"));
            misClientes.add(miCliente);
        }
        return misClientes;
    }


    /**
     * Muestra el cliente correspondiente al id introducido
     * @param _idCliente Id usado para la busqueda en la BD
     * @throws SQLException Error al intentar crear el objeto en la BD
     */
    public Cliente mostrarClienteId(int _idCliente) throws SQLException {
        Cliente miCliente = null;
        bd.consultarTabla("Select * from cliente where idCliente =" + _idCliente + "");
        while (rs.next()) {
            miCliente = new Cliente(rs.getInt("idCliente"), rs.getString("dni_cli"), rs.getString("nombre_cli"), rs.getString("apellidos_cli"), rs.getInt("cp_cli"), rs.getInt("puntos_cli"), rs.getString("usuario_clie"), rs.getString("contrasena"));
        }
        return miCliente;
    }

    
    public Cliente mostrarClientesNombre(String _nombre) throws SQLException {
        Cliente miCliente = null;
        bd.consultarTabla("Select * from cliente where Lower(nombre_cli) = Lower(" + _nombre + ")");
        while (rs.next()) {
            miCliente = new Cliente(rs.getInt("idCliente"), rs.getString("dni_cli"), rs.getString("nombre_cli"), rs.getString("apellidos_cli"), rs.getInt("cp_cli"), rs.getInt("puntos_cli"), rs.getString("usuario_clie"), rs.getString("contrasena"));
        }
        return miCliente;    
    }

    
    
    
    //Sin modificar
    
    
    
    
    
    /**
     * Borra un empleadao segun id.
     *
     * @param _idEmpleado
     * @throws SQLException Error al cargar la BD
     */
    public void borrarEmpleadoID(int _idEmpleado) throws SQLException {
        bd.actualizarTabla("Delete * from empleado where idEmpleado =" + _idEmpleado);
    }

    /**
     * Modifica un empleado.
     *
     * @param _empleado
     * @throws SQLException Error al cargar la BD
     */
    public void modificarEmpleado(Cliente _empleado) throws SQLException {
        bd.actualizarTabla("Update empleado set dni_emp=" + _empleado.getDni()
                + ",nombre_emp=" + _empleado.getNombre()
                + ",apellidos_emp=" + _empleado.getApellido()
                + ",fechaInicio_emp=" + _empleado.getFechaInicio()
                + ",cargo_emp=" + _empleado.getCargo()
                + ",usuario_emp=" + _empleado.getUsuario()
                + ",contrasenia_emp=" + _empleado.getContrasena()
                + ",idCine=" + _empleado.getIdCine());
    }
    // </editor-fold>
}
