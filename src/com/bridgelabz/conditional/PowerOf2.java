/******************************************************************************
 *  
 *  
 *  Purpose: Calculate table for power of 2. 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.ConditionalUtility;

public class PowerOf2 {

	public static void main(String[] args) 
	{
		ConditionalUtility conditionalUtility=new ConditionalUtility();
		int n,result,powerOfTwo;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number For Table : ");
		n=scanner.nextInt();
		powerOfTwo=conditionalUtility.powerOfTwo(2,n);// 5 = 32
		for(int i=1;i<=powerOfTwo;i++)
		{
			result = conditionalUtility.powerOfTwo(i, 2);
			System.out.println("Power of "+i+" "+result);
		}
		scanner.close();
	}
}



	