package day3.practice;

import java.util.Scanner;

public class BigNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringOne = sc.next();//input Strings
        String stringTwo = sc.next();
        int maxSize = Math.max(stringOne.length(), stringTwo.length());//detecting max String

        char charOne[] = stringOne.toCharArray();//transform Strings to char array
        char charTwo[] = stringTwo.toCharArray();

        int intOne[] = new int[maxSize];//int arrays
        int intTwo[] = new int[maxSize];

        for (int i = 0; i < maxSize; i++) { //full zero
            intOne[i] = 0;
            intTwo[i] = 0;
        }

        for (int i = 0; i < charOne.length; i++) {//int arrays
            intOne[maxSize - i - 1 - (maxSize - charOne.length)] = Character.getNumericValue(charOne[i]);
        }
        for (int i = 0; i < charTwo.length; i++) {
            intTwo[maxSize - i - 1 - (maxSize - charTwo.length)] = Character.getNumericValue(charTwo[i]);
        }

        int array[] = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            if (intOne[i] + intTwo[i] < 10) {
                array[i] = intOne[i] + intTwo[i];
            } else {
                if (i != maxSize - 1) {
                    array[i] = (intOne[i] + intTwo[i]) % 10;
                    intOne[i + 1]++;
                }
            }
        }
        for (int i = maxSize - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
