package mx.edu.uacm.api.services;

import java.util.List;
import mx.edu.uacm.api.domain.Curso;

public interface CursoService {
	public Curso guardarCurso(Curso curso);
	public Curso editarCurso(Curso curso);
	public String borrarCurso(Curso curso);
	public Curso mostrarCurso(Long id);
	public List<Curso> mostrarCurso();
}