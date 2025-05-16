import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // lista di negozi
        var negozi = Arrays.asList("ElettronicaStore", "TechShop", "SuperMarket");

        Televisore televisore1 = new Televisore("001", "Televisore Ultra HD", 
                "Televisore 4K con supporto HDR", 1199.99, negozi, 55.0, "4K");
        
        Televisore televisore2 = new Televisore("002", "Televisore LED Smart", 
                "Televisore LED 1080p, compatibile con app", 799.99, negozi, 43.0, "Full HD");
        
        Televisore televisore3 = new Televisore("003", "Televisore OLED", 
                "Televisore OLED con immagini ad alta definizione", 2500.00, negozi, 65.0, "4K");
        
        
        Smartphone smartphone1 = new Smartphone("001", "Smartphone Pro", 
                "Smartphone con display AMOLED e 128GB di memoria", 899.99, negozi, 128, 6, "Android");
        
        Smartphone smartphone2 = new Smartphone("002", "Smartphone X", 
                "Smartphone con processore Snapdragon e 64GB di memoria", 499.99, negozi, 64, 4, "iOS");
        
        Smartphone smartphone3 = new Smartphone("003", "Smartphone Ultra", 
                "Smartphone con fotocamera 108MP e 256GB di memoria", 1299.99, negozi, 256, 8, "Android");

        
        Cliente cliente1 = new Cliente("C001", "Mario", "Rossi", "mario.rossi@email.com", "password123");
        Cliente cliente2 = new Cliente("C002", "Giulia", "Bianchi", "giulia.bianchi@email.com", "password456");

        cliente1.acquistaProdotto(smartphone1);
        cliente2.acquistaProdotto(televisore1);

        cliente1.stampaProdottiAcquistati();
        cliente2.stampaProdottiAcquistati();

//        System.out.println(smartphone1);
//        System.out.println(smartphone2);
//        System.out.println(smartphone3);
//        
//        
//        System.out.println(televisore1);
//        System.out.println(televisore2);
//        System.out.println(televisore3);
//    
    }
}
