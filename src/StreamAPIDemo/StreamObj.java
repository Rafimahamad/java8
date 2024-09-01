package StreamAPIDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObj {
	
	public static void main(String[] args) {
		Stream<Object>emptyStream=Stream.empty();
		
		String names[]= {"Rafi","Rahul","hussain","Basha","Lokesh"};
		
		
		
		Stream<String> stream1=Stream.of(names);
		stream1.forEach(e -> { System.out.println(e);});
		
		Stream<Object> build = Stream.builder().build();
		
		Stream<String> stream2 = Arrays.stream(names);
		stream2.forEach(i -> System.out.println(i) );
		
		List<Integer> numbers = List.of(34,54,12,2,38,69);
		List<Integer> newNum = numbers.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(newNum);
	
//		short cut
	newNum.forEach(System.out::println);
	numbers.stream().sorted().forEach(System.out::println);
		
	Integer minNum =numbers.stream().min( (x,y) -> x.compareTo(y) ).get();
	System.out.println("min number "+minNum);
	
	Integer maxNum =numbers.stream().max( (x,y) -> x.compareTo(y) ).get();
	System.out.println("max number "+maxNum);
	
	
	
	
	
	}
}
