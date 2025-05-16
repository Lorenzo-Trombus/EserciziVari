package com.spring.report.dto;

public class ProdottoDTO {
	private int id, quantità;
	private String marca, modello, descrizione, categoria;
	private float prezzoConsigliato, prezzoMax;
	
	public ProdottoDTO() {
		
	}

	public ProdottoDTO(int id, int quantità, String marca, String modello, String descrizione, String categoria,
			float prezzoConsigliato, float prezzoMax) {
		super();
		this.id = id;
		this.quantità = quantità;
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.prezzoConsigliato = prezzoConsigliato;
		this.prezzoMax = prezzoMax;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getPrezzoConsigliato() {
		return prezzoConsigliato;
	}

	public void setPrezzoConsigliato(float prezzoConsigliato) {
		this.prezzoConsigliato = prezzoConsigliato;
	}

	public float getPrezzoMax() {
		return prezzoMax;
	}

	public void setPrezzoMax(float prezzoMax) {
		this.prezzoMax = prezzoMax;
	}

	@Override
	public String toString() {
		return "ReportDTO [id=" + id + ", quantità=" + quantità + ", marca=" + marca + ", modello=" + modello
				+ ", descrizione=" + descrizione + ", categoria=" + categoria + ", prezzoConsigliato="
				+ prezzoConsigliato + ", prezzoMax=" + prezzoMax + "]";
	}


}
