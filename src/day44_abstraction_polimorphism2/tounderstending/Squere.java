package day44_abstraction_polimorphism2.tounderstending;

public class Squere extends Shape{


    double width;
    double length;

    public Squere(double width, double length, String color, String name){
        super(color, name);
        //name = "Squere";
        this.width = width;
        this.length = length;

    }

  public double area(){
return   width * length;
    }



    @Override
    public String toString() {
        return super.toString() + "Squere{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length + "area = " + area()+
                '}';
    }
}
