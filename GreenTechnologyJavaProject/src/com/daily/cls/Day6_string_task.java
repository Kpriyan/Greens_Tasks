package com.daily.cls;

public class Day6_string_task {

	public static void main(String[] args) {
		
		// normal
		
		String name = "Hello";
		
		String reverse = "";
		
		for (int i = name.length()-1;i>=0; i--) {
			
			reverse = reverse+name.charAt(i);
			
		}
		
		System.out.println(reverse);
		
System.out.println(".............................");
		
		//Palindrome
		
        String name1 = "MADAM";
		
		String reverse1 = "";
		
		for (int i = name1.length()-1;i>=0; i--) {
			
			reverse1 = reverse1+name1.charAt(i);
			
		}
		
		System.out.println(reverse1);
		
       
	}

}
