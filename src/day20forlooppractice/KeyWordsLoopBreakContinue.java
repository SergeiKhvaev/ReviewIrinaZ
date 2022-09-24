package day20forlooppractice;

public class KeyWordsLoopBreakContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){

            System.out.println(i+ " ");

        }

        for(int i =1; i<=5; i++){
            if(i==2) {
                break; // the loop stops when i == 2
            }
        }


        for(int i =1; i<=5; i++) {
            if (i == 2) {
                continue; // loop skip i ==2, then loop continue (2 will not print)
            }
        }


    }
}
