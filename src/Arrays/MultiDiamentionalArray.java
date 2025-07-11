package Arrays;

public class MultiDiamentionalArray {

	public static void main(String[] args) {
		int a[][] = new int[3][2];// declaration
		a[0][0] = 555;
		a[0][1] = 255;

		a[1][0] = 444;
		a[1][1] = 464;

		a[2][0] = 333;
		a[2][1] = 333;
		System.out.println(a.length);
		System.out.println(a[0].length);
		for (int r = 0; r < 3; r++) {
			for (int s = 0; s < 2; s++) {
				System.out.print(a[r][s]+ " ");
			}System.out.println();

		}
	}

}
