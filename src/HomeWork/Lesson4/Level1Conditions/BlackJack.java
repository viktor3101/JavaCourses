package HomeWork.Lesson4.Level1Conditions;

import java.util.Scanner;

public class BlackJack {
    public static int score(int cardA, int cardB) {
        if (cardA > 0 && cardB > 0 && cardA < 22 && cardB < 22) {
            return Math.max(cardA, cardB);
        }
        if (cardA > 21 && cardB > 0 && cardB < 22) {
            return cardB;
        }
        if (cardB > 21 && cardA > 0 && cardA < 22) {
            return cardA;
        }
        if (cardA > 21 && cardB > 21) {
            return 0;
        } else {
            return 1;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value of card A and card B");
        int cardA = sc.nextInt();
        int cardB = sc.nextInt();
        int counter = score(cardA, cardB);
        if (counter == 1) {
            System.out.println("mistake");
        } else {
            System.out.println(counter);
        }
    }
}

/**
 * Input value of card A and card B
 * 19 20
 * 20
 *
 * Input value of card A and card B
 * 22 19
 * 19
 *
 * Input value of card A and card B
 * 22 23
 * 0
 *
 * Input value of card A and card B
 * -19 20
 * mistake
 *
 * Input value of card A and card B
 * 22 -19
 * mistake
 **/