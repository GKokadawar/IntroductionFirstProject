package ClassObjectMethods;

public class Employee {

	int id = 1;
	String name = "girish";
	String dept = "QA=Testing";
	int sal = 1000;

	void Display() {
		System.out.println("Employee id is :" + id);
		System.out.println("Employee name is:" + name);
		System.out.println("Employee department is:" + dept);
		System.out.println("Employee salary is :" + sal);

	}

	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee emp2=new Employee();
		emp2.id=2;
		emp2.name="Shirish";
		emp2.dept="development";
		emp2.sal=2000;


		emp2.Display();


	}
}
