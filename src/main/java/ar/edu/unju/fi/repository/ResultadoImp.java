package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Cachambi3829Tp5Application;
import ar.edu.unju.fi.model.Resultado;

@Repository("resultadoImp")
public class ResultadoImp implements IResultado {

	@Autowired
	private Resultado resultado;

	public static Logger LOG = LoggerFactory.getLogger(Cachambi3829Tp5Application.class);

	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto resultado en la BD
		LOG.info("El resultado fue guardado: " + resultado.getEquipo1() + "  " + resultado.getEquipo2());
	}

	@Override
	public Resultado mostrar() {
		// Se recuperan todos los datos de resultado
		LOG.info("Mostrar los datos de resultado");
		return resultado;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto resultado de la BD
		LOG.info("Se elimino el resultado de la BD");
	}

	@Override
	public Resultado modificar() {
		// Se modifica un objeto resultado de la BD
		return resultado;
	}

}
