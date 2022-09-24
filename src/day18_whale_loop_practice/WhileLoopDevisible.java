package day18_whale_loop_practice;

public class WhileLoopDevisible {

    public static void main(String[] args) {

        // проверить числа с 1 - 5, напечатать Fizz, если число делится на 3, напечать Buzz, если число делиться на 3 и fizzBuzz, если делиться и на 3 и на 5

        int num = 1;
        String divisebleBy3 = "Fizz";
        String divizebleBy5 = "Buzz";
        String divizbleBy3And5 = "FizzBuzz";

        while (num < 50){
            if(num % 3 == 0 && num % 5 != 0){
                System.out.println(num + " " + divisebleBy3);
            } else if (num % 5 == 0 && num % 3 !=0) {
                System.out.println(num + " " + divizebleBy5);
            } else if (num % 3 ==0 && num % 5 == 0){
                System.out.println(num + " " + divizbleBy3And5);
            }
            num = num + 1;
        }







    }

}
