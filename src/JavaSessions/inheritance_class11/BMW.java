package JavaSessions.inheritance_class11;

//BMW Class cannot extend 2 classes Car and Truck(Multiple Inheritance) due to the diamond problem
//public class BMW extends Car,Truck{
public class BMW extends Car {

	// Method Overriding: when we have a method in parent class
	// and the same method in child class with the same name and same number of
	// parameters
	// Runtime Polymorphism
	
	//Multiple Inheritance--Diamond Problem is not allowed from class to class
	//Multilevel Inheritance is allowed in java
	
	String colour="Blue";//colour variable value is overidden in the BMW class from red to blue
	
	@Override
	public void start() {
		System.out.println("BMW--start");
	}

	public void autoParking() {
		System.out.println("BMW--Auto Parking");
	}

	//static methods cannot be overridden
	/*@Override
	public static void wheels() {
		System.out.println("BMW--wheels");
	}*/

}
