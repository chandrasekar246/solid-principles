package in.chandrasekar246.solid.p5.dsp.refactored;

public class ProductFactory {

	public static ProductRepository create(int config) {
		if (config == 2) {
			return new NoSQLProductRepository();
		}
		return new SQLProductRepository();
	}
}
