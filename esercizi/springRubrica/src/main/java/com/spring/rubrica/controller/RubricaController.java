package com.spring.rubrica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rubrica.service.RubricaService;

@RestController
@RequestMapping(path="/rubriche")
public class RubricaController {
	
	@Autowired
	private RubricaService service;
	
	@GetMapping(path="/registra", consumes="application/json")
	public boolean registra(@RequestBody RubricaDTO dto) {
		return service.registra(dto);
	}
	
	@GetMapping(path="/cercaId/{id}",produces="application/json" )
	public RubricaDTO cercaPerId(@PathVariable int id) {
		return service.cercaPerId(id);
	}
	
	@GetMapping(path="/mostraTutti", produces = "application/json")
	public List<RubricaDTO> mostraTutti(){
		return service.mostraTutti();
	}
	
}
