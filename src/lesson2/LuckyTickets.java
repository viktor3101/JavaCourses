package lesson2;

public class LuckyTickets {

    public static void main(String[] args) {
        //int i = 1_000_000;
        int counter = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        for (int i = 0; i < 1000000; i++) {
            a = i / 100_000;
        }
        System.out.println("Count of lucky numbers " + counter);

        double ave = (counter / 1_000_000.0) * 100;
        System.out.println("It is " + ave + "% of all tickets");
    }
}
