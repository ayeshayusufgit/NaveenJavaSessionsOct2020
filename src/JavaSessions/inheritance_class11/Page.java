package JavaSessions.inheritance_class11;

public class Page {
	int timeOut = 10;

	public Page() {
		System.out.println("Page -- Default Constructor");
	}

	public Page(int num) {
		System.out.println("Page -- Parameterized Constructor:"+num);
	}

	public void title() {
		System.out.println("Page -- Title");
	}
	
	public void logo() {
		System.out.println("Page -- Logo");
	}
}
