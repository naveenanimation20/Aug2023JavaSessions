package BuilderPattern;

public class Ecommerce {

	public Ecommerce login() {
		System.out.println("user is logged in");
		return this; //new Ecommerce();
	}

	public Ecommerce login(String un, String pwd) {
		System.out.println("user is logged in with : " + un + " " + pwd);
		return this;
		//return new Ecommerce();
	}

	public Ecommerce search(String productName) {
		System.out.println("searching product: " + productName);
		return this;
	}

	public Ecommerce search(String productName, String color) {
		System.out.println("searching product: " + productName + " " + color);
		return this;
	}

	public Ecommerce selectProduct(String productName) {
		System.out.println("selecting product: " + productName);
		return this;
	}

	public Ecommerce addToCart(String productName) {
		System.out.println("adding product in the cart: " + productName);
		return this;
	}

	public Ecommerce doPayment(String cc, int cvv) {
		System.out.println("making payment using card: " + cc + ":" + cvv);
		return this;
	}

	public Ecommerce generaterOrderId() {
		System.out.println("order id is: " + 12345);
		return this;
	}

	public Ecommerce logout() {
		System.out.println("logout");
		return this;
	}
	
	

}
