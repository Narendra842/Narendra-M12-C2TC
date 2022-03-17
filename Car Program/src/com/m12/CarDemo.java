package com.m12;
public class CarDemo 
{
	
	String carName;        //Non-static  variable
	int carPrize;         //Non-static  variable
	String carColor;       //Non-static  variable
	

	void displayCarName()
	{             
		carName="Maruti Suzuki";
		System.out.println("Car Name::"+carName);    //print statement
	}
	void displayCarPrize()
	{           
		carPrize=1500000;
		System.out.println("Car Prize ::"+carPrize);
	}
	void displayCarColor()
	{          
		carColor="Black";
		System.out.println("Car color::"+carColor);
	}
	
	public static void main(String[] args)
	{   
			
		CarDemo car=new CarDemo();           // object creation
		car.displayCarName();
		car.displayCarPrize();              //invoke the methods
		car.displayCarColor();

	}//main

}//class