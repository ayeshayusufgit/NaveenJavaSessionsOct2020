package JavaSessions.exceptionhandling_wrapper_class14;

public class DataConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n = "100";
		System.out.println(n + 20);

		// String to int
		// wrapper class:Integer

		int num = Integer.parseInt(n); // 100
		System.out.println(num + 20);

		String total = "1000";
		int finalAmount = Integer.parseInt(total) + 10 + 40 - 30;
		System.out.println(finalAmount);

		// String to double
		String n1 = "12.33";
		System.out.println(n1 + 20);
		double num1 = Double.parseDouble(n1);
		System.out.println(num1);

		// String n3 = "test100"; // These kind of values will result in a NFE
		// The String is parsed and converted into its equivalent integer value but a
		// mixed string will not be able to converted as its equivalent int value wont
		// be available
		// int num3 = Integer.parseInt(n3);
		// System.out.println(num3 + 30);

		// int to String
		// double to String
		int n2 = 100;
		System.out.println(n2 + 20);

		String num2 = String.valueOf(n2);// returns the String representation of the int argument
		System.out.println(num2+ 20);
		
		double d1=12.33;
		String dnum1=String.valueOf(d1);
		System.out.println(dnum1+90);
	}

}
