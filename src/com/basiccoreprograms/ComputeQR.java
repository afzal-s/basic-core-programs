package com.basiccoreprograms;

import java.util.Scanner;

public class ComputeQR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of the Divisor: ");
        int divisor = scan.nextInt();
        System.out.print("Enter the value of the Dividend: ");
        int divident = scan.nextInt();
        scan.close();

        int quotient = divident / divisor;
        int remainder = divident % divisor;

        System.out.println("Quotient value:" + quotient);
        System.out.println("Remainder value:" + remainder);
	}

}
