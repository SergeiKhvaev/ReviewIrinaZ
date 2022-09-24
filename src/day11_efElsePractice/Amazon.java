package day11_efElsePractice;

public class Amazon {
    public static void main(String[] args) {
        double itemPrice = 25.99;
        boolean isPrime = false;

        if (isPrime) {
            System.out.println("Free 2 day shipping");
        }
        else {
            if (itemPrice >= 25){
                System.out.println("Free shipping");
            }
            else {
                System.out.println("Shipping cost is $ 2.99");
            }
        }


    }
}
