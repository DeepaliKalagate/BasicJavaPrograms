/******************************************************************************
		 *  
		 *  
		 *  Purpose: To check the date in range between given date.
		 *
		 *  @author  BridgeLabz
		 *  @version 1.0
		 *  @since   09-08-2019
		 *
		 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SpringSeason {

	public static void main(String[] args) 
	{		
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the Month  : ");
        int month = scanner.nextInt();
    	System.out.println("Please enter the Day : ");
    	int day=scanner.nextInt();
    	if(utility.validateDate(month,day))
    	{
		  if(utility.SpringSeason(month,day))
		  {
			System.out.println("It is Spring Season");
		  }
		  else
		  {
			System.out.println("It is not a Spring Season ");
		  }
    	}
    	else
    	{
		   System.out.println("Please enter a valid Date");		
    	}
    	scanner.close();
	}
}
