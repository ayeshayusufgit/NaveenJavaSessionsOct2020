package JavaSessions.exceptionhandling_wrapper_class14;

public class ThrowsKeyword3 {

	public void m1() {
		m2();
	}

	public void m2() {
		m3();
	}

	public void m3() {
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

		ThrowsKeyword3 obj = new ThrowsKeyword3();

		obj.m1();
	}

}
