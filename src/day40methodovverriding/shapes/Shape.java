package day40methodovverriding.shapes;

public class Shape {

    String type;

    public Shape(String type){
        this.type= type;
    }

    public double area(){// ������� ������ ��� overriding in chiled class

        return 0.0;
    }
    public  double perimeter (){

        return 0.0;
    }
    @Override
    public String toString(){ // overriding toString method from lang.Object class, ��� ����������� ������ �������� subclass ��� Parent class Object ��� ���������� inharitence ��� ���� �������, ������� �� ����� ������� ������ � ����� ������ toString method
        return "Shape: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter(); // we created different implementation of toString method from Object class

    }

}
