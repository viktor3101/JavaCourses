package HWLevelZero.PartTwo;

public class TasksFromOneToFour {
    public static void main(String[] args) {
        for (int i = 10; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 20; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 10; i <= 100; i = i + 10) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 300; i >= -200; i = i - 50) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}
