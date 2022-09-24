package day34ClassAndObjectsIntro.Rectangle;

public class rectangleOne {
    public static void main(String[] args) {
        rectangleclass rectangleOne = new rectangleclass();
        System.out.println(rectangleOne);
        // assighn variables
rectangleOne.base = 3.3;
rectangleOne.height = 3.7;
rectangleOne.perimeter = 0;
rectangleOne.area = 0;
        System.out.println(rectangleOne);

        // call methods
  rectangleOne.calcRectangleArea();
  rectangleOne.calcRectanglePerimeter();

        System.out.println(rectangleOne.perimeter); // assignet value after applied method
        System.out.println((rectangleOne.area)); // assignet value after applied method

        System.out.println(rectangleOne);


    }

}
