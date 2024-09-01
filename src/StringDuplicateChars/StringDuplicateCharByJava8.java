package StringDuplicateChars;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDuplicateCharByJava8 {
	
	public static void main(String[] args) {
		String s="Mahammad Rafi";
		findDuplicateChars(s.toLowerCase());
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
