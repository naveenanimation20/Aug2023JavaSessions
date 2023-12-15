package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0;
			System.out.println("Hello");
		} 
		catch (ArithmeticException e) {
			System.out.println("AE is coming...");
		}
		finally {
			System.out.println("finally block");
		}
		
		
		
		//use cases of finally block:
		//DB connection with JAVA:
		
		//make the connection with DB -- PASS
		//hit the SQL query -- PASS
		
		//try {
		//fetch the data from a table -- Exception
//		}
//		catch() {}
		
		
		//close the connection with DB -- finally block
		

	}

}

