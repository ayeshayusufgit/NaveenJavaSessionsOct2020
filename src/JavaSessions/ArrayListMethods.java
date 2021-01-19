package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> empNames = new Vector<String>();
		empNames.add("Ayesha");

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(20);
		ar.add(50);
		ar.add(60);
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(55);
		marks.add(70);
		ar.addAll(marks);
		System.out.println(ar);
		List<Integer> ar1=Collections.synchronizedList(ar);
		
	}

}
