package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.while
		// 1 to 10
		int i = 1; // starting:Initialization
		while (i <= 10) { // condition
			System.out.println(i); // 12345...10(statement to be executed)
			i++;// Increment/Decrement
		}

		int count = 1;
		while (count <= 100) {
			if (count % 5 == 0) {
				System.out.println("Hello!");
			}
			// count++;
			// ++count;
			count = count + 1;
		}

		// 2. for loop
		// 1 to 10
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);// 12345....10
		}

		System.out.println("-------------------------");
		int k;
		for (k = 1; k <= 10;) {
			System.out.println(k);// 12345....10
			k++;
		}

		// Infinite loop
		/*
		 * for(;;) { System.out.println("Hi"); }
		 */

		System.out.println("-------------------a to z-------------------");
		// a to z
		for (char c1 = 'á'; c1 <= 'z'; c1++) {
			System.out.println(c1);
		}

		System.out.println("---------------------------------------------");

		for (double d = 1.1; d <= 5.0; d++) {
			System.out.println(d);
		}

		// even numbers - 2,4,6 ...10
		for (int even = 2; even <= 10; even = even + 2) {
			System.out.println(even);
		}

		// even numbers - 2,4,6 ...10
		for (int even = 2; even <= 10; even++) {
			System.out.println(even);// 2 4 6
			even++;// 3 5
		}

		// odd numbers - 1,3,4 ...9
		for (int odd = 1; odd <= 10; odd = odd + 2) {
			System.out.println(odd);
		}

		System.out.println("---------------------------------------------");
		// do while
		// print 1 to 10
		int p = 1;
		do {
			System.out.println(p);
			p++;
		} while (p <= 10);

		// while infinite loop
		/*while (true) {
			System.out.println("Welcome");

		}*/

		// do-while infinite loop
		int q = 1;
		do {
			System.out.println(q);
			q++;
		} while (true);

	}

}
