import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rng = new Random();
		for(int i = 0; i<100; i++) {
			Integer num = Dividi(rng.nextInt(10), rng.nextInt(10));
			//System.out.println(num);
		}
		
	}

	private static Integer Dividi(int i, int j) {
		try {
			Integer q = i/j;
			System.out.print("ok");
			return q;
		} catch (Exception ex) {
			System.out.println("ko");
		}finally {
			System.out.println("lesgosky lesgo");
		}
		System.out.println("UUUaaaaaaa");
		return null;
	}

}
