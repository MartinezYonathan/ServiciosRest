package mx.edu.uacm.api.services.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uacm.api.domain.Taller;
import mx.edu.uacm.api.persistencia.TallerRepository;
import mx.edu.uacm.api.services.TallerService;

@Service
public class TallerServiceImpl implements TallerService {

	@Autowired
	TallerRepository tallerRepository;

	@Override
	public Taller guardarTaller(Taller curso) {
		// TODO Auto-generated method stub
		return tallerRepository.save(curso);
	}

	@Override
	public Taller editarTaller(Taller curso) {
		// TODO Auto-generated method stub
		return tallerRepository.save(curso);
	}

	@Override
	public String borrarTaller(Long id) {
		// TODO Auto-generated method stub
		tallerRepository.deleteById(id);
		return "Taller Borrado";
	}

	@Override
	public Taller mostrarTaller(Long id) {
		// TODO Auto-generated method stub
		return tallerRepository.findCursoById(id);
	}

	@Override
	public List<Taller> mostrarTaller() {
		// TODO Auto-generated method stub
		return (List<Taller>) tallerRepository.findAll();
	}

}
