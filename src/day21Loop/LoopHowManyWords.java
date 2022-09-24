package day21Loop;

public class LoopHowManyWords {
    public static void main(String[] args) {

        // determine how many words in given string
        String str = " i love java".trim();

        int count = 0;

        if (str.charAt(0) > 'a' && str.charAt(0) < 'z') {
            count++;
        }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }

        System.out.println(str + " contains " + count + " words");

    }
}
