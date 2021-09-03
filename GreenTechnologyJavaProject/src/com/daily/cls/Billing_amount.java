package com.daily.cls;

import java.util.Scanner;

public class Billing_amount extends Electricity_bill {

	public static void main(String[] args) {
		
		
		
		   long units;
		  
			 
		    Scanner sc=new Scanner(System.in);
	 
		    System.out.println("enter number of units");
		   
	        units=sc.nextLong();
	                  
	                 
	 
	           Billing_amount obj = new  Billing_amount();
	           obj.Bill(units);
	           
	           
	        	
	      	  System.out.println("per unit bill : " + obj.bill); 
	      	   
	      	   sc.close();
		

	}

}
