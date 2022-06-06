package exceptionPractice;

public class UserDefinedException {

	public static void main(String[] args) throws AgeProblem  {
		int age ;
		age = 16;
		try {
			if(age<18) {
			throw new AgeProblem("Minor");
			}else {
				System.out.println("Major");
			}
		}catch(AgeProblem ap) {
			ap.printStackTrace();
		}finally {
			System.out.println("Problem is solved");
		}
	}
}
