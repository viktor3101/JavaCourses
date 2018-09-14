package HWLevelZero.PartOne;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n:");
        int n = sc.nextInt();
        if (n > 100 && n < 200) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }

    }
}
