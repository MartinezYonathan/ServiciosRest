package mx.edu.uacm.api.persistencia;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mx.edu.uacm.api.domain.Taller;

public interface TallerRepository extends CrudRepository<Taller, Long> {
	//te pide el tipo del id y el tipo de la tabla
	
	@Query(value = "select * from curso where id" + "=:id", nativeQuery = true)
	Taller findCursoById(@Param("id") Long id);

}
