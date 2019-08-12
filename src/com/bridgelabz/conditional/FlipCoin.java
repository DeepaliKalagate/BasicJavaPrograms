/******************************************************************************
 *  
 *  
 *  Purpose: Calculate percentage of Tail Vs Head. 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditional;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No of time you want to flip a coin : ");
		int flipCoin=scanner.nextInt();
		int countTail=0;
		int countHead=0;
		for(int i=0;i<flipCoin;i++)
		{
			if(Math.random()>0.5)
			{
				System.out.println("It is a Tail");
				countTail++;
			}
			else
			{
				System.out.println("It is a Head");
				countHead++;
			}
		}
		System.out.println("Number of times Tail Occured : "+countTail);
		System.out.println("Number of times Head Occured : "+countHead);
		
		int tailPercent=(countTail*100)/flipCoin;
		int headPercent=(countHead*100)/flipCoin;
		System.out.println("Percentage of Tail & Head is : Tail "+tailPercent+"% Vs Head "+headPercent+"%");
		scanner.close();

	}

}
