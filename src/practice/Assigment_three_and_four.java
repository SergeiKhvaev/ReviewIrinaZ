package practice;

import java.util.ArrayList;

public class Assigment_three_and_four {
    // question 29


}

class Phone{

    public Phone(String str){
        this(str.length());
        System.out.print(0);
    }
    public Phone(int num){
        this();
        System.out.print(num);
    }
    public Phone(){
        System.out.print(1);
    }

}
class CallPhones {
    public static void main(String[] args) {
     new Phone("apple");
      new Phone(4);
      new Phone();
    }
}

