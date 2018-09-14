package HomeWork.Lesson4.Level1Conditions;

import java.util.Scanner;

public class LuckyTicket {
    public static boolean tick(String s) {
        char s1[] = s.toCharArray();
        int s2[] = new int[6];
        for (int i = 0; i < s.length(); i++) {
            s2[i] = (int) s1[i];
        }
        if (s2[0] + s2[1] + s2[2] == s2[3] + s2[4] + s2[5]) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input ticket: ");
        String s = sc.next();

        if (s.length() > 6) {
            System.out.println("MISTAKE");
        } else {
            System.out.println(tick(s));
        }
    }
}
/**
 * input ticket: 12312343
 * MISTAKE
 *
 * input ticket: 123006
 * true
 *
 * input ticket: 123452
 * false
 **/