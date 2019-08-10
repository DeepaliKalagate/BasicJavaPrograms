/******************************************************************************
		 *  
		 *  
		 *  Purpose: Print 3 Names in Reverse.
		 *
		 *  @author  BridgeLabz
		 *  @version 1.0
		 *  @since   09-08-2019
		 *
		 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class PrintThreeNames {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First Name : ");
		String first=scanner.nextLine();
		System.out.println("Enter Second Name : ");
		String second=scanner.nextLine();
		System.out.println("Enter Third Name : ");
		String third=scanner.nextLine();
		System.out.println("Hi "+third+","+second+" and "+first);

	}

}
