package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.ConditionalUtility;
import com.bridgelabz.utility.Utility;

public class RollDie {

	public static void main(String[] args) {
		ConditionalUtility conditionalUtility=new ConditionalUtility();
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		int max=6;
		int min=1;
		System.out.println("Enter number of time roll die you want : ");
		int n=scanner.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=(int)utility.random(max, min);
		}
		conditionalUtility.SuggestNum(a,n);
		scanner.close();

	}

}
