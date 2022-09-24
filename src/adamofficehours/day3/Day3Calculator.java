package adamofficehours.day3;

public class Day3Calculator {
    public static void main(String[] args) {

        double num1 = 10;
        double num2 = 14;
        char ch ='/';
        double result = 0F;
        switch (ch) {
            case '+':
            result = num1 + num2;
            break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                result = 0;
                System.err.println("invalid operator");
                break;
        }

        System.out.println(result);









    }




}
