package Abstraction;

public class InterfaceMainDemo extends C2 implements I1,I2{

	//Multiple Inheritance/Hybrid (mix)
	@Override
	public void m1() {System.out.println(x);}
	public void m2() {System.out.println(y);}
	public static void main(String[] args) {
		InterfaceMainDemo obj= new InterfaceMainDemo();
obj.m1();
obj.m2();
obj.m3();
	}

}
