package day40methodovverriding.shapes;

public class Square extends Shape {

    double side;

    public Square (double side){
        super("Square"); // we jast hardcoded, because it will always be SQUARE
        this.side = side;
    }
    @Override
    public double area(){
        return side * side;
    }


    @Override
    public double perimeter(){
        return side * 4;

    }
    @Override
    public String toString(){
       return super.toString() + "\nSide " + side; // called the super class toString methos by keyword super() + square variable

    }
}
