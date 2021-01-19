package JavaSessions.exceptionhandling_wrapper_class14;

public class ThrowsKeyword2 {

	public void m1() throws ArithmeticException {
		m2();
	}

	public void m2() throws ArithmeticException {
		m3();
	}

	public void m3() throws ArithmeticException {
		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("AE");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsKeyword2 obj = new ThrowsKeyword2();

		obj.m1();
	}

}
