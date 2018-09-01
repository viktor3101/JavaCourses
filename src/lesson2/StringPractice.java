package com.lesson2;

public class StringPractice {
    
    public static void main(String[] args) {
        String s = "Hello,Java";
        System.out.println(s.toUpperCase());
        int i = s.indexOf("Java");
        System.out.println("place of \"Java\"  " + (i + 1));
        System.out.println(s.startsWith("Hello"));
    }
}
