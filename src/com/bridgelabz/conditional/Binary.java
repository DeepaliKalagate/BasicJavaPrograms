/******************************************************************************
 *  
 *  
 *  Purpose: Convert Decimal to Binary Number. 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.ConditionalUtility;

public class Binary {

	public static void main(String[] args) {
		ConditionalUtility conditionalUtility=new ConditionalUtility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		int decToBinary = n;
		int a;
		String x="";
		if (n > 255)
		{
			System.out.println("Enter Number between 1 to 255");
		} else 
		{
			while (n > 0) 
			{
				a = n % 2;
				x = a + "" + x;
				n = n / 2;
			}
			System.out.println("Binary is: " + x);
			int resultOfSwapNibbles = conditionalUtility.SwapNibbles(decToBinary);
			System.out.println("Result of Swap Nibbles of binary number: "+resultOfSwapNibbles);
		}
		scanner.close();
	}

}
