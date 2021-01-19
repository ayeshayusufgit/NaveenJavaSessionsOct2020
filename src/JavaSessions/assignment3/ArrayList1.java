package JavaSessions.assignment3;

import java.util.ArrayList;

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> coloursList = new ArrayList<String>();
		coloursList.add("Red");
		coloursList.add("Blue");
		coloursList.add("Green");
		coloursList.add("Black");
		for (String colour : coloursList) {
			System.out.println(colour);

		}

	}

}
