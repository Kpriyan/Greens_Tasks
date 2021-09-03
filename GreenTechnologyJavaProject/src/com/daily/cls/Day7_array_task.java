package com.daily.cls;

public class Day7_array_task {

	public static void main(String[] args) {
		
		// sum
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		int[] arrays = {1,2,3,4,5,6,7,8,9,10};
		
		
		int sum = 0;
		int add = 0;
		
		for (int i : arrays) {
			sum = sum+i;
			
		}
		System.out.println(sum);
		
	    
		for (int d : array) {
			add = add+d;
			
		}
		System.out.println(add);
		
System.out.println("................................");
		
		// average
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sums = 0;
		
		for (int i = 0; i < a.length; i++) // for loop
			
			sums = sums + a[i];
			
			double average = sums/a.length;
			
			System.out.println(average);
			
			
			
		}
		
		
		
		
	}


