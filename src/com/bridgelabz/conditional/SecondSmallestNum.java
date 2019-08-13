/******************************************************************************
 *  
 *  
 *  Purpose: Find Second Largest and Smallest Number in given array. 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.ConditionalUtility;

public class SecondSmallestNum {

	public static void main(String[] args) {
		ConditionalUtility conditionalUtility=new ConditionalUtility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Elements in array :");
		int n=scanner.nextInt();
		int[] a=new int[n];
		System.out.println("Enter all the Elements for array:");
		for(int i=0;i<n;i++)
		{
			a[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second Largest  : "+a[n-2]);
		System.out.println("Second Smallest : "+a[1]);
	}

}
