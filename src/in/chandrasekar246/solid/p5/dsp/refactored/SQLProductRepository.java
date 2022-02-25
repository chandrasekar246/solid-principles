package in.chandrasekar246.solid.p5.dsp.refactored;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository implements ProductRepository {

	@Override
	public List<String> getAllProductNames() {
		System.out.println("SQLProductRepository");
		return Arrays.asList("Mobile", "Laptop", "Camera");
	}
}
