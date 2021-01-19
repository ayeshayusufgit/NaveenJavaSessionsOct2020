package JavaSessions.encap_this_builderpattern_class10;

public class UsersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Users user = new Users("12.33", "900, London, UK");
		System.out.println(user.getSalary() + " " + user.getAddress());
		user.setSalary("15.60");
		user.setAddress("901 London UK");
		System.out.println(user.getSalary() + " " + user.getAddress());
	}

}
