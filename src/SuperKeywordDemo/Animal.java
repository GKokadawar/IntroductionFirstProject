package SuperKeywordDemo;

class Animal {
	String colour = "white";
 void eat() {

	 System.out.println("eating ");
 }
}

class Dog extends Animal {
	String colour = "Black";
	@Override
	void eat() {

		System.out.println("eating bread ");
		super.eat();
	 }
	void show() {

		System.out.println(super.colour); //super keyword invoke the the immediate parent class variable

	}

}
