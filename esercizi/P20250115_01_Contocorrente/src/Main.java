public class Main {
    public static void main(String[] args) throws InterruptedException {
        try {
            // Crea un conto corrente
            Contocorrente conto = new Contocorrente();

            // Crea i thread
            ClienteNonSync c1 = new ClienteNonSync("Mario", 20, conto);
            ClienteSync c2 = new ClienteSync("Lucia", 50, conto);

            // Avvio i Threads
            c1.start();
            c2.start();

            // Attendo il completamento
            c1.join();
            c2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
