//@FunctionalInterface
//interface Calcolatore {
//	int calcola(int a, int b);
//}
//
//public class Main {
//	public static void main(String[] args) {
//		// Implementazione lambda per sommare due numeri
//		Calcolatore somma = (a, b) -> a + b;
//
//		// Test dell'operazione
//		int risultato = somma.calcola(5, 3);
//		System.out.println("Il risultato della somma è: " + risultato);
//	}
//}
@FunctionalInterface

interface VerificatoreParola {

             boolean verifica(String parola, int lunghezza);

}