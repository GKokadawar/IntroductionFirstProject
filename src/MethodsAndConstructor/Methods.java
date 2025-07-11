package MethodsAndConstructor;

public class Methods {
	// No parameter no return value
	void m1() {
		System.out.println("This is m1 method which not taking any parameter or not return value");

	}

	// No parameter return value
	int m2() {
		return (2 + 2);

	}

	// takes parameter not return value
	void m3(int id, String name) {

		System.out.println(id + name);

	}

	// takes parameter and return value
	int m4(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods mt = new Methods();
		mt.m1();
		System.out.println(mt.m2());
		mt.m3(1, " girish");
		System.out.println(mt.m4(5, 10));

	}

}
