package SuperThisKeyword;

public class BMW extends Car{

	int speed = 200;

	public BMW() {
		super(20,30);//1st statement in the BMW const...
		System.out.println("BMW const...");
		
	}
	
	public BMW(int p) {
		this();
		System.out.println("BMW const..." + p);
		
	}
	
	@Override
	public void displayInfo() {
		System.out.println("BMW -- info");
	}
	
	
	public void displayBMWInfo() {
		System.out.println("BMW -- system info");
		System.out.println(speed);//200
		System.out.println(super.speed);//100
		
		displayInfo();//bmw
		super.displayInfo();//car
	}
	
	//super: pointing to the parent class object
	//1. in the child clas const.. but it should be the 1st statement in the child class const...
	//2. when you have same properties (Method overrdding/same var) in parent and child 
	//but you want to call/access parent class properties -- use super keyword
	
	//this: pointing to the current class object
	//1. can call other const.. in the same class
	//2. either this() or super()
	//3. should be the 1st statement in the const...
	//4. to initialize the instance variables with the local variables in const... and methods.
	//5. can return this keyword also from the method - builder pattern
	
	
	
	
	
}
