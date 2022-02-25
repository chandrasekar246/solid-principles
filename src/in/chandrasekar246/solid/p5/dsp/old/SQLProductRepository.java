package in.chandrasekar246.solid.p5.dsp.old;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository {

	public List<String> getAllProductNames() {
		System.out.println("SQLProductRepository");
		return Arrays.asList("Mobile", "Laptop", "Camera");
	}
}
