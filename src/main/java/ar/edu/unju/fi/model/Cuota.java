
package ar.edu.unju.fi.model;

import java.time.LocalDate;

/**
 * Esta clase representa la cuota de que pagan los socios.
 * @author Nahuel Alberto Cachambi
 *
 */
public class Cuota {
	
	/*
	 * -----------------------
	 * ----- Atributos -------
	 * -----------------------
	 */
	
	/**
	 * Atributo que representa el codigo de identificacion del usuario
	 */
	private long id;
	
	/**
	 * Atributo que representa la fecha de pago de la cuota
	 */
	private LocalDate fechaPago;
	
	/**
	 * Atributo que representa el periodo de la cuota
	 */
	private String periodo;
	
	/**
	 * Atributo que representa el monto de la cuota
	 */
	private double monto;
	
	/**
	 * Atributo que representa el estado de la cuota del usuario
	 */
	private String estado;
	
	/**
	 * Atributo que representa el usuario
	 */
	private Usuario usuario;
	
	/*
	 * --------------------------
	 * ----- Constructores ------
	 * --------------------------
	 */

	/**
	 * Constructor por defecto
	 */
	public Cuota() {
		
	}

	/**
	 * Constructor Parametrizado
	 * @param id valor del codigo de identificacion del usuario
	 * @param fechaPago valor de la fecha de pago que realizo el usuario
	 * @param periodo valor del periodo de la cuota
	 * @param monto valor de monto de la cuota
	 * @param estado valor del estado de la cuota del usuario
	 * @param usuario valor del usuario
	 */
	public Cuota(long id, LocalDate fechaPago, String periodo, double monto, String estado, Usuario usuario) {
		this.id = id;
		this.fechaPago = fechaPago;
		this.periodo = periodo;
		this.monto = monto;
		this.estado = estado;
		this.usuario = usuario;
	}

	/*
	 *------------------------------
	 *----- Metodos Accesores ------
	 *------------------------------ 
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
	 * Devuelve la fecha de pago realizada por el usuario
	 * @return this.fechaPago
	 */
	public LocalDate getFechaPago() {
		return fechaPago;
	}

	/**
	 * Asigna un valor a la fecha de Pago realizada por el usuario
	 * @param fechaPago valor de fechaPago
	 */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	/**
	 * Devuelve el periodo de la cuota
	 * @return this.periodo
	 */
	public String getPeriodo() {
		return periodo;
	}

	/**
	 * Asigna un valor al periodo de la cuota
	 * @param periodo valor del periodo
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	/**
	 * Devuelve el monto de la cuota 
	 * @return this.monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * Asigna un valor al monto de la cuota
	 * @param monto valor del monto
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * Devuelve el estado de la cuota
	 * @return this.estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Asigna un valor al estado de la cuota
	 * @param estado valor de estado 
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Devuelve el usuario
	 * @return this.usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Asigna un valor al usuario
	 * @param usuario valor del usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Sobrescribe el metodo para que muestre el codigo de identificacion del usuario,
	 * la fecha de pago realizada por el usuario, el periodo de la cuota, el monto de la cuota,
	 * el estado de la cuota y el usuario.
	 */
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + "]";
	}
		

}
