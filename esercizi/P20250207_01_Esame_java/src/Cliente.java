import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private List<Prodotto> prodottiAcquistati;

    
    public Cliente(String id, String nome, String cognome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.prodottiAcquistati = new ArrayList<>();
    }

    public void acquistaProdotto(Prodotto prodotto) {
        prodottiAcquistati.add(prodotto);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Prodotto> getProdottiAcquistati() {
        return prodottiAcquistati;
    }

    public void stampaProdottiAcquistati() {
        System.out.println(nome + " " + cognome + " ha acquistato i seguenti prodotti:");
        for (Prodotto prodotto : prodottiAcquistati) {
            System.out.println(prodotto);
        }
    }
}
