package day4.practice;

public class Words {

    public static int totalLength(String[] words) {
        int res = 0;
        for (String word : words) {
            res += word.length();
        }
        return res;
    }

    public static boolean containsEmptyWord(String[] words) {
        for (String word : words) {
            if (word.equals("")) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        testTotalLength();
        testContainsEmptyWord();
    }

    private static void testTotalLength() {
        System.out.println(totalLength(new String[]{"asd","asd","asd"}));
    }

    private static void testContainsEmptyWord() {
        System.out.println(containsEmptyWord(new String[]{"asd","asd","asd"}));
        System.out.println(containsEmptyWord(new String[]{""}));
        System.out.println(containsEmptyWord(new String[]{}));
        System.out.println(containsEmptyWord(new String[]{"","asd","asd"}));
    }
}
