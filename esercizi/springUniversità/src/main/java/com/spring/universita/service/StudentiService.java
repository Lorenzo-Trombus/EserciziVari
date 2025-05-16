package com.spring.universita.service;



import java.util.List;

import com.spring.universita.dto.StudenteDTO;


public interface StudentiService {
	
	public boolean registra(StudenteDTO dto);
	public StudenteDTO cercaPerId(int id);
	//public NomeCognomeDTO getNomeCognome(int id);
	public List<StudenteDTO> mostraTutti();
	public StudenteDTO updatePassword(int idUtente, String password) ;
	public StudenteDTO cancella(int idUtente);

}