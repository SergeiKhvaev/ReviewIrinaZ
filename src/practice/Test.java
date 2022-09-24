package practice;

import day39inharitance_encapsulation.employee.Tester;

public class Test {
    static void run(){ // method
        System.out.print(1);
    }

    public static void main(String[] args) {
        Test.run();
        System.out.print(2);


    }
public Test() {// пустой конструктор, but we did t use it here? because Object not created
    System.out.print(3);
}





    static { // static block
    System.out.print(4);
}

}
