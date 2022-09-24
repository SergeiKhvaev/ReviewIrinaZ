package day35ClassAndObject.Rectangle;

public class rectangleOne {
    public static void main(String[] args) {

        rectangle rectangleOne = new rectangle();
        rectangleOne.base = 4;
rectangleOne.heigth = 5;
       rectangleOne.calcArea();
       rectangleOne.calcPErimeter();
        System.out.println(rectangleOne);
        System.out.println(rectangleOne.perimeter);
        System.out.println(rectangleOne.area);

    }
}
