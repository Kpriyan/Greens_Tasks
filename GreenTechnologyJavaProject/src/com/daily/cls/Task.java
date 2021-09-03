package com.daily.cls;

import java.util.Scanner;

public class Task {
	
	static long unit1000;
	static long unit500;
	static long unit200;
	static long unit100;
    double bill;
	

	public static void main(String[] args) {
		
		       Scanner sc=new Scanner(System.in);
		 
		       System.out.println("enter number of units");
		       unit1000=sc.nextLong();
	           System.out.println("per unite charges rs.10");
	           
	           System.out.println("enter number of units");
			   unit500=sc.nextLong();
	           System.out.println("per unite charges rs.5");
	           
              System.out.println("enter number of units");
			  unit200=sc.nextLong();
	          System.out.println("per unite charges rs.2");
	           
             
	           System.out.println("enter number of units");
			   unit100=sc.nextLong();
	           System.out.println("per unite charges rs.1");
	           
	           sc.close();
	          
	   		    
	   		    

	   	 
	   	              //System.out.println("Bill to pay : " + bill); 
	   	   } 
	   	
	           
    
		
		
		
		
		
	}


