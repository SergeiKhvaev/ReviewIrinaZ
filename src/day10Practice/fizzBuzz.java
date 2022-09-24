package day10Practice;
import java.util.Scanner;
public class fizzBuzz {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
System.out.println("Enter any number: ");
        int num = input.nextInt();

        if (num % 3 == 0 && num % 5 == 0){ // это условие нужно поставить первым, т.к. оно имеет два под условия, их нужно проверить первыми, в противном случае программа не даст их проверить, т.к. исполняться иные условия которые будут true и это условие просто не провериться
            System.out.println("FizzBuzz");
        }
      else   if (num % 3 == 0) {
                System.out.println("Fizz");
        }
      else  if(num % 5 == 0 ) {
                System.out.println("Buzz");
        }
      else {
            System.out.println(num);

        }



    }
}
