package JavaSessions.encap_this_builderpattern_class10;

public class AmazonApp {

	public AmazonApp doLogin(String username, String password) {

		System.out.println("Login with:" + username + "and " + password);
		// return AmazonApp(); in every method will create a new instance
		// so instead of that this can we used in which the same object will be used
		return this;
	}

	public AmazonApp doLogin(long phone, int otp) {

		System.out.println("Login with:" + phone + "and " + otp);
		return this;
	}

	public AmazonApp search(String productName) {
		System.out.println("Search Product with Product name:" + productName);
		return this;
	}

	public AmazonApp search(String productName, int price) {
		System.out.println("Search Product with Product name:" + productName + "and price:" + price);
		return this;
	}

	public AmazonApp addToCart(String productName) {
		System.out.println("Adding to Cart" + productName);
		return this;
	}

	public AmazonApp doPayment(String cc, int cvv) {
		System.out.println("make the payment with:" + cc + cvv);
		return this;
	}

	public AmazonApp doPayment(String upi) {
		System.out.println("make the payment with:" + upi);
		return this;
	}

	public AmazonApp logOut() {
		System.out.println("Log Out");
		return this;
	}
}
