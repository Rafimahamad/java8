package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingEX {

	public static void main(String[] args) {
		
		int arr[]= {5,6,3,2,8,9};
	
		//int arr1[]=new int[6];
		
		for(int i:arr) {
			System.out.print(" "+i);
		}
		
		System.out.println("\n sorting array : ");
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.print(" "+i);
		}
		
//		Collections.sort();
	
		System.out.println("\n sorting by collection");
	List<Integer> list =new ArrayList<Integer>( Arrays.stream(arr).boxed().toList());
	
	
	Collections.sort(list);
	System.out.println(list);
	Collections.reverse(list);
	System.out.println("revers oredr"+list);
	
//	List is heterogeneous
	List names=new ArrayList();
	names.add("rafi");
	names.add(1);
	System.out.println(names);
	
	}
}
