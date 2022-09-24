package day21Loop;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        // напечатать все пр€йм числа до определенного числа
        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to go");
        int range = input.nextInt();

        for(int i = 2 ; i <= range; i++) {// провер€ет рендж
            boolean isPrime = true; // каждый раз

            for(int j = 2 ; j < i ; j++){ // в раскаж каждого рендж провер€ем деление числа на числа в плоть до числа равного себе -1
                if(i % j == 0){ // провер€ем I делитс€ ли на 2 до i провер€€ пр€йм или нет
                    isPrime = false;
                    break; // останавливает внутренний лууп
                }
            }
            if (isPrime){
                System.out.println(i);
            }


        }


    }
}
