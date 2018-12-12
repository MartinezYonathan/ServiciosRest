package mx.edu.uacm.api.persistencia;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mx.edu.uacm.api.domain.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {

	@Query(value = "select * from persona where id" + "=:id", nativeQuery = true)
	Persona findPersonaById(@Param("id") Long id);
}
