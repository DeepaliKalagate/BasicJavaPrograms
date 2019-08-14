package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Pattern {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string :  ");
		String input=scanner.next();
		input=input.toLowerCase();
		char alphabet=input.charAt(0);
		switch(alphabet)
		{
		case 'k': 
				utility.printKPattern();
		
		case 'd': 
				utility.printDPattern();
		
		case 'w': 
				utility.printWPattern();
				break;
		default:
			System.out.println("Enter Valid String !");
		}
		scanner.close();
	}

}
