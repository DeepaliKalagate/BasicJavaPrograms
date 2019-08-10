package com.bridgelabz.functional;

import java.util.Scanner;

public class Trig {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	    System.out.println("Please enter the degree : ");
	    double degree=scanner.nextInt();
	    double radians = Math.toRadians(degree);
	    System.out.println("radian = "+radians);
	    double sinValue = Math.sin(radians); 
	    System.out.println("sin(" + degree + ") = " + sinValue);
	    double cosValue = Math.cos(radians);
	    System.out.println("cos(" + degree + ") = " + cosValue);
	    double tanValue = Math.tan(radians);
	    System.out.println("tan(" +degree+  ") = " + tanValue);
	    double secValue = 1/cosValue;
	    System.out.println("sec(" + degree + ") = " + secValue);
	    double cosecValue=1/sinValue;
	    System.out.println("cosec(" + degree + ") = " + cosecValue);
	    double cotValue=1/tanValue;
	    System.out.println("cot(" + degree + ") = " + cotValue);
	    scanner.close();
	}

}


