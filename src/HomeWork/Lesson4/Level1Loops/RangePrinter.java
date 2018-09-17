package HomeWork.Lesson4.Level1Loops;

import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        int min;
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println(" input range (min max): ");
        min = sc.nextInt();
        max = sc.nextInt();

        if (min > max) {
            for (int i = min; i >= max; i--) {
                System.out.print(i + "\t");
            }
        } else {
            for (int i = min; i <= max; i++) {
                System.out.print(i + "\t");
            }
        }
    }
}
/**
 * input range (min max):
 * 1 5
 * 1	2	3	4	5
 *
 * input range (min max):
 * 5 1
 * 5	4	3	2	1
 *
 * input range (min max):
 * 1 1
 * 1
 **/