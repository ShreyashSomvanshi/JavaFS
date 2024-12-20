package pack.capg.module.collections2;

import java.util.LinkedHashSet;




public class ProductCatalog {

	private LinkedHashSet<Product> products;

	public ProductCatalog(LinkedHashSet<Product> products) {
		super();
		products = new LinkedHashSet<Product>();
	}
	
	public boolean addProd(Product pro) {
		return products.add(pro);
	}
	

}
