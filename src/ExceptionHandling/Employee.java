package ExceptionHandling;

public class Employee {

	String name;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		Employee obj = new Employee();
		obj = null;

		try {
			obj.name = "Tom";// NPE
			int i = 9 / 0;// AE
			System.out.println("Hello");
		}

		catch (ArithmeticException e) {
			System.out.println("AE exception is coming...");
			 e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NPE exception is coming...");
			 e.printStackTrace();
		}

		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//5 secs
		
		

	}
	
	//error:
	//Error class
	//System(HW/OS) error: memory issue, leakage, stackover error
	

}
