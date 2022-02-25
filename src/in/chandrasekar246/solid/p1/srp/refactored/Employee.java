package in.chandrasekar246.solid.p1.srp.refactored;

public class Employee {

	private String employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employeeMobileNumber;
	private String employeeType;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void save() {
		if (System.getenv("DBMS_SYSTEM").equalsIgnoreCase("MySQL")) {
			new EmployeeRepositoryMySql().save(this);
		} else {
			new EmployeeRepositoryOracle().save(this);
		}
	}

	public void calculateTax() {
		new TaxCalculator().calculateTax(this);
	}
}
