package exceptionPractice;

public class AgeProblem extends Exception {
	
	/**
	 * @author kosridha
	 */
	private static final long serialVersionUID = 1L;
	AgeProblem(){
		super ("Age is Problem");
	}
	AgeProblem(String s){
		super(s);
	}
}
