package checked;

public class Impiegato {
	private int salario;
	private String nome;
	
	
	public Impiegato(String nome, int salario) {
		super();
		this.salario = salario;
		this.nome = nome;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Impiegato [nome=" + nome + ", salario=" + salario +"]";
	}
	
	public void incrementaSalario(int incremento) throws IncrementoNegativoException {
		if(incremento > 0)
			this.salario += incremento; //si puo evitare il "this"
		else 
			throw new IncrementoNegativoException();
	}

}
