package day20forlooppractice;

public class ForLoopCountingHi {
    public static void main(String[] args) {

        // count how many "hi" in the string

        String s = "addhisdddHelhilohihihitodayhi";
        // way1^ use loop to delete  first occurance eahe time
        int count = 0;
        while (s.contains("hi")) { // boolean condition
            System.out.println(s);
            s = s.replaceFirst("hi", "");
            count++;

        }
        System.out.println(count);
        System.out.println("===========================================================");

        // second way with for loop to check one index at time, but when there ia an h will check another index

        String s2 = "addhisdddHelhilohihihitodayh";
        int count2 = 0;

        for (int i = 0; i < s2.length() - 1; i++) {

            if (s2.charAt(i) == 'h' && s2.charAt(i + 1) == 'i') { // i+1 checks next char (если в конце будет просто h - код не сработает), поэтому мы делаем баланс -1  - >в условии  i <s2.length() -1
                count2++;

            }
        }

        System.out.println(count2);

        System.out.println("==================================================");

        //3 way, use indexes to check every 2 characters


        String s3 = "hi";
        int count3 = 0;

        //ab12 --> sub(0,2) эта логига применяется в решении, т.е. все при каждой итерации строка делится на сабстроку с шагом на 1 символ и при каждом цикле сабстрока проверяется равна ли она "HI"
        //ttyt --> sub(1,3)
        //rer ---> sub(2,4)
        //rewr --> sub(3,5)
        for (int i = 0; i < s3.length() - 1; i++) {
            if (s3.substring(i, i + 2).equals("hi")) {
                count3++;
            }
        }
        System.out.println(count3);
    }
}