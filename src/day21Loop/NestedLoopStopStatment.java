package day21Loop;

public class NestedLoopStopStatment {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {

            if(i % 2== 1) continue;
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j) ;
                }

            }


        }
    }

