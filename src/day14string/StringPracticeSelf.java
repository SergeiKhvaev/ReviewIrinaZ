package day14string;

import java.util.Scanner;
public class StringPracticeSelf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String str = "Sergei Khvalev loves Java";

        str.toUpperCase();

        System.out.println(str.toUpperCase()); // матод самостоятельно создал НОВУЮ строку
        str = str.toUpperCase(); // reassigned переменную
        System.out.println(str);

        String newName = str.toUpperCase(); // created new String with applied method
         System.out.println(newName);

        System.out.println("================================================================");


        String str2 = "KATYA STAROVOITOVA";

        str2.toLowerCase(); // method created new string directly
        System.out.println(str2.toLowerCase());

        str2 = str2.toLowerCase(); // reassigned veriable
        System.out.println(str2);

        String newName2 = str2.toLowerCase(); // created new string ,manually
        System.out.println(newName2);



        System.out.println("============================================================");

        String password = "Sergei1983";

        System.out.println("Enter password, please");

        String passwordInput = input.nextLine();

        if(passwordInput.equals(password)){
            System.out.println("Thank you, you are login");}
        else {
            System.out.println("Incorrect password");}

        System.out.println("=============================================================");






}


    }



