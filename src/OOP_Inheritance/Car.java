package OOP_Inheritance;

public class Car extends Vehicle{
	
	int maxSpeed = 100;
	
	final int price = 5000;
	
	static String color = "Black";

	
	//final method: can not be overridden : to prevent method overridding
	//final class: can not be a parent class: to prevent method inheritance
	
	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	//can not be overridden
	public static void billing() {
		System.out.println("Car -- billing");
	}
	
	//can not be overridden
	private void tyrePressure() {
		System.out.println("Car -- tyre pressure");
	}
	
	public void checkTypePressure() {
		tyrePressure();
	}
	
	
	 void selling() {
		System.out.println("Car -- selling");
	}
	
	//method hiding is also prevented by final
	public final static void testing() {
		
	}
	

}


////Page -- 15 secs to load the page
////LP -- 5 secs
//HP -- 15
//RP - 15
//OP - 10
