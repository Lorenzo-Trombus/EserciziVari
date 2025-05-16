import java.util.List;

public class Televisore extends Prodotto{
	private double dimensioneSchermo;
	private String risoluzione;
	
	
	public Televisore(String iD, String nome, String descrizione, double prezzo, List<String> negozi,
			double dimensioneSchermo, String risoluzione) {
		super(iD, nome, descrizione, prezzo, negozi);
		this.dimensioneSchermo = dimensioneSchermo;
		this.risoluzione = risoluzione;
	}


	public double getDimensioneSchermo() {
		return dimensioneSchermo;
	}


	public void setDimensioneSchermo(double dimensioneSchermo) {
		this.dimensioneSchermo = dimensioneSchermo;
	}


	public String getRisoluzione() {
		return risoluzione;
	}


	public void setRisoluzione(String risoluzione) {
		this.risoluzione = risoluzione;
	}


	@Override
	public String toString() {
		return "Televisore [dimensioneSchermo=" + dimensioneSchermo + ", risoluzione=" + risoluzione + "]";
	}
	

}
