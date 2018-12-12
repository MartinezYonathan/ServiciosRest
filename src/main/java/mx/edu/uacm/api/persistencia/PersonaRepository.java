package mx.edu.uacm.api.persistencia;

import org.springframework.data.repository.CrudRepository;

import mx.edu.uacm.api.domain.Curso;

public interface PersonaRepository extends CrudRepository<Curso, Long> {

}
