package Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = { 100, 200, 300, 700, 800 };
		int search = 900;
		boolean status = false;
		for (int i = 0; i < 5; i++) {

			if (a[i] == search) {
				System.out.println("available in aaray");
				status = true;
				break;

			}

		}
		if (!status) {
			System.out.println("Not found ");
		}
	}
}
