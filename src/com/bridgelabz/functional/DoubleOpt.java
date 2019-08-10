/******************************************************************************
 *  
 *  
 *  Purpose: Perform Arithmetic operations with Double Float Numbers
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DoubleOpt {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		double first=scanner.nextDouble();
		System.out.println("Enter Second Number : ");
		double second=scanner.nextDouble();
		System.out.println("Enter Third Number : ");
		double third=scanner.nextDouble();
		System.out.println("Enter the no of times u want to perform operations : ");
		int n=scanner.nextInt();
		int i;
		for(i=0;i<n;i++) {
		System.out.println("select the operations \n 1. a+b*c \n 2. a*b+c \n 3. c+a/b \n 4. a%b+c ");
		int Operater=scanner.nextInt();	
		double result;
		switch (Operater) {
		case 1:
				result=utility.DoubleOpt1(first, second, third);
				System.out.println("Operation 1 : "+result);
				break;
		case 2:
			result=utility.DoubleOpt2(first, second, third);
			System.out.println("Operation 2 : "+result);
			break;
		case 3:
			result=utility.DoubleOpt3(first, second, third);
			System.out.println("Operation 3 : "+result);
			break;
		case 4:
			result=utility.DoubleOpt4(first, second, third);
			System.out.println("Operation 4 : "+result);
			break;
		default:
			System.out.println("Please enter the correct number");
			break;
		}		
	}
	scanner.close();
	}
}
