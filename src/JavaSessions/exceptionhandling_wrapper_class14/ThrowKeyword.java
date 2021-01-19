package JavaSessions.exceptionhandling_wrapper_class14;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		try {
//			throw new Exception("Data not availible exception");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		String data=null;
		if(data==null) {
			throw new Exception("Data is null Exception");
		}

	}

}
