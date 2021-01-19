package JavaSessions.inheritance_class11;

public class LoginPage extends Page {
	int timeOut = 20;

	public LoginPage(int num) {
		super(num);// has to be the first statement in a constructor ow an error
		//super(); 2 super() will result in an error
		System.out.println("Login Page -- Default Constructor");
		//super();
	}

	public void display() {
		System.out.println(timeOut);
		System.out.println(super.timeOut);// with super keyword the Parent class timeout cant be accessed
		title();
		super.title();// The parent class method can be accessed with super keyword
	}

	@Override
	public void title() {
		System.out.println("Login Page -- Title");

	}

	public static void main(String[] args) {
		LoginPage lp = new LoginPage(100);

		lp.display();// Child class variable is called along with super
	}
}
