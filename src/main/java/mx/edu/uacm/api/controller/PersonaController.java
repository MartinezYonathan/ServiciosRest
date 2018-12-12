package mx.edu.uacm.api.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.uacm.api.domain.Persona;
import mx.edu.uacm.api.services.PersonaService;

//@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping(value = { "/api" })
public class PersonaController {

	public static final Logger log = LogManager.getLogger(PersonaController.class);

	@Autowired
	PersonaService personaService;

	@GetMapping("/persona")
	public List<Persona> getAllPersona() {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--PER------------  Entrando al metodo getAllPersona");

		return personaService.mostrarPersonas();
	}

	@GetMapping("/persona/{id}")
	public Persona getPersona(@PathVariable String id) {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--PER-------------    Entrando al metodo getPersona");

		return personaService.mostrarPersona(Long.parseLong(id));
	}

	@PostMapping("/persona")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona addPersona(@RequestBody Persona persona) {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--PER------------     Entrando al metodo addPersona");

		return personaService.guardarPersona(persona);
	}

	@PutMapping("/persona")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona updatePersona(@RequestBody Persona persona) {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--PER------------  Entrando al metodo updatePersona");

		return personaService.editaPersona(persona);
	}

	@DeleteMapping("/persona/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePersona(@PathVariable String id) {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--PER------------  Entrando al metodo deletePersona");

		personaService.borrarPersona(Long.parseLong(id));
	}
}
