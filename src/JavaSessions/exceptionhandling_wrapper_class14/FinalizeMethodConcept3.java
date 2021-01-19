package JavaSessions.exceptionhandling_wrapper_class14;

import JavaSessions.Employee;

public class FinalizeMethodConcept3 {
	String name = "java";

	public static void main(String[] args) {

		FinalizeMethodConcept3 obj = new FinalizeMethodConcept3();
		System.out.println(obj.name);
		obj = null;
		Employee e = new Employee();
		e = null;
		
		// 2 objects will be destroyed
		// Before Destroying the objects the GC will check for the finalize() and will
		// call that and then destroy the objects
		
		System.out.println("Calling GC");
		System.gc();
	}

	@Override
	public void finalize() {
		System.out.println("Clean up in FinalizeMethodClass");
	}
}
