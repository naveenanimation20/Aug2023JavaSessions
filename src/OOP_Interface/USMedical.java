package OOP_Interface;

public interface USMedical extends WHO{
	
	int min_fee = 10; //static and final by default
	
	
	
	//no method body/only method declaration: abstract method
	//can not create the object of Interface in Java
	//Interfaces cannot have constructors
	//all abs... methods are non static
	
	
	//100% abstraction(OOP)
	public void physioServices();
	
	public void oncologyServices();

	public void pediaServices();

	public void emergencyServices();
	
	@Override
	public void covidVaccination();
	
	private static void testing() {
		System.out.println("USM - testing");
	}

	
	
	//after JDK 1.8: two major changes:
	//1. can have static method but with method body:
	public static void billing() {
		//buss logic:
		System.out.println("USM - billing");
		testing();
	}
	
	//2. can have a default method with method body: non static:
	default void RnD(){
		System.out.println("USM - R&D");
		testing();
	}
	
}
