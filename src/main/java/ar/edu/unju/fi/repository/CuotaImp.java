package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Cachambi3829Tp5Application;
import ar.edu.unju.fi.model.Cuota;

@Repository("cuotaImp")
public class CuotaImp implements ICuota{

	@Autowired
    private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Cachambi3829Tp5Application.class);

	
	
	@Override
	public void guardar() {
	    //Accion ejecutada para guardar un objeto de la cuota en la BD
		LOG.info("La cuota fue guardada: "+cuota.getId()+" Precio: "+cuota.getMonto());
		
	}

	@Override
	public Cuota mostrar() {
		// Se recuperan todos los datos de la cuota
	   LOG.info("Mostrar los datos de la cuota");

		return cuota;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto cuota de la BD
	    LOG.info("Se elimino la cuota de la BD");
		
	}

	@Override
	public Cuota modificar() {
		// Se modifica un objeto usuario de la BD
		return cuota;
	}
	
	

}
