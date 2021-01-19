package JavaSessions.interface_class12;

public interface USMedical extends WHO {
	// Abstract Methods: a method which does not have method body
	// Prototype Method
	// No method body only method declaration
	// Cannot create the object of Interface

	int min_fees = 10;

	public void physioServices();

	public void cardioServices();

	public void emergencyServices();

	public void services_911();

	public String getPatientDetails();

	// after jdk 1.8
	// 1. can have static methods in interface with the method body only
	public static void billing() {
		System.out.println("US -- Billing System");
	}

	// 2. can create a default method with method body
	default void ambulanceServices() {
		System.out.println("US -- Ambulance Services"+1000);
	}

}
