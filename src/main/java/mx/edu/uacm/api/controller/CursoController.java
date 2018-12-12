package mx.edu.uacm.api.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.uacm.api.domain.Curso;
import mx.edu.uacm.api.services.CursoService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping(value = { "/api" })
public class CursoController {

	public static final Logger log = LogManager.getLogger(CursoController.class);

	@Autowired
	CursoService cursoService;

	@GetMapping("/curso")
	public List<Curso> getAllCursos() {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--CUR------------   Entrando al metodo getAllCursos");

		return cursoService.mostrarCursos();
	}

	@GetMapping("/curso/{id}")
	public Curso getCurso(@PathVariable String id) {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--CUR-------------   Entrando al metodo getCurso");

		return cursoService.mostrarCurso(Long.parseLong(id));
	}

	@PostMapping("/curso")
	@ResponseStatus(HttpStatus.CREATED)
	public Curso addCurso(@RequestBody Curso curso) {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--CUR------------       Entrando al metodo addCurso");

		return cursoService.guardarCurso(curso);
	}

	@PutMapping("/curso")
	@ResponseStatus(HttpStatus.CREATED)
	public Curso updateCurso(@RequestBody Curso curso) {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--CUR------------    Entrando al metodo updateCurso");

		return cursoService.editarCurso(curso);
	}
	
	@DeleteMapping("/curso/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCurso(@PathVariable String id) {
		log.debug("-------------------------------------------------------");
		log.debug("-CON--CUR------------    Entrando al metodo deleteCurso");

		cursoService.borrarCurso(Long.parseLong(id));
	}
}
