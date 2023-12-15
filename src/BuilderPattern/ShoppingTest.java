package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {

		Ecommerce u1 = new Ecommerce();
		u1.login("karishma@gmail.com", "karishma123")
			.search("Laptop")
				.selectProduct("MAcbook")
					.addToCart("MAcbook")
						.doPayment("1234 1234 4567 7777", 422)
							.generaterOrderId()
								.logout();
		
		
		//
		u1.login("karishma@gmail.com", "karishma123")
			.search("Shoes", "Red")
				.selectProduct("Nike AirMax")
					.logout();
		
		
		//
		u1.login("karishma@gmail.com", "karishma123")
			.search("Mobile", "Black")
				.selectProduct("Iphone 15")
					.addToCart("Iphone 15")
						.logout();
		
		//
		u1.login("karishma@gmail.com", "karishma123")
			.logout();
		
		//
		u1.login("karishma@gmail.com", "karishma123");
		
		//
		u1.login()
		.search("Mobile", "Black")
		.selectProduct("Iphone 15")
			.addToCart("Iphone 15")
			.doPayment("1234 1234 4567 7777", 422)
			.generaterOrderId()
				.logout()
				.login("karishma@gmail.com", "karishma123")
				.search("Laptop")
					.selectProduct("MAcbook")
						.addToCart("MAcbook")
							.doPayment("1234 1234 4567 7777", 422)
								.generaterOrderId()
									.logout();
					
			

		
		
		
	}

}
