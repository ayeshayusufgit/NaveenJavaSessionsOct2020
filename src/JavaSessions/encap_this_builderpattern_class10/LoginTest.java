package JavaSessions.encap_this_builderpattern_class10;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Login lp = new Login();
		//Setting username/password for customer 
		lp.setUsername("tom@gmail.com");
		lp.setPassword("test123");
		//this is the actual usercase of setters/getters
		lp.doLogin(lp.getUsername(), lp.getPassword());
		//Setting username/password for seller
		lp.setUsername("seller@gmail.com");
		lp.setPassword("seller123");

	}

}
