package com.spring.universita.service;



import java.util.List;

import com.spring.universita.dto.ProfessoreDTO;

public interface ProfessoriService {
	
	public boolean registra(ProfessoreDTO dto);
	public ProfessoreDTO cercaPerId(int id);
	//public NomeCognomeDTO getNomeCognome(int id);
	public List<ProfessoreDTO> mostraTutti();
	public ProfessoreDTO updatePassword(int idUtente, String password) ;
	public ProfessoreDTO cancella(int idUtente);

}