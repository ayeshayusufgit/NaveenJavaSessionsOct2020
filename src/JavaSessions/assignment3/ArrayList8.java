package JavaSessions.assignment3;

import java.util.ArrayList;
import java.util.List;

//8. Write a Java program to extract a portion of a array list.
//https://www.includehelp.com/java-programs/extract-some-of-the-elements-from-given-list.aspx

public class ArrayList8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(3);
		numList.add(4);
		numList.add(6);
		numList.add(10);
		System.out.println("Original ArrayList:" + numList);
		int startIndex = 1;
		int endIndex = 3;
		List<Integer> extractedList = numList.subList(startIndex, endIndex);
		System.out.println("Extracted ArrayList:" + extractedList);

	}

}
