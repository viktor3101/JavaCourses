package day3.practice;

import java.util.Scanner;

public class PetyaTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input count of cakes: ");
        int count = sc.nextInt();
        System.out.println("I have " + count + " cakes");
        for (int i = 0; i < count; i++) {
            System.out.println("I have eaten a cake. " + (count - 1 - i) + " have left ");
        }
    }
}
