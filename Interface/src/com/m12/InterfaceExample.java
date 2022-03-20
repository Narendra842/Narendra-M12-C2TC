package com.m12;

interface RBI
{
	public void rateOfIntrest();
}

class SBI implements RBI
{
	public void rateOfIntrest()
	{
		System.out.println("SBI Having 12 %  rate of intrest");
	}
}

class HDFC implements RBI
{
	public void rateOfIntrest()
	{
		System.out.println("HDFC Having  14 % rate of intrest  ");
	}
}

class Kotak implements RBI
{
	public void rateOfIntrest()
	{
		System.out.println("Kotak Having 13.30 % rate of intrest");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		RBI sbi= new SBI();
		sbi.rateOfIntrest();
		
		RBI hdfc= new HDFC();
		hdfc.rateOfIntrest();
		
		RBI kotak= new Kotak();
		kotak.rateOfIntrest();

	}

}
