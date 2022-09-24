package day31arraylist;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class LoopingArrayListFirstTry {
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(2.2);
        numbers.add(3.0);
        numbers.add(6.75);
        numbers.add(0.2);// min
        numbers.add(240.52); // max
        numbers.add(5.34);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

       double max = 4.9E-324; // keep here smallest double that exist
        for(Double eachNumber : numbers) {
            if(max < eachNumber){
                max = eachNumber;
            }
        }
        System.out.println(max);

        double min = 1.7976931348623157E308;// keep here biggest double that exist
        for(Double eachNumber : numbers) {
            if(min > eachNumber){
                min = eachNumber;
            }
        }
        System.out.println(min);

    }
}
