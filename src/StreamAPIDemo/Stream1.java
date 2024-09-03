package StreamAPIDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		
//		create list and filter all even numbers from list
		
	
	 ArrayList<Integer> list1 = new ArrayList<Integer>();
	 list1.add(56);
	 list1.add(45);
	 list1.add(43);
	 list1.add(23);
	 list1.add(18);
	 
		
		List<Integer> list2 = List.of(1, 2, 3, 4, 5);
//		list.add(84); immutable
		System.out.println(list2);
		
		
		List<Integer> list3 = Arrays.asList(11,37,24,25,12);
		
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		
		for(Integer list:list2) {
			if(list%2==0) {
				list4.add(list);
			}
		}
		
		System.out.println(list4);
		
		
		
//		using stream
		
		Optional<Integer> sum = list2.stream().reduce((a,b)->a+b);
		System.out.println("Sum = "+sum);
		
		Stream<Integer> stream = list2.stream();
		List<Integer> newList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
		
		
		System.out.println(newList);
		
		
		List<Integer> collect = list2.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		
		System.out.println(collect);
		
	Integer evensum=list2.stream().filter(i->i%2==0).reduce(0,Integer::sum);
		System.out.println("sum of even numbers: "+evensum);
//		greater than 20 from list3
		
		List<Integer> collect2 = list3.stream().filter(i -> i>20 ).collect(Collectors.toList());
		System.out.println(collect2);
	}
}