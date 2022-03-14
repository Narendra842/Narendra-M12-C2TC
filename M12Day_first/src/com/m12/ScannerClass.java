package com.m12;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		//create scanner class object to take input form  user
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Your Name \t :");
		String name= sc.next();
		
		System.out.print("Enter  Your Address \t :");
		String address= sc.next();
		
		System.out.print("Enter Your Qualification \t:");
		String qualification = sc.next();
		
		System.out.println("\n ===Your Details Are ===");
		System.out.println("\n Your Name : "+name);
		System.out.println("\n Your Address :"+address);
		System.out.println("\n Your Qualification :"+qualification);

	}

}
