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

	
}
	

