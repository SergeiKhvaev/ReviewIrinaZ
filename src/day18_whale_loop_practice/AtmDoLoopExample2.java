package day18_whale_loop_practice;
 import java.util.Scanner;
public class AtmDoLoopExample2 {

    public static void main(String[] args) {

        int validPin = 1234;
        int userPin;
        int attempts =0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter PIN");
            userPin = input.nextInt();
            attempts++;
        }while(attempts < 3 && userPin != validPin);
if (attempts <= 3 &&  userPin == validPin){
    System.out.println("Logged in");
        } else {
    System.out.println("Lokked acount, too many attempts");
        }
    }
}
