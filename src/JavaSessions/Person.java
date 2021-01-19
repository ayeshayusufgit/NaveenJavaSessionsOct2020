package JavaSessions;

public class Person {
	
	String name;
	int age;
	char gender;
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="Jasvir";
		p1.age=25;
		p1.gender='M';
		
		Person p2=new Person();
		p2.name="Naveen";
		p1.age=26;
		p1.gender='M';
		
		Person p3=new Person();
		p3.name="Lisa";
		p3.age=25;
		p3.gender='M';
		
		System.out.println(p1.name+p1.age+p1.gender);
		System.out.println(p2.name+p2.age+p2.gender);
		System.out.println(p3.name+p3.age+p3.gender);
		
		p1=p2;
		
		System.out.println(p1.name+p1.age+p1.gender);
		System.out.println(p2.name+p2.age+p2.gender);
		System.out.println(p3.name+p3.age+p3.gender);
		
		p2=p3;
		
		System.out.println(p1.name+p1.age+p1.gender);
		System.out.println(p2.name+p2.age+p2.gender);
		System.out.println(p3.name+p3.age+p3.gender);
		
		p3=p1;
		
		System.out.println(p1.name+p1.age+p1.gender);
		System.out.println(p2.name+p2.age+p2.gender);
		System.out.println(p3.name+p3.age+p3.gender);
	}
}
