package mx.edu.uacm.api.services.imple;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import mx.edu.uacm.api.domain.Persona;
import mx.edu.uacm.api.persistencia.PersonaRepository;
import mx.edu.uacm.api.services.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	public static final Logger log = LogManager.getLogger(PersonaServiceImpl.class);

	PersonaRepository personaRepository;

	@Override
	public Persona guardarPersona(Persona persona) {
		log.debug("-------------------------------------------------------");
		log.debug("-SER--PER------------ Entrando al metodo guardarPersona");
		return personaRepository.save(persona);
	}

	@Override
	public Persona editaPersona(Persona persona) {
		log.debug("-------------------------------------------------------");
		log.debug("-SER--PER------------   Entrando al metodo editaPersona");
		return personaRepository.save(persona);
	}

	@Override
	public String borrarPersona(Long id) {
		log.debug("-------------------------------------------------------");
		log.debug("-SER--PER------------  Entrando al metodo borrarPersona");

		personaRepository.deleteById(id);

		return "Persona Borrada";
	}

	@Override
	public Persona mostrarPersona(Long id) {
		log.debug("-------------------------------------------------------");
		log.debug("-SER--PER------------ Entrando al metodo mostrarPersona");
		return personaRepository.findPersonaById(id);
	}

	@Override
	public List<Persona> mostrarPersonas() {
		log.debug("-------------------------------------------------------");
		log.debug("-SER--PER------------ Entrando al metodo guardarPersona");
		return (List<Persona>) personaRepository.findAll();
	}

}
