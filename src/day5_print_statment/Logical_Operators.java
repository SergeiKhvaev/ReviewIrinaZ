package day5_print_statment;

public class Logical_Operators {
    public static void main(String[] args) {

        boolean openBoxP1 = true;
        boolean openBoxP2 = true;
        boolean openBox = openBoxP1 || openBoxP2;
        System.out.println(openBox);

        System.out.println("--------------------");

        boolean openBoxP11 = true;
        boolean openBoxP22 = false;
        Boolean openBox2 = openBoxP11 && openBoxP22;
        System.out.println(openBox2);
        System.out.println("--------------------");

        Boolean mom = false;
        Boolean dad = false;
        Boolean grandMa = true;
        boolean money = (mom && dad) || grandMa;
        System.out.println(money);

        System.out.println("--------------------");

// another solvation
        boolean mom1 = false;
        boolean dad1 = false;
        boolean parents = mom1 && dad1;
        boolean grandMa1 = true;
        boolean money1 = parents || grandMa1;
        System.out.println(money1);

        System.out.println("--------------------");


        boolean mainDoor = true;
        boolean secondDoor = false;
        if (mainDoor == false && secondDoor == true) {
            System.out.println("door bell ON");
        } else if (mainDoor == true && secondDoor == false) {
            System.out.println("door bell ON");
        } else {
            System.out.println("door bell OFF");
        }

        System.out.println("======================================================");

        //boolean regularKey = true;
        boolean internetConnection = false;
        boolean doorPower = true;

        if (internetConnection == true && doorPower == true) {
            System.out.println("You can`t open door with regular key");
        } else {
            System.out.println("Use regular key to open the door");}


        System.out.println("===============================================================================");

        boolean internetConnection1 = false;
        boolean doorPower1 = true;

        if (internetConnection1 == true && doorPower1 == true){
            System.out.println("False");}
                else if (internetConnection1 == false || doorPower1 == false){
                    System.out.println("False");}
                else {
                    System.out.println("False");}




                System.out.println("=================================================================");

                boolean iPhone = false;
                boolean fingerPrint = true;
                boolean password = false;

                if (iPhone == false && fingerPrint == true && password == false) {
                    System.out.println("Door is open");}
                else if (iPhone == false && fingerPrint == false && password == true){
                    System.out.println("Door is open");}
                else if (iPhone == true && fingerPrint == false && password == false){
                    System.out.println("Door is open");}
                else {
                     System.out.println("Door is locked");}
System.out.println("================================================================================");

                int teacher1 = 12;
                int teacher2 = 14;
                if (teacher1+teacher2 <= 25){
                    System.out.println("True");}
                else {
                    System.out.println("False");
                }

                System.out.println("============================================================");

                int a3 = 6;
                int a4 = 6;

                if(a3 > a4){
                    System.out.println(a3);}
                else if(a3 < a4){
                    System.out.println(a4);}
                else {
                    System.out.println("0");}






            }
        }
















