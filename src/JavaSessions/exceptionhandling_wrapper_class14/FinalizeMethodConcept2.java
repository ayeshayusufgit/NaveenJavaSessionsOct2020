package JavaSessions.exceptionhandling_wrapper_class14;

import JavaSessions.Employee;

public class FinalizeMethodConcept2 {
	String name = "java";

	public static void main(String[] args) {

//		FinalizeMethodConcept obj = new FinalizeMethodConcept();
//		System.out.println(obj.name);
//		obj=null;
		Employee e=new Employee();
		e=null;
		System.out.println("Calling GC");
		System.gc();
	}

	@Override
	public void finalize() {
		System.out.println("Clean up");
	}
}
