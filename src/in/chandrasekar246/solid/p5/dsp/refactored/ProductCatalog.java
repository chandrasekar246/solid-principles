package in.chandrasekar246.solid.p5.dsp.refactored;

import java.util.List;

public class ProductCatalog {

	private ProductRepository productRepository;

	public ProductCatalog(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public void listAllProducts() {
		List<String> productList = productRepository.getAllProductNames();

		// Display product names...
		System.out.println(productList);
	}
}
