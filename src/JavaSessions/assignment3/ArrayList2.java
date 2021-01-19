package JavaSessions.assignment3;

import java.util.ArrayList;

//2. Write a Java program to insert an element into the array list at the first and last positions.

public class ArrayList2 {

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

	}

}
