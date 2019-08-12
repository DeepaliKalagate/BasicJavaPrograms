/******************************************************************************
 *  
 *  
 *  Purpose: Print given string in reverse order. 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class RevString {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String to reverse: ");
		String str=scanner.nextLine();
		String s="";
		String rev=utility.reversed(str);
		System.out.println("Reverserd String is :"+rev);
		

	}

}
