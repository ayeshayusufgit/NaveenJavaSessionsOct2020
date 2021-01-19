package JavaSessions.exceptionhandling_wrapper_class14;

public class withTryCatchBlock6 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		

		try {
			int i = 9 / 0;
			System.out.println("testing");
			System.out.println("testing");
		} catch (ArithmeticException ex) {
			System.out.println("AE");
		
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NPE");
		}
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
	}

}
