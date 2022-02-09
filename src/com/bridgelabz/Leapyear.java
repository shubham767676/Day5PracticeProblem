package com.bridgelabz;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Creating a scanner object
		System.out.println("Enter a year to check :");
		int year = sc.nextInt();   //Read user input from command line
		
		if (year % 4 == 0) {
			System.out.println(year + " is a leap year");
		}else  {
			System.out.println(year + " is not a leap year");
		}
	}

}
