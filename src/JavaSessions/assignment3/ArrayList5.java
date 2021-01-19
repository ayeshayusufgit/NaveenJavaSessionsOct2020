package JavaSessions.assignment3;

import java.util.ArrayList;

//5. Write a Java program to remove the third element from a array list.

public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(3);
		numList.add(4);
		numList.add(6);
		numList.add(10);
		System.out.println(numList);
		// To remove element with index
		numList.remove(1);
		System.out.println(numList);
		// To remove element with object
		numList.remove(new Integer(6));
		System.out.println(numList);
	}

}
