/******************************************************************************
 *  
 *  
 *  Purpose: Conversion of temperature in fahrenheit to celsius and viceversa.  
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   10-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) 
	{
		Utility utility= new Utility();
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("Please enter the  case you want:");
	    System.out.println("1.Celsius to Fahrenheit: ");
	    System.out.println("2.Fahrenheit to Celsius: ");
	    int no=scanner.nextInt();
	    switch(no)
	    {
	    case 1: System.out.println("Please enter Celsius: ");
	    		int celsius=scanner.nextInt();
	    		utility.celsiusToFahrenheit(celsius);
	    		break;
	    case 2: System.out.println("Please enter Fehrenheit: ");
				int fehrenheit=scanner.nextInt();
				utility.fahrenheittocelsius(fehrenheit);
				break;
	    	
	    default: System.out.println("Please enter the valid Input!");
	    }
	    scanner.close();
	}
}
