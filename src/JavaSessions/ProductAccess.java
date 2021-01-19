package JavaSessions;

import java.util.ArrayList;

public class ProductAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product macObj = new Product();
		macObj.name = "Apple Macbook Pro";
		macObj.id = 101;
		ArrayList<String> laptopSellerList = new ArrayList<String>();
		laptopSellerList.add("Xeon Enterprise");
		laptopSellerList.add("Neon IT Labs");
		laptopSellerList.add("Imagine Pvt Lmt");
		macObj.sellerList = laptopSellerList;
		System.out.println(macObj.name);
		System.out.println(macObj.id);
		System.out.println(macObj.sellerList);

		Product windowsObj = new Product();
		windowsObj.name = "ThinkPad Pro";
		windowsObj.id = 102;
		windowsObj.sellerList = laptopSellerList;
		System.out.println(windowsObj.name);
		System.out.println(windowsObj.id);
		System.out.println(windowsObj.sellerList);

	}

}
