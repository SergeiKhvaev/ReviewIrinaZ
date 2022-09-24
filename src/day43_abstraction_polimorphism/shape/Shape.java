package day43_abstraction_polimorphism.shape;

public abstract class Shape {

    public final String name;

    public Shape(String name){
      this.name = name;
    }

    public abstract double Area();

    public abstract double Perimeter();

    @Override
    public String toString() {
        return name + "|" + " + area =" + + Area()+ " perimeter = " + Perimeter();

    }
}
