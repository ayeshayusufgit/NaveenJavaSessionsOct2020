package JavaSessions.encap_this_builderpattern_class10;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonApp shop = new AmazonApp();
		shop.doLogin("tom@gmail.com", "test123")
			 .search("Apple MacBook Pro")
			 .addToCart("Apple MacBook Pro")
			 .doPayment("4444 4444 4444 4444", 635)
			 .logOut();
		System.out.println("-----------------------------");
		shop.doLogin("tom@gmail.com", "test123")
		 	.addToCart("Samsung S10")
		 	.doPayment("amit.jajme@okicici")
		 	.logOut();
		System.out.println("------------------------------");
		shop.doLogin("tom@gmail.com", "test123")
			.logOut();
		System.out.println("------------------------------");
		shop.doLogin("tom@gmail.com", "test123")
			.doPayment("1212121@okicici")
		    .logOut();
		
	}

}
