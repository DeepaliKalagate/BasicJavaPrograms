/******************************************************************************
 *  
 *  
 *  Purpose: Convert Binary to Decimal Number. 
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
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=scanner.nextInt();
		int num=conditionalUtility.binaryToDecimal(n);
		System.out.println("Binary of "+n+" is "+num);
		scanner.close();

	}

}
