package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Esta clase representa el estadio de cualquier equipo registrado en 
 * la pagina web. Es necesario considerar que solamente representa el
 * estadio de un solo equipo.
 * @author Nahuel Alberto Cachambi
 *
 */

@Component
public class Estadio {
	
	/*
	 * ----------------------
	 * ----- Atributos ------
	 * ----------------------
	 */
	
	/**
	 * Atributo que representa el nombre del estadio
	 */
	private String nombre;
	
	/**
	 * Atributo que representa la fecha de la fundacion del estadio
	 */
	private LocalDate fechaFundacion;
	
	/**
	 * Atributo que representa la ciudad en donde se ubica el estadio
	 */
	private String ciudad;
	
	/**
	 * Atributo que representa la cantidad de aficionados que puede abordar
	 * el estadio
	 */
	private int capacidad;
	
	/**
	 * Atributo que representa la direccion en donde se ubica del estadio
	 */
	private String direccion;
	
	/*
	 * -------------------------
	 * ---- Constructores ------
	 * -------------------------
	 */
	
	/**
	 * Constructor por defecto
	 */
	
	public Estadio() {
		
	}
	
	/**
	 * Constructor Parametrizado
	 * @param nombre valor del nombre del estadio
	 * @param fechaFundacion valor de la fecha de la fundacion del estadio
	 * @param ciudad valor del nombre de la ciudad en donde se ubica el estadio
	 * @param capacidad valor de la cantidad de aficionado que aborda el estadio
	 * @param direccion valor de la direcion en donde se ubica el estadio
	 */

	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}
	
	/*
	 * --------------------------------
	 * ------ Metodos Accesores -------
	 * --------------------------------
	 */

	/**
	 * Devuelve el nombre del estadio
	 * @return this.nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un valor al nombre del estadio
	 * @param nombre valor del nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la fecha de la fundacion del estadio
	 * @return this.fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * Asigna un valor a la fecha de la fundacion del estadio
	 * @param fechaFundacion valor de la fechaFundacion
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * Devuelve la ciudad del estadio
	 * @return this.ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Asigna un valor a la ciudad en donde se ubica el estadio
	 * @param ciudad valor de la ciudad 
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Devuelve la cantidad de aficionados que aborda el estadio
	 * @return this.capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * Asigna un valor a la capacidad de aficionados que puede abordar el estadio
	 * @param capacidad valor de la capacidad 
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * Devuelve la direccion en donde se ubica el estadio
	 * @return this.direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Asigna un valor a la direccion del estadio
	 * @param direccion valor de la direccion 
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * Sobrescribe el metodo para que muestre el nombre del estadio, la fecha de fundacion
	 * del estadio ,la ciudad de ubicacion del estadio, la cantidad de aficionadon que 
	 * aborda el estadio, la direccion de ubicacion del estadio.
	 */
	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", ciudad=" + ciudad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}
	
	
	
	
	

}
