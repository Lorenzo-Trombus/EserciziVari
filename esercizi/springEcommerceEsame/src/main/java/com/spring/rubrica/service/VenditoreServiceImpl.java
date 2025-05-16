package com.spring.rubrica.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rubrica.dao.DAOVenditore;
import com.spring.rubrica.dto.ProdottoDTO;
import com.spring.rubrica.dto.VenditoreDTO;
import com.spring.rubrica.entiity.Venditore;
import com.spring.rubrica.utility.Conversioni;

@Service
@Transactional
public class VenditoreServiceImpl implements VenditoreService {

	@Autowired
	private DAOVenditore dao;
	
	@Override
	public boolean inserisciVenditore(VenditoreDTO dto) {
		Venditore ven = Conversioni.daVenditoreDTOaVenditore(dto) ;
		dao.save(ven);
		return true;
	}

	@Override
	public VenditoreDTO cercaVenPerId(Integer idVenditore) {
		Optional<Venditore> opt =dao.findById(idVenditore);
		if (opt.isPresent()) {
			Venditore trovato = opt.get();
			return Conversioni.daVenditoreaVenditoreDTO(trovato);
		}
		return null;
	}

	@Override
	public boolean aggiungiProdotto(Integer idVenditore, ProdottoDTO dto) {
		Optional<Venditore> opt = dao.findById(idVenditore);
		if (opt.isPresent()) {
			Venditore trovato =opt.get();
			trovato.aggiungiProdotto(Conversioni.daProdottoDTOaProdotto(dto));
			return true;
		}
		return false;
	}

}
