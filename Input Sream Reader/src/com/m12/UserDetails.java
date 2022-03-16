package com.m12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserDetails {
	
	public static void main(String[] args) throws Exception {
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Your Id :  ");
		int id= Integer.parseInt(br.readLine());
		
		System.out.println("Enter Your Name : ");
		String name= br.readLine();
		
		System.out.println("Enter Your Salary ");
		double salary= Double.parseDouble(br.readLine());
		
		System.out.println("Enter Your Mobile Number  ");
		long mobileNo= Long.parseLong(br.readLine());
		
		System.out.println("\n === User Details Are ===\n ");
		System.out.println("\n User Id : "+id);
		System.out.println("\n User Name : "+name);
		System.out.println("\n User Salary : "+salary);
		System.out.println("\n User Mobile Number : "+mobileNo);
		
		
	}

}
