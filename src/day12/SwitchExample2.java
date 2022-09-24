package day12;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SwitchExample2 {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

        System.out.println("size");



       String drink =  input.nextLine();

        switch(drink){
            case "tall":

                float price = 2.5F;
                int cal = 100;
                System.out.println("Tall " + price +" " + cal);
                break;

            case"grande":
                float price1 = 4F;
                int cal1 = 150;
                System.out.println("Grande " + price1  + " " + cal1);
                break;

            case"venti":
                float price2 = 4.5F;
                int cal2 = 200;
                System.out.println("venti " + price2 +" " + cal2);
                break;
            default:
                System.out.println("Size not match");



        }


    }

}
