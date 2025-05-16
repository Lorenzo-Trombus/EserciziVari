package com.spring.rubrica.dto;

import java.util.ArrayList;
import java.util.List;


public class VenditoreDTO {
	
	
	private int idVenditore;
	
	private String nome, cognome, username, password, via, città;

	
	private List<ProdottoDTO> prodotti = new ArrayList<>();
	
	public VenditoreDTO() {
		
	}
	
	public VenditoreDTO(int id, String nome, String cognome, String username, String password, String via, String città) {
		super();
		this.idVenditore = id;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.via = via;
		this.città = città;
	}

	public int getId() {
		return idVenditore;
	}

	public void setId(int id) {
		this.idVenditore = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}
	

	public List<ProdottoDTO> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<ProdottoDTO> prodotti) {
		this.prodotti = prodotti;
	}
	
	public void aggiungiProdotto(ProdottoDTO prodotto) {
		prodotti.add(prodotto);
	}

	@Override
	public String toString() {
		return "Venditore [id=" + idVenditore + ", nome=" + nome + ", cognome=" + cognome + ", username=" + username
				+ ", password=" + password + ", via=" + via + ", città=" + città + "]";
	}
	
	
	
	
	
}
