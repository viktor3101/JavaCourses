package HomeWork.Lesson4.LevelTwo;

import java.util.Scanner;

public class SubstringsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input ur string: ");
        String s = sc.nextLine();
        System.out.print("Now input subString: ");
        String subStr = sc.nextLine();
        int counter = 0;
        for (int i = 0; i <= s.length() - subStr.length(); i++) {
            if (subStr.equals(s.substring(i, i + subStr.length()))) {
                counter++;
            }
        }


        System.out.println(counter);
    }
}
