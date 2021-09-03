package com.daily.cls;

public class Replace_vowels {

	public static void main(String[] args) {
     
		String str = "Wellcome to class java";
		
		//String trim = str.trim().replace("", "");
		
		//System.out.println(trim);
		
		str = str.replaceAll("[AaEeIiOoUu]", "@");
		
		System.out.println(str);
		
		
		
	} 

}
