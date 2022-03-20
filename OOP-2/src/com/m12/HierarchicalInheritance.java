package com.m12;

class Employee
{
	public void sleep()
	{
		System.out.println("Employee is sleeping Now ");
	}
}

class Office extends Employee
{
	public void task()
	{
		System.out.println("Employee Having some Office Tasks");
	}
}

class Canteen extends Employee
{
	public void eat()
	{
		System.out.println("Employee is eating at Canteen");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		
        // here we used concept of Hierarchical inheritance because 
		// one class has been extended by other classes 
		
		Office o= new Office();
		o.sleep(); //calling sleep() of super class
		o.task();  // calling task() of Office class
		
		Canteen c= new Canteen();
		c.eat();
		
		
	}

}
