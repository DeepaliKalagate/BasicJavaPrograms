package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.ConditionalUtility;

public class PrimeFactor {

	public static void main(String[] args) {
		ConditionalUtility conditionalUtility=new ConditionalUtility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=scanner.nextInt();
		int fact=1;
		for(int i=2;i*i<=n;i++)
		{
			if(conditionalUtility.primeNum(i))
			{
				fact=conditionalUtility.calculateFactorial(n);
				System.out.println("Factorial of number: "+n+" is : "+fact);
				
			}
		}

	}

}
