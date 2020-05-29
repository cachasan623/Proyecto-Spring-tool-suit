package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Cachambi3829Tp5Application;
import ar.edu.unju.fi.model.Estadio;

@Repository("estadioImp")
public class EstadioImp implements IEstadio {

	@Autowired
	private Estadio estadio;

	public static Logger LOG = LoggerFactory.getLogger(Cachambi3829Tp5Application.class);

	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto estadio en la BD
		LOG.info("El estadio fue guardado: " + estadio.getNombre());
	}

	@Override
	public Estadio mostrar() {
		// Se recuperan todos los datos del estadio
		LOG.info("Mostrar los datos del estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto estadio de la BD
		LOG.info("Se elimino el estadio de la BD");
	}

	@Override
	public Estadio modificar() {
		// Se modifica un objeto estadio de la BD
		return estadio;
	}

}
