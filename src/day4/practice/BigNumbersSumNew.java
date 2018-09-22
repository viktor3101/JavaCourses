package day4.practice;

import java.util.Scanner;

public class BigNumbersSumNew {
    public static int maxSize(String strOne, String strTwo) {
        return Math.max(strOne.length(), strTwo.length());
    }

    public static int[] bigSum(String strOne, String strTwo) {
        int max = maxSize(strOne, strTwo);

        char charOne[] = strOne.toCharArray();//transform Strings to char array
        char charTwo[] = strTwo.toCharArray();

        int intOne[] = new int[max];//int arrays
        int intTwo[] = new int[max];

        for (int i = 0; i < charOne.length; i++) {//int arrays
            intOne[max - i - 1 - (max - charOne.length)] = Character.getNumericValue(charOne[i]);
        }
        for (int i = 0; i < charTwo.length; i++) {
            intTwo[max - i - 1 - (max - charTwo.length)] = Character.getNumericValue(charTwo[i]);
        }

        int array[] = new int[max];
        for (int i = 0; i < max; i++) {
            if (intOne[i] + intTwo[i] < 10) {
                array[i] = intOne[i] + intTwo[i];
            } else {
                if (i != max - 1) {
                    array[i] = (intOne[i] + intTwo[i]) % 10;
                    intOne[i + 1]++;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String stringOne = "100";//input Strings
        String stringTwo = "2";

        for (int i = bigSum(stringOne, stringTwo).length - 1; i >= 0; i--) {
            System.out.print(bigSum(stringOne, stringTwo)[i]);
        }
    }
}
