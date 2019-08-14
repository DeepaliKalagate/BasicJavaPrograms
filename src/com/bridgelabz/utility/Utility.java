/******************************************************************************
 *  
 *  
 *  Purpose: This file contains logic of all the programs.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;



public class Utility 
{
	public int SumOfIntegers(int firstNumber,int secondNumber)
	{
		int result=firstNumber+secondNumber;
		return result;
	}
	public int MultiplicationOfIntegers(int firstNumber, int secondNumber)
	{
		int result=firstNumber*secondNumber;
		return result;
	}
	public int SubtractOfIntegers(int firstNumber, int secondNumber)
	{
		int result=firstNumber-secondNumber;
		return result;
	}
	public int DivisionOfIntegers(int firstNumber, int secondNumber)
	{
		int result=firstNumber/secondNumber;
		return result;
	}
	
	
	public int IntOpt1(int first, int second, int third)
	{
		
		int result =first+second*third;
		return result;
	}
	public int IntOpt2(int first, int second, int third)
	{
		
		int result =first*second+third;
		return result;
	}
	public int IntOpt3(int first, int second, int third)
	{
		
		int result =third+first/second;
		return result;
	}
	public int IntOpt4(int first, int second, int third)
	{
		
		int result =first%second+third;
		return result;
	}
	
	
	
	
	public double DoubleOpt1(double first, double second, double third)
	{
		
		double result =first+second*third;
		return result;
	}
	public double DoubleOpt2(double first, double second, double third)
	{
		
		double result =first*second+third;
		return result;
	}
	public double DoubleOpt3(double first, double second, double third)
	{
		
		double result =third+first/second;
		return result;
	}
	public double DoubleOpt4(double first, double second, double third)
	{
		
		double result =first%second+third;
		return result;
	}
	
	
	
	
	public static boolean LeapYear(int year)
	{
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			return true;
		}
		return false;
	}

	
	public boolean validateDate(int month,int day)
	{
		if(month<1 || month>12)
			return false ;
		if(day<1 || day>31)
			return false;
		if(month==2)
			if(day<1 || day >28)
				return false;
		if(month==4 || month ==6 || month ==9 || month ==11)
			if(day<1 || day>30)
				return false; 
		return true;
	}	
	public boolean SpringSeason(int month, int day)
	{
		if(month==4 || month==5)
			return true;
		if((month==3&&day>=20)||(month==6&&day<=20))
			return true;
		return false;
	}
	
	
	
	
	public void calculate(Double a , Double b ,Double c)
	{
		double root1, root2 ;
		double delta =b*b + 4* a *c;
		if(delta >0)
		{
		    root1=(-b + Math.sqrt(delta))/2*a;
		    root2=(-b - Math.sqrt(delta))/2*a;
		    System.out.printf("Two roots of Equation " +a+"x*x+"+b+"x+"+c+"is %f  %f:",root1,root2);
		}
		if(delta==0)
		{
		    root1=-b/2*a;
		    root2=root1;
		    System.out.printf("Two roots of Equation " +a+"x*x+"+b+"x+"+c+"is %f  %f :",root1,root2);
		}
		if(delta<0)
		{
		    double realpart=-b/2*a;
		    double imagpart=Math.sqrt(delta)/2*a;
		    root1=realpart+imagpart;
		    root2=realpart-imagpart;
		    System.out.printf("Two roots of Equation " +a+"x*x+"+b+"x+"+c+"is %f  %f :",root1,root2);
		}
	}
	
	
	
	public double Euclidean(double x, double y ) 
	{
		 double result;
		 result=Math.sqrt(x*x+y*y);
		 return result;
	}
	
	
	
	public float random(int  max , int min ) 
	{
		 int range = max;
		 float randnum= (float)(Math.random() * range) + min; 
		 
		 return randnum;
	}
	public double maxnum1(double a, double b) 
	{
		 return Math.max(a, b);
	}
	public double minnum(double a, double b) 
	{
		 return Math.min(a, b);
	}
	
	
	
	public static double WindChill(int t, int v)
	{
			double x= Math.pow(v, 0.16);
			double w=35.74+(0.6215*t)+(0.4275*t-35.75)*x;
			return w;
			
	}
	
	
	public boolean validateDate(int month,int day, int year)
	{
		if (year<1582)
			return false;
		if(month<1 || month>12)
			return false ;
		if(day<1 || day>31)
			return false;
		boolean leapyear=Utility.LeapYear(year);
		if(month==2) 
			if(leapyear) {
				if(day<1 || day > 29)
					return false;
		}
		else 
		{
			if(day<1 || day >28)
					return false;
		}
		if(month==4 || month ==6 || month ==9 || month ==11)
			if(day<1 || day>30)
				return false; 
		return true;
	}	
	
	//Function for Calculate Temperature Conversion
	public void celsiusToFahrenheit(int celsius) 
	{
		int f= (celsius * 9/5) + 32 ;
		System.out.println("The fahrenheit degree is: "+f+" for celcius degree:  "+celsius);
	}

	public void fahrenheittocelsius(int fehrenheit)
	{
		 int c=(fehrenheit - 32) * 5/9;
		 System.out.println("the celsius degree is "+c+" for fehrenheit degree "+fehrenheit);
	}
	
	//Function for CarLoan
	public double LoanCalculator(int principalLoanAmount, int year, double roi) 
	{
		double payment, r;
		int n;
		n = 12 * year;
		r = (roi / (12 * 100));

		payment = (principalLoanAmount * r) / (1 - Math.pow(1 + r, -n));
		return payment;
	}
	
	
	//Function for Reversed String 
	public String reversed(String str) {
		String rev=" ";
		for(int i=str.length();i>0;--i)
		{
			rev=rev+(str.charAt(i-1));
		}
		return rev;
	}
	
	
	//Logic for Print Pattern
	
	public void printKPattern() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 13; j++) {
				if (i == 1) {
					if (j > 2 && j <= 10)
						System.out.print(" ");
					else
						System.out.print("*");

				}
				if (i == 2) {
					if (j > 2 && j <= 8)
						System.out.print(" ");
					else if (j > 11)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 3) {
					if (j > 2 && j <= 6)
						System.out.print(" ");
					else if (j > 6 && j <= 9)
						System.out.print("*");
					else if (j > 9)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 4) {
					if (j > 2 && j <= 4)
						System.out.print(" ");
					else if (j > 4 && j <= 7)
						System.out.print("*");
					else if (j > 7)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 5) {
					if (j > 5 && j <= 13)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 6) {
					if (j > 2 && j <= 4)
						System.out.print(" ");
					else if (j > 4 && j <= 7)
						System.out.print("*");
					else if (j > 7)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 7) {
					if (j > 2 && j <= 6)
						System.out.print(" ");
					else if (j > 6 && j <= 9)
						System.out.print("*");
					else if (j > 9)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 8) {
					if (j > 2 && j <= 8)
						System.out.print(" ");
					else if (j > 9 && j <= 11)
						System.out.print("*");
					else if (j > 11)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 9) {
					if (j > 2 && j <= 10)
						System.out.print(" ");
					else
						System.out.print("*");
				}

			}
			System.out.println();
		}

	}

	public void printDPattern() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 15; j++) {
				switch (i) {
				case 1:
					if (j > 10 && j <= 15)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 2:
					if (j > 2 && j <= 10)
						System.out.print(" ");
					else if (j > 10 && j <= 12)
						System.out.print("*");
					else if (j > 12)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 3:
					if (j > 2 && j <= 11)
						System.out.print(" ");
					else if (j > 11 && j <= 13)
						System.out.print("*");
					else if (j > 13)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 4:
					if (j > 2 && j <= 12)
						System.out.print(" ");
					else if (j > 12 && j <= 15)
						System.out.print("*");
					else
						System.out.print("*");
					break;
				case 5:
					if (j > 2 && j <= 12)
						System.out.print(" ");
					else if (j > 12 && j <= 15)
						System.out.print("*");
					else
						System.out.print("*");
					break;
				case 6:
					if (j > 2 && j <= 12)
						System.out.print(" ");
					else if (j > 12 && j <= 15)
						System.out.print("*");
					else
						System.out.print("*");
					break;
				case 7:
					if (j > 2 && j <= 11)
						System.out.print(" ");
					else if (j > 11 && j <= 13)
						System.out.print("*");
					else if (j > 13)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 8:
					if (j > 2 && j <= 10)
						System.out.print(" ");
					else if (j > 10 && j <= 12)
						System.out.print("*");
					else if (j > 12)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 9:
					if (j > 10 && j <= 15)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				}
			}
			System.out.println();
		}

	}

	public void printWPattern() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 32; j++) {
				switch (i) {
				case 1:
					if (j > 2 && j <= 15)
						System.out.print(" ");
					else if (j == 16)
						System.out.print("*");
					else if (j > 16 && j <= 29)
						System.out.print(" ");
					else if (j > 29 && j <= 31)
						System.out.print("*");
					else if (j == 32)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 2:
					if (j == 1)
						System.out.print(" ");
					else if (j > 1 && j <= 3)
						System.out.print("*");
					else if (j > 3 && j <= 14)
						System.out.print(" ");
					else if (j > 14 && j <= 17)
						System.out.print("*");
					else if (j > 17 && j <= 28)
						System.out.print(" ");
					else if (j > 28 && j <= 30)
						System.out.print("*");
					else if (j > 30)
						System.out.print(" ");
					else
						System.out.print("*");

					break;
				case 3:
					if (j <= 2)
						System.out.print(" ");
					else if (j > 2 && j <= 4)
						System.out.print("*");
					else if (j > 4 && j <= 13)
						System.out.print(" ");
					else if (j > 13 && j <= 15)
						System.out.print("*");
					else if (j == 16)
						System.out.print(" ");
					else if (j > 16 && j <= 18)
						System.out.print("*");
					else if (j > 18 && j <= 27)
						System.out.print(" ");
					else if (j > 27 && j <= 29)
						System.out.print("*");
					else if (j > 29)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 4:
					if (j <= 3)
						System.out.print(" ");
					else if (j > 3 && j <= 5)
						System.out.print("*");
					else if (j > 5 && j <= 12)
						System.out.print(" ");
					else if (j > 12 && j <= 14)
						System.out.print("*");
					else if (j > 14 && j <= 17)
						System.out.print(" ");
					else if (j > 17 && j <= 19)
						System.out.print("*");
					else if (j > 19 && j <= 26)
						System.out.print(" ");
					else if (j > 26 && j <= 28)
						System.out.print("*");
					else if (j > 28)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 5:
					if (j <= 4)
						System.out.print(" ");
					else if (j > 4 && j <= 6)
						System.out.print("*");
					else if (j > 6 && j <= 11)
						System.out.print(" ");
					else if (j > 11 && j <= 13)
						System.out.print("*");
					else if (j > 13 && j <= 18)
						System.out.print(" ");
					else if (j > 18 && j <= 20)
						System.out.print("*");
					else if (j > 20 && j <= 25)
						System.out.print(" ");
					else if (j > 25 && j <= 27)
						System.out.print("*");
					else if (j > 27)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 6:
					if (j <= 5)
						System.out.print(" ");
					else if (j > 5 && j <= 7)
						System.out.print("*");
					else if (j > 7 && j <= 10)
						System.out.print(" ");
					else if (j > 10 && j <= 12)
						System.out.print("*");
					else if (j > 12 && j <= 19)
						System.out.print(" ");
					else if (j > 19 && j <= 21)
						System.out.print("*");
					else if (j > 21 && j <= 24)
						System.out.print(" ");
					else if (j > 24 && j <= 26)
						System.out.print("*");
					else if (j > 26)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 7:
					if (j <= 6)
						System.out.print(" ");
					else if (j > 6 && j <= 8)
						System.out.print("*");
					else if (j > 8 && j <= 9)
						System.out.print(" ");
					else if (j > 9 && j <= 11)
						System.out.print("*");
					else if (j > 11 && j <= 20)
						System.out.print(" ");
					else if (j > 20 && j <= 22)
						System.out.print("*");
					else if (j > 22 && j <= 23)
						System.out.print(" ");
					else if (j > 23 && j <= 25)
						System.out.print("*");
					else if (j > 25)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 8:
					if (j <= 7)
						System.out.print(" ");
					else if (j > 7 && j <= 10)
						System.out.print("*");
					else if (j > 10 && j <= 21)
						System.out.print(" ");
					else if (j > 21 && j <= 24)
						System.out.print("*");
					else if (j > 24)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 9:
					if (j <= 8)
						System.out.print(" ");
					else if (j == 9)
						System.out.print("*");
					else if (j > 9 && j <= 22)
						System.out.print(" ");
					else if (j == 23)
						System.out.print("*");
					else if (j > 23)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				}
			}
			System.out.println();
		}

	}

	
}	
	
	
	
	


	
		
		
		
	
		
		
	

