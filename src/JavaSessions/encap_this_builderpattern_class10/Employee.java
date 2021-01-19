package JavaSessions.encap_this_builderpattern_class10;

public class Employee {
	public String name;
	public int age;
	private double salary;
	private int tax;

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public static void main(String args[]) {

		Employee obj = new Employee();
		obj.name = "Tom";
		obj.age = 35;
		obj.salary = 12.33;
		obj.tax = 20;

	}
}
