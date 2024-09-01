package reference.test;

import java.util.function.BiFunction;

public class Test1 {
public static void main(String[] args) {
	
	DoAddition lambda=(int a,int b) -> {return a+b; };
	System.out.println(lambda.add(59, 50));
	
	DoAddition addition=Test1::add;
	System.out.println(addition.add(10,40));
	
	OrbitaryObjMetthod oom =Test1::addition;
	oom.addition(new Test1(), 20, 20);
	
	
//	BiFunction<Integer,Integer,Integer>add =Bifun::addition;
//     add.apply(new Test1(),4,50);
	
	BiFunction<String, String,String>concat=String::concat;
	String name=concat.apply("Mahammad", "rafi");
	System.out.println(name);
	
	
	BiFunction<Integer, Integer, Integer> sumMethodRef = Math::addExact;
System.out.println(sumMethodRef.apply(49, 89));
}

static int add(int a,int b) {
	return a+b;
}

 int addition(int a,int b) {
	return a+b;
}

}
