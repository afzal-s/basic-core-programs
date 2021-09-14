package com.basiccoreprograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		System.out.print("Enter Number #1: ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();

		System.out.print("Enter Number #2: ");
		Scanner scan2 = new Scanner(System.in);
		int num2 = scan2.nextInt();

		System.out.print("Enter Number #3: ");
		Scanner scan3 = new Scanner(System.in);
		int num3 = scan3.nextInt();

		scan.close();
		scan2.close();
		scan3.close();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " Is The Largest Number Among " + num2 + ", " + num3);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " Is The Largest Number Among " + num1 + ", " + num3);
		} else {
			System.out.println(num3 + " Is The Largest Number Among " + num1 + ", " + num2);
		}
	}
}