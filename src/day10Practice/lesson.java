package day10Practice;

public class lesson {

    public static void main(String[] args) {

        int saleAmount = 12_000;

        if (saleAmount < 10_000) {
            System.out.println("No bonus");
        } else if (saleAmount >= 10_000 && saleAmount < 15_000) {
            System.out.println("Bonus is 7_000");
        } else {
            System.out.println("Bonus is 10_000");


        }
    }
}