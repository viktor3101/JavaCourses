package HomeWork.Lesson3;

import java.util.Scanner;

public class SimpleAboutMeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur name: ");
        String name = sc.next();
        System.out.print("enter ur surname: ");
        String surname = sc.next();
        System.out.print("enter ur age: ");
        int age = sc.nextInt();

        System.out.println("I’m " + name + " " + surname + ", " + age + " years old");


    }
}
