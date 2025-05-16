
public class Abbigliamento extends Prodotto {

	public Abbigliamento(String name, Double price, String categoria) {
		super(name, price, categoria);
	
	}

	@Override
	public Double calculateDiscount() {
		if ("Abbigliamento invernale".equalsIgnoreCase(getCategoria())) {
            setPrice(getPrice() - (getPrice() * 0.15)); 
		}
		return null;
	}
	

}
