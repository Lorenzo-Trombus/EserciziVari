import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class CasellaPostale {
    private final int maxSize;
    private final Queue<String> messaggi;
    private final ReentrantLock lock;
    private final Condition nuovoMessaggio;
    private final Condition spazioLibero;

    public CasellaPostale(int maxSize) {
        this.maxSize = maxSize;
        this.messaggi = new LinkedList<>();
        this.lock = new ReentrantLock();
        this.nuovoMessaggio = lock.newCondition();
        this.spazioLibero = lock.newCondition();
    }

    public void scriviMessaggio(String messaggio) {
        lock.lock();
        try {
            while (messaggi.size() >= maxSize) {
                spazioLibero.await();
            }
            messaggi.add(messaggio);
            System.out.println("Messaggio scritto: " + messaggio);
            nuovoMessaggio.signal();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public void leggiMessaggio() {
        lock.lock();
        try {
            while (messaggi.isEmpty()) {
                nuovoMessaggio.await();
            }
            String messaggio = messaggi.poll();
            System.out.println("Messaggio letto: " + messaggio);
            spazioLibero.signal();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }
}
