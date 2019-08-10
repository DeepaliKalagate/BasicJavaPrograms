/******************************************************************************
		 *  
		 *  
		 *  Purpose: To find the roots of the equation a*x*x + b*x + c.
		 *
		 *  @author  BridgeLabz
		 *  @version 1.0
		 *  @since   09-08-2019
		 *
		 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		Utility utility= new Utility();
	    Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter value of x*x i.e A: ");
		double a=scanner.nextDouble();
		System.out.println("Please enter value of x i.e B: ");
		double b=scanner.nextDouble();
		System.out.println("Please enter value of constant i.e C: ");
		double c=scanner.nextDouble();
		utility.calculate(a,b,c);
		scanner.close();

	}

}
