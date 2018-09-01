package com.lesson1;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a b");
        a = sc.nextInt();
        b = sc.nextInt();
        int avg = 0;
        if ((a > 0) && (b > 0)) {
            if ((a + b) < 0) {
                avg = (2147483647) + (a + b) / 2 + 1;
            }
        }
        if ((a < 0) && (b < 0)) {
            if ((a + b) > 0) {
                avg = (2147483647) + (a + b) / 2 + 1;
            }
        } else {
            avg = (a + b) / 2;
        }
        System.out.println("avg = " + avg);
    }
}


