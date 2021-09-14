package com.basiccoreprograms;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		System.out.print("Enter a character :");
		Scanner scan = new Scanner(System.in);
		char alphabet = scan.next().charAt(0);
		scan.close();

		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'
				|| alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
			System.out.println("Given character is an vowel");
		} else {
			System.out.println("Given character is a consonant");
		}
	}
}