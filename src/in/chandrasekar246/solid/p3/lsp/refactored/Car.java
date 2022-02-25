package in.chandrasekar246.solid.p3.lsp.refactored;

public class Car extends Vehicle {
	
	@Override
	public void getInteriorWidth() {
		getCabinWidth();
	}

	public void getCabinWidth() {
		System.out.println(this.getClass().getSimpleName() + " - I've cabin :)");
	}
}
