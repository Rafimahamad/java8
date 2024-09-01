package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo  {

	
	public static void main(String[] args) {
		List<Student>students=new ArrayList<Student>();
		
		
		students.add(new Student(10,"rafi",24));
		students.add(new Student(22,"Basha",34));
		students.add(new Student(14,"Jamal",28));
		
		Collections.sort(students);
		System.out.println(students);
				
		Collections.sort(students,(s1,s2)->s1.name.compareTo(s2.name));
		System.out.println("sorting using lamda function by names "+students);
		
		Collections.sort(students,(s1,s2)->s1.id-s2.id);
		System.out.println("sorting using lamda function by ids "+students);

	}
	
}
