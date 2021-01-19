package JavaSessions.encap_this_builderpattern_class10;

//POJO classes-Plain Old Java Object
//We have some private variable and public methods to access these variables
public class Login {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//behaviour
	public void doLogin(String username, String password) {
		System.out.println("Login with:" + username + "and " + password);
	}

}
