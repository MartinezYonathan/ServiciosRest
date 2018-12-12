package mx.edu.uacm.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.edu.uacm.api.domain.Curso;

@Service
public interface CursoService {
	public Curso guardarCurso(Curso curso);
	public Curso editarCurso(Curso curso);
	public String borrarCurso(Long id);
	public Curso mostrarCurso(Long id);
	public List<Curso> mostrarCursos();
}