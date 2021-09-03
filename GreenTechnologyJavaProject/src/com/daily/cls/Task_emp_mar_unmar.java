package com.daily.cls;

import java.util.Scanner;

public class Task_emp_mar_unmar {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you have permanent job yes/No");
		String job = sc.nextLine();
		System.out.println("Are you married yes/No ");
		String m = sc.nextLine();
		System.out.println("years of Experience");
		double exp = sc.nextDouble();
		sc.close();
		if (job.equalsIgnoreCase("yes") && m.equalsIgnoreCase("yes") && exp >= 30) {
			System.out.println("Eligible loan amount is 60000");
			
		}else if (job.equalsIgnoreCase("yes") && m.equalsIgnoreCase("No") && exp >= 30) {
			System.out.println("Eligible loan amount is 50000");
			
		}else if (job.equalsIgnoreCase("yes") && m.equalsIgnoreCase("yes") && exp < 30) {
			System.out.println("Eligible loan amount is 35000");
			
		}else if (job.equalsIgnoreCase("yes") && m.equalsIgnoreCase("No") && exp < 30) {
			System.out.println("Eligible loan amount is 25000");
			
		}else if (job.equalsIgnoreCase("No")) {
			System.out.println("Eligible loan amount is 10000");
			
		}else {
			System.out.println("Not Eligible");
		}
		
	}

}
