import java.io.*;

public class Contocorrente {
    private double saldo;

    public Contocorrente() throws IOException {
        // Carica il saldo dal file
        File file = new File("db.txt");
        if (file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            if (line != null) {
                saldo = Double.parseDouble(line);
            }
            br.close();
        } else {
            saldo = 1000.0; // Valore iniziale di esempio
        }
    }

    public double getSaldo() {
        return saldo;
    }

    // Prelievo non sincronizzato
    public void prelievoNonSynch(double somma) throws Exception {
        Thread.sleep(3000);  // Simulazione di un tempo di elaborazione
        double nuovoSaldo = saldo - somma;
        if (nuovoSaldo >= 0) {
            saldo = nuovoSaldo;
            aggiornaSaldo();
        } else {
            throw new Exception("Saldo insufficiente!");
        }
    }

    // Prelievo sincronizzato
    public synchronized void prelievo(double somma) throws Exception {
        Thread.sleep(3000);  // Simulazione di un tempo di elaborazione
        double nuovoSaldo = saldo - somma;
        if (nuovoSaldo >= 0) {
            saldo = nuovoSaldo;
            aggiornaSaldo();
        } else {
            throw new Exception("Saldo insufficiente!");
        }
    }

    private void aggiornaSaldo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("db.txt"))) {
            bw.write(String.valueOf(saldo));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
