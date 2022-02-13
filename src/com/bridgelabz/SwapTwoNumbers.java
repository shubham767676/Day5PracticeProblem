package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Before swapping");
		System.out.println("Enter a First number :");
		num1 = sc.nextInt();
		System.out.println("Enter a second number :");
		num2 = sc.nextInt();

		int swap = num1;
		num1 = num2;
		num2 = swap;

		System.out.println("After swapping");
		System.out.println("The First number is:" + num1);
		System.out.println("The second number is :" + num2);
	}

}
