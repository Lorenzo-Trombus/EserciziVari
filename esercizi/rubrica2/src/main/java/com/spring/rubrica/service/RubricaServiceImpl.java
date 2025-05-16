package com.spring.rubrica.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.rubrica.dao.DAORubrica;
import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.entity.Rubrica;
import com.spring.rubrica.utility.Conversioni;

public class RubricaServiceImpl implements RubricaService{

	@Autowired
	private DAORubrica dao;
	
	@Override
	public boolean creaRubrica(RubricaDTO dto) {
		
		
		return false;
	}

	@Override
	public RubricaDTO cerca(Integer idRubrica) {
		Optional<Rubrica> opt = dao.findById(idRubrica);
		if(opt.isPresent()) {
			Rubrica trovata =opt.get();
			return Conversioni.daRubricaARubricaDto(trovata);
		}
		return null;
	}

	@Override
	public boolean aggiungiContatto(Integer idRubrica, ContattoDTO dto) {
		Optional<Rubrica> opt =dao.findById(idRubrica);
		if(opt.isPresent()) {
			Rubrica trovata =opt.get();
			trovata.aggiungiContatto(Conversioni.daContattoDtoAContatto(dto));
			return true;
		}
		return false;
	}

	@Override
	public boolean aggiungiContatto(Integer idRubrica, ContattoDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
