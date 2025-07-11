package String;

public class OccaranceOfCharacter {

	public static void main(String[] args) {
		String s="Girishii";
		int len=s.length();
		System.out.println(len);
		String newstring =s.replace("i","");
		System.out.println(newstring);
		int len2=newstring.length();
		System.out.println("The occurance of i :"+(len-len2));


	}
}
