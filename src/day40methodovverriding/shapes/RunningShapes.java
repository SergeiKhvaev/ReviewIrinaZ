package day40methodovverriding.shapes;

public class RunningShapes {
    public static void main(String[] args) {
        Circle circule = new Circle(3.4);
        System.out.println(circule); // toString method from Super class (radius not exist in Super class), so we miss rudius value because we we declared radius in Subclass, where toString method not created

        System.out.println(circule.perimeter());
        System.out.println(circule.area());


        System.out.println("========================");
        Square square = new Square(5.5);
        System.out.println(square);
       // System.out.println(square.perimeter());
     //   System.out.println(square.area());

    }
}
