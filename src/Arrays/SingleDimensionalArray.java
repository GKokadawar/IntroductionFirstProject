package Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// declaring arrays
		int a[] = new int[5];
		// inserting data into array
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		// Approch2
		int b[] = { 100, 200, 500 };
		// Find Length of an array
		System.out.println("Length of an array is : " + a.length);
		// Read single value from array: from specific location
		System.out.println(b[2]);
		// Read all data from array
		for (int i = 0; i < a.length - 1; i++) {

			System.out.println(a[i]);
		}
	System.out.println("__________________");

	int c[]= new int [5];
	// inserting data into array
	c[0]=100;
	c[1]=200;
	c[2]=300;
	c[3]=400;
	c[4]=500;
	for(int x:a)//x is varaible to save all data and a is array ,declaration condition and increamentation happen automatically
	{
		System.out.println(x);
		if( x==300) {
			break;
		}

	}
}
}
