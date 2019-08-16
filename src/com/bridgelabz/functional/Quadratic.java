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
	    int a,b,x,c;
		double delta,root1,root2;
		System.out.println("Enter value of A");
		a = scanner.nextInt();
		System.out.println("Enetr value of B");
		b = scanner.nextInt();
		System.out.println("Enter value of C");
		c = scanner.nextInt();
		
        delta=utility.FindDeltaSquarRoot(a,b,c);
        System.out.println("Delta"+delta);
		
		root1=utility.QuadraticEquation1(a,b,delta);
		root2=utility.QuadraticEquation2(a,b,delta);
		
		System.out.println("Root 1 of X is :"+root1);
		System.out.println("Root 2 of X is :"+root2);
		scanner.close();
	}
}
