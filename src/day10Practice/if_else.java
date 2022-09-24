package day10Practice;

public class if_else {
    public static void main(String[] args) {

        int hours = 16;


        if (hours >= 6 && hours <= 11) {
            System.out.println("Good morning");
        } else if (hours >= 12 && hours <= 16) {
            System.out.println("Good Evening");
        } else if((hours >= 17 && hours <= 23) || (hours >= 0 && hours <= 5)){
            System.out.println("Good night");}




    }
}