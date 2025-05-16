
public class Elettronica extends Prodotto {

	public Elettronica(String name, Double price, String categoria) {
		super(name, price, categoria);
		
	}

	@Override
	public Double calculateDiscount() {
		if (getPrice() > 500) {
            setPrice(getPrice() - (getPrice() * 0.10));
		}
		return null;
	}
	

}
