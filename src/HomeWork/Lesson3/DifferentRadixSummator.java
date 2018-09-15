package HomeWork.Lesson3;

import java.util.Scanner;

public class DifferentRadixSummator {
    public static void main(String[] args) {
//        : 1011
//        Enter Y in Oct: 73
//        Enter Z in Hex: ABC
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X in Bin: ");
        int x = Integer.parseInt(sc.next(), 2);
        System.out.print("Enter X in Oct: ");
        int y = Integer.parseInt(sc.next(), 8);
        System.out.print("Enter X in Hex: ");
        int z = Integer.parseInt(sc.next(), 16);
        System.out.println("X + Y + Z = " + (x + z + y));
    }
}
