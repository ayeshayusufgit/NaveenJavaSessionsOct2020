package JavaSessions;

public class Login {

	public void doLogin() {

	}

	public void doLogin(int a) {

	}

	public void doLogin(int a, int b) {

	}

	public void doLogin(int a, String b) {

	}

	public void doLogin(String a, int b) {

	}

	public void doLogin(String a, String b) {

	}

	public void login() {
		System.out.println("Login with no params");
	}

	public void login(String un, String pwd) {
		System.out.println("Login with 2 params" + un + ":" + pwd);
	}

	public void login(String un, String pwd, int otp) {
		System.out.println("Login with 3 params" + un + ":" + pwd + ":" + otp);
	}

	public void login(String un, String pwd, long phone) {
		System.out.println("Login with 3 params" + un + ":" + pwd + ":" + phone);
	}

	public boolean login(long ph, int otp) {
		System.out.println("Login with ph and otp");
		return true;
	}

	public void search() {

	}

	public void search(String prodName, int price) {

	}

	public void search(String prodName, int price, String colour) {

	}

	public void doPayment(String UPI) {
	}

	public void doPayment(String UPI, long ph, int otp) {
	}

	public void doPayment(long cc, int otp) {
	}

	public void doPayment(String amazonPay, String pwd, int otp) {
	}

	public void cabBooking() {

	}

	public void cabBooking(String str, String end) {

	}

	public void cabBooking(String str, String end, String carType) {

	}

	public void cabBooking(String str, String end, String carType, String couponCode) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Login lp = new Login();
		lp.login();

		lp.login("admin", "admin123");

		lp.login("naveen", "naveen123", 909000);

		if (lp.login(9898989, 1234)) {
			System.out.println("Home Page is displayed");
		}

	}

}
