package day3.practice;

import java.util.Scanner;

public class PetyaFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input count of cakes and border cake: ");
        int count = sc.nextInt();
        int borderCake = sc.nextInt();
        System.out.println("I have " + count + " cakes");
        for (int i = 0; i < count; i++) {
            System.out.println("I have eaten " + (i + 1) + " cakes");
            if ((i + 1) > borderCake) {
                System.out.println("I am feeling bad!");
            }
        }
    }
}
