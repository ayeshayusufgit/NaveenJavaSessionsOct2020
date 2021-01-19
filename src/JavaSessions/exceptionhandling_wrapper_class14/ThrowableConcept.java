package JavaSessions.exceptionhandling_wrapper_class14;

public class ThrowableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Launch the browser");
		System.out.println("Enter the url");
		
		try {
			int i=9/0;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
