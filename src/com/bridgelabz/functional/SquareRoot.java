package com.bridgelabz.functional;

import java.util.Scanner;

public class SquareRoot 
{        
	public static void main(String[] args) 
	{
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number : ");
		n=scanner.nextInt();
		int a;
		for(int i=0;i<n;i++)
		{
			if(n!=0)
			{
				n=n%10;
				n=n/10;
				a=n*n;
				System.out.println("RESULT "+a);
			}
			else
			{
				System.out.println("Check Number");
				
			}

		}
	}
}
