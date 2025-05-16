package com.spring.universita.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.universita.entity.Studente;

@Repository
public class StudenteMappaImplDAO implements StudentiDAO{
	
	private Map<Integer, Studente> mappa = new HashMap<>();

	public boolean insert(Studente studente) {
		if(mappa.containsKey(studente.getMatricola()))
			return false;
		
		mappa.put(studente.getMatricola(), studente);
		return true;

	}
	public List<Studente> selectAll(){
		return new ArrayList<>(mappa.values());
	}

	public Studente selectById(Integer idStudente) {
		return mappa.get(idStudente);
	}
	
	public boolean delete(Integer idUStudente) {
		Studente studente = mappa.remove(idUStudente);
		return studente!=null;
	}

}
