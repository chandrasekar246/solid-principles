package in.chandrasekar246.solid.p5.dsp.old;

import java.util.List;

public class ProductCatalog {

	public void listAllProducts() {
		
		SQLProductRepository sqlProductRepository = new SQLProductRepository();
		
		List<String> productList = sqlProductRepository.getAllProductNames();
		
		// Display product names...
		System.out.println(productList);
	}
}
