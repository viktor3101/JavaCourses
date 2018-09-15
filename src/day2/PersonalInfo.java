package day2;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        System.out.println("Hello, i'm " + name + ", " + age + " years old");


        sc.close();
    }
}
