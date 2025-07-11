package StaticDemo;

public class StaticDemo {
	// Static Keyword is assign to variable and methods only
	// Static variable and method we can access without creating object
	static int a = 10;
	int b = 20;

	static void m1() {
		System.out.println("Printm1");
	}

	void m2() {// We can access static stuff from not static method directly
		System.out.println(a);
		System.out.println(b);
	}

}
