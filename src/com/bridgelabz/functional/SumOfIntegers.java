/******************************************************************************
 *  
 *  
 *  Purpose: Sum of Two Integers
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SumOfIntegers 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		int firstNumber,secondNumber,result = 0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number : ");
		firstNumber=scanner.nextInt();
		System.out.println("Enter second number : ");
		secondNumber=scanner.nextInt();
		System.out.println("Enter the no of times u want to perform operations : ");
		int n=scanner.nextInt();
		int i;
		for(i=0;i<n;i++)
		{
		    System.out.println("select the operations: \n 1. a+b \n 2. a-b \n 3. a*b \n 4. a/b ");
		    int Operater=scanner.nextInt();		
		    switch (Operater) 
		    {
		    	case 1:
		    		result=utility.SumOfIntegers(firstNumber, secondNumber);
		    		System.out.println("Operation 1 : "+result);
		    		break;
		    	case 2:
		    		result=utility.SubtractOfIntegers(firstNumber, secondNumber);
		    		System.out.println("Operation 2 : "+result);
		    		break;
		    	case 3:
		    		result=utility.MultiplicationOfIntegers(firstNumber, secondNumber);
		    		System.out.println("Operation 3 : "+result);
		    		break;
		    	case 4:
		    		result=utility.DivisionOfIntegers(firstNumber, secondNumber);
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
