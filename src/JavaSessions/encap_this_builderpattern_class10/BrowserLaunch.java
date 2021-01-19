package JavaSessions.encap_this_builderpattern_class10;

public class BrowserLaunch {

	public void launchBrowser() {
		System.out.println("Chrome browser is getting launch");
		checkOSVersion();
		checkRAMSpace();
		checkOSCompatibility();
	}

	private void checkOSVersion() {
		System.out.println("Checking OS Version");
	}

	private void checkRAMSpace() {
		System.out.println("Checking RAM space");
	}

	private void checkOSCompatibility() {
		System.out.println("Checking OS Compatibility!");
	}
}
