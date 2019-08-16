package com.bridgelabz.functional;

import java.util.Scanner;

public class ReverseString 
{

	public static String swap(String str, int i, int j)  
    {  
        StringBuilder sb = new StringBuilder(str);  
        sb.setCharAt(i, str.charAt(j));  
        sb.setCharAt(j, str.charAt(i));  
        return sb.toString();  
    }   
    // reversing the individual words  
    static String reverseWords(String str)  
    {  
        int start = 0;  
        for (int i = 0; i < str.length(); i++)  
        {  
            if (str.charAt(i) == ' ' ||  
                    i == str.length()-1 ) 
            { 
                int end; 
                if (i == str.length()-1) 
                    end = i ; 
                else
                    end = i - 1 ;  
               
                while (start < end) 
                {  
                    str = swap(str,start,end) ; 
                    start++;  
                    end--;  
                }  
                start = i + 1;  
            }  
        }  
      
        return str ;  
}
    public static void main(String[] args) 
	{
    	String str = "";  
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String : ");
        str=scanner.nextLine();
        System.out.println(reverseWords(str));  
	}
	}
