/******************************************************************************
 *  
 *  
 *  Purpose: Calculate Number of times won, Percent Win and Avg number of bets made. 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.ConditionalUtility;

public class GamlingSimulator {

	public static void main(String[] args) 
	{
		ConditionalUtility conditionalUtility=new ConditionalUtility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter stake number which you want :");
		int stake=scanner.nextInt();
		System.out.println("Enter goal number : ");
		int goal=scanner.nextInt();
		System.out.println("Enter number of Tries do you want to play: ");
		int tries=scanner.nextInt();
		conditionalUtility.gamling(stake,goal,tries);
		scanner.close();
	}

}
