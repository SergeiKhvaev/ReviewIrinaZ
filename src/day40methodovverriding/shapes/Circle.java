package day40methodovverriding.shapes;

public class Circle extends Shape{

    double radius;

    public Circle(double radius){ // создали обычный констрактор и вызвали супер класс констрактор, не нужды variable type потому что всегда обхект из этого класса мбудет circle, но у нас должна быть всегда возможность инициализировать радиус переменную, поэтому мы ее положили в параметры констрактора
        super("Circle");
        this.radius = radius;
    }

    // build method overriding - change implementation of Super class methods area and perimeter

    @Override
    public double area(){
        return radius * radius * Math.PI;
    }// Math.pow(radius, 2) * Math.PI
    // Math.pow(radius, 2) == radius^2


    @Override
    public double perimeter(){
        return 2* Math.PI * radius;
    }

    public String toString(){
        return super.toString() + "\nRadius " + radius;// called the super class toString methos by keyword super() + square variable
    }

}
