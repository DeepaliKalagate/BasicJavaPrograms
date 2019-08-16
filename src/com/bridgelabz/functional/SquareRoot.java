package com.bridgelabz.functional;

import java.util.Scanner;

public class SquareRoot 
{        
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=scanner.nextInt();
		int a;
		for(int i=0;i<n;i++)
		{
			 if(n==1)
			 {
				System.out.println("Check Number");
					
			 }
			else 
			{
				n=n%10;
				n=n/10;
				a=n*n;
				System.out.println("RESULT is: "+a);
			}
			
		}
	}
}
