package mx.edu.uacm.api.services;

import java.util.List;

import mx.edu.uacm.api.domain.Persona;

public interface PersonaService {
	public Persona guardarPersona(Persona persona);
	public Persona editaPersona(Persona persona);
	public String borrarPersona(Long id);
	public Persona mostrarPersona(Long id);
	public List<Persona> mostrarPersonas();
}
