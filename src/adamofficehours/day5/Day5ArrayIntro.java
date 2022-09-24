package adamofficehours.day5;

import java.util.Arrays;

public class Day5ArrayIntro {
    public static void main(String[] args) {

        // rotate elements

int [] x = {1,2,3,4}; // 2,3,4,1
        int b = x[0];


for(int i = 0; i < x.length-1; i++){
    // at the last i=x.length
    x [i] = x[i+1];
}
 x[x.length-1] = b;
        System.out.println(Arrays.toString(x));

        System.out.println("====================================================");
// вывод простое переназначение элемента неподходит

      //  int [] y = {1,2,3}; // 2,3,1
                  //0 1 2
     //  y[2] = x[0];//[2,3,1]
            //3,1,2
        //  System.out.println(Arrays.toString(y));




    }
}
