package day40methodovverriding.shapes;

public class Shape {

    String type;

    public Shape(String type){
        this.type= type;
    }

    public double area(){// создали методы дл€ overriding in chiled class

        return 0.0;
    }
    public  double perimeter (){

        return 0.0;
    }
    @Override
    public String toString(){ // overriding toString method from lang.Object class, все создаваемые классы €вл€ютс€ subclass дл€ Parent class Object это встроеннао inharitence дл€ всех классов, поэтому мы можем вызвать всегда в любом классе toString method
        return "Shape: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter(); // we created different implementation of toString method from Object class

    }

}
