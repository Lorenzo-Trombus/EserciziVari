package com.spring.rubrica.utility;

import java.util.List;
import java.util.stream.Collectors;

import com.spring.rubrica.dto.ProdottoDTO;
import com.spring.rubrica.dto.VenditoreDTO;
import com.spring.rubrica.entiity.Prodotto;
import com.spring.rubrica.entiity.Venditore;

public class Conversioni {
	
	public static Prodotto daProdottoDTOaProdotto(ProdottoDTO dto) {
		return new Prodotto(dto.getIdProdotto(), dto.getDescrizione(),dto.getCategoria(),dto.getQuantità(),dto.getPrezzo(),dto.getSconto());
	}
	
	public static ProdottoDTO daProdottoaProdottoDTO(Prodotto prodotto) {
		return new ProdottoDTO(prodotto.getIdProdotto(),prodotto.getDescrizione(),prodotto.getCategoria(),prodotto.getQuantità(),prodotto.getPrezzo(),prodotto.getSconto());
	}
	
	public static Venditore daVenditoreDTOaVenditore(VenditoreDTO dto) {
		Venditore venditore = new Venditore(dto.getId(),dto.getNome(),dto.getCognome(),dto.getUsername(),dto.getPassword(),dto.getCittà(),dto.getVia());
		List<ProdottoDTO> listaD = dto.getProdotti();
		
		List<Prodotto> lista = listaD.stream().map(prodottoDTO -> Conversioni.daProdottoDTOaProdotto(prodottoDTO)).collect(Collectors.toList());
	
		
		venditore.setProdotti(lista);
		return venditore;
	}
	
	public static VenditoreDTO daVenditoreaVenditoreDTO(Venditore venditore) {
		VenditoreDTO venditoreD = new VenditoreDTO(venditore.getId(),venditore.getNome(),venditore.getCognome(),venditore.getUsername(),venditore.getPassword(),venditore.getCittà(),venditore.getVia());
		List<ProdottoDTO> lista = venditoreD.getProdotti();
		
		List<Prodotto> listaD = lista.stream().map(prodottoDTO -> Conversioni.daProdottoDTOaProdotto(prodottoDTO)).collect(Collectors.toList());
	
		
		venditore.setProdotti(listaD);
		return venditoreD;
	}

}
