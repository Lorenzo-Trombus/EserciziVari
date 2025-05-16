package com.spring.rubrica.entity;

import java.util.ArrayList;
import java.util.List;

public class Rubrica {
	private int id, annoCreazione;
	private String proprietario;
	private List<Contatto> contatti= new ArrayList<Contatto>();
	public Rubrica(int id, int annoCreazione, String proprietario, List<Contatto> contatti) {
		super();
		this.id = id;
		this.annoCreazione = annoCreazione;
		this.proprietario = proprietario;
		this.contatti = contatti;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnnoCreazione() {
		return annoCreazione;
	}
	public void setAnnoCreazione(int annoCreazione) {
		this.annoCreazione = annoCreazione;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public List<Contatto> getContatti() {
		return contatti;
	}
	public void setContatti(List<Contatto> contatti) {
		this.contatti = contatti;
	}
	
	
}
