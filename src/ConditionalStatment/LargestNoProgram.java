package ConditionalStatment;

public class LargestNoProgram {

	public static void main(String[] args) {
		int a=100;
		int b=50;
		int c=6;
		if (c>b && c>a) {
			System.out.println(c+": is largest no from all 3");
		}else if (b>c && b>a) {
			System.out.println(b+": is largest no from all 3");
		}else if (a>c && a>c) {
			System.out.println(a+": is largest no from all 3");
		}

	}

}
