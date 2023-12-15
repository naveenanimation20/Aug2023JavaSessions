package javasessions;

public class Car {
	
	String name;
	int price;
	String chasisNumber;
	static final int wheels=4;
	
	
	//in the backgroud, jvm will add one default/hidden const...
	
	
	public static void main(String[] args) {

		Car c1 = new Car();//creating object--->calling default cosnst...
		c1.name = "BMW";
		c1.price = 50;
		c1.chasisNumber = "12121BMW";
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 60;
		c2.chasisNumber = "121666AUDI";
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 10;
		c3.chasisNumber = "12122wwHONDA";
		
		//Car.wheels = 5;

		//how to call static vars:
		//1. use directly: within the same class
		System.out.println(wheels);
		System.out.println(c1.name + " " + c1.price + " " + c1.chasisNumber + " " + wheels);
		
		//2. use it with the class name: from anywhere
		System.out.println(Car.wheels);
		System.out.println(c1.name + " " + c1.price + " " + c1.chasisNumber + " " + Car.wheels);


		//3. can I call static var with object ref name??
		System.out.println(c1.wheels);//not recommended
		
		
	}

}
