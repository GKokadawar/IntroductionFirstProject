package MethodsAndConstructor;

public class ConstructorDemo {
	// name same as class name
	// not return any value not even void
	// But it can take parameter
	// Only used for initiate /assigning data into variable

	ConstructorDemo() {

		System.out.println("Calling default construtor");

	}

	ConstructorDemo(int a, String b) {

		System.out.println("Calling Parametrized construtor " + a + ": " + b);

	}

	public static void main(String[] args) {

		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd2 = new ConstructorDemo(2, "Girish");
	}

}
