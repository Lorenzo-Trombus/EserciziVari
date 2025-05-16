package unchecked;

import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {
		// creo un arraylist di stringhe e uso metodi che sollevano eccezioni unknown
		ArrayList<String> fiori = new ArrayList<>();
		fiori.add("fresie");
		fiori.add("rose");
		fiori.add("margherite");
		
		System.out.println(fiori);
		
		System.out.println(fiori.get(1));
		
		int x= 5;
		try {
			fiori.add(x,"narcisi");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("fine");

	}

}
