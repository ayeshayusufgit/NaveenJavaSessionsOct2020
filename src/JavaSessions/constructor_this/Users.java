package JavaSessions.constructor_this;

public class Users {
	String name;
	int age;
	static String compName;

	public void getCity() {
		System.out.println("get city");
	}

	public static void getInfo() {
		System.out.println("get info");
	}
	public static void getInfo(int a) {
		System.out.println("get info:"+a);
	}
	public static void getInfo(int a,int b) {
		System.out.println("get into:"+a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// How to call non static vars and methods
		// We have to create to object
		Users obj = new Users();
		obj.name = "Peter";
		obj.age = 25;
		obj.compName = "IBM";
		
		// How to called static vars and methods:
		
		// 1.you can call them directly within the class
		compName = "HCL";
		getInfo();
		// name="Tom";
		// age=30;
		
		// 2. by usinh class name
		Users.compName = "MS";
		Users.getInfo();
		
		Users.getInfo();
		Users.getInfo(10, 20);
	}

}
