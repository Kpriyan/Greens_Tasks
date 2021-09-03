package com.daily.cls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_Iterator_loop {

	public static void main(String[] args) {
      
		//Input - a[]= {11, 12, 13, 14, 15, 16}
		
		
		
		 List<Integer> a = new ArrayList<Integer>();
		 
		 a.add(11);
		 a.add(12);
		 a.add(13);
		 a.add(14);
		 a.add(15);
		 a.add(16);
		 
		 // iterate
		 // For Each
		 System.out.println("For each Method");
		 for (Integer integer : a) {
			 System.out.println(integer);
			
		}
		 
System.out.println(".......................................");

         // For Loop
         System.out.println("For Loop");
		 for (int i = 0; i < a.size(); i++) {
			 System.out.println(a.get(i));
			
		}
		 
System.out.println(".................2nd task...........................");

	 List<Integer> b = new LinkedList<Integer>();
		 
		 b.add(11);
		 b.add(12);
		 b.add(13);
		 b.add(14);
		 b.add(15);
		 b.add(16);
		 b.add(17);
		 
		 // iterate
		 // For Each
		 System.out.println("For each Method");
		 for (Integer integer : b) {
			 System.out.println(integer);
			
		}
		 
System.out.println(".......................................");

         // For Loop
         System.out.println("For Loop");
		 for (int i = 0; i < b.size(); i++) {
			 System.out.println(b.get(i));
			
		}
		 
		 
		 // class name object = new class name();
		   
		 
			
			
		 
		
		
	}

}
