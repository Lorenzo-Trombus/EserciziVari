package checked;

public class MainImpiegato {

	public static void main(String[] args) {
		Impiegato imp = new Impiegato("mario",1000);
		System.out.println(imp);
		
		try {
			imp.incrementaSalario(-500);
		} catch (IncrementoNegativoException e) {
			System.out.println("hai inserito un valore negativo o nullo ");	
		}
		System.out.println(imp);
	}

}
