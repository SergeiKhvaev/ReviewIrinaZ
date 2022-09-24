package day8;
import java.util.Scanner;
public class PracticeScanner2 {

    public static void main(String[] args){

        Scanner revenue = new Scanner(System.in);

        System.out.println("quantaty");
        int quantaty = revenue.nextInt();

        System.out.println("Price");
        float priceItem = revenue.nextFloat();

        System.out.println("Summary: " + quantaty * priceItem);






    }

}
