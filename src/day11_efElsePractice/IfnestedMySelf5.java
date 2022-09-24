package day11_efElsePractice;

public class IfnestedMySelf5 {
    public static void main(String[] args){

        double lengthMovie = 4.2;

        if (lengthMovie > 0 && lengthMovie <= 4) {
            if (lengthMovie <= 1) {
                System.out.println("The price is $8.99");
            } else if (lengthMovie <= 1.5) {
                System.out.println("The price is $10.5");
            } else if (lengthMovie <= 2) {
                System.out.println("The price is $12.5");
            } else if (lengthMovie <= 2.5) {
                System.out.println("The price is $14.99");
            } else if (lengthMovie <= 3 || lengthMovie <= 3.5 || lengthMovie <= 4) {
                System.out.println("The price is $15.99");
            }
        }
        else {
            if(lengthMovie <= 0){
                System.out.println("Movie can`t be less than 0 minutes");
            }
            else if(lengthMovie > 4){
                System.out.println("Movie can`t be more then 4 hours");
            }
        }



    }
}
