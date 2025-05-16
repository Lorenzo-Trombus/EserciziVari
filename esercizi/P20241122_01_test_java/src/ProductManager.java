import java.util.*;

public class ProductManager implements Ordinabile {
	private List<Prodotto>products;
	
	public  ProductManager() {
		setProducts(new ArrayList<>());
	}
	
	public void addProduct(Prodotto product) {
        getProducts().add(product);
    }

    public void displayProducts() {
        for (Prodotto product : getProducts()) {
            System.out.println(product.toString());
        }
    } 

	@Override
	public List<Prodotto> sortByPrice(List<Prodotto> products) {
		Collections.sort(products,new Comparator<Prodotto>() {

			@Override
			public int compare(Prodotto p1, Prodotto p2) {
				return Double.compare(p1.getPrice(),p2.getPrice());
			}
			
		});
		return products;
	}

	public List<Prodotto> getProducts() {
		return products;
	}

	public void setProducts(List<Prodotto> products) {
		this.products = products;
	}

}
