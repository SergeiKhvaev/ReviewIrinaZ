package day22arrays;

public class ArraysNameAndInitialsSelf {
    public static void main(String[] args) {

        String[] names = {"James Bond", "Harry Potter", "Tony Stark"};
        System.out.println(""+names[0].charAt(0) + names[0].charAt(6));
        System.out.println(""+names[1].charAt(0) + names[1].charAt(6));
        System.out.println(""+names[2].charAt(0) + names[2].charAt(5));

        System.out.println("--------------------------------------------------------");


        String n = "Potter Harry";
        System.out.println(n.charAt(n.indexOf('H')));



    }
}
