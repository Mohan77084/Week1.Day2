package week1.day2;

public class Cars {
	public boolean applyBreak() {
	return true;
	}
	private boolean applyGear() {
		return true;
	}
	boolean switchOnAc() {
		System.out.println("AC is ON");
		return true;
	}
	public boolean applyAccelerate() {
		return false;
	}
	
	
	public static void main(String[] args) {
		Cars obj = new Cars();
		boolean applyBreak = obj.applyBreak();
		System.out.println(applyBreak);
		boolean applyGear = obj.applyGear();
		System.out.println(applyGear);
		boolean switchOnAc = obj.switchOnAc();
		System.out.println(switchOnAc);
		boolean applyAccelerate = obj.applyAccelerate();
		System.out.println(applyAccelerate);
	}
}
