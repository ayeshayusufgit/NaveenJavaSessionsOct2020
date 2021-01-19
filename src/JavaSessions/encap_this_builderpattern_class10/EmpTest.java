package JavaSessions.encap_this_builderpattern_class10;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.name = "Peter";
		e1.age = 40;
		//e1.salary=12.50; unable to access a private variable outside the class
		//e1.tax=20; unable to access a private variable outside the class
		
		e1.setSalary(12.33);
		System.out.println(e1.getSalary());
		
		e1.setTax(20);
		System.out.println(e1.getTax());
	}

}
