package day2;

public class LuckyTickets {

    public static void main(String[] args) {
        //int i = 1_000_000;
        int counter = 0;
        for (int i = 0; i < 1000000; i++) {
            //запис числа з білету як стрічки
            String a = String.valueOf(i);

            //запис стрічки як масиву char
            String b ="000000";
            char[] array = b.toCharArray();
            for (int j = 0; j < a.length(); j++) {
                array[j + 6 - a.length()] = a.charAt(j);
            }

            //ініціалізація інт масива
            int[] intArray = new int[6];
            for (int j = 0; j < intArray.length; j++) {
                intArray[j] = (int) array[j];
            }

            //провірка основної умови
            if ((intArray[0] + intArray[1] + intArray[2]) == (intArray[3] + intArray[4] + intArray[5])) {
                counter++;
            }
        }
        System.out.println("Count of lucky numbers " + counter);
        double proc = (counter / 1_000_000.0) * 100;
        System.out.println("It is " + proc + "% of all tickets");
    }
}
