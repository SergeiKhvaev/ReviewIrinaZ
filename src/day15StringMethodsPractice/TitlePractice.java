package day15StringMethodsPractice;
import java.util.Scanner;
public class TitlePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name include title");
        String name = input.nextLine().toLowerCase();
        if(name.startsWith("mr") || name.startsWith("mister")){
             System.out.println("Hello Sir");
        } else if(name.startsWith("ms") || name.startsWith("miss")){
              System.out.println("Hello Ma`am");
        } else if(name.startsWith("dr")) {
               System.out.println("Hello Doctor");}

               if(name.endsWith("sr")){
                   System.out.println("Nice to meet you Senior");
               } else if (name.endsWith("jr")){
                   System.out.println("Nice to meet you Junior");
               }




       // System.out.println("Enter your name include title");
      //  String name = input.nextLine().toLowerCase();
      //  if(name.contains("mr") || name.contains("mister")){
       //     System.out.println("Hello Sir");
       // } else if(name.contains("ms") || name.contains("miss")){
       //     System.out.println("Hello Ma`am");
     //   } else if(name.contains("dr")) {
      //      System.out.println("Hello Doctor");
      //  }





    }
}
