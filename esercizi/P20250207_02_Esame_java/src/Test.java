public class Test {
    public static void main(String[] args) throws InterruptedException {
        CasellaPostale casella = new CasellaPostale(10);
        Mittente mittente = new Mittente(casella);
        Destinatario destinatario = new Destinatario(casella);

        mittente.start();
        destinatario.start();

        mittente.join();
        destinatario.join();
    }
}
