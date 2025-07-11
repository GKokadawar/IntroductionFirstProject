package ExceptionHandlingDemo;

public class Exception {

	// Unchecked exception
	public static void main(String[] args) {

		String s = null;

		try {
			System.out.println(s.length());

		} //catch (NullPointerException e) {
			//System.out.println("handlled exception catch block");
		 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("handlled exception catch block");
		} catch (NumberFormatException e) {
			System.out.println("handlled exception catch block");
		}
		 catch(Throwable e) {System.out.println("throwsbale executed");}
		finally {
			System.out.println("This is finally ");

		}

	}
}
