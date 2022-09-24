package day44_abstraction_polimorphism2.tounderstending;

public class Circle extends Shape{
    double radius;

    public Circle(String color, double radius, String name){
        super(color, name);
        name = "Circle";
        this.radius = radius;
    }

    public double area(){
        return  radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius + "area " + area() +'}';
    }
}
