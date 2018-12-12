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

import io.swagger.annotations.ApiOperation;
import mx.edu.uacm.api.domain.Taller;
import mx.edu.uacm.api.services.TallerService;

//@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping(value = { "/api" })
public class TallerController {

	public static final Logger log = LogManager.getLogger(TallerController.class);

	@Autowired
	TallerService tallerService;

	@ApiOperation(value="obtiene una cadena de saludo")
	@GetMapping("/curso")
	public List<Taller> getAllCursos() {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--CUR------------   Entrando al metodo getAllCursos");

		return tallerService.mostrarTaller();
	}

	@GetMapping("/curso/{id}")
	public Taller getCurso(@PathVariable String id) {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--CUR-------------   Entrando al metodo getCurso");

		return tallerService.mostrarTaller(Long.parseLong(id));
	}

	@PostMapping("/curso")
	@ResponseStatus(HttpStatus.CREATED)
	public Taller addCurso(@RequestBody Taller taller) {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--CUR------------       Entrando al metodo addCurso");

		return tallerService.guardarTaller(taller);
	}

	@PutMapping("/curso")
	@ResponseStatus(HttpStatus.CREATED)
	public Taller updateCurso(@RequestBody Taller taller) {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--CUR------------    Entrando al metodo updateCurso");

		return tallerService.editarTaller(taller);
	}

	@DeleteMapping("/curso/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCurso(@PathVariable String id) {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--CUR------------    Entrando al metodo deleteCurso");

		tallerService.borrarTaller(Long.parseLong(id));
	}
}
