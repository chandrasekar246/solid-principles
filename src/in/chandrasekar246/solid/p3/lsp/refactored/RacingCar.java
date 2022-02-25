package in.chandrasekar246.solid.p3.lsp.refactored;

public class RacingCar extends Vehicle {
	@Override
	public void getInteriorWidth() {
		getCockpitWidth();
	}
	
	public void getCockpitWidth() {
		System.out.println(this.getClass().getSimpleName() + " - I've cockpit :)");
	}
}
