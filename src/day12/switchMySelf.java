package day12;
import java.util.Scanner;
public class switchMySelf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter CPU");
        String CPU = input.nextLine();
        String CPURAM = "";

        switch (CPU) {
            case "i7":
                System.out.println("Enter RAM");
                int RAM = input.nextInt();
                switch (RAM) {
                    case 10:
                        System.out.println("i7RAM10");
                        break;
                    case 20:
                        System.out.println("I7RAM20");
                        break;
                    default:
                       // System.out.println("NO RAM");
                        ;}
                break;

            case "i9":
                System.out.println("Enter ROM");
                 RAM = input.nextInt();
                switch (RAM) {
                    case 40:
                        System.out.println("i9ROM40");
                        break;
                    case 50:
                        System.out.println("i9ROM50");
                        break;
                    case 60:
                        System.out.println("i9ROM60");
                        break;
                    default:
                        System.out.println("NO ROM");
                        break;
                }


        }

    }
}