package com.spring.universita.dto;

public class StudenteDTO {
	
	private int matricola,annoNascita, annoImmatricolazione;
	private String nome,cognome, indirizzo;
	
	public StudenteDTO() {
		
	}

	public StudenteDTO(int matricola, int annoNascita, int annoImmatricolazione, String nome, String cognome,
			String indirizzo) {
		super();
		this.matricola = matricola;
		this.annoNascita = annoNascita;
		this.annoImmatricolazione = annoImmatricolazione;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public int getAnnoNascita() {
		return annoNascita;
	}

	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}

	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}

	public void setAnnoImmatricolazione(int annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
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

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "StudenteDTO [matricola=" + matricola + ", annoNascita=" + annoNascita + ", annoImmatricolazione="
				+ annoImmatricolazione + ", nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + "]";
	}
	
	

}
