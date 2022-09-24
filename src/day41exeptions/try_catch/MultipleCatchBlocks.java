package day41exeptions.try_catch;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        try {
            System.out.println(1 / 0);// we will catch exception if we will divide by 0 // rest of try block code not execute, it program jump to catch block, then rest of code execute(i mean code in catch block and code after catch block). So we will never meet String s = null s.trim();

            String s = null; //
            s.trim(); // we will catch NullPointer exception if it will occure, if, for example we will not divide by 0 before(I mean if  System.out.println(1/0) will not occure)
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Second catch block");
            e.printStackTrace();

        }
        System.out.println("End");
    }
}