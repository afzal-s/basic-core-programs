package com.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		System.out.print("Enter the Nth number of Harmonic: ");
        Scanner scan = new Scanner(System.in);
        int harmonics = scan.nextInt();
        scan.close();
        
        double sum = 0.0;
        
        for (int count = 1; count <= harmonics; count++) {
            System.out.print("1/" + count + " + ");
            sum += 1.0 / count;
        }
        
        System.out.println("The Nth Harmonic Value: " + sum);
	}

}
