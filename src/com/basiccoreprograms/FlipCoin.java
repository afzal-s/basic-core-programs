package com.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int headCount = 0, tailCount = 0;
        double perHead = 0, perTail = 0;

        Scanner scan = new Scanner(System.in);        
        System.out.print("How Many Number Of Times To Flip Coin: ");
        int input = scan.nextInt();
        scan.close();
        
        Random random = new Random();

        for (int i = 1; i <= input; i++) {
            int ran = random.nextInt(2);
            if (ran == 0) {
                System.out.println(i + ": Head");
                headCount += 1;

            } else {
                System.out.println(i + ": Tail");
                tailCount += 1;
            }
        }
        
        perHead = (float) headCount / input * 100;
        perTail = (float) tailCount / input * 100;
        System.out.println("Total head: " + headCount);
        System.out.println("Total Tail: " + tailCount);
        System.out.println("Percentage of head: " + perHead + "%");
        System.out.println("Percentage of tail: " + perTail + "%");
    }
} 