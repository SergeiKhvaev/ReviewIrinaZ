package day27ArraysMEthods;

public class MethodCreationSelf {

    public static void evenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " is even number");
            }
        }
    }

    public static void oddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " is odd number");
            }
        }
    }

    public static void main(String[] args) {

        oddNumbers();
        System.out.println("==============================================");
        evenNumbers();

    }
}