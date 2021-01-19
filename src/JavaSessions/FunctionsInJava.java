package JavaSessions;

public class FunctionsInJava {

	// TODO Auto-generated method stub

	// Functions:
	// cannot create a function inside a function
	// function is the behaviour of the class

	// 1. no input and no return:
	// void doesnt return anything and and cannot have a return keyword
	// return type: void
	public void test() {
		System.out.println("Test Function");
	}

	// 2 no input and some return
	// return type: String
	public String getTrainerName() {
		System.out.println("Get Trainer Name:");
		String name = "Naveen";
		return name;
	}

	// return type: int
	public int getTotal() {
		System.out.println("Get Total");
		int a = 100;
		int b = 200;
		int c = a + b + 30;
		return c;
	}

	// 3. input and some return
	// return type: int
	public int add(int a, int b) {
		System.out.println("Add Function");
		int z = a + b;
		return z;
	}

	public String getCapitalName(String countryName) {
		System.out.println("Getting the capital for:" + countryName);
		if (countryName.equals("India")) {
			return "New Delhi";
		} else if (countryName.equals("USA")) {
			return "Washington DC";
		} else if (countryName.equals("Russia")) {
			return "Moscow";
		} else if (countryName.equals("UK")) {
			return "London";
		} else {
			System.out.println("Country name is not found, pls pass thr right country name" + countryName);
			return null;
		}
	}

	// function: which takes student names and return their marks
	public int getStudentMarks(String studentName) {
		System.out.println("Getting marks for student:" + studentName);
		int marks = 0;
		if (studentName.equals("Suma")) {
			marks = 90;
		} else if (studentName.equals("Vishal")) {
			marks = 100;
		} else if (studentName.equals("Jasvir")) {
			marks = 95;
		} else if (studentName.equals("Naveen")) {
			marks = 20;
		} else {
			System.out.println("Student not found!" + studentName);
			marks = -1;
		}
		return marks;
	}

	// function: which takes browserName(String) and launches the browser
	// accordingly
	public void launchBrowser(String browser) {
		if (browser.equals("chrome")) {
			System.out.println("Launching the chrome browser!!");
		} else if (browser.equals("firefox")) {
			System.out.println("Launching the firefox browser!!");
		}
	}

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();

		// n is a holding parameter
		String n = obj.getTrainerName();
		System.out.println(n);

		int total = obj.getTotal();
		System.out.println(total);

		System.out.println(obj.getTotal());

		int t2 = obj.add(30, 40);
		System.out.println(t2);

		String cap1 = obj.getCapitalName("Germany");
		System.out.println(cap1);

		int m1 = obj.getStudentMarks("Tom");
		System.out.println(m1);

		int marks = obj.getStudentMarks("Peter");
		System.out.println(marks);

	}
}
