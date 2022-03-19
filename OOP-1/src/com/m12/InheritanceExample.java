package com.m12;

class Parent 
{
	public void sleep()
	{
		System.out.println("Parent Class sleep()  ");
	}
	public void eat()
	{
		System.out.println("parent class eat() ");
	}
}
//here, we are extending parent class property into child class 
//by using extend keyword
class Child extends Parent
{
	public void eat()
	{
		System.out.println("Child  Class eat()");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		// Creating Child Class Object to Access child as well 
		// parent class method
		
		Child c= new Child();
		c.eat(); //  calling eat() of child class
		
		/* calling sleep() of parent class using child class object
           because we used extend keyword to access property of parent 
           class
         */
		c.sleep(); 
	}

}
