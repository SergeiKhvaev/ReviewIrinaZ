package day12;

public class SoccerGame {

    public static void main(String[] args) {

     int min = 0;
     if (min >= 0 && min <= 90) {
         System.out.println("Valid time");
         if(min >= 75){
             System.out.println("Just started");
         }
         else if(min >= 60){
             System.out.println("player doing best");
         }
         else if(min >= 30) {
             System.out.printf("(middle");
         }
         else {
             System.out.println("almoust done");
         }
     }
     else {
         if(min < 0){
         System.out.println("can nott be less 0");}
          else {
             System.out.println("can not be more than 90");

             ///System.out.println(min < 0? "minutes negative": "game can not be longer than 90 min"; else s ternary может выглядить так

         }


     }

        System.out.printf("=========================================");


     ///System.out.println(min < 0? "minutes negative": "game can not be longer than 90 min";





    }

}
