package JavaSessions.assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//6. Write a Java program to search an element in a array list.
//https://www.baeldung.com/find-list-element-java
public class ArrayList6 {

	public static Customer findingCustomerUsingFor(String name, List<Customer> customers) {
		for (int i = 0; i < customers.size(); i++) {
			Customer cust = customers.get(i);
			if (cust.getName().equals(name)) {
				return cust;
			}
		}
		return null;
	}

	public static Customer findingCustomerUsingEnhancedFor(String name, List<Customer> customers) {
		for (Customer cust : customers) {
			if (cust.getName().equals(name)) {
				return cust;
			}

		}
		return null;
	}

	public static Customer findingCustomerUsingIterator(String name, List<Customer> customers) {
		Iterator<Customer> itr = customers.iterator();
		while (itr.hasNext()) {
			Customer cust = (Customer) itr.next();
			if (cust.getName().equals(name)) {
				return cust;
			}
		}
		return null;
	}

	public static Customer findingCustomerUsingStreams(String name, List<Customer> customers) {
		Customer cust = customers.stream().filter(x -> name.equals(x.getName())).findAny().orElse(null);
		return cust;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1, "Ayesha"));
		customers.add(new Customer(2, "Abu"));
		customers.add(new Customer(2, "Ibu"));

		Customer custObj = new Customer(2, "Ibu");

		// method 1 using contains()
		if (customers.contains(custObj)) {
			System.out.println("Customer obj exists!");
		}

		// method 2 using indexOf()
		if (customers.indexOf(custObj) != -1) {
			System.out.println("Customer obj exists!");
		}

		// method 3 using enhanced for loop
		if (ArrayList6.findingCustomerUsingFor("Ibu", customers) != null) {
			System.out.println("Customer found using method3!");
		} else {
			System.out.println("Customer not found using method3!");
		}

		// method 4 using enhanced for loop
		if (ArrayList6.findingCustomerUsingEnhancedFor("Ibu", customers) != null) {
			System.out.println("Customer found using method4!");
		} else {
			System.out.println("Customer not found using method4!");
		}

		// method 5 using enhanced for loop
		if (ArrayList6.findingCustomerUsingIterator("Ibu", customers) != null) {
			System.out.println("Customer found using method5!");
		} else {
			System.out.println("Customer not found using method5!");
		}

		// method 6 using enhanced for loop
		if (ArrayList6.findingCustomerUsingStreams("Ibu", customers) != null) {
			System.out.println("Customer found using method6!");
		} else {
			System.out.println("Customer not found using method6!");
		}
	}

}
