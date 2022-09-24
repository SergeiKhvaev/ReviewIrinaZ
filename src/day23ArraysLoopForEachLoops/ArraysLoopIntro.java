package day23ArraysLoopForEachLoops;

import java.util.Arrays;

public class ArraysLoopIntro {
    public static void main(String[] args) {


        int[] nums ={1, 2, 3, 4, 5}; // можем все распечататть вручную, можем все распечатать черед Arrays.toString и распечатать весь массив, можем массив распечатать через цикл

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]); // распечатали в ручную

        System.out.println("---------------------------------------------------------");
        System.out.println(Arrays.toString(nums)); // использовали Arrays.toString, но в этом случае нам возврашается String формат и с этой строкой мало что можем сделать, поэтому используется циклы
        System.out.println("---------------------------------------------------------");

for(int i = 0; i < nums.length; i++){ //распечатали использую цикл for
    System.out.println(nums[i]);
}
        System.out.println("---------------------------------------------------------");
        //еще один способ распечатать ассив

       String arrayAsString = "Array -  ";
       for (int i = 0; i < nums.length; i++){
            arrayAsString += nums[i]+ " | ";

        }
        arrayAsString += " - END";
        System.out.println(arrayAsString);







    }
}
