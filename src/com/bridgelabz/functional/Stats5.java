/******************************************************************************
		 *  
		 *  
		 *  Purpose: Print five uniform random values between 0 and 1, their average value, and their minimum and maximum value.
		 *
		 *  @author  BridgeLabz
		 *  @version 1.0
		 *  @since   09-08-2019
		 *
		 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Stats5
{
		static double temp2;
		public static void main(String[] args) 
		{
			 Utility utility= new Utility();
	    	 int  max = 1;
	         int min = 0; 
	         double sum=0;
	    	 double[] array=new double[5];
	    	 for(int i=0; i<5 ;i++) 
	    	 {
	    		array[i]=utility.random(max, min);
	    		  System.out.println(array[i]);
	    		  sum=sum + array[i];
	    	 }
	    	 double avg=sum/5;
	    	 System.out.println("avg"+avg);
	    	
	    	 temp2= utility.maxnum1(array[0], array[1]);
	    	 for(int i=2;i<5;i++) 
	    	 {
	    		 temp2=utility.maxnum1(array[i], temp2); 
	    	 }
			System.out.println("max"+temp2);
			
			 double temp1= utility.minnum(array[0], array[1]);
	    	 for(int i=2;i<5;i++) 
	    	 {
	    		 temp1=utility.minnum(array[i],temp1); 
	    	 }
			System.out.println("min"+temp1);
		}

}


