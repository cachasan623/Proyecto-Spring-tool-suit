
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Esta clase representa cualquier noticia acerca del futbol 
 * @author Nahuel Alberto Cachambi
 *
 */

@Component
public class Noticia {
	
	/*
	 * ----------------------
	 * ------ Atributos -----
	 * ----------------------
	 */
	
	/**
	 * Atributo que representa la fecha de la noticia
	 */
	private LocalDate fecha;
	
	/**
	 * Atributo que representa el titulo de la noticia
	 */
	private String titulo;
	
	/**
	 * Atributo que representa el resumen de la noticia
	 */
	private String resumen;
	
	/*
	 *------------------------------
	 *-------- Constructores -------
	 *------------------------------ 
	 */
	
	/**
	 * Costructor por defecto 
	 */
	public Noticia() {
		
	}

	/**
	 * Constructor Parametrizado
	 * @param fecha valor de la fecha de la noticia
	 * @param titulo valor del titulo de la noticia
	 * @param resumen valor del resumen de la noticia
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}

	/*
	 * ------------------------------
	 * ----- Metodo Accesores -------
	 * ------------------------------
	 */
	/**
	 * Devuelve la fecha de la noticia
	 * @return this.fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * Asigna un valor a la fecha de la noticia
	 * @param fecha valor de la fecha
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * Devuelve el titulo de la noticia
	 * @return this.titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Asigna un valor al titulo de la noticia
	 * @param titulo valor del titulo 
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Devuelve el resumen de la noticia
	 * @return this.resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * Asigna un valor al resumen de la noticia
	 * @param resumen valor del resumen 
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	/**
	 * Sobrescribe el metodo para que muestre la fecha de la noticia,
	 * el titulo de la noticia y el resumen de la noticia.
	 */
	@Override
	public String toString() {
		return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}
	
	
	
	
	

}
