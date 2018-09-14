package HWLevelZero.PartOne;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("+" + 1);
        }
        if (a < b) {
            System.out.println(-1);
        }
        if (a == b) {
            System.out.println(0);
        }
    }
}
