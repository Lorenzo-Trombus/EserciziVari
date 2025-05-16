package com.spring.studente.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.studente.dao.DAOStudente;
import com.spring.studente.dto.StudenteDTO;
import com.spring.studente.entity.Studente;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudenteServiceImpl  implements StudenteService{
	@Autowired
	private DAOStudente dao;
	
	
	@Override
	public boolean Immatricola(StudenteDTO dto) {
		Studente st= new Studente(dto.getMatricola(),dto.getNome(),dto.getCognome(),dto.getAnnoImm(), 0);
		
		Optional<Studente> opt =dao.findById(dto.getMatricola());
		dao.save(st);
		if(opt.isPresent())
			return false;
		else {
			dao.save(st);
			return true;
		}
	}

	@Override
	public StudenteDTO cerca(Integer matricola) {
		Optional<Studente> opt =dao.findById(matricola);
		if(opt.isPresent()) {
			Studente st = opt.get();
			return new StudenteDTO(st.getMatricola(),st.getNome(),st.getCognome(),st.getAnnoImm(), matricola);
			
		}
		return null;
	}
}
