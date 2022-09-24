package day42abstractionexeptionsrecap.practice.shapes;

public class Circle extends Shape {
    /*
    Create a concrete class Circle
    sub class of Sharpe
    create an instance variable radius
    call the parent constructor to set the name of the shape to "Circle"
& initialize the radius value for the circle
    implement the two abstract methods for a circle shape
        area()
        perimeter()
    override the toString to return the name, area, perimeter, and radius
     */
    double radius;
    static double PI = 3.14;

    public Circle( double radius) {
        super("Circle");
        this.radius = radius;
    }
        @Override
        public double area (){
            return (radius * radius) * PI;
        }

        @Override
    public double perimeter (){
        return 2*radius *PI;

    }

    @Override
    public String toString() {
        return super.toString() + ", radius of " + name + " is " + radius + ", constant PI is " + PI + " " + ", area is " + name + " is" + area() + ", perimeter of " + name + " is " + perimeter();
    }
}
