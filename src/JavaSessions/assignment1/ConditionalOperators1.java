package JavaSessions.assignment1;

import java.util.Scanner;

public class ConditionalOperators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter number 1:");
		int no1 = myObj.nextInt();
		System.out.println("Enter number 2:");
		int no2 = myObj.nextInt();
		System.out.println("Enter number 3:");
		int no3 = myObj.nextInt();

		int largest;
		if (no1 >= no2 && no1 >= no3) {
			largest = no1;
		} else if (no2 >= no1 && no2 >= no3) {
			largest = no2;
		} else {
			largest = no3;
		}
		System.out.println("The largest of the 3 number is:" + largest);
	}
}