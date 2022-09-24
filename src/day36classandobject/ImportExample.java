package day36classandobject;
import javax.sound.midi.Soundbank;

import java.util.Arrays;

import static java.lang.Math.*;// *accsses all static member from class without class name
import static java.lang.Integer.*; //*accsses all static member from class without class name
import static java.util.Arrays.*;
public class ImportExample {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(PI);
       // System.out.println(max(4,1)); // method in 2 different classes ->need to define the class
        System.out.println(MAX_VALUE);
        System.out.println((abs(-6)));

        System.out.println(MIN_VALUE);
        System.out.println(MAX_VALUE);
        parseInt(""); // Integer.parseInt()

        int []a = {43,4,2};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println((Arrays.toString(a)));// the reasen you can t use  just toString is because it doesnt knownwhich one  is multiple from different classes

    }
}
