package com.spring.utente.entity;

public class Utente {

    private int id;
    private String nome, cognome, username,password;

    public Utente() {
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

    @Override
    public String toString() {
        return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", username=" + username + "]";
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

	public Utente(int id, String nome, String cognome, String username, String password) {
        super();
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password=password;
    }


}
