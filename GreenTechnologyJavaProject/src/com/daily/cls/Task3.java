package com.daily.cls;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//task 4
		String Input ="velmurugank451@gmail.com";
		System.out.println(Input.contains("@"));
		
		
		//task 4
		System.out.println("Enter the email");
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
	    boolean get = st.contains("@");
	    if (get) {
		 System.out.println("valid email id");
		
	    }else {
		System.out.println("invalid email");
	   }
	 
	   s.close();
	 
		
		// task 5
	   String In = "Wellcome to class java";
		System.out.println(In.replace("java", "sql"));
	
		
		/*System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] chars = str.toCharArray();
		
		
		int count =0;
		
		for (char c : chars) {
			
			
			
			
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
				}
			}
       System.out.println(count);
       sc.close();
	}*/
	
	
	

	}
}
	


