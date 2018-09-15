package HomeWork.Lesson4.LevelZero.PartOne;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input day: ");
        int day = sc.nextInt();
        if (day >= 1 && day <= 5) {
            System.out.println("Weekday");
        }
        if (day > 7) {
            System.out.println("Invalid data");
        } else {
            System.out.println("Weekend");
        }
    }
}
