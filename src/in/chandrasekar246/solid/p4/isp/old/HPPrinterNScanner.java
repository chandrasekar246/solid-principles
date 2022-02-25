package in.chandrasekar246.solid.p4.isp.old;

public class HPPrinterNScanner implements MultiFunction {

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
		System.out.println("I can scan documents");
	}

	@Override
	public void scanPhoto() {
		System.out.println("I can scan photos");
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
