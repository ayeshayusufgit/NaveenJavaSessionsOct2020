package JavaSessions.exceptionhandling_wrapper_class14;

public class withTryCatchBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0;
		} catch (ArithmeticException ex) {
			System.out.println("Exception occured");
			ex.printStackTrace();
		}
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
	}

}
