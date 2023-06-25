package pe.edu.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.model.bd.Sala;
import pe.edu.cibertec.repository.SalaRepository;


@Service
public class SalaService {
	
	@Autowired
	private SalaRepository salaRepository;
	
	public List<Sala> listarSala(){
		return salaRepository.findAll();
	}
	
	public void registrarSala(Sala sala) {
		salaRepository.save(sala);
	}
	
	public void eliminarSala(Integer idsala) {
		salaRepository.deleteById(idsala);
	}
	
}