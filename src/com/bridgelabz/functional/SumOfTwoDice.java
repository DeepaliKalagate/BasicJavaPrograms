/******************************************************************************
		 *  
		 *  
		 *  Purpose: Sum of two Dice, random integers between 1 and 6
		 *
		 *  @author  BridgeLabz
		 *  @version 1.0
		 *  @since   09-08-2019
		 *
		 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SumOfTwoDice {

	public static void main(String[] args) {
		Utility utility= new Utility();
   	 	int max = 6; 
        int min = 1; 
    
        int a=(int)utility.random(max,min);
        System.out.println("First random no on 1st dice is : "+a);
        int b=(int)utility.random(max,min);
        System.out.println("Second random no on 2nd dice is : "+b);
        int sum=a+b;
   	    System.out.println("Sum of two dice is : "+sum);
        }

	}


