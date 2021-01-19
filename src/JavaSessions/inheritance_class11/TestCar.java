package JavaSessions.inheritance_class11;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b = new BMW();
		// THe overridden method
		b.start();
		// Methods inherited from the Parent Car
		b.stop();
		b.refuel();
		// This method is specific only to BMW class
		b.autoParking();
		b.engine();// Getting inherited from Vehicle class
		System.out.println(b.colour);// colour variable is inherited by BMW class and can be accessed by b.colour
		// b.theftSafety(); indivisual methods cannot be accessed/inherited by sibling
		// ie BMW from Audi class

		Audi ad = new Audi();
		ad.start();// method inherited from Car class
		ad.stop();// method inherited from Car class
		ad.refuel();// method inherited from Car class
		ad.theftSafety();// indivisual method from Audi class
		// ad.autoParking();indivisual methods cannot be accessed/inherited by siblings
		// ie Audi from BMW class

		// Calling start(),stop() and refuel() from the superclass Car
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();// Getting inherited from Vehicle class

		// Creating object of BMW wo any reference
		new BMW();

		// Topcasting
		Car c1 = new BMW();// child class object can be referred by parent ref variable
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();// Getting inherited from Vehicle class

		// Downcasting
		// BMW b1=new Car();
		// Creating object of BMW wo any reference
		// BMW b1 =(BMW) new Car();//Class Cast Exception

		Vehicle v = new BMW();
		// v.start(); this wont be allowed as its there in the Car class and overridden
		// in the BMW class
		// v.refuel(), this wont be allowed as its there in the Car class and overridden
		// in the BMW class
		// v.autoParking(); will not be allowed as per the reference type check
		v.engine();// this method will be allowed as its inherited from vehicle

		// static methods can be called by the Classname.wheels
		Car.wheels();

		//Below the value of the variable a can be changed as below
		int num = 10;
		num = 20;
		num = 30;
		System.out.println(num);
		
		//If you dont want a variable value to be changed declare it with final
		final int num1 = 10;
		//num1 = 20; // Gives error
		//num1 = 30; // Gives error
		//System.out.println(num1);
	}

}
