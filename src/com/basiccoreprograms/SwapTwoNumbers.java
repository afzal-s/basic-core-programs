package com.basiccoreprograms;

import java.util.*;

public class SwapTwoNumbers {  
    
	public static void main(String[] args) {  
       int num1, num2, temp;
       Scanner scan = new Scanner(System.in);  
       System.out.print("Enter value of first number: ");  
       num1 = scan.nextInt();  
       System.out.print("Enter value of second number: ");  
       num2 = scan.nextInt();  
       scan.close();
       
       System.out.println("Before swapping two numbers: " + num1 + " " + num2);   

       temp = num1;  
       num1 = num2;  
       num2 = temp;   
       System.out.println("After swapping: "+ num1 + " " + num2);  
       System.out.println( );  
    }    
}  