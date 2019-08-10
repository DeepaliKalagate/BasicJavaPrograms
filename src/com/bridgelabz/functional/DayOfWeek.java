/******************************************************************************
 *  
 *  
 *  Purpose: 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   10-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) 
	{
				Utility utility= new Utility();
			    Scanner scanner= new Scanner(System.in);
			    System.out.println("please  enter day ");
			    int day=scanner.nextInt();
			    System.out.println("please  enter month");
			    int month=scanner.nextInt();
			    System.out.println("please  enter year ");
			    int year=scanner.nextInt();
			    if(utility.validateDate(month,day,year)) {
			    int	y0 = year - (14 - month) / 12;
			    int	x = y0 + (y0/ 4) - (y0 /100) + (y0/400);
			    int	m0 = month + 12* ((14 - month) / 12) - 2;
			    int	d0 = (day + x + 31* m0/12)%7;
			    switch(d0) {
			    case 1 : System.out.println("its monday");
			    		  break;
			    case 2 : System.out.println("its tuesday");
			    		  break;
			    case 3 : System.out.println("its wednesday");
				    	  break;
			    case 4 : System.out.println("its thursday");
				  		  break;
			    case 5 : System.out.println("its friday");
				  		  break;
			    case 6 : System.out.println("its saturday");
				  		  break;
			    case 0 : System.out.println("its sunday");
				          break;
			    }
			    } else {
			    	System.out.println("please enter the valid date ");
			    }
			    scanner.close();
			}
}


