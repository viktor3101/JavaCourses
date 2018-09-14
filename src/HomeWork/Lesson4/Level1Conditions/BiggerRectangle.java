package HomeWork.Lesson4.Level1Conditions;

import java.util.Scanner;

public class BiggerRectangle {
    public static int bigger(int a1, int b1, int a2, int b2) {
        if (a1 < 0 || a2 < 0 || b1 < 0 || b2 < 0) {
            return 0;
        } else {
            int a = a1 * b1;
            int b = a2 * b2;
            if (a > b) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input w1 h1 w2 h2");
        int width1 = sc.nextInt();
        int length1 = sc.nextInt();
        int width2 = sc.nextInt();
        int length2 = sc.nextInt();
        System.out.println(bigger(width1, length1, width2, length2));
    }
}
/**
 * input w1 h1 w2 h2
 * 10 20 40 30
 * 2
 *
 * input w1 h1 w2 h2
 * 10 -20 40 30
 * 0
 **/