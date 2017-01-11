# CoreERP
Esquema de los modulos y funciones del proyecto:

Cines
	-crearCine()
		*idCine (PK)
		*nombre
		*cif
		*direccion
		*poblacion
		*cp
		*nSalas

		sql:insert into cine values(null, 'griñon films', 0000003,'Las colis', 'Griñon', 28977);

	-modificarCine()
		*idCine
		*nombre
		*cif
		*direccion
		*poblacion
		*cp
		*nSalas

	-ConsultarCine()
		*nombre

		select * from  cine where Lower(nombre_cine) = 'cubas film';

	-borrarCine()
		*idCine
----------------------------------------------

Empleados
	
	-crearEmpleado()
		*idEmpleado (PK)
		*dni
		*nombre
		*apellidos
		*fechaInicio
		*cargo
		*idCine (Foranea)
	
	-modificarEmpleado()
		*idEmpleado
		*dni
		*nombre
		*apellidos
		*fechaInicio
		*cargo
		*idCine

	-ConsultarEmpleado()
		*nombre

	-borrarEmpleado()
		*idEmpleado
-----------------------------------------------

Cliente

	-crearCliente()
		*idCliente(PK)
		*dni
		*nombre
		*apellidos
		*cp
		*puntos
		*usuario
		*contraseña

	-modificarCliente()
		*idCliente(PK)
		*dni
		*nombre
		*apellidos
		*cp
		*puntos
		*usuario
		*contraseña

	-ConsultarCliente()
		*nombre

	-borrarCliente()
		*idCliente(PK)
--------------------------------------------------

Proveedores

	-crearProveedor()
		*idProveedor(PK)
		*dni
		*nombre
		*apellidos
		*poblacion
		*cp

	-modificarProveedo()
		*idProveedor
		*dni
		*nombre
		*apellidos
		*poblacion
		*cp

	-ConsultarProveedor()
		*nombre

	-borrarProveedor
		*idProveedor
-----------------------------------------------------

Pedido

	cabecera

	cuepo




-----------------------------------------------------

Producto

	-crearProducto()
		*idProducto(PK)
		*descripcion
		*precio
		*idCine(Foranea)

	-modificarProducto()
		*idProducto
		*descripcion
		*precio
		*idCine

	-ConsultarProducto()
		*nombre

	-borrarProducto()
		*idProducto
--------------------------------------------------------

Sesion

	-crearSesion()
		*idSesion(PK)
		*hora
		*idSala

	-modificarSesion()
		*idSesion
		*hora
		*idSala

	-Consultar()
		*Hora
		*Pelicula		

	-borrarSesion()
		*idSesion
----------------------------------------------------------

Sala

----------------------------------------------------------
Pelicula
	
	-crearPelicula()
		*idPelicula(PK)
		*nombre
		*duracion
		*edad

	-modificarPelicula()
		*idPelicula
		*nombre
		*duracion
		*edad
	
	-borrarPelicula()
		*idPelicula
-----------------------------------------------------------

Reseva

--------------------------------------------------------

Butaca

-------------------------------------------------------------

