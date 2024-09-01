package localdatetimeapi;

import java.time.LocalDate;
import java.util.Date;

public class Test_Leap_Year {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		LocalDate d1=LocalDate.of(1999,7,5);
		
		System.out.println(d.isLeapYear()+""+d+"is a leap year");
		
		System.out.println(d1.isLeapYear());
		
		


	}
	
}
