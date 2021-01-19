package JavaSessions.constructor_this;

public class MainMethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}
	
	public static void main(int a) {
		System.out.println("Hello World:"+a);
	}
	public static void main(int a,int b) {
		System.out.println("Hello World:"+a+b);
	}

}
