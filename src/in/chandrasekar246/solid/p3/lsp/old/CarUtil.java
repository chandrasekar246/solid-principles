package in.chandrasekar246.solid.p3.lsp.old;

import java.util.ArrayList;
import java.util.List;

public class CarUtil {

	/*
	 * Breaking the hierarchy
	 */
	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new RacingCar();

		List<Car> carList = new ArrayList<>();
		carList.add(c1);
		carList.add(c2);

		for (Car car : carList) {
			car.getCabinWidth();
		}
	}

}
