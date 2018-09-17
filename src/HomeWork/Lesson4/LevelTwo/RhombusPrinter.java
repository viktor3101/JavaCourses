package HomeWork.Lesson4.LevelTwo;

import java.util.Scanner;

public class RhombusPrinter {
    public static void main(String[] args) {
        System.out.println("input count: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        char[][] array = new char[size][size];
        int minSize = size / 2;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j + minSize || i == j - minSize || j == size - i - 1 - minSize || j == size - i - 1 + minSize) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = '.';
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
