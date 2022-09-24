package adamofficehours.day2;
import java.util.Scanner;
public class OfficeHoursDay2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter tepmerature, you prefer, please");
                int temp = input.nextInt();


if (temp >=70 && temp <= 80) {
    System.out.println (temp + " is " + "ideal temp");
}
else {
    if (temp < 70) {
        System.out.println (temp + " is " + "too cold");
    }
    else {
        System.out.println(temp + " is " + "too hot");
    }

}


    }

}
