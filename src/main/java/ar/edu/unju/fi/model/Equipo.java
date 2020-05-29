package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Esta clase representa a cualquier equipo registrado 
 * en la pagina web. Es necesario considerar que solamente
 * representa a un equipo registrado.
 * 
 * @author Nahuel Alberto Cachambi
 *
 */

@Component
public class Equipo{
	
	/*
	 * *********************
	 * ***** Atributos *****
	 * *********************
	 */
	
	/**
	 * Atributo que representa el nombre del equipo
	 */
	private String nombre;
	
	@Autowired
	
	/**
	 * Atributo que representa el estadio del equipo
	 */
	private Estadio estadio;
	
	/*
	 * ****************************
	 * ****** Constructores *******
	 * ****************************
	 */
	
	/**
	 * Constructor por defecto
	 */
	
	public Equipo() {
		
	}
	
	/**
	 * Constructor Parametrizado
	 * @param nombre valor del nombre del equipo
	 * @param estadio valor del estadio del equipo
	 */

	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}

	/*
	 * *****************************
	 * **** Metodos Accesores ******
	 * *****************************
	 */
	
	/**
	 * Devuelve el nombre del equipo
	 * @return this.nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un valor al nombre del equipo
	 * @param nombre valor del nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el estadio del equipo
	 * @return this.estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}

	/**
	 * Asigna un valor a estadio del equipo
	 * @param estadio valor del estadio
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	/**
	 * Sobrescribe el metodo para que muestre el nombre
	 * y el estadio del equipo.
	 */

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
	
	
	
	
	
	
	
}