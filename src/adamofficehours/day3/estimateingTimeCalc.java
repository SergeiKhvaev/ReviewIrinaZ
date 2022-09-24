package adamofficehours.day3;
import java.util.Scanner;
public class estimateingTimeCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maxSpeed = 80;
        int minSpeed = 40;

        System.out.println("What is your speed?");
        double speed = input.nextDouble();

        if (speed <= minSpeed || speed  >= maxSpeed){
               speed = 60;
        }

        System.out.println("What is your distance?");
        double distance = input.nextDouble();

        input.nextLine();
        System.out.println("What is starting point");
        String startPoint = input.nextLine();

        System.out.println("What is ending point");
        String endPoint = input.nextLine();

        double time = distance / speed;

        System.out.println("The ETA  " +  time + " hours from" + startPoint + " " + endPoint);



        ;





    }
}
