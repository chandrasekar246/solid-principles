package in.chandrasekar246.solid.p2.ocp.refactored;

public class InsurancePremiumDiscountCalculator {

	public int calculatePremiumDiscountPercentage(CustomerProfile customer) {
		if (customer.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}
}
