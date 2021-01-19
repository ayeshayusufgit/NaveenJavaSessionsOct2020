package JavaSessions;

public class Car {
	String name;
	String model;
	int price;
	String color;
	static int wheels=4;
	
	public static void main(String[] args) {
		Car c1=new Car();
		c1.name="BMW";
		c1.model="520d";
		c1.price=80;
		c1.color="Blue";
		//c1.wheels=4;
		
		Car c2=new Car();
		c2.name="Honda";
		c2.model="Civic";
		c2.price=30;
		c2.color="Red";
		//c2.wheels=4;
		
		Car c3=new Car();
		c3.name="BMW";
		c3.model="520d";
		c3.price=80;
		c3.color="Black";
		//c3.wheels=4;
		
		Car c4=new Car();
		c4.name="Audi";
		c4.model="Q5";
		c4.price=75;
		c4.color="Silver";
		//c4.wheels=4;
		
		Car c5=new Car();
		c5.name="Maruti";
		c5.model="Alto";
		c5.price=3;
		c5.color="Grey";
		//c5.wheels=4;
	}
	

}
