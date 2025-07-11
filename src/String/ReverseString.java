package String;

public class ReverseString {

	public static void main(String[] args) {
		String s = "JavA";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		StringBuffer sc = new StringBuffer("Girish");
		System.out.println(sc.reverse());
		StringBuilder sc1 = new StringBuilder("Kokadwar");
		// System.out.println(sc1.reverse());
		//immutable
		StringBuilder sc33=sc1.append(" umarkhed");
		System.out.println(sc1);
		System.out.println(sc33);
	}

}
