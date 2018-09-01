package com.lesson1;

import java.util.Scanner;

public class DigitsPrinter {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int[] array = new int[string.length()];//масив для сортування
        int[] array1 = new int[string.length()];//масив для подальшого виведення
        int[] finalArray = new int[5];//фінальний масив
        for (int counter = 0; counter < string.length(); counter++) {
            char c = string.charAt(counter);
            array[counter] = Character.getNumericValue(c);
            array1[counter] = Character.getNumericValue(c);
        }

        if (array.length > 5) {
            //функція яка проходить випадки, коли число має більше розрялів ніж 5
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int a = array[i];
                        array[i] = array[j];
                        array[j] = a;
                    }
                }
            }
            int counter = 0;
            int max = array[4];
            for (int i = 0; i < array.length; i++) {
                if ((array1[i] <= max) && (counter < 5)) {
                    finalArray[counter] = array1[i];
                    counter++;
                }
            }
        } else {
            //функція яка проходить випадки, коли число має менше розрялів ніж 5
            for (int i = 0; i < array1.length; i++) {
                finalArray[i + finalArray.length - array1.length] = array1[i];
            }
        }

        for (int i = 0; i < 5; i++)
            System.out.println(finalArray[i]);
    }
}
