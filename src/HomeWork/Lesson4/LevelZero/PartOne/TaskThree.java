package HomeWork.Lesson4.LevelZero.PartOne;

import java.util.Scanner;

public class TaskThree {
    public static int minimalFromTwo(int a, int b) {
        return Math.min(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a b c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = minimalFromTwo(a, b);
        System.out.println(minimalFromTwo(m, c));
    }
}
