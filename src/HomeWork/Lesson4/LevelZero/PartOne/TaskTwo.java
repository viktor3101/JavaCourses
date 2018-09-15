package HomeWork.Lesson4.LevelZero.PartOne;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.min(a, b));
    }
}
