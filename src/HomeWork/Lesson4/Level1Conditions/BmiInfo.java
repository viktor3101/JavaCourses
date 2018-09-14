package HomeWork.Lesson4.Level1Conditions;

import java.util.Scanner;

public class BmiInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bmi = 0;
        System.out.println("Input ur weight height:");
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        if (h != 0) {
            bmi = w / Math.pow(h, 2);
            if (bmi <= 0 && h < 0 || bmi <= 0 || h < 0) {
                System.out.println("ERROR!!");
            } else {
                if (bmi <= 18.5) {
                    System.out.println("Underweight");
                }
                if (bmi >= 25.0) {
                    System.out.println("Overweight");
                } else {
                    System.out.println("Normal");
                }
            }
        }
    }
}
/**
 * Input ur weight height:
 * 70
 * 1.75
 * Normal
 *
 * Input ur weight height:
 * -70 1.75
 * ERROR!!
 *
 * Input ur weight height:
 * 70 -1.75
 * ERROR!!
 **/