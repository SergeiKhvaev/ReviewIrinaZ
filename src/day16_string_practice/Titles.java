package day16_string_practice;

public class Titles {

    public static void main(String[] args) {

        String name = "Mr James";
        name = name.toLowerCase(); // любой регистр компьютер переводит в нижний регистра, т.о. нам уже не важно в каком регистре вводятся даные (код будет видеть их в нижнем регистре)

        if (name.startsWith("mr")  || name.startsWith("mister")){

            System.out.println("Hello Sir");
        }else if (name.startsWith("ms") || name.startsWith("miss") || name.startsWith("madam")){
            System.out.println("Hello ma`am");
        }else if (name.startsWith("dr")){
            System.out.println("Hello Doctor");
        }

        if (name.endsWith("sr")){
            System.out.println("Nice to meer you Senior");
        }else if (name.endsWith("jr")){
            System.out.println("Nice to meer you Junior");
        }



    }
}
