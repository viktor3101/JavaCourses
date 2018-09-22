package day4.practice;

import java.util.Arrays;

public class Reverse {

    public static void swapElems(int[] array, int i) {
        int temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = temp;

    }

    public static void reverse(int[] array) {
        int halfSize = array.length/2;
        for (int i = 0; i < halfSize; i++) {
            swapElems(array, i);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
