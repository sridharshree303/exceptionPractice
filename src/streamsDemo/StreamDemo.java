package streamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(35);
		marks.add(30);
		System.out.println(marks);
		//added 5 marks to all 
		List<Integer> updatedMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
		//filter odd numbers
		List<Integer> oddNum = marks.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(oddNum);
		//count number of objects
		int noOfFailedStudents = (int) marks.stream().filter(m->m<35).count();
		System.out.println(noOfFailedStudents);
		//sorted order
	//	List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());     //in Default ASC order
	//	List<Integer> sortedList = marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
			// DESC order using comparator and comparedTo
		List<Integer> sortedList = marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortedList);
	//	
		
		
	}
}




