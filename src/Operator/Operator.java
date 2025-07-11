package Operator;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic operator
		int a=30,b=40;
		int result=a+b;
		System.out.println("The addition of a and b is : "+result);
		System.out.println("The substarction  of a and b is : "+(a-b));
		System.out.println("The multiplication  of a and b is : "+(a*b));
		System.out.println("The divison of a and b is : "+(a/b));
		System.out.println("The modulo of a and b is : "+(a%b));
		//Relational operator : return boolean value (2 variable needed)
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println("**********");
		System.out.println(a!=b);
		System.out.println(a==b);
		boolean results=a>b;
		System.out.println(results);
		System.out.println("---------");
		//Logical operator
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		//increment operator
		 int q=5;
		 q++; //q=q+1;
		 System.out.println(q);
		 int d=11;
		 int res=d++; // post increment
		 System.out.println(res);
		 int res1=++d; // pre increment
		 System.out.println(res1);
		//decrement operator
		 int z=5;
		 z--; //q=q-1;
		 System.out.println(z);
		 //case1
		 int ress=z--;
		 System.out.println(z);
		 System.out.println(ress);
		 int resss=--z;
		 System.out.println(z);
		 System.out.println(resss);

		 //Assignment operator
		 int g=10;
		g+=5; // g=g+3;
		System.out.println(g);
		g-=4;// g=g-4;
		System.out.println(g);
		g*=2;// g=g*2;
		System.out.println(g);
		g/=2;// g=g/2;
		System.out.println(g);
		g%=2;// g=g%2;

		System.out.println(g);
		//Conditional /ternary operator


	int person_age=18;

	String resd=(person_age>18)? "Eligible" : "not eligible" ;
	System.out.println(" vote "+resd);



	}

}
