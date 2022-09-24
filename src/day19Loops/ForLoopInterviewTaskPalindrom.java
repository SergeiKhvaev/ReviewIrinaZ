package day19Loops;

public class ForLoopInterviewTaskPalindrom {
    public static void main(String[] args) {

        //
        // палидром означает, если слово читается одинаково и с конца и с начала - АННА, ПОП racecar maam
// 1. needs revers word;
        // 2. comper

        String word = "anna";
        String revers ="";

        int length = word.length();

        for(int i = word.length() -1; i >= 0; i--) {
            System.out.println(word.charAt(i));
            revers += word.charAt(i);
        }
            if (word.equals(revers)){
                System.out.println("Palidrom");
            }
            else{
                System.out.println("Not polidrom");}

            }

        }

















