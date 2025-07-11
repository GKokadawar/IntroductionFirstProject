package Abstraction;

interface shape {
	int len = 10;// final static
	int width = 10;

	void circle(); // abstract method

	default void square() { // default method
		System.out.println("this is square default method");
	}

	static void rectangle() { // static method
		System.out.println(" this is rectangle static method");
	}

}

public class interfaceDemo implements shape {
	@Override
	public void circle() { // when we implement any method from parents to child then it should be public
		System.out.println("This is circle abstract method");
	}

	void triangle() {

		System.out.println("This is traingle");
	}
	int p=100;

	public static void main(String[] args) {
		// Scenario1 class
		interfaceDemo intd = new interfaceDemo();
		intd.circle();
		intd.square();
		shape.rectangle();// not directly created in class its from interface thats why added interface
		intd.triangle();
		System.out.println(intd.p);

		// Scenario2 interface
		System.out.println("************");
		shape sh = new interfaceDemo();
		sh.circle();
		sh.square();
		shape.rectangle();
		//System.out.println(shape.p);


		//sh.triangle();// you can not access because holding in interface thats why showing error same with

	}

}
