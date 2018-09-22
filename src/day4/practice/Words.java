package day4.practice;

public class Words {

    public static int totalLength(String[] words) {
        int res = 0;
       /* for (int i = 0; i < words.length; i++) {
            res += words[i].length();
        }*/
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
        String[] stringArray = new String[]{};
        System.out.println(totalLength(stringArray));
        System.out.println(containsEmptyWord(stringArray));
    }
}
