package exceptionPractice;

public class BasicExceptionLearning {

	public static void main(String[] args) {
		try {
			int a=10;
			int b = 0;
			int c = a/b;
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		catch(ArithmeticException e) {
		//	e.printStackTrace();   // all details
		//  e.getMessgae();			// exception name and reason
		//  System.out.println(e.toString());		//reason
			System.out.println("Message will printed");
		}
		catch(ArrayIndexOutOfBoundsException aeou) {
			aeou.toString();
		}
		finally {
			System.out.println("Finally block");
			// we can use try with finally or try with catch with following finally
			
		}
	}
}
