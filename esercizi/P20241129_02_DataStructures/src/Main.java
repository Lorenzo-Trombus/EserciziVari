import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Set,Map,List,Queue,Stack,Array
		
		//I set
		HashSet<Prova> hsp =new HashSet<Prova>();
		TreeSet<Prova> tsp = new TreeSet<Prova>();
		
		//le mappe
		HashMap<Prova, Integer> hmp = new HashMap<Prova, Integer>();
		TreeMap<Prova, Integer> tmp = new TreeMap<Prova, Integer>();
		
		for (int i=0; i<100; i++) {
			hsp.add(new Prova(i));
			tsp.add(new Prova(i));

		}
		
		System.out.println(hsp.contains(new Prova(10)));
		
		Prova unaProva = new Prova(987);
		hsp.add(unaProva);
		System.out.println(hsp.contains(unaProva));
		
	}

}

class Prova {
	public String uno;
	public Integer due;
	public  
}