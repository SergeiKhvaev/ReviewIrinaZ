package day14string;

import java.util.Scanner;

public class replit1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select storage type");
        String storageType = input.nextLine();

        System.out.println("Select storage size");

        double storagePrice = 0;

        switch (storageType) {
            case ("HHD"):
                double storageSize = input.nextDouble();
                if (storageSize == 500) {
                    storagePrice = 50;
                } else if (storageSize == 1000) {
                    storagePrice = 100;
                } else if (storageSize == 2000) {
                    storagePrice = 300;
                }
                break;
            case ("SSD"):
                 storageSize = input.nextDouble();
                 if(storageSize == 500){
                     storagePrice = 100;
                 } else if (storageSize == 1000){
                     storagePrice = 200;
                 } else if (storageSize == 2000){
                     storagePrice = 400;
                 }
                 break;
        }

        System.out.println(storagePrice);

    }
}