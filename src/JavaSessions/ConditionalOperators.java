package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;

		System.out.println(a > b);// false
		System.out.println(b > a);// true

		if (b > a) { // > is a comparision operator
			System.out.println("b is greater than a");
		} else {
			System.out.println("a is greater than b");
		}

		a = 10; // = assignment operator
		b = 10;
		if (a == b) { // == is comparison operator
			System.out.println("both are equal");
		}

		if (true) {
			System.out.println("Hey");
		} else { // Dead Code: as this code will never be executed
			System.out.println("Hello");
		}

		if (false) { // Dead Code: as this code will never be executed
			System.out.println("Hey");
		} else {
			System.out.println("Hello");
		}

		boolean flag = false;

		if (flag) {
			System.out.println("Selenium");
		} else {
			System.out.println("QTP");
		}

		// nested - if
		int marks = 101;
		if (marks <= 100) {
			if (marks >= 90) {
				System.out.println("Grade A");
			}
			if (marks >= 80) {
				System.out.println("Grade B");
			}
		} else {
			System.out.println("Not Eligible");
		}

		// if if if
		marks = 100;
		if (marks >= 90) {
			System.out.println("Grade A");
		}
		if (marks >= 80) {
			System.out.println("Grade B");
		}
		if (marks >= 70) {
			System.out.println("Grade C");
		}
		if (marks >= 60) {
			System.out.println("Grade D");
		}

		String browser = "Chrome";

		if (browser.equals("Chrome")) {
			System.out.println("Launch Chrome");
		}
		if (browser.equals("Firefox")) {
			System.out.println("Launch FF");
		}
		if (browser.equals("IE")) {
			System.out.println("Launch IE");
		}
		if (browser.equals("Safari")) {
			System.out.println("Launch Safari");
		} else {
			System.out.println("Pls pass the correct browser name");
		}
		
		browser = "Safari";

		if (browser.equals("Chrome")) {
			System.out.println("Launch Chrome");
		}else if (browser.equals("Firefox")) {
			System.out.println("Launch FF");
		}else if (browser.equals("IE")) {
			System.out.println("Launch IE");
		}else if (browser.equals("Safari")) {
			System.out.println("Launch Safari");
		} else {
			System.out.println("Pls pass the correct browser name");
		}

	}
}
