package sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	
	public static void main(String[] args) {
		List<Person>persons=new ArrayList<>();
		persons.add(new Person(2,"Rafi",20));
		persons.add(new Person(2,"Hussain",20));
		persons.add(new Person(21,"Shaik",25));
		persons.add(new Person(13,"Mahammad",27));
		
		System.out.println("Sort by Name");
		
		Collections.sort(persons,new NameComparator());
		
		System.out.println(persons);
		
		System.out.println("Sort by age");
		
		Collections.sort(persons,new AgeComparator());
		System.out.println(persons);
		
		
		
//		using tree set
		
		Set<Person> set=new TreeSet(new NameComparator());
		
		set.addAll(persons);
		
		System.out.println("Tree set"+set);
		
	}
}
