package day41exeptions.hidding;

public class Second extends First{
   // @Override becase in is static method, which we can not override, but we can hide it, that actualy mean we create another static method wit same name (hidden static method). so now we have 2 static methods with same name, which one we call depend from what reference class we will use
    public static void staticMethod(){
        System.out.println("Static method from Second class");//
    }

    public void instanceMethodB(){
        staticMethod(); // here we will call clossest static method - static method from Second calss
    }


}
