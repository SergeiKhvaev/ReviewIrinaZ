package day42abstractionexeptionsrecap.practice.library;

public class FailToCheckOutEception extends Exception{
    /*
    Create a class FailToCheckOutException
    make this a checked exception
    create a constructor to accept the String argument and pass it
 to the super constructor
     */

    public FailToCheckOutEception(String str){
        super(str);
    }
}
