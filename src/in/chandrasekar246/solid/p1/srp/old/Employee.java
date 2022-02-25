package in.chandrasekar246.solid.p1.srp.old;

public class Employee {

	private String employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employeeMobileNumber;
	private String employeeType;
	
	/*
	 * REASON TO CHANGE
	 * 1. Changes in employee attributes
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/*
	 * REASON TO CHANGE
	 * 2. Changes in database
	 */
	public void save() {
		// Save this object to database
	}
	
	/*
	 * REASON TO CHANGE
	 * 3. Changes in tax calculation
	 */
	public void calculateTax() {
		// Calculate tax based on the employeeType
	}
}
