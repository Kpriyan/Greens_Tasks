package com.daily.cls;

public class Task_switchcase {
	//String filename = "Documentfile";
	
	String filename = "documentfile";
	
	public void find() {
		switch (filename) {
		case "wordfile":
			System.out.println("My File Name Wordfile ");
			
			break;
		}
        switch (filename) {
		case "Excelfile":
			System.out.println("My File Name Excelfile ");
			
			break;
		}
		switch (filename) {
		case "Documentfile":
			System.out.println("My File Name Documentfile ");
			
			break;

		default:
			System.out.println("File Name Doesn't Match");
			break;
		}
		
	}

	public static void main(String[] args) {
		
		Task_switchcase obj = new Task_switchcase();
		obj.find();

	}

}
