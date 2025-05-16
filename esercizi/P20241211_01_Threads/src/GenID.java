import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;


public class GenID extends Thread{
	private static ReentrantLock lock = new ReentrantLock();
	static long ID=0;
	
	public void run() {
		Random rng = new Random();
        while (true) {
            System.out.println(ID);
            // Simulare un minimo di tempo di calcolo
            try {
                Thread.sleep(71);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            lock.lock();
            ID = ID + 1;
            lock.unlock();
            try {
            	Thread.sleep(97);
            } catch (InterruptedException e) {
            	
            }
        }
    }

}
