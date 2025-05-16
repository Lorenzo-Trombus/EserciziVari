import java.util.*;

public class Prodotto {
	private String ID;
	private String nome;
	private String descrizione;
	private double prezzo;
	private List<String> negozi;
	
	public Prodotto(String iD, String nome, String descrizione, double prezzo, List<String> negozi) {
		super();
		ID = iD;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.negozi = negozi;
	}


	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public List<String> getNegozi() {
		return negozi;
	}

	public void setNegozi(List<String> negozi) {
		this.negozi = negozi;
	}


	@Override
	public String toString() {
		return "Prodotto [ID=" + ID + ", nome=" + nome + ", descrizione=" + descrizione + ", prezzo=" + prezzo
				+ ", negozi=" + negozi + "]";
	}
	
	

}
