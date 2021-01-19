package JavaSessions.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//9. Write a Java program of swap two elements in an array list.
//https://stackoverflow.com/questions/30970169/how-to-swap-items-in-a-list
public class ArrayList9 {

	public static void swap(ArrayList<Integer> numList, int index1, int index2) {
		int temp = numList.get(index1);
		numList.set(index1, numList.get(index2));
		numList.set(index2, temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(3);
		numList.add(4);
		numList.add(6);
		numList.add(10);
		numList.add(1);
		numList.add(-1);

		System.out.println("Original ArrayList content:" + numList);
		System.out.println("Pls enter the number to be swapped");

		System.out.println("Enter Number 1");

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		System.out.println("Enter Number 2");
		int num2 = sc.nextInt();

		if (numList.contains(num1) && numList.contains(num2)) {

			ArrayList9.swap(numList, numList.indexOf(num1), numList.indexOf(num2));
			System.out.println("ArrayList after swapping using swap()" + numList);

		} else {
			System.out.println("One or both the numbers dont exist in the ArrayList");
		}

		//Swapping using Collections.swap()
		Collections.swap(numList, numList.indexOf(num1), numList.indexOf(num2));
		System.out.println("ArrayList after swapping using Collections.swap()"+numList);
	}
}
