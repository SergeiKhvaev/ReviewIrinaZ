package day16_string_practice;

import java.sql.SQLOutput;

public class CreateID {

    public static void main(String[] args) {



        String firstName = "John";
        String lastName = "smith";
        System.out.println(firstName.substring(0,1) + lastName.substring(0,1).toUpperCase() + lastName.substring(1,3) + firstName.length() * 2);

    }
}
