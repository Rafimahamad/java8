package StringDuplicateChars;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuilder st=new StringBuilder(str).reverse();
		System.out.println(st);
		//reverseString(str);
	}

	
	private static void reverseString(String str) {
		StringBuilder reverse = new StringBuilder();
		for(int i=str.length()-1;i>=0 ;i--) {
		 reverse.append(str.charAt(i));	
		}
	
		System.out.println(reverse);
	}

}
