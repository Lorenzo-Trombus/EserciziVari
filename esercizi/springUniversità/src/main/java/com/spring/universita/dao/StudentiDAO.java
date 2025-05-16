package com.spring.universita.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.universita.entity.Studente;


public interface StudentiDAO {

	public boolean insert(Studente studente);
	
	public List<Studente> selectAll();

	public Studente selectById(Integer idStudente) ;
	
	public boolean delete(Integer idStudente) ;

}
