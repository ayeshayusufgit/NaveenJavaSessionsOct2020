package JavaSessions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(300);
		marks.add(400);
		
		System.out.println(marks.size());
		
		for(Integer e:marks) {
			System.out.println(e);
		}
		
		System.out.println("-------------------");
		//Java Streams
		marks.stream().forEach(ele->System.out.println(ele));
		System.out.println("-------------------");
		
		
		ArrayList<String> empList=new ArrayList<String>();
		empList.add("Tom");
		empList.add("Peter");
		empList.add("Lisa");
		
		System.out.println(empList.size());
		
		for(String e:empList) {
			System.out.println(e);
		}
		System.out.println("---------------------");
		//JDK 8 Streams
		empList.stream().forEach(emp->System.out.println(emp));
		System.out.println("----------------------");
	}

}
