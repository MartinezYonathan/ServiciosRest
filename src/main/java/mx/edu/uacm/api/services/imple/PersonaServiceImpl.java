package mx.edu.uacm.api.services.imple;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mx.edu.uacm.api.controller.CursoController;
import mx.edu.uacm.api.domain.Persona;
import mx.edu.uacm.api.services.PersonaService;

public class PersonaServiceImpl implements PersonaService {

	public static final Logger log = LogManager.getLogger(CursoController.class);

	PersonaService personaService;

	@Override
	public Persona guardarPersona(Persona persona) {
		log.debug("-------------------------------------------------------");
		log.debug("-SER--PER------------ Entrando al metodo guardarPersona");
		return personaService.guardarPersona(persona);
	}

	@Override
	public Persona editaPersona(Persona persona) {
		log.debug("-------------------------------------------------------");
		log.debug("-SER--PER------------   Entrando al metodo editaPersona");
		return personaService.editaPersona(persona);
	}

	@Override
	public String borrarPersona(Long id) {
		log.debug("-------------------------------------------------------");
		log.debug("-SER--PER------------  Entrando al metodo borrarPersona");

		return personaService.borrarPersona(id);
	}

	@Override
	public Persona mostrarPersona(Long id) {
		log.debug("-------------------------------------------------------");
		log.debug("-SER--PER------------ Entrando al metodo mostrarPersona");
		return personaService.mostrarPersona(id);
	}

	@Override
	public List<Persona> mostrarPersonas() {
		log.debug("-------------------------------------------------------");
		log.debug("-SER--PER------------ Entrando al metodo guardarPersona");
		return personaService.mostrarPersonas();
	}

}
