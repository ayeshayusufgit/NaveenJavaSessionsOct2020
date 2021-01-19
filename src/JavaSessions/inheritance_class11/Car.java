package JavaSessions.inheritance_class11;


//Car Class cannot extend 2 classes Vehicle and Truck(Multiple Inheritance) due to the diamond problem
//public class Car extends Vehicle,Truck{
public class Car extends Vehicle {
	
	//final --- is used to prevent inheritance and method overriding both

	String colour="Red";
	
	public void start() {
		System.out.println("Car----start");
	}
	
	public void stop() {
		System.out.println("Car----stop");
	}

	public void refuel() {
		System.out.println("Car-----refuel");
	}
	
	public static void wheels() {
		System.out.println("Car-----wheels");
	}
}
