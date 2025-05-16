package com.spring.rubrica.service;

import com.spring.rubrica.dto.ProdottoDTO;
import com.spring.rubrica.dto.VenditoreDTO;

public interface VenditoreService {
	public boolean inserisciVenditore(VenditoreDTO dto);
	public VenditoreDTO cercaVenPerId(Integer idVenditore);
	//public VenditoreDTO modificaPassword(Integer idVenditore, String password );
	public boolean aggiungiProdotto(Integer idVenditore, ProdottoDTO dto);
}
