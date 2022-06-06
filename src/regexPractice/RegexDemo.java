package regexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexDemo {
	
    public static void main(String aa[]) {
    	
//  String regex = "[a-zA-Z0-9]{5}", input = "aB6h7";
//  String regex = "[a-zA-Z0-9]{5}", input = "adhW7";
//  String regex = "[\\d]{5}",input="95776";
//  String regex = "[\\d]{5}",input="90843";
//  String regex = "[a-z]{5}",input = "dshca";
//	String regex = "Abc", input = "Abc";
//  String regex = "[\\w\\h]{6}",input="dhdj 8";
    String regex = "[\\W\\S]{4}",input="% $&";
    
    
    	
	Pattern pt = Pattern.compile(regex);
	Matcher mt  = pt.matcher(input);
	
	System.out.println(mt.matches());    //  fixed start and end
	System.out.println(mt.lookingAt());  // fixed start and variable end
	System.out.println(mt.find());     // variable start and variable end
	
	
	
	
}
}
