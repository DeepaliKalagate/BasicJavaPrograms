/******************************************************************************
 *  
 *  
 *  Purpose: Print wind chill using Math.pow(a, b) function.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   10-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the  tempreture less than 50 Fahrenheit) : ");
	    int t=scanner.nextInt();
	    System.out.println("Please enter the  wind speed between 3 to 120 : ");
	    int v=scanner.nextInt();
	    if (t>50 || 3>v || v>120 ) {
	    	System.out.println("Please enter the correct value!");
	    } else {
	    	double  w= Utility.WindChill(t,v);
	    	System.out.println("National Weather Service defines the effective temperature (the wind chill) to\n" + 
	    			"be:"+w);
	    }
	    scanner.close();
	}

}
