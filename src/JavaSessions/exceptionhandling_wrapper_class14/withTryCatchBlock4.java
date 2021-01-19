package JavaSessions.exceptionhandling_wrapper_class14;

public class withTryCatchBlock4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0;
			System.out.println("testing");
			System.out.println("testing");
		} catch (NullPointerException ex) {
			System.out.println("Exception occured");
			ex.printStackTrace();
		}
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
	}

}
