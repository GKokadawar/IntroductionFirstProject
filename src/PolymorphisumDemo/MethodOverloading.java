package PolymorphisumDemo;

public class MethodOverloading {
	void m1() {
		System.out.println("Blank method");

	}

	void m1(int a, int b, String name) {

		System.out.println("Method with parameter " + a + b + name);

	}

	void m1(double b, String name) {
		System.out.println(b + name);

	}

	void m1(String school, int wardno, String address) {

		System.out.println(school + wardno + address);
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.m1();
		mo.m1(1, 2, "Girish");
		mo.m1(2.3, " sandip");
		mo.m1("sakle ", 5, " UKD");

	}

}
