package day29ReturnTypeMEthodPractice;

public class Picture {
    public static void main(String[] args) {

        draw();
        draw("red");
        draw("blue", 10);
        draw("yellow", "big");
        draw(2, "blue");

    }


    public static void draw() {
        System.out.println("Drwning circul");
    }

    public static void draw(String color) { // overloading

        System.out.println("Drawning with " + color);
    }


    public static void draw(String color, int size) { // overloading
        System.out.println("making pictures of " + size);
    }
    public static void draw(int size, String color) {        // overloading and still good, but we just switch 2 variables
        System.out.println("sljldjds");
    }



    public static void draw(String color, String s2) { // overloading
        System.out.println("Drawning with two Strings");



    }

}