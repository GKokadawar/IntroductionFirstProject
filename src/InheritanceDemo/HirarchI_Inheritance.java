package InheritanceDemo;

class parents {
	void show10(int c) {

		System.out.println("Method of parent class" + c);
	}

}

class Child1 extends parents {

	void shows(int a) {
		System.out.println("method of c1 "+a);
	}
}

class Child2 extends parents {
	void shown(int b) {
		System.out.println("method of c2 "+b);
	}

}

public class HirarchI_Inheritance {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.show10(100);
		c1.shows(2);
		Child2 c2 = new Child2();
		c2.show10(100);
		c2.shown(4);


	}

}
