package day27ArraysMEthods;

public class MethodParameters {

    public static void greeting(String  name){
        System.out.println("Hello " + name);
        System.out.println("Nice to meet you " + name);
    }

    public static void age(int  birthYear){
        System.out.println("you are " + (2022 - birthYear) + " years old");

    }

    public static void main(String[] args) {

        greeting("James"); // james ia an argument, value of the name for method
        greeting("Alina");



        age(1983);

        String [][][] arr = new String [2][][];

    }
}
