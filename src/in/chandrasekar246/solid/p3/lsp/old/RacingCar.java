package in.chandrasekar246.solid.p3.lsp.old;

public class RacingCar extends Car {
	@Override
	public void getCabinWidth() {
		System.out.println(this.getClass().getSimpleName() + " - I don't have cabin :(");
	}
	
	public void getCockpitWidth() {
		System.out.println(this.getClass().getSimpleName() + " - I've cockpit :)");
	}
}
