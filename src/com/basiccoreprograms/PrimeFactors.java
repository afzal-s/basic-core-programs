package com.basiccoreprograms;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.print("Enter Number To Find Prime Factors: ");
        Scanner scanner = new Scanner(System.in);
        int prime = scanner.nextInt();
        scanner.close();
        
        if (prime == 1) {
            System.out.println(prime + " is not a Prime Number");
        } else {
            for (int i = 2; i * i <= prime; i++) {
                while (prime % i == 0) {
                    System.out.println(i);
                    prime = prime / i;
                }
            }
            if (prime > 2) {
                System.out.println(prime);
            }
        }
	}

}
