package JavaSessions.assignment3;

import java.util.ArrayList;

//3. Write a Java program to retrieve an element (at a specified index) from a given array list.

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(3);
		numList.add(4);
		numList.add(6);
		numList.add(10);
		numList.add(0, 11);
		System.out.println(numList);
		numList.add(numList.size(), 12);
		System.out.println(numList);
		System.out.println(numList.get(2));

	}

}
