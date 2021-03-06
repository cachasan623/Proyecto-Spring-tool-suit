package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Cachambi3829Tp5Application implements CommandLineRunner  {
	
	@Autowired
	IUsuarioService usuarioService;
    @Autowired
    Usuario usuario;

	public static void main(String[] args) {
		SpringApplication.run(Cachambi3829Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Inicializo las variables de mi objeto usuario
		usuario.setApellido("Cachambi");
		usuario.setDireccion("av El Chalchalero");
		usuario.setDni(40390080);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1997,01, 8));
		usuario.setId(1);
		usuario.setNombre("Nahuel Alberto");
		usuario.setPassword("123");
		usuario.setTipo("SOCIO");
		
		usuarioService.guardar();
				
		
	}

	
}
