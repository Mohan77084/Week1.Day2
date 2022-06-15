package week1.day2;

public class TwoWheelers {
	public int  noOfWheels() {
		return 2;
	}
	public short noOfMirrors() {
		return 2;
	}
	long chasisNumber(long c) {
		return c;
	}
	private boolean isPuntured() {
		return false;
	}
	String bikeName(String d) {
		return d;
	}
	public double runningKM(double e) {
		return e;
	}
	
	public static void main(String[] args) {
		TwoWheelers obj = new TwoWheelers();
		int noOfWheels = obj.noOfWheels();
		System.out.println(noOfWheels);
		short noOfMirrors = obj.noOfMirrors();
		System.out.println(noOfMirrors);
		long chasisNumber = obj.chasisNumber(6789);
		System.out.println(chasisNumber);
		boolean puntured = obj.isPuntured();
		System.out.println(puntured);
		String bikeName = obj.bikeName("Yamaha R15");
		System.out.println(bikeName);
		double runningKM = obj.runningKM(42520);
		System.out.println(runningKM);
	}
}
