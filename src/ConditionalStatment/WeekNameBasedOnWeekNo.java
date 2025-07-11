package ConditionalStatment;

public class WeekNameBasedOnWeekNo {

	public static void main(String[] args) {
		int weekNo = 7;
		if (weekNo == 1) {
			System.out.println("Added week no refers to monday");
		} else if (weekNo == 2) {
			System.out.println("Added week no refers to tuesday");
		} else if (weekNo == 3) {
			System.out.println("Added week no refers to wednesday");
		} else if (weekNo == 4) {
			System.out.println("Added week no refers to thursday");
		} else if (weekNo == 5) {
			System.out.println("Added week no refers to friday");
		} else if (weekNo == 6) {
			System.out.println("Added week no refers to saturday");
		} else if (weekNo == 7) {
			System.out.println("Added week no refers to sunday");
		} else {
			System.out.println("You have not added correct week no ");
		}

	}
}
