package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array
		// 1. int array

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[0]);
		System.out.println(i[3]);
		// System.out.println(i[4]);//ArrayIndexOutOfBoundException
		// System.out.println(i[-1]);//ArrayIndexOutOfBoundException

		int len = i.length;
		System.out.println("Length:" + len);
		System.out.println("Hi:" + (len - 1));
		System.out.println("Li:" + (0));

		// To Print all the values from array:using for loop
		for (int k = 0; k < 4; k++) {
			System.out.println(i[k]);
		}
		
		//double array
		double d[] = new double[4];
		d[0] = 12.22;
		d[1] = 34.33;
		System.out.println(d[0] + d[1]);
		
		//char array
		char c[] = new char[3];
		c[0] = 'á';
		c[1] = 'b';
		c[2] = '$';
		System.out.println(c[0] + c[1]);
		
		//string array
		String student[]=new String[4];
		student[0]="Tom";
		student[1]="Lisa";
		student[2]="Peter";
		
		for(int m=0;m<student.length;m++) {
			System.out.println(student[m]);
		}
		
		//Object Array:Can be used to store different types of data
		Object obj[]=new Object[5];
		obj[0]="Tom";
		obj[1]=30;
		obj[2]=35.44;
		obj[3]=true;
		obj[4]='m';
		
		for(int g=0;g<obj.length;g++) {
			System.out.println(obj[g]);
		}
		

	}

}
