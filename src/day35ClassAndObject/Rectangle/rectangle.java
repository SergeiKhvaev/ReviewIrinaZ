package day35ClassAndObject.Rectangle;

public class rectangle {
    double base;
    double heigth;
    double perimeter;
    double area;
    public void calcPErimeter(){
        perimeter = 2* base + 2 * heigth;

    }

   public void calcArea(){
        area = base * heigth;


   }


    public String toString() {
        return "rectangle{" +
                "base=" + base +
                ", heigth=" + heigth +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
