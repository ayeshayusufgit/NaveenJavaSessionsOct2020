package JavaSessions.encap_this_builderpattern_class10;

public class Users {
	private String salary;
	private String address;

	public Users(String salary, String address) {
		super();
		this.salary = salary;
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
