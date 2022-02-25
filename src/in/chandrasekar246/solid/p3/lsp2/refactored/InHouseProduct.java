package in.chandrasekar246.solid.p3.lsp2.refactored;

public class InHouseProduct extends Product {
	
	@Override
	public double getDiscount() {
		applyExtraDiscount();
		return discount;
	}

	public void applyExtraDiscount() {
		discount *= 1.5;
	}
}
