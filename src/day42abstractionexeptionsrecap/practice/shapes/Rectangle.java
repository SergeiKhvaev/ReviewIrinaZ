package day42abstractionexeptionsrecap.practice.shapes;

public class Rectangle extends Shape{
    /*
    Create a concrete class Rectangle
    sub class of Sharpe
    create an instance variable length
    create an instance variable width
    call the parent constructor to set the name of the shape to "Rectangle"
& initialize the length and width values for the shape
    implement the two abstract methods for a rectangle shape
        area()
        perimeter()
     */

    double length;
    double width;
    public Rectangle(double length, double width){
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
@Override
    public double area(){
        return length * width;
}

@Override
    public double perimeter(){
        return (length * width) * 2;
}

public String toString(){

        return super.toString() +  ", Length of " + name + " is " + length + ", width of " + name + " is " + width + ", area of " + name + " is " + area() + ", perimeter of " + name + " is " + perimeter();
}
}
