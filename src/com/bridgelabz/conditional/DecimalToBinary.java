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

public class DecimalToBinary {

	public static void main(String[] args) {
		ConditionalUtility conditionalUtility=new ConditionalUtility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=scanner.nextInt();
		int num=conditionalUtility.decToBinary(n);
		System.out.println(" is the Binary Number of Decimal Number "+num);
		scanner.close();

	}

}
