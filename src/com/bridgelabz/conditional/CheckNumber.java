package com.bridgelabz.conditional;

import com.bridgelabz.utility.ConditionalUtility;

public class CheckNumber 
{
	public static void main(String[] args) 
	{
		ConditionalUtility conditionalUtility=new ConditionalUtility();
		int array[] = new int[101];
		   
	    for (int i = 0; i <= 100; i++)
	    {
	        array[i] = i;
	    }
	   
	    array[8] = 3;
	    array[90] = 3;
		conditionalUtility.checkNumber(array);
	}
}
