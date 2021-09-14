package com.basiccoreprograms;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number To Check Even Or Odd: ");
		int num = scan.nextInt();
		scan.close();

		if (num % 2 == 0) {
			System.out.println(num + " Number Is An Even number");
		} else {
			System.out.println(num + " Number Is An Odd Number");
		}
	}
}