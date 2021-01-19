package JavaSessions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList - default class
		// dynamic in nature
		// it maintains the order
		// sequential index based collection

		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());// 2
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());// 4
		ar.add(500);
		ar.add(600);
		ar.add(700);
		System.out.println(ar.size());// 7
		System.out.println(ar);
//		ar.add(800);
//		ar.add(900);
//		ar.add(1000);
//		System.out.println(ar.size());
//		ar.add(1100);
//		System.out.println(ar.size());

		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
//		System.out.println(ar.get(7));
//		System.out.println(ar.get(-1));

		ar.remove(4);
		System.out.println(ar.get(4));

		// To print all the values in thr ArrayList
		System.out.println(ar);

		// For Loop
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ar.add(12.33);
		ar.add("Tom");

		for (Object obj : ar) {
			System.out.println(obj);
		}

		// using iterator
		Iterator itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
