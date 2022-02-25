package in.chandrasekar246.solid.p5.dsp.refactored;

public class MainApplication {

	public static void main(String[] args) {

		ProductRepository productRepository = ProductFactory.create(2);

		ProductCatalog productCatalog = new ProductCatalog(productRepository);

		productCatalog.listAllProducts();
	}

}
