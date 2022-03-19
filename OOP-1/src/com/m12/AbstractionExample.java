package com.m12;

abstract class Shape
{
	// here, we are hiding internal implementation just 
	// showing necessary information, this is nothing but abstraction
	  public abstract void areaFind();
} // abstract class Shape end

class Rectangle extends Shape
{
	public void areaFind() // providing implementation as per requirement
	{
		double length=65;
		double breadth= 58;
		double area= length*breadth;
		System.out.println("Area of Rectangle is : "+area);
	}
} // class Rectangle end

class Circle extends Shape
{
	public void areaFind()
	{
	    double pi=3.14;
	    double radius =43;
	    double area= pi*(radius* radius);
	    System.out.println("Area of Circle is : "+area);
	    
	}
}// class Circle end

public class AbstractionExample {

	public static void main(String[] args) 
	{
		// Creating Referance Variable for abstract class Shape
		Shape s1,s2;
		s1= new Rectangle(); //  Rectangle class Object creation
		s2= new Circle(); //  Circle class Object creation
		
		
		// calling findArea() method 
		s1.areaFind();
		s2.areaFind();	
	}

}
