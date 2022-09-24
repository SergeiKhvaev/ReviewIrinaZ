package day43_abstraction_polimorphism.shape;

public class Circle extends Shape{

    final double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double Area() {
        return radius * radius * Math.PI;

    }

    @Override
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString(){
        String s = super.toString();
        return s.substring(0, s.indexOf("|")) + radius + s.substring(s.indexOf("|")-1);

    }
}
