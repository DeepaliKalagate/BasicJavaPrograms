/******************************************************************************
 *  
 *  
 *  Purpose: Compute the square root of a nonnegative number. 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.ConditionalUtility;

public class SqrtNewton {

	public static void main(String[] args) {
		ConditionalUtility conditionalUtility=new ConditionalUtility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter non negative number : ");
		int n=scanner.nextInt();
		if(n>0)
		{
			conditionalUtility.sqrtNewton(n);
		}
		else
		{

			System.out.println("Please,Enter positive number");
		}

	}

}
