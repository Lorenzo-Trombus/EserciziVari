
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		private static LinkedList<Integer> AddToLinkedList(Integer n) {
	        LinkedList<Integer> lli = new LinkedList<Integer>();
	        while (n > 0) {
	            lli.add(n--);
	        }
	        return lli;
	    }
	    private static ArrayList<Integer> AddToArrayList(Integer n) {
	        ArrayList<Integer> lli = new ArrayList<Integer>();
	        while (n > 0) {
	            lli.add(n--);
	        }
	        return lli;
	    }
	    private static LinkedList<Integer> AddFirstLinkedList(Integer n) {
	        LinkedList<Integer> lli = new LinkedList<Integer>();
	        while (n > 0) {
	            lli.addFirst(n--);
	            return lli;
	        }
	    }
	    private static ArrayList<Integer> AddFirstArrayList(Integer n) {
	        ArrayList<Integer> lli = new ArrayList<Integer>();
	        while (n > 0) {
	            lli.addFirst(n--);
	        }
	        return lli;
	    }

	}

}
