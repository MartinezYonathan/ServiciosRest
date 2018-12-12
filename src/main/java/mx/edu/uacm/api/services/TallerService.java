package mx.edu.uacm.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.edu.uacm.api.domain.Taller;

@Service
public interface TallerService {
	public Taller guardarTaller(Taller taller);

	public Taller editarTaller(Taller taller);

	public String borrarTaller(Long id);

	public Taller mostrarTaller(Long id);

	public List<Taller> mostrarTaller();
}