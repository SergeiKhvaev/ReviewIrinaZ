package day20forlooppractice;

public class ForLoopCountChar {

    public static void main(String[] args) {

        /// дается строка найти сколько букв верхнего и нижнего регистра или цифр в нутри строки

        String s = "112JJJbbbHHjj";
        int upper = 0;
        int lower = 0;
        int number = 0;

        for (int i = 0; i < s.length(); i++) {

        char eachLetter = s.charAt(i);

        if (eachLetter >= 'A' && eachLetter <= 'Z') {
            upper++;
        } else if (eachLetter >= 'a' && eachLetter <= 'z') {
            lower++;
        } else if (eachLetter >= '0' && eachLetter <= '9') {
            number++;
        }


    }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(number);
}
}