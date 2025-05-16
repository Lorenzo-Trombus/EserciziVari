package com.spring.rubrica.entity;

public class Contatto {
	private int id;
	private String nome,cognome, gruppoAppartenenza, numero,dataNascita;
	private boolean preferito;
	public Contatto(int id, String nome, String cognome, String gruppoAppartenenza, String numero, String dataNascita,
			boolean preferito) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.gruppoAppartenenza = gruppoAppartenenza;
		this.numero = numero;
		this.dataNascita = dataNascita;
		this.preferito = preferito;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getGruppoAppartenenza() {
		return gruppoAppartenenza;
	}
	public void setGruppoAppartenenza(String gruppoAppartenenza) {
		this.gruppoAppartenenza = gruppoAppartenenza;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}
	public boolean isPreferito() {
		return preferito;
	}
	public void setPreferito(boolean preferito) {
		this.preferito = preferito;
	}
	
	

}
