package day41exeptions.try_catch;

public class MultipleSleep {
    public static void main(String[] args) throws  InterruptedException { // accepting if the exceptions happens and stop my program // we will not catch exceptions(like try & catch blocks), but we allow to run prodram. Remember throws key word help to handle onli checked exceptions

        System.out.println("Hello");

        Thread.sleep(3000);

        System.out.println("Second line");

        Thread.sleep(3000);

        System.out.println("Middle line");
        Thread.sleep(3000);

        System.out.println("Bye");

    }
}
