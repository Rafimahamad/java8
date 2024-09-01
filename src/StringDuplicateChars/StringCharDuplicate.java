package StringDuplicateChars;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCharDuplicate {

	public static void main(String[] args) {
		
		 String input = "Mahammad Rafi";
	        findDuplicates(input);	
	      
	}

	private static void findDuplicates(String input) {
		
		
		String st=input.toLowerCase();
		char[] charArray = input.toCharArray();
		
		Stream<char[]> stream = Stream.of(charArray);		
		System.out.println("stream api");
		stream.forEach(System.out::println);
		
		Map<Character ,Integer> charCountMap = new LinkedHashMap<Character, Integer>();
		
		for(char c:st.toCharArray()) {
			
				charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);	
				System.out.println("process "+charCountMap);
		}
		System.out.println(charCountMap);
		
		
//		 for (Map.Entry<Character, Integer> entry :  charCountMap.entrySet()) {
//	            if (entry.getValue() > 1) {
//	                System.out.println("Character '" + entry.getKey() + "' is duplicated " + entry.getValue() + " times.");
//	            }
//	        }
		 
		charCountMap.entrySet().stream()
		.filter(entry -> entry.getValue()>1)
		.forEach(entry -> System.out.println(entry.getKey()+"is repeated "+entry.getValue()));
	
		
		charCountMap.entrySet().stream()
		.filter(entry -> entry.getValue()>1)
		.forEach(System.out:: println);
		
		charCountMap.entrySet().stream()
		.filter(entry -> entry.getValue()>1)
		.collect(Collectors.toList());
		
		//print first non repeated char
		
		Optional<Entry<Character, Integer>> findFirst = charCountMap.entrySet().stream().filter(entry->entry.getValue()==1).findFirst();
		
		System.out.println(findFirst);
	
	}
}
