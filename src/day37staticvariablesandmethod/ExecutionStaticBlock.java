package day37staticvariablesandmethod;

public class ExecutionStaticBlock {
    public static void main(String[] args) {
        new ExecutionStaticBlock();// static run just once before any other code block, but just once, so that why we will see "3" only once
        System.out.println(1);
        new ExecutionStaticBlock();

    }



    public ExecutionStaticBlock(){
        System.out.println(2);
    }
        static {// this block run first whenever the class is loaded(used), before anything else
            System.out.println(3);
        }

    }

