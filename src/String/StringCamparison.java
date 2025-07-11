package String;

public class StringCamparison {

	public static void main(String[] args) {
		String s1 = "welcome";
		String s2 = "welcome";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("****************");
		String s3 = new String("welcome");
		String s4 = new String("welcome");

		System.out.println(s3 == s4);// used to compare object
		System.out.println(s3.equals(s4));// used to compare value of object
		System.out.println("****************");
		String s5 = "radious";
		String s6 = new String("welcome");
		String s7 = s6;
		System.out.println(s5 == s6);// used to compare object
		System.out.println(s5.equals(s6));// used to compare value of object
		System.out.println("****************");
		System.out.println(s7==s6);//object are same
		System.out.println(s7.equals(s6));
		System.out.println("*******");
		System.out.println(s7==s2);

		// Object are same

	}

}
