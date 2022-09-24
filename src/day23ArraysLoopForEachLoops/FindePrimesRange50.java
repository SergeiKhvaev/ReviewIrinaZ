package day23ArraysLoopForEachLoops;

public class FindePrimesRange50 {
    public static void main(String[] args) {


        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {// j < 49 почему не работает
                if (i % j == 0) {
                    isPrime = false;
                }
            }
           if(isPrime){
               System.out.println(i);
           }

        }



        }
    }
