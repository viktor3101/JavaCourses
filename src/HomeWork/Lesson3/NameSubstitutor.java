package HomeWork.Lesson3;

import java.util.Scanner;

public class NameSubstitutor {
    public static void main(String[] args) {
        System.out.print("Input name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        String string = "Hi, my name is " + name;
        System.out.println(string);

    }
}
