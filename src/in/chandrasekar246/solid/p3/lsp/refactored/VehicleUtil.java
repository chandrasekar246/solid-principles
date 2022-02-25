package in.chandrasekar246.solid.p3.lsp.refactored;

import java.util.ArrayList;
import java.util.List;

public class VehicleUtil {

	/*
	 * Breaking the hierarchy
	 */
	public static void main(String[] args) {

		Vehicle v1 = new Car();
		Vehicle v2 = new RacingCar();

		List<Vehicle> vehicleList = new ArrayList<>();
		vehicleList.add(v1);
		vehicleList.add(v2);

		for (Vehicle vehicle : vehicleList) {
			vehicle.getInteriorWidth();
		}
	}

}
