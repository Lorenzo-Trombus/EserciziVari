
public class Secondo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("questa è la prima riga");
		System.out.println("questa è la terza riga");
		System.out.println("questa è la seconda riga");

		byte b1 = 10;
		byte b2;
		b2 = 100;
		byte b3, b4, b5;

		System.out.println("il valore di b1 è: " + b1);
		b1 = 127;
		System.out.println("il valore di b1 è: " + b1);
		b1 += 1;
		System.out.println("il valore di b1 è: " + b1);

		double d1 = 2.3;
		float f1 = 2.3F;

		/*
		 * operatori aritmetici e logici +,-,*,/,%, && (and) || (or)
		 * 
		 * logica binaria &(and) | (or)
		 */

		/*
		 * Esercizio: definite le due variabili v1 e v2 di tipo intero assegnate a v1 il
		 * valore 35 e a v2 il valore 41 stampate l'and logico tra v1 e v2 stampate
		 * l'and binario tra v1 e v2 discutete il risultato
		 */

		int v1 = 35;
		int v2 = 41;
		System.out.println(v1 & v2);
		// System.out.println(v1 && v2);

		{
			int num1 = 10;
			System.out.println(num1);
		}
		{
			boolean num1 = true;
			System.out.println(num1);
		}
//		 int num2=29;
//		 {
//			 int num2=30;
//			 non me lo fa fare perchè due variabili con lo stesso nome creano confusione			 
//		 }
		float l1 = 45.3f;
		float l2 = 67.2f;
		
		float i= Math.sqrt((l1*l1)+(l2*l2));
	}

}
