package JavaSessions.exceptionhandling_wrapper_class14;

public class FinalizeMethodConcept1 {
	String name = "java";

	public static void main(String[] args) {

		FinalizeMethodConcept1 obj = new FinalizeMethodConcept1();
		System.out.println(obj.name);
		obj=null;
		System.gc();
	}

	@Override
	public void finalize() {
		System.out.println("Clean up");
	}
}
