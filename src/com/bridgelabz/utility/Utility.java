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
	
	
	public double LoanCalculator(int principalLoanAmount, int year, double roi) 
	{
		double payment, r;
		int n;
		n = 12 * year;
		r = (roi / (12 * 100));

		payment = (principalLoanAmount * r) / (1 - Math.pow(1 + r, -n));
		return payment;
	}
	public String reversed(String str) {
		String rev=" ";
		for(int i=str.length();i>0;--i)
		{
			rev=rev+(str.charAt(i-1));
		}
		return rev;
	}
}	
	
	
	
	


	
		
		
		
	
		
		
	

