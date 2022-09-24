package day41exeptions.hidding;

public class First {

    public static void staticMethod(){
        System.out.println("Static method from First class");
    }

    public void instanceMethodA(){
        staticMethod();
    }


}
