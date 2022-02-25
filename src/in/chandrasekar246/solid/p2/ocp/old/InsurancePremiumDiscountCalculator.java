package in.chandrasekar246.solid.p2.ocp.old;

public class InsurancePremiumDiscountCalculator {

	public int calculatePremiumDiscountPercentage(HealthInsuranceCustomerProfile customer) {
		if (customer.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}
}
