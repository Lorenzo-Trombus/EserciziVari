package com.spring.universita.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.service.ProfessoriService;


@RestController
@RequestMapping(path="/utenti")
public class ProfessoriController {	
	@Autowired
	private ProfessoriService service;

	@GetMapping(path="/registra", consumes = "application/json")
	public boolean registra(@RequestBody  ProfessoreDTO dto) {
		
		return service.registra(dto);
		
	}
		
	@GetMapping(path="/cerca/{id}", produces = "application/json")
	public ProfessoreDTO cercaPerId(@PathVariable  int id) {
		
		return service.cercaPerId(id);
	}
	
	@GetMapping(path="/mostraTutti", produces = "application/json")
	public List<ProfessoreDTO> mostraTutti(){
		return service.mostraTutti();
	}
	
	@GetMapping(path="/modificaPassword/{idUtente}", produces = "application/json")
	public ProfessoreDTO modificaMail(@PathVariable int idUtente, String password) {
		return service.updatePassword(idUtente, password);
	}
	
	@GetMapping(path="/cancella/{idUtente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProfessoreDTO cancellaUtente(@PathVariable int idUtente) {
		return service.cancella(idUtente);
	}

//	@GetMapping(path="/nomeCognome/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public NomeCognomeDTO getNomeCognome(@PathVariable int id) {
//		return service.getNomeCognome(id);
//	}
	
}