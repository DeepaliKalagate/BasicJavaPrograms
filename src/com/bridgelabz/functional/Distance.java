/******************************************************************************
		 *  
		 *  
		 *  Purpose: To calculate distance = sqrt(x*x + y*y).
		 *
		 *  @author  BridgeLabz
		 *  @version 1.0
		 *  @since   09-08-2019
		 *
		 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		Utility utility= new Utility();
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("Please enter the coordinates X & Y : ");
	    double x = scanner.nextDouble();
	    double y = scanner.nextDouble();
	    double result;
	    result=utility.Euclidean(x,y);
	    System.out.println("The  Euclidean distane is : "+result);
	    scanner.close();
	}

}
