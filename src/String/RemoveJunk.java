package String;

public class RemoveJunk {

	public static void main(String[] args) {
		String str="!G@#$%^iri*&9040sh9";
		String Good=str.replaceAll("[^a-zA-Z]","");
		System.out.println(Good);
		// remove spaces
		String str1="Hi Java  Selenium  welcome Tutorial";
		System.out.println(str1.replaceAll("\\s", ""));

	}

}
