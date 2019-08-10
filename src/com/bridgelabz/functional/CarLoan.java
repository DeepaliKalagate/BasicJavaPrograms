/******************************************************************************
 *  
 *  
 *  Purpose: Calculate monthly payments for Car Loan. 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   10-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CarLoan 
{

	public static void main(String[] args)
	{
		Utility utility= new Utility();
		Scanner scanner= new Scanner(System.in);
		int principalLoanAmount,year;
		double roi,amountToPayForMonth;

		System.out.println("Enter Principal Loan Amount : ");
		principalLoanAmount=scanner.nextInt();
		System.out.println("Enter Year : ");
		year=scanner.nextInt();
		System.out.println("Enter Rate Of Interest : ");
		roi=scanner.nextDouble();
		amountToPayForMonth=utility.LoanCalculator(principalLoanAmount,year,roi);
		System.out.println("Amount to Pay per month  :"+amountToPayForMonth+" For " +year+" Years");
		scanner.close();
	}

}
