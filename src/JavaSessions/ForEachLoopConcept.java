package JavaSessions;

public class ForEachLoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		// normal loop
		for (int p = 0; p < i.length; p++) {
			System.out.println(i[p]);
			if (i[p] == 20) {
				System.out.println("20 is found... in for loop");
			}
		}
		// for each loop
		for (int p : i) {
			System.out.println(p);
			if (p == 20) {
				System.out.println("20 is found... in foreach loop");
			}
		}
		
		Object obj[] = new Object[5];
		obj[0]="Tom";
		obj[1]=30;
		obj[2]=35.44;
		obj[3]=true;
		obj[4]='m';
		for(Object t:obj) {
			System.out.println(t);
		}

	}

}
