package in.chandrasekar246.solid.p4.isp.old;

public class CanonPrinter implements MultiFunction {

	@Override
	public void print() {
		System.out.println("I can print");
	}

	@Override
	public String getPrintSpoolDetails() {
		return "Print spool details...";
	}

	@Override
	public void scan() {
		// NOT SUPPORTED
	}

	@Override
	public void scanPhoto() {
		// NOT SUPPORTED
	}

	@Override
	public void fax() {
		// NOT SUPPORTED
	}

	@Override
	public void internetFax() {
		// NOT SUPPORTED
	}

}
