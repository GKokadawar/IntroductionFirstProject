package Arrays;

public class MissingNoArrays {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5 };
		int sum1 = 0;
		int sum2=0;
		for (int element : a) {
			sum1 = sum1 + element;

		}
		for (int j = 0; j <= 5; j++) {
			sum2 = sum2 + j;

		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println("The mising no in arrays is : "+(sum2-sum1));

	}

}
