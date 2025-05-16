package com.spring.rubrica.service;

import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.RubricaDTO;

public interface RubricaService {
	
	public boolean creaRubrica(RubricaDTO dto);
	public RubricaDTO cerca (Integer idRubrica);
	public boolean aggiungiContatto(Integer idRubrica, ContattoDTO dto);
}
