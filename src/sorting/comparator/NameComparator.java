package sorting.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.name.compareTo(p2.name);
	}

	
}

