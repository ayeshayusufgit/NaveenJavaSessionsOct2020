package JavaSessions.interface_class12;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.dentalServices();
		// fh.ENTServices();
		System.out.println(fh.getPatientDetails());

		fh.medicalInsurance();
		fh.medicalTraining();

		// Method inherited from UN class to the Fortis Hospital
		fh.worldMedicalPolicies();
		// Method inherited from UNHC class to the Fortis Hospital
		fh.medicalFunds();
		// default method from the USMedical Interface gets inherited in the
		// FortisHospital class can be accessed as below:
		// fh.ambulanceServices();Gives Cannot reduce visibilty of the inherited
		// interface error

		// THe default method from USMedical Interface gets inherited in the
		// FortisHospital class can be accessed as below:
		fh.ambulanceServices();

		System.out.println(USMedical.min_fees);
		// USMedical.min_fees=100;Give error:by default its final by nature
		USMedical.billing();
		FortisHospital.billing();

		// USMedical usm=new USMedical();Creating an object of an interface is not
		// allowed in java

		// Top Casting:Child class object refered by a parent class interface ref
		// variable
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.emergencyServices();
		us.getPatientDetails();
		us.physioServices();
		us.services_911();

		// Down Casting:Parent Class Object referred by child class interface ref
		// variable(is not allowed)
		// new USMedical() ;

	}

}
