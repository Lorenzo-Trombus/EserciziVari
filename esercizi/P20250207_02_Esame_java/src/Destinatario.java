public class Destinatario extends Thread {
    private final CasellaPostale casella;

    public Destinatario(CasellaPostale casella) {
        this.casella = casella;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            casella.leggiMessaggio();
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
