package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	public void checkout(String status) {
		// ALL BELOW LINES ARE ASPECTS COMES UNDER THE CROSS CUTTING CONCERNS
		// LOGGING
		// AUTHORIZATION AND AUTHENTICATION
		// SANITIZE THE DATA
		// THE LINE BELOW IS BUSINESS LOGIC
		System.out.println("Checkout method from ShoppingCart called");
	}
	
	public int quantity() {
		return 2;
	}

}
