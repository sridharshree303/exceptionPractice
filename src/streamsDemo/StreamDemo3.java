package streamsDemo;

import java.util.ArrayList;
import java.util.function.Consumer;

public class StreamDemo3 {

	public static void main(String[] args) {
		
		ArrayList <Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(20);
		arr.add(18);
		arr.add(9);
		arr.add(15);
		System.out.println(arr);
		
		//min() and max() in ASC  // 1,9,15,18,20
		Integer min = arr.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println(min);
		Integer max = arr.stream().max((s1,s2)->-s1.compareTo(s2)).get();
		System.out.println(max);
		System.out.println("-------------------------------------");
		//forEach Method
		Consumer<Integer> c = i ->{
			System.out.println("The square of "+i+" is: "+(i*i));
		};
		arr.stream().forEach(c);
		//arr.stream().forEach(i->{
		//	System.out.println("The SQUARE of "+i+" is : "+(i*i));
		// });
		
		// toArray  -- 
		Integer[] i = arr.stream().toArray(Integer[]::new);
		for(Integer i1:i) {
			System.out.println(i1);
		}
		

	}

}
