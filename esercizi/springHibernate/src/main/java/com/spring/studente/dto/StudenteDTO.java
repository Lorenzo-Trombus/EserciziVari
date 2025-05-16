package com.spring.studente.dto;

public class StudenteDTO {
	
		
		
		private int matricola;
		
		private String nome,cognome;
		private int  annoImm;
		
		
		public StudenteDTO(int matricola, String nome, String cognome, int matricola2, int annoImm) {
			super();
			this.matricola = matricola;
			this.nome = nome;
			this.cognome = cognome;
			this.annoImm = annoImm;
		}


		

		

		public int getMatricola() {
			return matricola;
		}






		public void setMatricola(int matricola) {
			this.matricola = matricola;
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



		public int getAnnoImm() {
			return annoImm;
		}


		public void setAnnoImm(int annoImm) {
			this.annoImm = annoImm;
		}


		@Override
		public String toString() {
			return "Studente [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", Matricola="
					+ ", annoImm=" + annoImm + "]";
		}
		
		
		
		
		
		
		
		

	}


