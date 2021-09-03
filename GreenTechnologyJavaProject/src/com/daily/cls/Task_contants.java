package com.daily.cls;

import java.util.Scanner;

public class Task_contants {

	public static void main(String[] args) {
		
		//b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, y, z.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string");
		
		String str = sc.nextLine();
		
		char[] chars = str.toCharArray();
		
		int count =0;
		
		for (char c : chars) {
			
			switch(c) {
			
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			 count++;
			 break;
				
				
			
			
			}
			
		}
		 System.out.println(count);
		 sc.close();
		

	}

}
