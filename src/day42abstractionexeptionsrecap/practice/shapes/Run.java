package day42abstractionexeptionsrecap.practice.shapes;

public class Run {
    public static void main(String[] args) {

        Circle circleOne = new Circle(2.1);

        System.out.println(circleOne.area());
        System.out.println((circleOne.perimeter()));
        System.out.println(circleOne);

        System.out.println("==============================");

        Rectangle rectangleOne = new Rectangle(2.5, 3.4);
        System.out.println(rectangleOne.area());
        System.out.println(rectangleOne.perimeter());
        System.out.println(rectangleOne);


    }
}
