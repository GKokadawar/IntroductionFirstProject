package String;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String R="Hi ";
		String S="WELCOME";
		String T=" To Java";
		//Length
		System.out.println(S.length());
		//Concatenation -merge 2 string
		System.out.println(S+T);
		System.out.println(S.concat(T));
		System.out.println("Welcome".concat(T));
		System.out.println(S.concat("To Java"));
		System.out.println(R.concat(S).concat(T));
		//Trim -remove spaces
		String U="     To Java     ";
		System.out.println(U);
		System.out.println(U.trim());
		//CharAt: return particular character
		System.out.println(S.charAt(1));
		//contains : return boolean value
		System.out.println(S.contains("wel"));
		System.out.println(S.contains("WEL"));
		System.out.println(S.contains("Come"));
		System.out.println(S.contains("CoMe"));
		System.out.println("@@@@@@@@@@");
		//Equals and equals ignore case

		String s1="welcome";
		String s2="Welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		//replace
		String s3="Welcome java Welcome dotrnet Welcome selenium";
		System.out.println(s3.replace('W', 'G'));
		System.out.println(s3.replace("Welcome", "Namaste"));

		//Substring : extract substring from main string
		String s4="Welcome";
		System.out.println(s4.substring(2,5));
		System.out.println(s4.substring(0, 6));
		//Lower to upper and upper to lower
		String s5="GiRisH";
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());
		//Split method used to separate string on the basis of delimeter//return array
		String s6="girishkokadwar@gmail.com";
		String d[]=s6.split("@");
		System.out.println(d[0]+" "+ "and "+d[1]);
		System.out.println(Arrays.toString(d));
		String s7="$32,3,5";
		String s8=s7.replace("$", "");
		System.out.println(s8);
		System.out.println(s8.replace(",", ""));
		String s9= "girish,3328@gmail.com";
		String arr1[]=s9.split(",");
		String arr2[]=arr1[1].split("@");
		System.out.println(arr1[0]+arr2[0]+arr2[1]);
		//*%&()- you can not used as delimeter
		//without using equal ignore upper and lower
		String s10="John";
		System.out.println(s10.replace('J', 'j').contains("john"));


	}

}
