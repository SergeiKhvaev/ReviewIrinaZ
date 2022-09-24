package day40methodovverriding;

import practice.Test;

public class UsingFinal extends Test1 {

    // extends FinalKeyWordExamples class doesn t work, because FinalKeyWordExamples  class is final
    // extends String class doesn t work, because that class is final
   // extends Math class doesn t work, because that class is final
    public static void main(String[] args) {
        new FinalKeyWordExamples(10);
        System.out.println(new FinalKeyWordExamples(10));

        System.out.println(FinalKeyWordExamples.PLANET);

        System.out.println("==========================");
        FinalKeyWordExamples obj2 = new FinalKeyWordExamples(20); // dynamic way, assign first


        System.out.println(obj2.a); // hardcoded in class
        System.out.println(obj2.b);
       // obj2.a = 4; we can not reassign it, because it is final variable
        //obj2.b = 99; we can not reassign it, because it is final variable
        System.out.println(obj2.PLANET); // not reccoment that vay to access to static variable
        System.out.println(FinalKeyWordExamples.PLANET); // recommended way to access to static variable

       // FinalKeyWordExamples.PLANET = "Mars"; we can not reassign it, because it is final constant variable


        Test1 obj3 = new Test1();
        obj3.helloWorld();
    }
/*

    @Override  //I can t override, because helloWorld(){} method is final method
    public void helloWorld(){

    }

 */




    }
class Test1 {

    public final void helloWorld() {
        System.out.println("Hello World!");
    }
}