package com.m12;

public class Car {
	
	String carName; //instance Variable
	int carPrice;     //instance Variable
	String carColor; //instance Variable
	
	void displayCarName()  // not-static Method 
	{
		carName="Baleno-450";
		System.out.println("Car Name::"+carName);    //print statement
	}
	void displayCarPrize()  // not-static Method 
	{          
		carPrice=1500000;
		System.out.println("Car Prize ::"+carPrice);
		}
	void displayCarColor()    // not-static Method 
   {         
		carColor="Black";
		System.out.println("Car color::"+carColor);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();                   // initiate the object
		obj.displayCarName();
		obj.displayCarPrize();              //invoking the non-static  method
		obj.displayCarColor();

	}

}
