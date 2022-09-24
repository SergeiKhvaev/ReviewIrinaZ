package day37staticvariablesandmethod.student;

import java.util.Arrays;

public class CydeoStudents {
    // instance variables
    String name;
    String city;
    int group;
    Coffee myOwnCoffee; // created object as instance variable of CydeoStudent class

    // static variables
    static int batchNumber; // we can define values rigth here also, but insted we define values in static block
    static String schoolName;// we can define values rigth here also, but insted we define values in static block
    static String[] instructors; // static means one cope, belong to class, all objects share. String[] type// we can define values rigth here also , but insted we define values in static block

    static{ // we use static block to assign static variables
        batchNumber =27;// we define values of static variables here
        schoolName = "Cydeo";// we define values of static variables here
        instructors = new String[] {"Adam", "Saim", "Asia"}; // we created new string arr and assigned it to instructors referance
    }

    public CydeoStudents(String name, String city, int group) {
        this.name = name;
        this.city = city;
        this.group = group;
        myOwnCoffee = new Coffee(16); //другой путь положить эту переменную также в аргументы этого конструктора
    }

    public void drink(){ // method to define coffe amount after each drink

        myOwnCoffee.amountLeft -= 2;
    }

    public static void schoolInfo(){ // we use static method to print all static variables when class loaded first time
        System.out.println(schoolName + " natch " + batchNumber);
        System.out.println("Instructors " + Arrays.toString(instructors));
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                '}';
    }
}
