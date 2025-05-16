package com.spring.universita.utility;

import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.entity.Studente;

public class Conversioni {
	
	public static Studente daUtenteDTOAUtente(StudenteDTO dto) {
		return new Studente(dto.getMatricola(),dto.getAnnoNascita(),dto.getAnnoImmatricolazione(),dto.getNome(),dto.getCognome(),dto.getIndirizzo());
		
	}
	
	public static StudenteDTO daUtenteAUtenteDTO(Studente entity) {
		return new StudenteDTO(entity.getMatricola(),entity.getAnnoNascita(),entity.getAnnoImmatricolazione(),entity.getNome(),entity.getCognome(),entity.getIndirizzo());
		
	}

}
