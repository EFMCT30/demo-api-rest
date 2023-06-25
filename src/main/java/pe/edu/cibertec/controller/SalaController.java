package pe.edu.cibertec.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.cibertec.model.bd.Sala;
import pe.edu.cibertec.service.SalaService;

@RestController
@RequestMapping(path="/api/finanzas/v1/sala")
public class SalaController {

	@Autowired
	private SalaService salaService;
	
	@GetMapping("")
	public ResponseEntity<List<Sala>> obtenerTodo(){
		ArrayList<Sala> salaList = new ArrayList<Sala>();
		salaService.listarSala().forEach(salaList::add);
		if(salaList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(salaList,HttpStatus.OK);
	}
}
