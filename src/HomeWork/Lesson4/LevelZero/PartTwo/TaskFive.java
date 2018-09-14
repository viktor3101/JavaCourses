package HWLevelZero.PartTwo;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input from to ");
        int from = sc.nextInt();
        int to = sc.nextInt();
        if (from > to) {
            System.out.println("ERROR while inputting!!");
        } else {
            for (int i = from; i <= to; i++) {
                System.out.print(i + "  ");
            }
        }
    }
}
