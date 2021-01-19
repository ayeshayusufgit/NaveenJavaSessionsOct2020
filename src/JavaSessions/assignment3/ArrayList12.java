package JavaSessions.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//12. Write a Java program to print all the elements of a ArrayList using the position of the elements

public class ArrayList12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>(9);

		// using add(), add 5 values
		arr.add(2);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(11);
		System.out.println("The List elements are:");

		// prints all the elements using indexes
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}
}
