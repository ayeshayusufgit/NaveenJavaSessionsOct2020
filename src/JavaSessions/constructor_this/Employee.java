package JavaSessions.constructor_this;

public class Employee {
	String name;
	int id;
	int age;
	boolean isActive;

	// Constructor
	// name will be the same as the class name
	// constructor overloading is allowed in java
	// constructor will be called when u create the object
	// constructor will help to initialize the class variables non static for the
	// respective object
	public Employee() {// default const... or 0 param const
		System.out.println("0 param constructor");
	}

	public Employee(int a) {// 1 param const...
		System.out.println("1 param constructor" + a);
	}

	public Employee(int a, String b) {// 2 param const...
		System.out.println("2 param constructor" + a + b);
	}

	// the local variable name,id cannot access the name,id which is passed to it
	// public Employee(String name, int id) {// 2 param const...
	// name = name;
	// id = id;
	// }

	// Alterative1 by renaming the variables of the parameters,thus the values can
	// be assigned
	// public Employee(String name1, int id1) {// 2 param const...
	// name = name1;
	// id = id1;
	// }

	// Alterative2 by using the this keyword when the local/ variables of the
	// parameter have the same name
	public Employee(String name, int id) {// 2 param const...
		this.name = name;
		this.id = id;
	}

	public Employee(String name, int id, int age, boolean isActive) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.isActive = isActive;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		Employee e2 = new Employee(10, "Java");
		Employee e3 = new Employee("Tom", 101);
		System.out.println(e3.name + " " + e3.id+" "+e3.age+" "+e3.isActive);
		Employee e4 = new Employee("Peter", 102, 30, true);
		System.out.println(e4.name + " " + e4.id + " " + e4.age + " " + e4.isActive);

	}

}
