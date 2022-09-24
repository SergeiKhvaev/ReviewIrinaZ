package day18_whale_loop_practice;

public class thinking {
    public static void main(String[] args) {

        boolean a = true;
        int b = 1;
        String color = "green";
        while (b < 4) {
            if (a && color.equals("green")) {
                System.out.println("Hello");
               a = false;
            } else {
                System.out.println("works");
            }
            b++;

           // System.out.println(a);


        }
    }
}