package com.daily.cls;

import java.util.Scanner;

public class Task_singleswitchcase {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the superhero");
		String hero = sc.nextLine();
		
		switch (hero) {
		case "vijay":
			System.out.println("Vijay is a Superhero");
			break;
			
			case "superman":
				System.out.println("Superman is a superhero");
				break;
				
			case "batman":
				System.out.println("Batman is a Superhero");
				break;
				
				default:
				System.out.println("This Superhero Not In The List");
			break;
		}
		
		sc.close();
		
	}

}
