package day35ClassAndObject.carper;

public class CarpetOne {
    public static void main(String[] args) {
        CarpetClass carpetOne = new CarpetClass(12.5, 35, 12.99, false);

        System.out.println(carpetOne);

        CarpetClass carpetTwo = new CarpetClass(12.5, 35, 12.99, true);
        System.out.println(carpetTwo);

        carpetTwo.width = 18;
        carpetTwo.calculatePrice();
        System.out.println(carpetTwo);


    }
}
