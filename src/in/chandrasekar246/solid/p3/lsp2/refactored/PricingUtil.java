package in.chandrasekar246.solid.p3.lsp2.refactored;

import java.util.ArrayList;
import java.util.List;

public class PricingUtil {

	/*
	 * Tell, don't ask
	 */
	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new InHouseProduct();
		
		List<Product> productList = new ArrayList<>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		
		for (Product product : productList) {
			System.out.println(product.getDiscount());
		}
	}
}
