import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Definire una classe (Coppiaint) che contiene due integer
		Coppia<Integer,Double> ci1 = new Coppia<Integer,Double>(1,2.0);
		Coppia<Integer,Double> ci2 = new Coppia<Integer,Double>(111,112.0);

		//implementare un metodo SwapCoppia che scambia tra loro i contenuti di 
		// due coppie di dati (es. in ci2 va 1,2.0 e in ci1 va 111,112.0
		System.out.println(ci1 + ", " +ci2);
		SwapCoppia(ci1, ci2);
		System.out.println(ci1 + ", " +ci2);
		
		Coppia<String, String> css1=new Coppia<String,String>("uno", "due");
		Coppia<String, String> css2=new Coppia<String,String>("AAAuno", "BBBBdue");

				
	}
	private static <T1,T2> void SwapCoppia(Coppia<T1,T2> ci1, Coppia<T1,T2>ci2) {
		Coppia<T1, T2> appo = new Coppia<T1,T2>(ci1.getPrimo(), ci1.getSecondo());
		
		ci1.setPrimo(ci2.getPrimo());
		ci1.setSecondo(ci2.getSecondo());
		
		ci2.setPrimo(appo.getPrimo());
		ci2.setSecondo(appo.getSecondo());
	
//	private static void SwapCoppia(Coppia<Integer,Double> ci1, Coppia<Integer,Double>ci2) {
//		Coppia<Integer, Double> appo = new Coppia<Integer,Double>(ci1.getPrimo(), ci1.getSecondo());
//		
//		ci1.setPrimo(ci2.getPrimo());
//		ci1.setSecondo(ci2.getSecondo());
//		
//		ci2.setPrimo(appo.getPrimo());
//		ci2.setSecondo(appo.getSecondo());
	}
}
