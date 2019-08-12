package com.bridgelabz.utility;

public class ConditionalUtility
{

	public int powerOfTwo(int n, int powerOfTwo) {
		int result;
		result=(int) Math.pow(n, powerOfTwo);
		return result;
	}

	public static boolean primeNum(int number) 
	{
		int temp=number;
		for(int i=2;i<temp/2;i++) 
		{
			if(temp%i==0)
			{
				return false;
			}			
		}
		return true;		
	}

	public void gamling(int stake, int goal, int day) 
	{
		int win=0;
		 int trails=0;
		 for(int i=0;i<day;i++) {
			 int money=stake;
			 while(money>0 && money<goal) {
				 if(Math.random()>0.5) {
					 money++;
					 trails++;
				 }else {
				 		money--;
				 		trails++;
				 	}
			 }
			 if(money==goal)
				 win++;	
		 }
		 System.out.println("Number of times won: "+win);
		 System.out.println("Percentage of win: "+win*100/day);
		 System.out.println("Average no of bets made: "+trails/day);
	}
}
	

