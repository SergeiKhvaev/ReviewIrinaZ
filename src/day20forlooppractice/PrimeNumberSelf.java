package day20forlooppractice;

public class PrimeNumberSelf {
    public static void main(String[] args) {
        int num = 15;
        String isPrime = "";

        for (int i = 2; i < 9; i++) {

            if (num % i == 0) {
                System.out.println(num + " not prime");
                break;
            } else {
                System.out.println(num + " is prime");
                break;
            }
        }

        System.out.println("==============================================");

        // another way

        int num2 = 19;
        boolean isPrime2 = true;

        for (int i = num2 - 1; i > 2; i--) {

            if (num2 % i == 0) {
                isPrime2 = false;
            }
        }
        System.out.println(isPrime2? num + " is  prime number" : num + " is not prime number");// отдельное if утверждение на сонове вывода луп

    }

}

