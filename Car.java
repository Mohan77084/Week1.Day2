package week1.day2;

public class Car {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.printCarName();
		String color = obj.getColor();
		System.out.println(color);
		boolean carPuntured = obj.isCarPuntured();
		System.out.println(carPuntured);
	}
	public void printCarName() { 
		System.out.println("Audi Q7");
	}
	private String getColor() {
		return "Samurai Grey";
	}
	boolean isCarPuntured() {
		return false;
	}
}
