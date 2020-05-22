
package ar.edu.unju.fi.model;

import java.time.LocalDate;

/**
 * Esta clase representa a los usuarios que estan registrados en la
 * pagina web. Es necesario considerar que existe tres tipos de usuarios
 * los Administrdores, los consultores y los socios que estan suscriptos 
 * a la pagina.
 * @author Nahuel Alberto Cachambi
 *
 */
public class Usuario {
	
	/*
	 * ------------------------------
	 * ------ Atributos -------------
	 * ------------------------------
	 */
	
	/**
	 * Atributo que representa el codigo de identificacion del usuario
	 */
	private long id;
	
	/**
	 * Atributo que representa el nombre del usuario
	 */
	private String nombre;
	
	/**
	 * Atributo que representa el apellido del usuario
	 */
	private String apellido;
	
	/**
	 * Atributo que representa la fecha de nacimiento del usuario
	 */
	private LocalDate fechaNacimiento;
	
	/**
	 * Atributo que representa la direccion del usuario
	 */
	private String direccion;
	
	/**
	 * Atributo que representa el dni del usuario
	 */
	private long dni;
	
	/**
	 * Atributo que representa la fecha de alta del usuario
	 */
	private LocalDate fechaAlta;
	
	/**
	 * Atributo que representa el tipo de usuario
	 */
	private String tipo;
	
	/**
	 * Atributo que representa la contraseña del usuario
	 */
	private String password;

	/*
	 * ---------------------------
	 * ------- Constructores -----
	 * ---------------------------
	 */
	
	/**
	 * Constructor por defecto
	 */
	public Usuario() {
		
	}

	/**
	 * Constructor Parametrizado
	 * @param id valor del codigo de identificacion del usuario
	 * @param nombre valor del nombre del usuario
	 * @param apellido valor del apellido del usuario
	 * @param fechaNacimiento valor de la fecha de nacimiento del usuario
	 * @param direccion valor de la direccion del usuario
	 * @param dni valor del dni del usuario
	 * @param fechaAlta valor de la fecha de alta del usuario
	 * @param tipo valor del tipo de usuario
	 * @param password valor de la contraseña del usuario
	 */
	public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
			LocalDate fechaAlta, String tipo, String password) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
		this.tipo = tipo;
		this.password = password;
	}
	
	/*
	 * -----------------------------
	 * ----- Metodos Accesores -----
	 * -----------------------------
	 */

	/**
	 * Devuelve el codigo de identificacion del usuario
	 * @return this.id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Asigna un valor al codigo de identificacion del usuario
	 * @param id valor del id 
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Devuelve el nombre el usuario
	 * @return this.nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un valor al nombre del usuario 
	 * @param nombre valor del nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el apellido del usuario
	 * @return this.apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Asigna un valor al apellido del usuario
	 * @param apellido valor del apellido 
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Devuelve la fecha de nacimiento del usuario
	 * @return this.fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Asigna un valor a la fecha de nacimiento del usuario
	 * @param fechaNacimiento valor de fechaNacimiento 
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Devuelve la direccion del usuario
	 * @return this.direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Asigna un valor a la direccion del usuario
	 * @param direccion valor de la direccion 
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Devuelve el dni del usuario
	 * @return this.dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * Asigna un valor al dni del usuario
	 * @param dni valor del dni
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * Devuelve la fecha de alta del usuario
	 * @return this.fechaAlta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * Asigna un valor a la fecha de alta del usuario
	 * @param fechaAlta valor de fechaAlta 
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * Devuelve el tipo de usuario
	 * @return this.tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Asigna un valor al tipo de usuario
	 * @param tipo valor de tipo 
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Devuelve la contraseña del usuario 
	 * @return this.password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Asigna un valor a la contraseña del usuario
	 * @param password valor del password 
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Sobrescribe el metodo para que muestre el codigo de identificacion del usuario, el nombre
	 * del usuario, el apellido del usuario, la fecha de nacimiento del usuario, la direccion del usuario,
	 * el dni del usuario, la fecha de alta del usuario ,el tipo de usuario, la contraseña del usuario.
	 */
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", tipo="
				+ tipo + ", password=" + password + "]";
	}
	
	
}
