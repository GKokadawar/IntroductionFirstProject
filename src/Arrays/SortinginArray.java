package Arrays;

import java.util.Arrays;

public class SortinginArray {

	public static void main(String[] args) {
		int a[]= {10,20,60,80,1,88};
		System.out.println("Before sorting"+Arrays.toString(a));

		Arrays.sort(a);
		System.out.println("After sorting"+Arrays.toString(a));

	}

}
