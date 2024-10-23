package oop.poly2;

public class Account extends Employee {
	
	public Account(String name, String job) {
//		super(name, job);
		super.name = name ;
		super.job = job;
	}
	
	public void disp() {
		System.out.println(super.name);
	}
	
}
