package com.lesson1;

import java.util.Scanner;

public class BytesConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long totalBytes = sc.nextLong();
        long gigaBytes = totalBytes / 1024 / 1024 / 1024;
        totalBytes = totalBytes - gigaBytes * 1024 * 1024 * 1024;
        long megaBytes = totalBytes / 1024 / 1024;
        totalBytes = totalBytes - megaBytes * 1024 * 1024;
        long kiloBytes = totalBytes / 1024;
        long bytes = totalBytes - kiloBytes * 1024;

        System.out.println(gigaBytes + " GB, " + megaBytes + " MB, "
                + kiloBytes + " KB, " + bytes + " B");

    }
}
