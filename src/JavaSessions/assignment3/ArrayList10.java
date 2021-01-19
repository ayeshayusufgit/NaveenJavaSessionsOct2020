package JavaSessions.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//10. Write a Java program to empty an array list.
//https://www.codevscolor.com/java-empty-an-arraylist

public class ArrayList10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numList1 = new ArrayList<Integer>();
		numList1.add(3);
		numList1.add(4);
		numList1.add(6);
		numList1.add(10);
		numList1.add(1);
		numList1.add(-1);

		System.out.println("Original ArrayList content:" + numList1);
		numList1.clear();
		System.out.println("List after clearing it" + numList1);

		System.out.println("===========================");
		ArrayList<Integer> numList2 = new ArrayList<Integer>();
		numList2.add(3);
		numList2.add(4);
		numList2.add(6);
		numList2.add(10);
		numList2.add(1);
		numList2.add(-1);
		System.out.println("Original ArrayList content:" + numList2);
		numList2.removeAll(numList2);
		System.out.println("List after clearing it" + numList2);
	}
}
