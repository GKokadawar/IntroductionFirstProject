package MethodsAndConstructor;

public class SaveData {

	int id;
	String name;
	char section;
	int salary;

	void Set_methods(int a, String b, char c, int d) {

		id = a;
		name = b;
		section = c;
		salary = d;

	}

	void showdata() {

		System.out.println("For This id:" + id + " The person name is " + name + " which belongs to section " + section
				+ " and salary is:" + salary);

	}

	public static void main(String[] args) {
		SaveData sd = new SaveData();
		sd.Set_methods(100, "Sandip", 'A', 20000);
		sd.showdata();

	}

}
