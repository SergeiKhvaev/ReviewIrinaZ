package day40methodovverriding;

public class Parent {

    public static void hello(){
        System.out.println("Hello from Parent");// inherite to child
    }
    public static void bye(){
        System.out.println("Bye from Parent");
    }
}

class Child  extends Parent{
    //@Overriding : static method can not override
    public static void bye (){ // when we make same method like Parent class has, we hide Parent class method
        System.out.println("Bye from child");
    }
}

class Run{
    public static void main(String[] args) {
        Parent.hello();// normall inharitance for static method, accssesible by both name
        Child.hello();// normall inharitance for static method, accssesible by both name

        Parent.bye();
        Child.bye(); // hidden new method printed

    }


}