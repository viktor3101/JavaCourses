package HomeWork.Lesson4.Level1Loops;

import java.util.Scanner;

public class EvensRangePrinter {
    public static void main(String[] args) {
        int min;
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println(" input range (min max): ");
        min = sc.nextInt();
        max = sc.nextInt();
        if (min > max) {
        } else {
            for (int i = min; i <= max; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + "\t");
                }
            }
        }
    }
}
/**
 * input range (min max):
 * 9 1
 *     //Nothing
 * input range (min max):
 * 1 9
 * 2	4	6	8
 **/