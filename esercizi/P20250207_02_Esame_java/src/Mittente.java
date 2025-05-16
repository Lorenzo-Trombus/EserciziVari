public class Mittente extends Thread {
    private final CasellaPostale casella;

    public Mittente(CasellaPostale casella) {
        this.casella = casella;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            casella.scriviMessaggio("Messaggio " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
