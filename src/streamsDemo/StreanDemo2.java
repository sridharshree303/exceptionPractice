package streamsDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreanDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Sridhar Kolluru");
		arr.add("Sridhar Shree");
		arr.add("Sridhar Sri");
		arr.add("Sridhar kalyani");
		arr.add("Sridhar Priya");
		arr.add("Sridhar Naidu");
		
		System.out.println(arr);
		//using comparedTo
		List<String> sortedList = arr.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());     
		System.out.println(sortedList);
		
		//sorted based on length of name
		Comparator<String> c = (s1,s2) -> {
				int l1 = s1.length();
				int l2 = s2.length();
				if(l1<l2) return -1;
				else if(l1>l2) return 1;
				else return s1.compareTo(s2);
		};
		List<String> sortedList1 = arr.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedList1);
	
	}

}



