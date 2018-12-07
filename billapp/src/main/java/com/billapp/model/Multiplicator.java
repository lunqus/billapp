package com.billapp.model;

import java.util.Scanner;

public class Multiplicator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num1 = in.nextInt();

        for (int i=0; i< 10; i++){
            System.out.println(num1 + " x " + (i+1) + " = " +
                    (num1 * (i+1)));
        }


        System.out.println();
        System.out.println();
        System.out.println( ( (4 & 1) | ( 2 ^ 3 ) ) );
        System.out.println(4 & 1);
        System.out.println(2 ^ 3);
        System.out.println(15 | 18);
    }
}
