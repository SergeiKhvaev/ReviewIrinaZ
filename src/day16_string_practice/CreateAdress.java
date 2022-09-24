package day16_string_practice;
import java.util.Scanner;

public class CreateAdress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address");
        String address = input.nextLine();
        address = address.toUpperCase(); // весь ввод будет в верхнем регистре
        address = address.trim(); // мы изначально убераем все ненужные пробелы в начале и в конце, которые могут быть введены в консоле
        // также мы можем вызвать chain methods  - String address = input.nextLine.toUpperCase().trim()
        //                                          String                       return:String   return: string
        // - это вернет String уже с примененными методами (chain methods)

        if(address.startsWith("500")) {
            System.out.println("House is on RIGHT side of the street");
            } else if (address.startsWith("600")){
            System.out.println("House is on LEFT side of the street ");
        }

        if(address.contains("DRIVE")) {
            System.out.println("We are on Drive");
        }else if(address.contains("LANE")){
            System.out.println("We are on Line");
        }else if(address.contains("AVE")){
            System.out.println("We are on Avenue");
        }









    }
}
