/******************************************************************************
 *  
 *  
 *  Purpose: Find Repeated Number from given array. 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.ConditionalUtility;

public class RepeatedNumber {

	public static void main(String[] args) 
	{ConditionalUtility conditionalUtility=new ConditionalUtility();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Number of Elements for array :");
	int n=scanner.nextInt();
	int[] a=new int[n];
	System.out.println("Enter all the Elements of array:");
	for(int i=0;i<n;i++)
	{
		a[i]=scanner.nextInt();
	}

	}

}
