package practice.codingbat;

public class RepeatFirstThreeCharsOfString {
    public static void main(String[] args) {

        /*
        Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
frontTimes("Chocolate", 2) ? "ChoCho"
frontTimes("Chocolate", 3) ? "ChoChoCho"
frontTimes("Abc", 3) ? "AbcAbcAbc"


         */

        String str = "abc";
        System.out.println(frontTimes(str, 0));


    }


    public static String frontTimes(String str, int n) {
        String repeats = "";

            if (str.length() <= 3) {
                repeats = str.repeat(n);
            } else {
                repeats = str.substring(0, 3).repeat(n);
            }


        return repeats;
    }
}

/* another solution
public String frontTimes(String str, int n) {
  String repeats ="";
  int length = 3;
  if(str.length() < length){
    length = str.length();
     }

     for(int i = 0; i < n; i++){
       repeats += str.substring(0, length);
     }

 return repeats;

}


 */