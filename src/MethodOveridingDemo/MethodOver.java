package MethodOveridingDemo;
class bank{
	double roi() {
		return 10;}

}
class ICICI extends bank{

	@Override
	double roi() {
		return 6.2;}
}
class SBI extends bank{

	@Override
	double roi() {
		return 7.5;}
}
public class MethodOver {
// same method present in parent and child but body of child is change(implementation )
	public static void main(String[] args) {
		ICICI ic=new ICICI();
		double c=ic.roi();
		System.out.println(c);
		SBI sb=new SBI();
		double e=sb.roi();
		System.out.println(e);
	}

}
