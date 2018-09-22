package day4.practice;

import java.util.Arrays;

public class PositiveElements {

    public static int countOfPositive(int[] array) {
        int count = 0;
        for (int elem : array) {
            if (elem > 0) count++;
        }
        return count;
    }

    public static int[] findPositiveElems(int[] array) {
        int[] newArray = new int[countOfPositive(array)];
        int i = 0;
        for (int element : array) {
            if (element > 0) {
                newArray[i] = element;
                i++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPositiveElems(new int[]{10, -2, 20, 0,-15}))); // [10, 20]
        System.out.println(Arrays.toString(findPositiveElems(new int[]{-2, 0}))); // []
        System.out.println(Arrays.toString(findPositiveElems(new int[]{}))); // []
        System.out.println(Arrays.toString(findPositiveElems(new int[]{10, 20}))); // [10, 20]

    }
}
