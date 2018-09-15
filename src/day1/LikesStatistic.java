package com.lesson1;

import java.util.Scanner;

public class LikesStatistic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input count of likes: ");
        long likesCount = sc.nextLong();
        System.out.print("input reg year: ");
        int registrationYear = sc.nextInt();
        double likesPerYear = likesCount / (2018 - registrationYear);
        System.out.println(likesPerYear + " likes / year");
    }
}
