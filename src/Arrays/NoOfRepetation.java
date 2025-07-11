package Arrays;

public class NoOfRepetation {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 20, 40, 20, 50 };
		int search = 20;
		int count = 0;
		for (int x : a) {
			if (x == search) {
				System.out.println("element match" + count);
				count++;
			}
		}System.out.println("Total value of search 20 is"+count);

	}

}
