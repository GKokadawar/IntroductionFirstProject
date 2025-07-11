package InheritanceDemo;

class A {
	int a = 100;

	void display() {
		System.out.println(a);
	}

}

class B extends A { //Single inheritance
	int b = 200;

	void show() {
		System.out.println(b);

	}

}class C extends B { //Multilevel inheritance
	int c = 300;

	void print() {
		System.out.println(c);

	}

}

public class InheritanceType {
	// in 1 java class only 1 public method should present

	public static void main(String[] args) {
		B obj = new B();
		C obj1 = new C();

		obj1.show();
		obj1.display();
		obj1.print();
	}

}
