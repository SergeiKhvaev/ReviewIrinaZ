package day41exeptions.try_catch;

public class ExampleOne {
    public static void main(String[] args) {
        String s = null;
      //  System.out.println(s.length());// it compile, but when I will run it we will have problem - unchecked exception, exception happen during run time - we will see unchecked exception NullPointerException
        s = "hello";
        //System.out.println(s.charAt(10));// it compile, but when i will run it we will have problem,  unchecked exception , exception happen during run time. unchecked exception- StringIndexOutOfBoundsException/ So we can handle it by using try and catch blocks (tool)+ in catch block we can provide extra info about exception occurance. If We handle it, we can prevent termination of our program in case exception occurance, as result of exception handaling we let rest of our code (code after exception) run - an that is perfect

        System.out.println("hello");



      // Thread.sleep(5000);// Threade - class, sleep() - method. here we have checked exceptions, and we have to hande it before running(compile). So before fix checked exception then run  can run code - use throws (specify exception), otherwise
        System.out.println("ddd");


    }
}
