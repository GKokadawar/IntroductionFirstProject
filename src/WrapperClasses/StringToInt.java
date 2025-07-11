package WrapperClasses;

public class StringToInt {

	public static void main(String[] args) {
		// String to integer
		String s1 = "2222";
		String s2 = "3333";
		int value1 = Integer.parseInt(s1);
		int value2 = Integer.parseInt(s2);
		System.out.println(value1 + value2);
		// String to double
		String s3 = "12.5";
		String s4 = "12.55";
		double value3 = Double.parseDouble(s3);
		double value4 = Double.parseDouble(s4);
		System.out.println(value3 + value4);
		// string to boolean
		String s5 = "true";
		String s6 = "false";
		boolean value5 = Boolean.parseBoolean(s5);
		boolean value6 = Boolean.parseBoolean(s6);

		System.out.println(value5);
		System.out.println(value6);
		//convert any data into string
		int a=10;
		double d=2.35;
		char c='A';
		Boolean b=true;

		String p =String.valueOf(a);
		String q =String.valueOf(d);
		String r =String.valueOf(c);
		String s =String.valueOf(b);
		System.out.println(r+p+s+q);

	}

}
