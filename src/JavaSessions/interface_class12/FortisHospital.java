package JavaSessions.interface_class12;

public class FortisHospital extends UNHC implements USMedical, UKMedical, IndianMedical {

	@Override
	public void oncologyServices() { // TODO Auto-generated method stub
		System.out.println("FH -- Oncology Services");

	}

	@Override
	public void dentalServices() { // TODO Auto-generated method stub
		System.out.println("FH -- Dental Services");

	}

	@Override
	public void orthoServices() { // TODO Auto-generated method stub
		System.out.println("FH -- Ortho Services");
	}

	@Override
	public void radioServices() { // TODO Auto-generated method stub
		System.out.println("FH -- Radio Services");

	}

	@Override
	public void radioServices(int doctorsCount) {
		// TODO Auto-generated method stub

		System.out.println("FH -- Radio Services:" + doctorsCount);

	}

	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- Physio Services");

	}

	@Override
	public void cardioServices() {
		// TODO Auto-generated method stub

		System.out.println("FH -- Cardio Services");

	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- Emergency Services");

	}

	@Override
	public void services_911() {
		// TODO Auto-generated method stub
		System.out.println("FH -- 911 Services");

	}

	// FH specific methods
	public void medicalInsurance() {
		System.out.println("FH -- Medical Insurance");
	}

	public void medicalTraining() {
		System.out.println("FH -- Medical Training");
	}

	@Override
	public String getPatientDetails() {
		// TODO Auto-generated method stub
		return "Patient Details";
	}

	@Override
	public void covid19Testing() {
		// TODO Auto-generated method stub
		System.out.println("FH -- Covid 19 Testing");
		// methods from the parent class can be accessed using the super keyword
		super.medicalFunds();// inherited from UNHC class
		super.worldMedicalPolicies();// inherited from UN class
	}

	// @Override
	public static void billing() {
		System.out.println("FH -- Billing System");
	}
	
	/*@Override
	default void ambulanceServices() {
		System.out.println("US -- Ambulance Services"+1000);
	}*/
	
	@Override
	public void ambulanceServices() {
		System.out.println("US -- Ambulance Services"+400);
	}
	
}
