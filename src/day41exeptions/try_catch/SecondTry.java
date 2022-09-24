package day41exeptions.try_catch;

public class SecondTry {
    public static void main(String[] args)  {

        try {
            int[] arr = {4, 2, 4, 1};
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e){ // we have catch block that help catch exceptions without stoping program execution
            System.out.println("CATCH BLOCK");
            e.printStackTrace(); // method that print whole info about excetprion
            System.out.println(e.getMessage()); // method that print only short message about exception
        }
        System.out.println("Thank you Sergei for catching exception");
    }
}