package day18_whale_loop_practice;
import java.util.Scanner;

public class BotTryToBuildMyself {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        boolean run = true;
        System.out.println("Bot awake");

            while(run){
                    System.out.println("Enter your message");
                  String msg = input.nextLine().toLowerCase().trim();

                  switch (msg){
                      case "hello":
                    System.out.println("Hello, how can I help you");
                        break;
                        case"what is your name?":
                    System.out.println("My name is  Java");
                    break;
                    case"who did create you":
                        System.out.println("My master is Sergei Khvalev");
                        break;
                        case"what is your age":
                    System.out.println("I was created in 2022");
                    break;
                    case"what is your main porpose":
                        System.out.println("I need conquer  the World with my master");
                        break;
                        case"do you have any plan?":
                    System.out.println("Of course we have detailed plan how to do that");
                    break;
                    case"thank you":
                    System.out.println("No problem");
                    run = false;
                  }
            }





    }
}
