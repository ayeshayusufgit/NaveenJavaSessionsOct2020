package JavaSessions.exceptionhandling_wrapper_class14;

public class ThrowableConcept2 {
//will the exception work when there is an
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Launch the browser");
		System.out.println("Enter the url");
		
		try {
			int i=9/0;
		} catch (Error e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
