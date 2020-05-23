
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Esta clase representa cualquier resultado de los partidos en torneo
 * de futbol. 
 * @author Nahuel Alberto Cachambi
 *
 */

@Component
public class Resultado {
	
	/*
	 * --------------------
	 * ---- Atributo ------
	 * --------------------
	 */
	
	/**
	 * Atributo que representa la fecha que se realizo el partido de futbol
	 */
	private LocalDate fecha;
	
	/**
	 * Atributo que representa el equipo local que disputo el partido
	 */
	private Equipo equipo1;
	
	/**
	 * Atributo que representa el equipo visitante que disputo el partido
	 */
	private Equipo equipo2;
	
	/**
	 * Atributo que representa la cantidad de goles del equipo local que disputo el partido
	 */
	private int golesEquipo1;
	
	/**
	 * Atributo que representa la cantidad de goles del equipo visitante que disputo el partido
	 */
	private int golesEquipo2;

	/*
	 * ------------------------
	 * --- Constructores ------
	 * ------------------------
	 */
	
	/**
	 * Constructor por defecto
	 */
	public Resultado() {
		
	}

	/**
	 * Constructor Parametrizado
	 * @param fecha valor de la fecha que se realizo el partido
	 * @param equipo1 valor del equipo local que disputo el partido
	 * @param equipo2 valor del equipo visitante que disputo el partido
	 * @param golesEquipo1 valor de la cantidad de goles del equipo local que disputo el partido
	 * @param golesEquipo2 valor de la cantidad de goles del equipo visitante que disputo el partido
	 */
	public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}
	
	/*
	 * -----------------------------
	 * ---- Metodos Accesores ------
	 * -----------------------------
	 */

	/**
	 * Devuelve la fecha del partido realizado
	 * @return this.fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * Asigna un valor a la fecha del partido realizado
	 * @param fecha valor de la fecha 
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * Devuelve el equipo local que disputo el partido
	 * @return this.equipo1
	 */
	public Equipo getEquipo1() {
		return equipo1;
	}

	/**
	 * Asigna un valor al equipo local que disputo el partido
	 * @param equipo1 valor de equipo1
	 */
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	/**
	 * Devuelve el equipo visitante que disputo el partido
	 * @return this.equipo2
	 */
	public Equipo getEquipo2() {
		return equipo2;
	}

	/**
	 * Asigna un valor al equipo visitante que disputo el partido
	 * @param equipo2 valor de equipo2 
	 */
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	/**
	 * Devuelve la cantidad de goles que convirtio el equipo local en el partido
	 * @return this.golesEquipo1
	 */
	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	/**
	 * Asigna un valor a la cantidad de goles que convirtio el equipo local en el partido
	 * @param golesEquipo1 valor de golesEquipo1
	 */
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	/**
	 * Devuelve la cantidad de goles que convirtio el equipo visitante en el partido
	 * @return this.golesEquipo2
	 */
	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	/**
	 * Asigna un valor a la cantidad de goles que convirtio el equipo visitante en el partido
	 * @param golesEquipo2 valor de golesEquipo2 
	 */
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

	/**
	 * Sobrescribe el metodo para que muestre la fecha del partido, el equipo
	 * local y el visitante, la cantidad de goles que convirtio el equipo
	 * local y el visitante en el partido.
	 */
	@Override
	public String toString() {
		return "Resultado [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1="
				+ golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
	}
	
	
	
	
	

}
