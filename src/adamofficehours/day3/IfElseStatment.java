package adamofficehours.day3;

public class IfElseStatment {

    public static void main(String[] args) {

        int num = -10;

        if (num > 0) {
            System.out.println("Positive");
                    }
        else  {
            System.out.println("Negative");
        }


        System.out.println("========================================");


        char input = 'A';

        if ((input  >= 'a' && input <= 'z') || (input >= 'Z' && input <= 'Z')) {
            System.out.println("Alphabet");
        }
        else {
            System.out.println("not alphabet");
        }







    }
}
