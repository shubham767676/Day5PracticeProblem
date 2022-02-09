package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class Flipcoin {

	public static void main(String[] args) {
		float heads=0;
		float tails=0;
		float headPercentage=0;
		float tailPercentage=0;

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times coin flipped  ");
		int totalCoin = sc.nextInt();

			for(int i = 0;i < totalCoin; i++)
			{
				double Flipcoin = Math.random() ;
				if (Flipcoin < 0.5) 
				{
					heads++ ;
					System.out.println("Heads");
				}
				else 
				{
					tails++ ;
					System.out.println("Tails");
				}   
				
				headPercentage =(float)(heads/totalCoin) * 100;
				tailPercentage = (float)(tails/totalCoin) * 100;

				System.out.println("Head percentage :" +headPercentage);
				System.out.println("Tail percentage :" +tailPercentage);

				

			}

	}

}
