package SuperThisKeyword;

public class Car {
	
	int speed = 100;
	
	public Car() {
		System.out.println("car const...");
		
	}
	
	public Car(int a) {
		this(10,20);
		//this();//error - Constructor call must be the first statement in a constructor
		System.out.println("car const..."+ a);
	}
	
	public Car(int a, int b) {
		this();
		System.out.println("car const..."+ (a+b));
	}
	
	public void displayInfo() {
		System.out.println("Car -- info");
	}
	

}
