package JavaSessions;

public class SwitchedCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser="Chrome";
		switch(browser) {
		case "Chrome": System.out.println("Launch Chrome");
						break;
		case "Firefox": System.out.println("Launch Firefox");
						break;
		case "Safari": System.out.println("Launch Safari");
					   break;
		case "IE": System.out.println("Launch IE");
					break;
		default: System.out.println("Pls pass the correct browser name"+browser);
				 break;
		}

	}

}
