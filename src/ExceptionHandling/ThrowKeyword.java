package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		// custom exception:
		//default case: throw new Exception
		//else part: throw new Exception

		String url = null;

		if (url == null) {
			try {
				throw new Exception("URL IS NULL");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		else {
			System.out.println("enter url in browser....");
		}
		
		

	}

	
}
