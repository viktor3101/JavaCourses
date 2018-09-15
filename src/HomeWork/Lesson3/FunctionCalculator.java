package HomeWork.Lesson3;

import java.util.Scanner;

import static java.lang.Math.*;

public class FunctionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = sc.nextDouble();
        double f = log(sin(x) + pow(E, x) * sqrt(x) / PI);
        System.out.println(f);

    }
}
