package com.m12;

class A 
{
	public void m1()
	{
		System.out.println("THis is A class m1()");
	}
}

class B extends A
{
	public void m2()
	{
		System.out.println("This is B class m2()");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
	
		B b= new B();
		// calling B,A class Method's here we are taking
		// support of single level inheritance  
		b.m1();
		b.m2();

	}

}
