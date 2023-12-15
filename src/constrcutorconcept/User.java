package constrcutorconcept;

public class User {

	//public, default, protected, private
	
	
	String name;
	String email;
	int userId;
	String dob;
	String city;

	// create the user on the basis of following options:
	// 1. name
	// 2. name, email
	// 3. name, userId
	// 4. name, email, dob
	// 5. name, email, userId, dob, city
	// 6. name, city -- NA

	public User(String name) {
		this.name = name;
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public User(String name, int userId) {
		this.name = name;
		this.userId = userId;
	}

	public User(String name, String email, String dob) {
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	public User(String name, String email, int userId, String dob, String city) {
		this.name = name;
		this.email = email;
		this.userId = userId;
		this.dob = dob;
		this.city = city;
	}

	public String[] getUserOrderDetails(String name) {

		if (name.equals("Avinash")) {
			String orderDetails[] = { "Laptop", "Mouse", "USB Cable" };
			return orderDetails;
		}

		else if (name.equals("Ekanth")) {
			String orderDetails[] = { "Laptop", "Mouse" };
			return orderDetails;
		}

		else {
			return null;
		}

	}

	
	
}
