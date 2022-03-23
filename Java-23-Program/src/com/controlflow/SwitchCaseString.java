package com.controlflow;
public class SwitchCaseString 
{
	public static void main(String[] args)
	{
		String name = "Narendra";

		switch (name.toLowerCase()) 
		{
		case "vijay":
			System.out.println("this is vijay");
			break;
		case "akash":
			System.out.println("this is akshay");
			break;
		case "narendra":
			System.out.println("this is narendra ");
			break;
		default:
			System.out.println("this person is invalid");
			break;
	}
}
}

