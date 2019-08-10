/******************************************************************************
 *  
 *  
 *  Purpose: Check year is a leap year or not.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		Utility utility=new Utility();
		int year;
		boolean result;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter year : ");
		year=scanner.nextInt();
		if(year>=1582&&year<=9999)
		{
			if(utility.LeapYear(year))
			{
				System.out.println(year + " is a leap year");
			}
			else
			{
				System.out.println(year + " is not a leap year");
			}
		}
		else
		{
			System.out.println("Please, Enter a Valid Year!");
		}
		scanner.close();
	}

}
