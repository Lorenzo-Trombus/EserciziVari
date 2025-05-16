import java.util.List;

public class Smartphone extends Prodotto{
	private int memoriaArchiviazione;
	private int RAM;
	private String sistemaOperativo;
	
	public Smartphone(String iD, String nome, String descrizione, double prezzo, List<String> negozi,
			int memoriaArchiviazione, int rAM, String sistemaOperativo) {
		super(iD, nome, descrizione, prezzo, negozi);
		memoriaArchiviazione = memoriaArchiviazione;
		RAM = rAM;
		sistemaOperativo = sistemaOperativo;
	}

	public int getMemoriaArchiviazione() {
		return memoriaArchiviazione;
	}

	public void setMemoriaArchiviazione(int memoriaArchiviazione) {
		memoriaArchiviazione = memoriaArchiviazione;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		sistemaOperativo = sistemaOperativo;
	}

	@Override
	public String toString() {
		return "Smartphone [MemoriaArchiviazione=" + memoriaArchiviazione + ", RAM=" + RAM + ", SistemaOperativo="
				+ sistemaOperativo + "]";
	}
	
	

}
