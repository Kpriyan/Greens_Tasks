package com.daily.cls;

import java.util.Scanner;

public class Task_electric_bill {
	

	public static void main(String[] args) {

		
		  long units;
		  
		   Scanner sc=new Scanner(System.in);
	 
		   System.out.println("enter number of units");
		   
	           units=sc.nextLong();
	           
	           sc.close();
	 
	     	   double billperunit=0;
	 
	           if(units>=1000)
			billperunit=units*10;
	 
	    	   else if(units<=500 && units < 1000)
			billperunit=units*5;
	 
		    else if(units<=200 && units < 500)
			billperunit=units*2;
	           
		    else if(units<200)
				billperunit=units*1;
		 
	  System.out.println("bill amount: " + billperunit); 
	              
	              
	}
	
	
	
         
		
		
		}
	
	


