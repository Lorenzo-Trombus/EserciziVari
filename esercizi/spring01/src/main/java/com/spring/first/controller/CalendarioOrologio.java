package com.spring.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/DataOra")
public class CalendarioOrologio {
	
	public CalendarioOrologio() {
		System.out.println("spring istanzia CalendarioOrologio");
	}
	
	@GetMapping(path="/data")
	public String dataOdierna(String data, String ora) {
		return "La data di oggi é " + data +  " e sono le: " + ora;
	}
}
