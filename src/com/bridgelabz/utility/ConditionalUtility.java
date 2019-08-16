package com.bridgelabz.utility;

import java.util.Scanner;

public class ConditionalUtility
{
//Method for Calculating Power of 2
	public int powerOfTwo(int n, int powerOfTwo) {
		int result;
		result=(int) Math.pow(n, powerOfTwo);
		return result;
	}

	//Method for calculating Prime numbers from given range
	public static boolean primeNum(int number) 
	{
		int temp=number;
		for(int i=2;i<temp/1;i++) 
		{
			if(temp%i==0)
			{
				return false;
			}			
		}
		return true;		
	}
	
//Method for gamlingSimulator Program
	public void gamling(int stake, int goal, int tries) 
	{
		int win=0;
		 int trails=0;
		 for(int i=0;i<tries;i++) 
		 {
			 int money=stake;
			 while(money>0 && money<goal)
			 {
				 if(Math.random()>0.5) 
				 {
					 money++;
					 trails++;
				 }
				 else 
				 {
				 		money--;
				 		trails++;
				 	}
			 }
			 if(money==goal)
				 win++;	
		 }
		 System.out.println("Number of times won: "+win);
		 System.out.println("Percentage of win: "+win*100/tries);
		 System.out.println("Average no of bets made: "+trails/tries);
	}
	
	//Method for Calculating Square root
	public double sqrtNewton(int c) 
	{
		double t,epsilon;
		t=c;
		t=(c/t+c)/2;
		epsilon=1*(Math.pow(10, -15));
		epsilon=1e-15;
		while(Math.abs(t -c/t) > epsilon*t) 
		{
			t=(c/t+t)/2.0;
			System.out.println(t);
		}
		return t;
	}

	////Method for Converting Number from Binary to Decimal 
	public int binaryToDecimal(int n) 
    { 
        int num = n; 
        int dec = 0; 
        int base = 1; 
        int temp = num; 
        while (temp > 0) 
        { 
            int last = temp % 10; 
            temp = temp / 10; 
  
            dec += last * base; 
  
            base = base * 2; 
        } 
  
        return dec; 
    }
	
	//Method for Converting Number from Decimal to Binary 
	public static int decToBinary(int n) 
    {  
		int num=n;
        int[] binaryNum = new int[1000]; 
        int i = 0; 
        while (n > 0)  
        { 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        }
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]);
		return num; 
    }	

	//Method for Swapping two Nibbles
	
		public int SwapNibbles(int y)
		{		
			int  x = (((y & 0x0F) << 4) |((y & 0xF0) >> 4));	
			return  x; 
			 
		}

		public int calculateFactorial(int n) 
		{
			int fact=1;
			for( int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			return fact;
		}

		public int checkNumber(int [] array)
		{
			int i,j;
			for(i=0;i<array.length-1;i++)
			{
				for(j=i+1;j<array.length;j++)
				{
					if(array[i]==array[j])
					{
						System.out.println(array[i]+" is Repeated element in array ");
						break;
					}
				}
			}
			return array[i];
		}

		
		//Method for ROll Die Program
		public void SuggestNum(int[] a, int n)
		{
			int one=0,two=0,three=0,four=0,five=0,six=0;
			for(int i=0;i<n;i++)
				switch(a[i]) 
				{
					case 1: one++;
						break;
					case 2: two++;
						break;
					case 3: three++;
						break;
					case 4 :four++;
						break;
					case 5: five++;
						break;
					case 6 :six++;
						break;
				}
				if(one>=two&&one>=three&&one>=four&&one>=five&&one>=six) 
					System.out.println("Dice 1 fall maximum times count is : "+one);
				else if(two>=one&&two>=three&&two>=four&&two>=five&&two>=six) 
					System.out.println("Dice 2 fall maximum times count is : "+two);
				else if(three>=one&&three>=two&&three>=four&&three>=five&&three>=six) 
					System.out.println("Dice 3 fall maximum times count is : "+three);
				else if(four>=one&&four>=two&&four>=three&&four>=five&&four>=six) 
					System.out.println("Dice 4 fall maximum times count is : "+four);
				else if(five>=one&&five>=two&&five>=three&&five>=four&&five>=six) 
					System.out.println("Dice 5 fall maximum times count is : "+five);
				else 
				System.out.println("Dice 6 fall maximum times count is : "+six);
		}

		//Method for Sin Program
		public double CalculateAngleX(int x) 
		{
			return x%(2*180);
		}

		public void PrintSinXSeries(double angleX, int noOddSeries) 
		{
			int count=1;

			System.out.print("Sin("+angleX+") = ");
			System.out.print(angleX +" - ");
			for(int i=3;i<=noOddSeries;) 
			{
				if(count%2!=0) 
				{
					System.out.print(Math.pow(angleX, i)+" / "+calculateFactorial(i));
					if(i!=noOddSeries) 
					{
						System.out.print(" + ");
					}
					
					count++;
					
				}else 
				{
					System.out.print(Math.pow(angleX, i)+" / "+calculateFactorial(i));
					if(i!=noOddSeries) 
					{
						System.out.print(" - ");	
					}
					count++;
				}
				i=i+2;
				
			}
			
		}
}
	

