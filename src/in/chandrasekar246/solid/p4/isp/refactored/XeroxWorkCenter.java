package in.chandrasekar246.solid.p4.isp.refactored;

public class XeroxWorkCenter implements Print, Scan, Fax {

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
		System.out.println("I can send fax");
	}

	@Override
	public void internetFax() {
		System.out.println("I can send fax through internet");
	}

}
