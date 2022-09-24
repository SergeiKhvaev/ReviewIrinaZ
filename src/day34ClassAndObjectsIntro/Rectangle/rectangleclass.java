package day34ClassAndObjectsIntro.Rectangle;

public class rectangleclass {

        double base;
        double height;
        double perimeter;
        double area;

        // instance method - calcPerimeter

        public void calcRectanglePerimeter(){
            perimeter = (base + height) * 2;
            System.out.println("Rectangle Perimeter : " + (base + height) * 2);



        }

        // inctance method - calcArea

        public void calcRectangleArea(){
            area = base * height;
            System.out.println("Rectangle Perimeter : " + (base * height));

        }


        public String toString() { // toStringMEthod need to print whole information about object
            return "Rectangle{" +
                    "base=" + base +
                    ", height=" + height +
                    ", perimeter=" + perimeter +
                    ", area=" + area +
                    '}';
        }
    }



