package JavaSessions.assignment3;

import java.util.ArrayList;

//7. Write a Java program to reverse elements in a array list

public class ArrayList7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numList = new ArrayList<Integer>();
		ArrayList<Integer> revList = new ArrayList<Integer>();

		numList.add(3);
		numList.add(4);
		numList.add(6);
		numList.add(10);

		System.out.println("AL Before Reversing");
		System.out.println(numList);

		for (int i = numList.size() - 1; i >= 0; i--) {
			revList.add(numList.get(i));
		}

		System.out.println("AL After Reversing");
		System.out.println(revList);
	}
}
