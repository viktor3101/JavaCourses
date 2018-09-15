package day3.practice;

import java.util.Scanner;

public class TrianglePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = sc.nextInt();
        for (int i = size; i > 0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
