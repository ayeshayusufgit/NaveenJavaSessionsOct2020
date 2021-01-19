package JavaSessions.constructor_this;

public class Login {

	String username;
	String password;
	String role;
	
	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Login(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public void doLogin(String username,String password) {
		System.out.println(username+" "+password);
	}
	
	public void doLogin(String username,String password,String role) {
		System.out.println(username+" "+password+" "+role);
	}
}
