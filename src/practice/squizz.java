package practice;

import java.util.Arrays;

public class squizz {
    public static void main(String[] args) {

      String s = "the game was tide at 2-2";
      String s2 = s.substring(5);// ame was tide at 2-2
        System.out.println(s2);
int index1 = s.indexOf("game"); // 4
        System.out.println(index1);
int index2 = s2.indexOf("game");// error
        System.out.println(index2);


    }
}