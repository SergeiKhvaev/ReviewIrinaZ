package day11_efElsePractice;

public class NestedMySelf4 {
    public static void main(String[] args) {

        int minutesLeft = 99;

        if(minutesLeft >= 0 && minutesLeft <=90) {
            System.out.println("Normal minutes range");
            if(minutesLeft >= 75) {
                System.out.println("Just getting started");
            }
            else if (minutesLeft >= 60) {
                System.out.println("players are doing their best");
            }
            else if (minutesLeft >= 30) {
                System.out.println("middle of the game is going great");
            }
            else if (minutesLeft >= 0) {
                System.out.println("the end of the game is approching");
                }
        }
        else {
            if(minutesLeft < 0) {
                System.out.println("Minutes can`t be negative");
            }
            else if (minutesLeft >90){
                System.out.println("Game can`t be longer then 90 minutes");
            }
        }

    }
}
