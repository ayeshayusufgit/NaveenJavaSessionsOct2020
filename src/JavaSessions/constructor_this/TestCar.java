package JavaSessions.constructor_this;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Car c=new Car();get an error

		Car c1 = new Car("Alto", 3);
		Car c2 = new Car("BMW", 70, "Blue", 12.33);
		Car c3 = new Car("Audi", 80, "Red");
		System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + c1.mileage);
		System.out.println(c2.name + " " + c2.color + " " + c2.price + " " + c2.mileage);
		System.out.println("Login class");
		Login lp = new Login("ayesha@gmail.com", "test123");
		System.out.println(lp.username + lp.password);

		Login lp1 = new Login("admin", "admin");
		System.out.println(lp.username + lp.password);

		Login lp_cust = new Login("tom@gmail.com", "test123");
		lp_cust.doLogin(lp_cust.username, lp_cust.password);

		Login lp_seller = new Login("xeon@gmail.com", "test123");
		lp_seller.doLogin(lp_seller.username, lp_seller.password);

		Login lp_dist = new Login("abc@gmail.com", "test123","Distributor");
		lp_dist.doLogin(lp_dist.username, lp_dist.password, lp_dist.role);
	}

}
