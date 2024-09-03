package StringDuplicateChars;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringDuplicateCharByJava8 {
	
	public static void main(String[] args) {
		String s="Mahammad Rafi";
		findDuplicateChars(s.toLowerCase());
		
		Character first_non_repeatedChar = s.toLowerCase().chars()  // Convert the string to an IntStream
        .mapToObj(c -> (char) c)  // Convert each int to a char
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))  // Count occurrences using LinkedHashMap to maintain insertion order
        .entrySet().stream()  // Convert the Map to a Stream of Map entries
        .filter(entry -> entry.getValue() == 1)  // Filter out entries with a count of 1
        .map(Map.Entry::getKey)  // Get the key (character)
        .findFirst()  // Find the first element in the Stream
	    .orElse(null);
		System.out.println("first non repeated char in "+s+" is : "+first_non_repeatedChar);
	}

	private static void findDuplicateChars(String s) {
	
		Map<Character,Long> charCountMap=s.chars()
				.mapToObj(c-> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//		s.chars(): Converts the string to a stream of its character's integer (ASCII/Unicode) values.
//		.mapToObj(c -> (char) c): Maps those integer values back to Character objects.
//		.collect(Collectors.groupingBy(c -> c, Collectors.counting())): This part collects the Character stream into a Map<Character, Long> where:
//			groupingBy(c -> c): Groups the characters by themselves. Essentially, this creates a map where each unique character in the string is a key.
//			Collectors.counting(): Counts the occurrences of each character and stores the count as the value associated with that character key in the map.
		
		System.out.println(charCountMap);
//	charCountMap.entrySet().stream()
//	.filter(entry->entry.getValue()>1)
//	.forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
//	
		
		
		
		
	}

}
