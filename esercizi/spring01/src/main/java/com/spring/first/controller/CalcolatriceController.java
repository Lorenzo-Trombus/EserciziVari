package com.spring.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica a Spring che dovrà istanziare e gestire questa classe
@RequestMapping(path="/calcolatrice")
public class CalcolatriceController {

	
	// qui ci sarebbe il costruttore di default
	@GetMapping(path="/sum")
	public int somma(int n1, int n2) {
		return n1+n2;
	}
	
	@GetMapping(path="/subtraction")
	public int sottrazione(int n1, int n2) {
		return n1 -n2;
	}
	
	@GetMapping(path="/division")
	public int divisione(int n1, int n2) {
		return n1 / n2;
	}
	
	@GetMapping(path="/multiplication")
	public int moltiplicazione(int n1, int n2) {
		return n1 * n2;
	}
}
