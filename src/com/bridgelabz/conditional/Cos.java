package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.ConditionalUtility;

public class Cos {

	public static void main(String[] args) {
		ConditionalUtility conditionalUtility=new ConditionalUtility();
		Scanner scanner=new Scanner(System.in);
		int x;
		double angleX;
		int noEvenSeries;
		
		System.out.println("Enter angle between 0 to 360");
		x=scanner.nextInt();
		System.out.println("Enter odd number for series");
		noEvenSeries=scanner.nextInt();
		if(noEvenSeries%2==0) {
			if(x>=0&&x<=360) {
				angleX=conditionalUtility.CalculateAngleX(x);
				conditionalUtility.PrintSinXSeries(angleX,noEvenSeries);
			}else
				System.out.println("Please enter valid angle");
			
		}else
			System.out.println("Please enter valid even no.");
		
		scanner.close();

	}

}
