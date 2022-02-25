package in.chandrasekar246.solid.p4.isp.refactored;

public class CanonPrinter implements Print {

	@Override
	public void print() {
		System.out.println("I can print");
	}

	@Override
	public String getPrintSpoolDetails() {
		return "Print spool details...";
	}
}
