package day44_abstraction_polimorphism2.tounderstending;

public abstract class Shape {
 String color;
 String name;

 public Shape(String color, String name){
     this.color = color;
     this.name = name;
 }
    public   double area(){
    return 2.5;
    };

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
