package day28javamethods;

public class CharJavaMethods {

    public static void getUpperAtoZ (){

        for(char letter = 'A'; letter <= 'Z' ; letter ++){
            System.out.print(letter + " ");
        }
    }

    public static void getloweratoz () {

        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");
        }
    }


    public static void getUpperZtoA() {

        for (char letter = 'Z'; letter >= 'A'; letter--) {
            System.out.print(letter + " ");
        }


    }



    public static void getlowerzoa () {

        for (char letter = 'z'; letter >= 'a'; letter--) {
            System.out.print(letter + " ");
        }


    }


    public static void main(String[] args) {

        getloweratoz();
        System.out.println();
        getUpperAtoZ();
        System.out.println();
        getlowerzoa();
        System.out.println();
        getUpperZtoA();

    }
}
