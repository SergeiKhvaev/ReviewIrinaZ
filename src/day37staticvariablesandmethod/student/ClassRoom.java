package day37staticvariablesandmethod.student;

import java.util.Arrays;

public class ClassRoom {
    public static void main(String[] args) {
CydeoStudents.schoolInfo();// all school info static method, call method without creating object

CydeoStudents sergei = new CydeoStudents("Sergei", "Irkutsk", 26); // made object -Sergei with personal info
        System.out.println(sergei);
        System.out.println(Arrays.toString(sergei.instructors));// not proper way to call static variable
        System.out.println(Arrays.toString(CydeoStudents.instructors)); // good way to call static variable by CLASS NAME
        System.out.println(CydeoStudents.instructors[1].charAt(3));// a


        System.out.println(sergei.myOwnCoffee.amountLeft);
        sergei.drink();
        System.out.println(sergei.myOwnCoffee.amountLeft);

        System.out.println("=======================================");
        CydeoStudents ali = new CydeoStudents("Ali", "Woodbrige", 1);
        System.out.println(ali.myOwnCoffee.amountLeft);
        ali.drink();
        ali.drink();
        ali.drink();
        System.out.println(ali.myOwnCoffee.amountLeft);
        System.out.println(sergei.myOwnCoffee.amountLeft);// Sergei still have his own amount of cofe, regardlee how mauch ali drinked befor


    }
}
