package HomeWork.Lesson4.LevelTwo;

import java.util.Scanner;

public class EquilateralTrianglePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = sc.nextInt();

        while (size < 0) {
            System.out.println("Value is invalid!");
            System.out.print("Input valid value: ");
            size = sc.nextInt();
        }


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
