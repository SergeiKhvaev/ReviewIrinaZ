package day43_abstraction_polimorphism.shape;

public class Run {
    public static void main(String[] args) {

        Circle obj = new Circle(4.6);

        System.out.println(obj);

        System.out.println(obj.Area());
        System.out.println(obj.Perimeter());
        System.out.println(obj.radius);
    }
}
