package lamdbaex;

public class LambdaDemo {
public static void main(String[] args) {
	
//	Addition addition = (int a ,int b) -> {
//		return a+b ;
//	};
	
	Addition addition = (a ,b) ->  a+b ;

	
	
	System.out.println(addition.add(5, 6));

//	StringLength str= (msg) -> msg.length();
	
	StringLength str= msg -> msg.length();
	
	System.out.println(str.lenghtOfString("Mahammad Rafi"));
	
}
}
