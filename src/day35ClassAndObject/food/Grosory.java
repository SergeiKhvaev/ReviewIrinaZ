package day35ClassAndObject.food;

public class Grosory {
    public static void main(String[] args) {
        FoodClass apples = new FoodClass("apple", 5, 3.99);
        System.out.println(apples);

        apples.unitPrice = 1.99;
        apples.TotalPriceCalc();
        System.out.println(apples);

        System.out.println("===============================");

        FoodClass salamy = new FoodClass("salamy", 2, 8);
        System.out.println(salamy);

        salamy.quantity = 3;
        System.out.println(salamy);
        salamy.TotalPriceCalc();
        System.out.println(salamy);



    }
}
