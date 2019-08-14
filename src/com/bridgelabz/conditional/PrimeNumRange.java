/******************************************************************************
 *  
 *  
 *  Purpose: Check Prime Numbers from given range. 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.ConditionalUtility;

public class PrimeNumRange {

	public static void main(String[] args) 
	{
		ConditionalUtility conditionalUtility=new ConditionalUtility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter range start from : ");
		int start=scanner.nextInt();
		System.out.println("Enter range ends to : ");
		int end=scanner.nextInt();
		for( int temp=start;temp<=end;temp++)
		{
			boolean prime = conditionalUtility.primeNum(temp);
			if(prime)
			{
				System.out.print("\t"+temp);
			}
		}
	}
}


