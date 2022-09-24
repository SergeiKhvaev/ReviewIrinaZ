package day38accessmodifiers_encapulation.square;

public class SquareInstance {

    public static void main(String[] args) {
        Square squareOne = new Square(3);
        System.out.println(squareOne.toString());
        System.out.println(squareOne.getSide());
        squareOne.setSide(5);
        System.out.println(squareOne);
        System.out.println(squareOne.getSide());

        System.out.println(squareOne.calculateArea());
        System.out.println(squareOne.calculatePerimeter());

        Square squareTwo = new Square(6);
        System.out.println(squareTwo);
        System.out.println(squareTwo.calculatePerimeter());
        System.out.println(squareTwo.calculateArea());
    }
}
