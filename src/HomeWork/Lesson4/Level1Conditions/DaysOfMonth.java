package HomeWork.Lesson4.Level1Conditions;

import java.util.Scanner;

public class DaysOfMonth {
    public static int count(int n) {
        switch (n) {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number if month");
        int n = sc.nextInt();
        if (n < 0 || n > 12) {
            System.out.println("ERROR!!!");
        } else {
            System.out.println(count(n));
        }

    }
}
/**
 * input number if month
 * 4
 * 30
 *
 * input number if month
 * 2
 * 28
 *
 * input number if month
 * 20
 * ERROR!!!
 **/