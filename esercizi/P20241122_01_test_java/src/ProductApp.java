public class ProductApp {
    public static void main(String[] args) {
        
        ProductManager manager = new ProductManager();

        // Creazione di alcuni prodotti
        Elettronica prod1 = new Elettronica("Iphone iper pro max super", 6000.0, "Telefoni");
        Elettronica prod2 = new Elettronica("Turing01", 45.12, "PC");
        Abbigliamento prod3 = new Abbigliamento("Giubbotto Invernale", 160.2, "Abbigliamento invernale");
        Abbigliamento prod4 = new Abbigliamento("Tanga", 25.9, "Abbigliamento estivo");

        // Aggiungi prodotti al gestore
        manager.addProduct(prod1);
        manager.addProduct(prod2);
        manager.addProduct(prod3);
        manager.addProduct(prod4);

        // Visualizza i prodotti prima dell'ordinamento
        System.out.println("Prodotti prima dell'ordinamento:");
        manager.displayProducts();

        // Ordinamento dei prodotti per prezzo
        manager.sortByPrice(manager.getProducts());

        // Visualizza i prodotti dopo l'ordinamento
        System.out.println("\nProdotti dopo l'ordinamento:");
        manager.displayProducts();
    }
}
