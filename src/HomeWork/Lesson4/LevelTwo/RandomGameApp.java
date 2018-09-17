package HomeWork.Lesson4.LevelTwo;

import java.util.Scanner;
import java.util.Random;

public class RandomGameApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input range of numbers min and max:  ");
        int min = sc.nextInt();
        int max = sc.nextInt();
        int randomNumber = new Random().nextInt(max - min) + min;
        int gamersNumber;
        int i = 0;

        do {
            System.out.println("Input ur number: ");
            gamersNumber = sc.nextInt();
            i++;
            if (randomNumber == gamersNumber) {
                System.out.println("You WIN!! ");
                break;
            } else {
                if (i != 5) {
                    System.out.println("Try again!");
                }
            }
        } while (i != 5);

        if (i == 5) {
            System.out.println("You lose");

        }
    }
}
