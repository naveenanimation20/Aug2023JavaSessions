package javasessions;

public class Customer {
	
	//customer class vars:
	String firstName;
	String lastName;
	String email;
	String telephone;
	String password;
	boolean subscribe;

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.firstName = "Neha";
		c1.lastName = "Yadav";
		c1.password = "Neha@123";
		c1.subscribe = true;
		
		Customer c2 = new Customer();
		c2.firstName = "Ravi";
		c2.lastName = "Sharma";
		
		Customer c3 = new Customer();
		c3.firstName = "Naveen";
		
		Customer c4 = new Customer();
		c4.firstName = "Pooja";
		c4.email = "pooja@gmail.com";
		c4.lastName = "Bhatt";
		c4.telephone = "9999998989";
		c4.subscribe = false;
		c4.password = "pooja@123";
		
		new Customer();
		
	}
	
	
	public void get() {
		
	}

}
