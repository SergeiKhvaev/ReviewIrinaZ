package day20forlooppractice;

public class forLoopsBreakSpaceProgram {
    public static void main(String[] args) {
        // space program, put space after every word, or replace spase by _ if we have space in word

        String s = "word word word hello wolrd";
        String result = "";

        for(int i = 0; i <s.length(); i ++) { // i<=s.length()-1 алтернатива
        char letter = s.charAt(i);
        if(letter == ' '){
            result += "_ ";
        } else {
            result += letter + " ";
        }

        }

        System.out.println(result);

    }
}
