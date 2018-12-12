package mx.edu.uacm.api.services.imple;

import java.util.List;

import mx.edu.uacm.api.domain.Curso;
import mx.edu.uacm.api.persistencia.CursoRepository;
import mx.edu.uacm.api.services.CursoService;

public class CursoServiceImpl implements CursoService {

	CursoRepository cursoRepository;
	
	@Override
	public Curso guardarCurso(Curso curso) {
		// TODO Auto-generated method stub
		return cursoRepository.save(curso);
	}

	@Override
	public Curso editarCurso(Curso curso) {
		// TODO Auto-generated method stub
		return cursoRepository.save(curso);
	}

	@Override
	public String borrarCurso(Curso curso) {
		// TODO Auto-generated method stub
		cursoRepository.delete(curso);
		return "Curso Borrado";
	}

	@Override
	public Curso mostrarCurso(Long id) {
		// TODO Auto-generated method stub
		return cursoRepository.findCursoById(id);
	}

	@Override
	public List<Curso> mostrarCurso() {
		// TODO Auto-generated method stub
		return (List<Curso>) cursoRepository.findAll();
	}

}
