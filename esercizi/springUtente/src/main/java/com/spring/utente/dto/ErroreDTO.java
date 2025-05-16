package com.spring.utente.dto;

public class ErroreDTO {
	
	private String messaggio;
	
	public ErroreDTO() {
		
	}

	public ErroreDTO(String messaggio) {
		super();
		this.messaggio = messaggio;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	@Override
	public String toString() {
		return "ErroreDTO [messaggio=" + messaggio + "]";
	}
	
	
}
