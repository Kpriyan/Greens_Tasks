package com.daily.cls;

import java.util.Scanner;

public class Task_electric_bil {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	 
		   System.out.println("enter number of units");
		   
	          long units=sc.nextLong();
	          System.out.println(units);
	          
	          if (units<=1000) {
	        	  System.out.println("per unit rs 10");
				
			}else {
				System.out.println("unit limit cross");
			}
	          
	          long unit2=sc.nextLong();
	          System.out.println(unit2);
	          
	          if (unit2<=500) {
	        	  System.out.println("per unit rs 5");
				
			}else {
				System.out.println("unit limit cross");
			}
	          
	          long unit3=sc.nextLong();
	          System.out.println(unit3);
	          
	         
	          if (unit3<=200) {
	        	  System.out.println("per unit rs 2");
				
			}else {
				System.out.println("unit limit cross");
			}
	          
	          long unit4=sc.nextLong();
	          System.out.println(unit4);
	          
	          if (unit4<=100) {
	        	  System.out.println("per unit rs 1");
				
			}else {
				System.out.println("unit limit cross");
			}
	           
	 
	    sc.close(); 	   
	}

}
