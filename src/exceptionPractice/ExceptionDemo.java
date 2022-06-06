package exceptionPractice;

public class ExceptionDemo {

	static void validate(int age) {
		try {
		if (age > 18) {
			throw new ArithmeticException("you are eligible for vote");
		} else {
			System.out.println("You are not eligible for voting");
		}
		}catch(Exception ee){}
	}
	public static void main(String args[]) {
		validate(19);
		System.out.println("Program successfully completed");
	}

}
