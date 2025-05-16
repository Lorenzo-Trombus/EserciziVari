public class ClienteNonSync extends Thread {
    private String nome;
    private double somma;
    private Contocorrente conto;

    public ClienteNonSync(String nome, double somma, Contocorrente conto) {
        this.nome = nome;
        this.somma = somma;
        this.conto = conto;
    }

    @Override
    public void run() {
        try {
            System.out.println(nome + " verifica saldo: " + conto.getSaldo());
            conto.prelievoNonSynch(somma);
            System.out.println(nome + " ha prelevato " + somma + ". Nuovo saldo: " + conto.getSaldo());
        } catch (Exception e) {
            System.out.println(nome + " errore: " + e.getMessage());
        }
    }
}
