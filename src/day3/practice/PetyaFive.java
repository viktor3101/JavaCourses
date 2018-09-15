package day3.practice;

import java.util.Scanner;

public class PetyaFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input count of cakes and number of people : ");
        int count = sc.nextInt();
        int people = sc.nextInt();

        for (int person = 1; person <= people; person++) {
            System.out.println("I am " + person + " person. I have " + count + " cakes");
            for (int cake = 0; cake < count; cake++) {
                System.out.println("I have eaten " + (cake + 1) + " cakes");
            }
        }
    }
}
