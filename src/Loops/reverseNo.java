package Loops;

public class reverseNo {

	public static void main(String[] args) {
		int orgnum = 11511;
		int num = orgnum;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		if (rev == orgnum) {
			System.out.println("Given no is palindrome");
		} else {
			System.out.println("Not palidnrome");
		}
	}
}

/*
 *
 */
