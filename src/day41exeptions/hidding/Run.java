package day41exeptions.hidding;

public class Run {
    public static void main(String[] args) {

        First.staticMethod();// we used reference to First class
        Second.staticMethod();// we used reference to Second class (hidden static method)

        System.out.println("==================");

        new First().instanceMethodA(); //
      // new First().instanceMethodB(); instance method b was created in the sub class
        new Second().instanceMethodA(); // this instance method was inherited, will print original static method because that static method is closest to called instance method
        new Second().instanceMethodB(); // this is own sub class method, will call hidden static method from Second class, because that static method is closest to called instance method




    }
}
