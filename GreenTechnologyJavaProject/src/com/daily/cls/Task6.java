package com.daily.cls;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
      
		
		System.out.println("Enter the string");
		                                             
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
	}
	
	
		
		
		
	}


