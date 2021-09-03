package com.daily.cls;

public class Task_swap_twonumbers {
	
	public void withthirdparty() {
		int mysalary = 50;
		int managersalary=100;
		
		System.out.println("Before swap:"+"my:"+ mysalary + "manger:"+ managersalary);
		
		int temp = mysalary;
		mysalary=managersalary;
		managersalary=temp;
		
		System.out.println("After swap:"+"my:"+mysalary + "manger:"+ managersalary);
		
		
	}
	public void withoutthirdparty() {
		int mysalary = 50;
		int managersalary=100;
		
		System.out.println("Before swap:"+"my:"+ mysalary + "manger:"+ managersalary);
		
		//formula divid
		
		/*first = first-second;100-50;
		second = first+second;100+50;
		first=second-first;100-150;*/
		
		
		mysalary= mysalary-managersalary;
		managersalary=mysalary+managersalary;
		mysalary=managersalary-mysalary;
		
		System.out.println("After swap:"+"my:"+mysalary + "manger:"+ managersalary);
		
		
		
	}
	

	public static void main(String[] args) {
		Task_swap_twonumbers obj = new Task_swap_twonumbers();
		obj.withthirdparty();
        obj.withoutthirdparty();
	}

}
