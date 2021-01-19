package JavaSessions.exceptionhandling_wrapper_class14;

public class TryCatchBlockFinally2 {

	String name = "Java";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		TryCatchBlockFinally2 obj = new TryCatchBlockFinally2();

		try {
			//obj = null;
			System.out.println(obj.name);
			int i = 9 / 3;
			System.out.println("testing");
			System.out.println("testing");
		} catch (ArithmeticException ex) {
			System.out.println("AE");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NPE");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
	}
}