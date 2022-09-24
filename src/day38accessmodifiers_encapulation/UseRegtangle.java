package day38accessmodifiers_encapulation;

public class UseRegtangle {
    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle();
//rectangle1.length = 10; normal way, but we do t have directe access because it privat
//rectangle1.width = 20;normal way, but we do t have directe access because it private

       // System.out.println(rectangle1.length);
        //normal way, but we do t have directe access because it private
      //  System.out.println(rectangle1.width); normal way, but we do t have directe access because it private



        rectangle1.setWidth(15); // we can reasignt that not directly, by setter
        rectangle1.setLength(25);// we can reasignt that not directly, by setter

        System.out.println(rectangle1.getLength()); // we have access but not direct, by getter
        System.out.println(rectangle1.getWidth());// we have access but not direct, by getter


    }


}
