package ThisKeywords;

public class ThisDemo {
	int x, y; // class or instance variable

	ThisDemo(int x, int y) {// Local variable

		this.x = x;
		this.y = y;
	}

	void display() {

		System.out.println(x + y);

	}

	public static void main(String[] args) {
		ThisDemo td = new ThisDemo(100, 200);
		td.display();

	}

}
