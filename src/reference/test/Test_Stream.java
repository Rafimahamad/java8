package reference.test;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

public class Test_Stream {

	
	public static void main(String[] args) {
		List<String>list=List.of("Rafi","Mahammad","Raj","Karan","william","Jahid");
		
		list.stream().forEach((names)-> System.out.println(names));
		
		list.stream().forEach(System.out::println);
		
//		Function<String,Employee> stringToEmployee= (string)-> {
//			return new Employee(string);
//		};
		
//		list.stream().
//		map(Employee::new).forEach(System.out :: println);
//		
		list.stream().
		map(Employee::new)
		.map(emp -> 
		         { emp.setId(ThreadLocalRandom.current().nextInt(100,1000));
			         return emp;
			      })
		.forEach(System.out::println);
		
		//to upper case
		
		list.stream().
		map(Employee::new)
		.map(emp -> 
		         { emp.setId(ThreadLocalRandom.current().nextInt(100,1000));
			         return emp;
			      })
		.map(Employee::getName)
		.map(String :: toUpperCase)
		.forEach(System.out::println);
		
		
		
		}
		
	
	
	}

