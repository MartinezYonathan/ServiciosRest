package mx.edu.uacm.api.persistencia;

import org.springframework.data.repository.CrudRepository;

import mx.edu.uacm.api.domain.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {
	//te pide el tipo del id y el tipo de la tabla

}
