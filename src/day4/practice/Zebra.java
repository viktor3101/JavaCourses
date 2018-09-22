package day4.practice;

import java.util.Arrays;

public class Zebra {
    public static String[] createZebra(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size");
        }
        String[] zebra = new String[size];
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                zebra[i] = "black";
            } else {
                zebra[i] = "white";
            }
        }
        return zebra;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createZebra(5)));
    }
}
