package JavaSessions.assignment3;

import java.util.ArrayList;

//4. Write a Java program to update specific array element by given element.
public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(3);
		numList.add(4);
		numList.add(6);
		numList.add(10);
		numList.add(2);
		System.out.println("AL before the element is updated");
		System.out.println(numList);

		int element = 3;
		int newElement = 100;
		int elementIndex = numList.indexOf(element);

		if (elementIndex != -1) {
			System.out.println("The element " + element + " is found in the " + elementIndex + " position!");
			numList.set(elementIndex, newElement);
		} else {
			System.out.println("The element " + element + " is  not found!");
		}
		System.out.println("AL after the element is updated");
		System.out.println(numList);
	}
}
