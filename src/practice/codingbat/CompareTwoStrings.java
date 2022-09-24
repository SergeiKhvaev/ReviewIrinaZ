package practice.codingbat;

public class CompareTwoStrings {
    /*
    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


    stringMatch("xxcaazz", "xxbaaz") ? 3
    stringMatch("abc", "abc") ? 2
    stringMatch("abc", "axc") ? 0
     */
    public static void main(String[] args) {

/*
       String a1 = "abcc";
        String b1 = "abccc";
        // String str = a;
        int count1 = 0;
            for (int i = 0; i < b1.length() - 1; i ++) {
                if (a1.substring(i, i + 2).equals(b1.substring(i, i + 2))) {
                    count1++;
                }
                }
                System.out.println(count1);

 */

            // coding bat solution
        String a = "abcc";
        String b = "abccc";
        int len = Math.min(a.length(), b.length());
        int count = 0;
        // Look at both substrings starting at i
        for (int i=0; i<len-1; i++) {// why -1????
            String aSub = a.substring(i, i+2); // - 1 because substring (i, i+2) but end of substring do not ends acctually on -2? in will stop on i+1 (поэтому чтобы уровнять +1 делаем в len -1 (что бы лууп не искал за границами String and to prevent outOfBounce)
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {  // Use .equals() with strings
                count++;
            }
        }
        System.out.println(count);






            }






    }

