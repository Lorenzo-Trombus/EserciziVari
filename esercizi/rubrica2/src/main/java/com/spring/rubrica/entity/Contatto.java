package com.spring.rubrica.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contatto {

    @Id
    private int idContatto;

    private String nome, cognome, numero;

    public Contatto() {
        // TODO Auto-generated constructor stub
    }

    public Contatto(int idContatto, String nome, String cognome, String numero) {
        super();
        this.idContatto = idContatto;
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
    }

    public int getIdContatto() {
        return idContatto;
    }

    public void setIdContatto(int idContatto) {
        this.idContatto = idContatto;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}