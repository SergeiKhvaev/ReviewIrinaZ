package day10Practice;

public class SimpleCulculator {

    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 10;
        char operator = '%';
        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*' || operator == 'x') {
            result = num1 * num2;
        }
        else if (operator == '/') {
            result = num1 / num2;
        }
        else if (operator == '%') {
            result = num1 % num2;
        }
        else {

            System.out.println("Invalid operator");

        }
        System.out.println(" " + num1 + operator + num2 + "= " + result);

    }
}
