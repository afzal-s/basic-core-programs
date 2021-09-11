package com.basiccoreprograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		int num = 1;
        System.out.print("Enter a number to print table power of 2: ");
        Scanner scan = new Scanner(System.in);
        Long inpNum = scan.nextLong();
        scan.close();
        
        for (int i = 1; i<=inpNum; i++) {
            num = num * 2;
            System.out.println("2 ^ " + i + " = " + num);
        }
	}

}